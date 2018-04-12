/**
  Returns the boolean value of the statement
  "it is possible to get from starting point to treasure"
*/

public class MazeSolver {

	public static boolean solveMaze(Maze maze) {
		//check for base cases
		if(maze.explorerIsOnA() == Maze.TREASURE) return true;
		else if(maze.explorerIsOnA() == Maze.WALL) return false;

		//recursive case, WIP
		else {
			Maze snapshot = new Maze(maze);
			for (int direction = 0; direction < 4; direction++) {
				maze.dropA(Maze.WALL);
				maze.go((int) Math.pow(2, direction));
				if (solveMaze(maze)) return true;
				else return false; //in-place dummy statement for future recursive backtracking algorithm
			}
			return false;
		}
	}
}
