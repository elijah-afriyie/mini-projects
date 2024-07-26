import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * MyFrame demonstrates the use of a JLabel with MouseListener to change its appearance
 * based on mouse events.
 */
public class MyFrame extends JFrame implements MouseListener {

  // Declare the JLabel and ImageIcons for different states
  JLabel label;

  ImageIcon happy = new ImageIcon("happy.png");
  ImageIcon pain = new ImageIcon("pain.png");
  ImageIcon relief = new ImageIcon("relief.png");
  ImageIcon sad = new ImageIcon("sad.png");

  // Constructor for MyFrame
  MyFrame() {
    // Set up JFrame properties
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 500);
    this.setLayout(new BorderLayout());

    // Initialize the JLabel and set its properties
    label = new JLabel();
    label.setBackground(Color.RED);
    label.setOpaque(true); // Make the background color visible
    label.addMouseListener(this); // Add MouseListener to the label
    label.setHorizontalAlignment(JLabel.CENTER); // Center the text and icon

    // Add the label to the frame
    this.add(label);

    // Make the frame visible
    this.setVisible(true);
  }

  // Override methods from MouseListener interface

  // Called when the mouse is clicked (pressed and released)
  @Override
  public void mouseClicked(MouseEvent e) {}

  // Called when the mouse button is pressed
  @Override
  public void mousePressed(MouseEvent e) {
    label.setBackground(Color.YELLOW);
    label.setIcon(pain);
    label.setText("Ouchhhh... it hurts!!!");
  }

  // Called when the mouse button is released
  @Override
  public void mouseReleased(MouseEvent e) {
    label.setBackground(Color.GREEN);
    label.setIcon(relief);
    label.setText("I'm feeling better now!");
  }

  // Called when the mouse enters the label area
  @Override
  public void mouseEntered(MouseEvent e) {
    label.setBackground(Color.GREEN);
    label.setIcon(happy);
    label.setText("Hehe... I'm happy you're here!");
  }

  // Called when the mouse exits the label area
  @Override
  public void mouseExited(MouseEvent e) {
    label.setBackground(Color.RED);
    label.setIcon(sad);
    label.setText("Oh no, I'm sad you're leaving!");
  }
}
