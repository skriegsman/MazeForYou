# **[Maze For You](https://maze4u.github.io/)**
---
### What Inspired us:
After learning about a shark tank funded business called "I Want To Draw A Cat For You", in which the owner Steve draws cat caricatures for people, we were inspired to do something similar. Sam had the idea to draw mazes using a maze generating algorithm.

### What it does:
- The program is given a seed maze (2D array) which is an outline with an entrance, exit, and empty center. It then uses an algorithm to randomly place a point in the empty center. Another method checks the validity of the move and either approves it or vetoes it.
- The checking method makes sure that the maze is still solvable, and that no "rooms" have been created. A room is a clump of walls that the user cant get in, it takes space from the maze and makes it less visually appealing.
- Once the maze is filled, it is printed out as a 2D array. Right now, we have to copy the array into an excel document that highlights the square depending on whether it is a wall or path.

### How we built it:
- We programmed the entire thing in java, we used excel formulas to create an image from the output array.
- The website was programmed and hosted with GitHub using a combination of HTML5 and CSS3.

### Challenges we ran into:
- The most challenging part of this program was making sure that no "rooms" were created and that the maze is solvable. To check for solvability, we needed to make something that can solve it.
- Sam implemented an A* pathfinding algorithm that would solve the maze to determine if it was still possible. A* uses a heuristic approach to pathfinding meaning that it uses data to limit the number of possible paths it checks.

### Accomplishments that we're proud of:
We are most proud of the programs ability to actually create a maze in a reasonable amount of time. In order for a maze to be created, we have to be sure it is solvable as shown above. This can take a long time if you don't use a fast algorithm.

### What we learned:
- Justin learned how to program in HTML5 and CSS3 in order to make our website.
- Sam learned how to divide out tasks within an algorithm to make it run more efficiently and easier to adapt. At first everything took place in the main method. By dividing them out it made the program more modular.
- Saad primarily worked on our other project, while working on this one, he learned how java uses arrays for complex tasks.

### What's next for Maze For You:
- Our goal for the future is that someone can go to our website, click a button, and   download a pdf of a maze that was generated for them. It will be simple and intuitive.
- A user will also be able to draw or upload a shape to define the outline of their maze such as a name or company logo. The program will then take the outline and fill it in with lines to make a maze.
- We want to add different maze generation algorithms so that you can create different types of mazes. An algorithm that uses a tree and one that places random points will make different styles of mazes.
- Lastly, we want to add a difficulty setting so users can chose to make a hard maze or easy maze.
