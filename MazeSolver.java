/**
  Returns the boolean value of the statement
  "it is possible to get from starting point to treasure"
*/

public class MazeSolver {
	
	private Maze maze;
    private static Displayer display;

    public MazeSolver(Maze mazeInput, int heightInput) {
    maze = mazeInput;
    display = new Displayer(heightInput);
    display.atTopOfWindow(maze.toString());
    }
    
    public boolean canMazeBeSolved() {


        //check for base cases
        if(maze.explorerIsOnA() == Maze.TREASURE) return true;
        else if(maze.explorerIsOnA() == Maze.WALL) return false;

        //recursive case
        else {
            //prepares a snapshot in case of recursive backtracking

            //starts east, then goes counter-clockwise      
        int[] directions = {Maze.EAST, Maze.SOUTH, Maze.WEST, Maze.NORTH};
            for (int direction : directions) {
				
				Maze snapshot = new Maze(maze);
                maze.dropA(Maze.WALL);
                maze.go(direction);
                display.atTopOfWindow(maze.toString());

                if (canMazeBeSolved()) return true;
                
                //recursively backtrack
                maze = snapshot;
                display.atTopOfWindow(maze.toString());
            }
            //all 4 directions exhausted
            return false;
        }
    }

    //streamlines output in terminal
    public String toString() {
    	if (canMazeBeSolved()) return "true \n";
    	else return "false \n";
    }
}
