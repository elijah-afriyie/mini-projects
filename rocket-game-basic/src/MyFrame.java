import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * MyFrame demonstrates the use of KeyListener to move a JLabel with keyboard input.
 */
public class MyFrame extends JFrame implements KeyListener {

  // Declare the JLabel for displaying the image and text
  JLabel label;

  // Constructor for MyFrame
  MyFrame() {
    // Set up JFrame properties
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 500);
    this.setLayout(null);
    this.getContentPane().setBackground(Color.BLACK);
    this.addKeyListener(this); // Add KeyListener to the frame

    // Load the image icon
    ImageIcon icon = new ImageIcon("ship.png");

    // Initialize the JLabel and set its properties
    label = new JLabel("Basic Shuttle Game");
    label.setBounds(0, 0, 128, 128);
    label.setIcon(icon);

    // Add the label to the frame
    this.add(label);

    // Make the frame visible
    this.setVisible(true);
  }

  // Override methods from KeyListener interface

  // Called when a key is typed (pressed and released)
  @Override
  public void keyTyped(KeyEvent e) {
    // Move the label based on the character typed
    switch (e.getKeyChar()) {
      case 'a':
        label.setLocation(label.getX() - 10, label.getY());
        break;
      case 'w':
        label.setLocation(label.getX(), label.getY() - 10);
        break;
      case 'd':
        label.setLocation(label.getX() + 10, label.getY());
        break;
      case 's':
        label.setLocation(label.getX(), label.getY() + 10);
        break;
    }
  }

  // Called when a key is pressed
  @Override
  public void keyPressed(KeyEvent e) {
    // Move the label based on the key code
    switch (e.getKeyCode()) {
      case 37: // Left arrow key
        label.setLocation(label.getX() - 10, label.getY());
        break;
      case 38: // Up arrow key
        label.setLocation(label.getX(), label.getY() - 10);
        break;
      case 39: // Right arrow key
        label.setLocation(label.getX() + 10, label.getY());
        break;
      case 40: // Down arrow key
        label.setLocation(label.getX(), label.getY() + 10);
        break;
    }
  }

  // Called when a key is released
  @Override
  public void keyReleased(KeyEvent e) {
    // Print the character and key code of the released key
    System.out.println("You pressed " + e.getKeyChar());
    System.out.println("You pressed " + e.getKeyCode());
  }
}
