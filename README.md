# Maze Problem

## Personnel
Jonas Lopez, Samuel Ramos

## Statement of Problem
What is the Boolean value of the statement "it is possible to get from the starting position to treasure"?

## Recursive Abstraction
When I am asked to <br />
find a path such that the explorer reaches treasure in n moves, <br />
the recursive abstraction can <br />
find a path such that the explorer reaches treasure in n-1 moves, starting one legal move closer to treasure

## Base Case
The explorer is on the treasure–no moves need to be made.

## English or pseudocode description of algorithm
1. Save the current position of the explorer to a 2d array showing its position in the maze.  
2. Starting with the element to the right of the explorer, check if it is a legal element to move to. 
(Legal elements for movement are not part of the path the explorer has already moved through and also not part of a wall.)  
3. If the element is legal, then move to the location.  
If not, then check the element 90 degrees to the right of the element from the position of the explorer.  
## class(es), with fields and methods
TBA

## Version *n* Wishlist
* all ways
* shortest way
