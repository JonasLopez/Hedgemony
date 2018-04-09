# Maze Problem

## Personnel
Jonas Lopez, Samuel Ramos

## Statement of Problem
What is the Boolean value of the statement "it is possible to get from the starting position to treasure"?

## Recursive Abstraction
When I am asked to <br />
find a path such that the explorer reaches treasure in n moves, <br />
the recursive abstraction can <br />
find a path such that the explorer reaches treasure in n-1 moves, starting on a space adjacent to the space it was on before

## Base Case
1. The explorer is on the treasure–no moves need to be made. Returns true.
2. The explorer is in a wall. Returns false.
3. There is no treasure. Returns false.

## English or pseudocode description of algorithm
1. Check if the explorer is outside of the path or if there is no treasure. <br />
    if true: executes base case. <br />
    if false: continue algoritm.
2. Save the current position of the explorer to a 2d array showing its position in the maze.  
3. Starting with the element to the right of the explorer, check if it is a legal element to move to. 
(Legal elements for movement are not part of the path the explorer has already moved through and also not part of a wall.)  
4. Check the adjacent elements. If the element is legal, then move to the location, and repeat from step 2.
5. If there is a dead end reached, then go back to the stepping stone where the decision was made.


## class(es), with fields and methods
TBA

## Version *n* Wishlist
* all ways
* shortest way
