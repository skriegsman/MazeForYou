//Sam Kriegsman

/**
- Main method
    - Define input type
    - Define Generation type
    -Run Methods

- Input Methods
    - randomly generated seed
    - given 2d array seed

- Make Maze
    - tree Method
    - random Method

- Check Generation
    - no rooms
   - possible path
    - is finished
**/

import java.util.Random;

public class Maze {
    public static void main(String [] args) {
        int [][] seed = {{1,2,1,1,1,1,1,1,1,1,1},
                         {1,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,1},
                         {1,1,1,1,1,1,1,1,1,2,1},}; //user given seed
        printMaze(generateRandom(seed));
    }

    public static int [][] generateRandom(int [][] seed) {
        Random r = new Random();
        boolean keepGoing = true;

        while(keepGoing) {
            int y = r.nextInt(seed.length-3);
            int x = r.nextInt(seed[y].length-3);
            int valid = checkGeneration(seed, x, y);
            if(valid == 0) {
                seed[y][x] = 1; //Good move, make it a wall
            }
            else if(valid == 1) {
                //Do nothing, it is a bad move
            }
            else if(valid == 2) {
                keepGoing = false; //the maze is done
            } else { // only runs if a number other than 0,1,or 2 is given
                System.out.println("ERROR: checkGeneration gave invalid response");
            }
        }

        return seed;
    }

    /*
    - Check for rooms
    - checks for solvability
    */
    public static int checkGeneration(int [][] seed, int x, int y) {
        if(checkRooms(seed, x, y)) {
            if(checkSolvable(seed, x, y)) {
                return 0;
            } else {return 1; }
        } else { return 1; }
    }

    public static boolean checkRooms(int [][] seed, int x, int y) {
        if(seed[y+1][x+1] == 1) {
            if(seed[y+1][x] == 1) {
                if(seed[y][x+1] == 1) {
                    return false;
                }
            }
        }
        if(seed[y+1][x-1] == 1) {
            if(seed[y+1][x] == 1) {
                if(seed[y][x+1] == 1) {
                    return false;
                }
            }
        }
        if(seed[y-1][x+1] == 1) {
            if(seed[y][x+1] == 1) {
                if(seed[y-1][x] == 1) {
                    return false;
                }
            }
        }
        if(seed[y-1][x-1] == 1) {
            if(seed[y][x-1] == 1) {
                if(seed[y-1][x] == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkSolvable(int [][] seed, int x, int y) {
        int [][] testArray = seed;
        testArray[y][x] = 1;

        int xPos = 1;
        int yPos = 1;
        int xFinal = testArray[0].length;
        int yFinal = testArray.length;

        boolean solvable = false;
        while(!solvable) {
            if(dista)
        }

        return solvable;
    }

    public static void printMaze(int [][] maze) {
        for(int i = 0; i < maze.length; i++) { //for every row
            for(int j = 0; j < maze[i].length; j++) { //for every spot in each row
                System.out.print(maze[i][j] + " "); //print that number followed by a space
            }
            System.out.println(); //go to next line
        }
    }
}
