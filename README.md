# Maze Problem

## Personnel
Jonas Lopez, Samuel Ramos

## Statement of Problem
What is the Boolean value of the statement "it is possible to get from the starting position to treasure"?

## Recursive Abstraction
When I am asked to <br />
find a path such that the explorer reaches treasure in n moves, <br />
the recursive abstraction can <br />
find a path such that the explorer reaches treasure in n-1 moves, starting on a stepping stone adjacent to the stepping stone it was on before

## Base Case
1. The explorer is on the treasure–no moves need to be made. Returns true.
2. The explorer is in a wall. Returns false.

## English or pseudocode description of algorithm
1. Check for the two base cases: if the explorer is on the treasure or in a wall. <br />
    if true: executes base case. <br />
    if false: continue algorithm.
2. Save the current position of the explorer to a 2d array showing its position in the maze.  
3. Invoke the recursive abstraction, starting with the stepping stone of the explorer, check if it is a legal stepping stone to move to. 
(Legal elements for movement are not part of the path the explorer has already moved through and also not part of a wall.)  
4. Check the adjacent stepping stones. If the stepping stone is legal to move to, then move to it, and repeat from step 2.
5. If there is a dead end reached, then go back to the stepping stone where the decision was made.


## class(es), with fields and methods
* Displayer  
  * **Fields**:  
int windowHeight   

  * **Methods**:  
atTopOfWindow  
lineSeparatorsIn  
  
* Maze  
  * **Fields**:  
int TREASURE  
int WALL  
int STEPPING_STONE  
int EAST  
int NORTH  
int WEST  
int SOUTH  
int[][] maze  
int MAX_RANKS  
int rankCount  
Vector explorerPosition  

  * **Methods**:  
toString  
go  
dropA  
explorerIsOnA   
  
* Vector  
  * **Fields**:  
n/a
  
  * **Methods**:  
add
  
* UserOfMaze  
  * **Fields**:  
Displayer displayer  
  
  * **Methods**:  
main  
moveTest  
dropTest  
copyConstructTest  
displayerTest  
snapshotDemo  
  
## Version *n* Wishlist
* all ways
* shortest way

## Known bugs
TBA
