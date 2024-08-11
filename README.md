# Snake Game 🐍

## Title and Introduction 🎮

Welcome to the Snake Game! This classic arcade game challenges players to navigate a snake around the screen, consuming apples to grow longer while avoiding collisions with the walls and the snake's own body. The game is implemented in Java using Swing for the graphical interface.

## Project Structure 📂

The project is organized into the following main folders:

1. **snake.game**: Contains Java classes for the game logic and user interface.
    - `Board.java`: Manages the game board, rendering the snake and apple, handling movement, and checking for collisions.
    - `SnakeGame.java`: The main class that initializes and displays the game window.

2. **Icons**: Contains PNG files used for game assets such as the apple and snake graphics.

## API Reference 📖

- **`Board`**:
    - Manages the game board and snake.
    - Methods: `loadImages()`, `initGame()`, `locateApple()`, `paintComponent(Graphics g)`, `draw(Graphics g)`, `gameOver(Graphics g)`, `move()`, `checkApple()`, `checkCollision()`, `actionPerformed(ActionEvent ae)`.

- **`SnakeGame`**:
    - Initializes the game window and sets up the game board.

## Prerequisites ✅

Before you start, make sure you have the following installed on your machine:

- **Java Development Kit (JDK)**: Ensure that Java JDK 21 is installed. If not, download and install it from the [Oracle JDK Downloads](https://www.oracle.com/java/technologies/javase-downloads.html) page.

## Installation ⚙️

1. **Clone the Repository**: Clone the repository to your local machine using Git:
   ```bash
   git clone https://github.com/Rishy-09/Snake-Game
    ```
2. **Navigate to the Project Directory**: Change to the project directory:

```bash
cd Snake-Game
```

3. **Add JAR Files**: If there are any JAR files required, place them in the `lib` directory of your project or include them in your project's classpath.


4. **Open the Project in Your IDE**: Open the project in an Integrated Development Environment (IDE) such as IntelliJ IDEA.


5. **Build and Run the Project**:

- Compile the project using your IDE’s build tools.
- Run the `SnakeGame` class to start the application.

6. **Verify Configuration**: Ensure that the application is correctly configured and that all necessary resources are available.

## Deployment

To deploy the Snake Game, follow these steps:

1. **Package the Application**:
    - Build the project into a JAR file using your IDE’s build tools.
    - Ensure all necessary resources are included in the JAR file.

2. **Run the Application**:
    - Execute the JAR file from the command line or through a Java runtime environment.
    - Use the command:
      ```bash
      java -jar SnakeGame.jar
      ```

3. **Distribution**:
    - Share the JAR file with users or deploy it to a server or cloud platform as needed.

## Demo

To see the Snake Game in action, follow these steps:

1. **Run the Application**: Start the `SnakeGame` class as described in the Installation section.


2. **Gameplay**:
    - Use the arrow keys to control the direction of the snake.
    - The goal is to eat the apples while avoiding collisions with the snake's own body and the game area boundaries.
    - The game ends when the snake collides with itself or the boundaries.


## Related Projects

- **[Notepad Clone](https://github.com/Rishy-09/Notepad-Clone)**: A simple implementation of a notepad application using Java Swing.

Explore this project for more examples of Java programming and UI development!

## Acknowledgements

- Special thanks to [YouTube Tutorial](https://www.youtube.com/watch?v=1jDQYEZtunM&list=PL_6klLfS1WqE1-_MJgZiJqAaccjLGHh0H) for the comprehensive guide and tutorials on creating a Snake game in Java.

## Authors

- **Naman Chanana**: Developer and Maintainer

## Badges

[![Java](https://img.shields.io/badge/Language-Java-blue.svg)](https://www.java.com)

## Appendix

- For additional information and details about the project, please refer to the [Google Drive folder](https://drive.google.com/drive/folders/1QLC26xut0BN804jLHeyXZmjNWA2jRtYP) containing project resources.

## Issues

If you encounter any issues or have suggestions for improvements, please report them on the [GitHub Issues page](https://github.com/Rishy-09/Snake-Game/issues).
