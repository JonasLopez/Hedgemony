/**
  Test MazeSolver class.
  
  Requires command line arguments:
  o  the name of a file containing a maze.
  o  the rank and file where an explorer is starting.
  o  the height of the displayer.
  
  Ex:
      java UserOfMazeSolver mazes/4cell_treasureWest.txt -1 -1 5  # no explorer, displayer has a height of 5

*/

public class UserOfMazeSolver {

	public static void main(String[] commandLine) 
		throws java.io.FileNotFoundException {
        	System.out.println();
          System.out.println("solving maze "
                            + commandLine[0]
                            + " starting at rank "
                            + commandLine[1]
                            + " and column "
                            + commandLine[2]
                            );
        	Maze maze = new Maze( commandLine[0]
                            	, Integer.parseInt( commandLine[1])
                            	, Integer.parseInt( commandLine[2])
                            	);
          MazeSolver canMazeBeSolved = new MazeSolver(maze, Integer.parseInt( commandLine[3]));
          System.out.print(canMazeBeSolved);
       	}
}
