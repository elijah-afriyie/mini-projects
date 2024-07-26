import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * MyFrame demonstrates a simple GUI with a button and a label.
 * The button allows the user to choose a color, which will change the label's text color.
 */
public class MyFrame extends JFrame implements ActionListener {

  // Declare button and label as instance variables
  JButton button;
  JLabel label;

  // Constructor for MyFrame
  MyFrame() {
    // Set up JFrame properties
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application exits when the window is closed
    this.setLayout(new FlowLayout()); // Set the layout manager to FlowLayout

    // Initialize the button with a label
    button = new JButton("Pick a Color");
    button.addActionListener(this); // Add an action listener to the button to handle click events

    // Initialize the label with some text
    label = new JLabel("Hello, Bro!");
    label.setBackground(Color.WHITE); // Set the background color of the label to white
    label.setFont(new Font("Arial", Font.BOLD, 16)); // Set the font of the label text
    label.setOpaque(true); // Make the label's background color visible

    // Add the button and label to the JFrame
    this.add(button);
    this.add(label);

    this.pack(); // Adjust the frame size to fit the components
    this.setVisible(true); // Make the frame visible
  }

  // Override the actionPerformed method to handle button click events
  @Override
  public void actionPerformed(ActionEvent e) {
    // Check if the source of the event is the button
    if (e.getSource() == button) {
      // Create a color chooser dialog
      JColorChooser colorChooser = new JColorChooser();

      // Show the color chooser dialog and get the selected color
      Color color = colorChooser.showDialog(null, "Pick a Color", Color.black);

      // Set the label's foreground (text) color to the selected color
      label.setForeground(color);
    }
  }
}
