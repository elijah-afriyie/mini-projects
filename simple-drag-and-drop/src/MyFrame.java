import javax.swing.JFrame;

public class MyFrame extends JFrame {

  DragPanel dragPanel;

  // Constructor for MyFrame
  MyFrame() {
    dragPanel = new DragPanel(); // Initialize the drag panel
    this.add(dragPanel); // Add the drag panel to the frame

    // Set up JFrame properties
    this.setTitle("Simple Drag and Drop");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(600, 600);
    this.setVisible(true); // Make the frame visible
  }

  // Main method to create an instance of MyFrame
  public static void main(String[] args) {
    new MyFrame();
  }
}
