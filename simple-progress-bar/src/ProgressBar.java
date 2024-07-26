import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 * ProgressBar
 *
 * A simple example demonstrating the use of a JProgressBar in a JFrame.
 * The progress bar fills from 0% to 100% and changes color upon completion.
 */
public class ProgressBar {

  JFrame frame;
  JProgressBar bar;

  // Constructor for ProgressBar
  ProgressBar() {
    // Initialize the JFrame
    frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420, 420);
    frame.setLayout(null); // Use null layout for absolute positioning

    // Initialize the JProgressBar
    bar = new JProgressBar();
    bar.setValue(0); // Set initial value to 0
    bar.setBounds(0, 0, 420, 50); // Set position and size of the progress bar
    bar.setStringPainted(true); // Show text inside the progress bar

    // Set progress bar appearance
    bar.setString("Done!"); // Set the text displayed on the progress bar
    bar.setForeground(Color.RED); // Set the foreground color of the progress bar
    bar.setBackground(Color.BLACK); // Set the background color of the progress bar

    // Add the progress bar to the frame
    frame.add(bar);

    // Make the frame visible
    frame.setVisible(true);

    // Start the filling process
    fill();
  }

  // Method to fill the progress bar
  public void fill() {
    int counter = 0;

    while (counter <= 100) {
      bar.setValue(counter); // Update the progress bar's value
      if (counter == 100) {
        bar.setForeground(Color.GREEN); // Change color to green upon completion
      }
      try {
        Thread.sleep(50); // Pause for 50 milliseconds
      } catch (InterruptedException e) {
        e.printStackTrace(); // Print stack trace if an InterruptedException occurs
      }

      counter += 1; // Increment the counter
    }
  }

  // Main method to run the ProgressBar application
  public static void main(String[] args) {
    new ProgressBar(); // Create an instance of ProgressBar to start the application
  }
}
