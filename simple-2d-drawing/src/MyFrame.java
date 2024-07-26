import javax.swing.JFrame;

/**
 * MyFrame demonstrates the use of a custom JPanel within a JFrame.
 */
public class MyFrame extends JFrame {

  // Declare the custom JPanel
  MyPanel panel;

  // Constructor for MyFrame
  MyFrame() {
    // Initialize the custom JPanel
    panel = new MyPanel();

    // Set up JFrame properties
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed

    // Add the custom panel to the frame
    this.add(panel);

    // Size the frame so that all its contents are at or above their preferred sizes
    this.pack();

    // Center the frame on the screen
    this.setLocationRelativeTo(null);

    // Make the frame visible
    this.setVisible(true);
  }
}
