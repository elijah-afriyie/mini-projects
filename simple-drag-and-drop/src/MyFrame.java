import javax.swing.JFrame;

/**
 * MyFrame demonstrates a simple drag-and-drop feature using a custom panel.
 */
public class MyFrame extends JFrame {

  // Declare the custom drag panel as an instance variable
  DragPanel dragPanel;

  // Constructor for MyFrame
  MyFrame() {
    // Initialize the drag panel
    dragPanel = new DragPanel();
    // Add the drag panel to the frame
    this.add(dragPanel);

    // Set up JFrame properties
    this.setTitle("Simple Drag and Drop"); // Set the title of the frame
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application exits when the window is closed
    this.setSize(600, 600); // Set the size of the frame
    this.setVisible(true); // Make the frame visible
  }
}
