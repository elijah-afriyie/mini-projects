import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Slider
 *
 * This class demonstrates the use of a JSlider in a Swing application.
 * It updates a JLabel to display the current value of the slider.
 */
public class Slider implements ChangeListener {

  JFrame frame;
  JPanel panel;
  JLabel label;
  JSlider slider;

  // Constructor for Slider
  Slider() {
    // Initialize the JFrame and its components
    frame = new JFrame("Slider Demo");
    panel = new JPanel();
    label = new JLabel();
    slider = new JSlider(0, 100);

    // Configure the JSlider
    slider.setPreferredSize(new Dimension(400, 200)); // Set the size of the slider
    slider.setFont(new Font("Arial", Font.PLAIN, 12)); // Set the font for the slider labels

    slider.setPaintTicks(true); // Show tick marks
    slider.setMinorTickSpacing(10); // Set spacing between minor ticks

    slider.setPaintTrack(true); // Show the track of the slider
    slider.setMajorTickSpacing(25); // Set spacing between major ticks

    slider.setPaintLabels(true); // Show labels on the slider

    slider.setOrientation(SwingConstants.VERTICAL); // Set the orientation of the slider to vertical
    slider.addChangeListener(this); // Add a ChangeListener to respond to slider value changes

    // Configure the JLabel
    label.setFont(new Font("Arial", Font.PLAIN, 22)); // Set the font for the label
    label.setText("°C = " + slider.getValue()); // Initialize the label with the current slider value

    // Add components to the panel
    panel.add(slider);
    panel.add(label);

    // Add the panel to the frame
    frame.add(panel);

    // Configure the JFrame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the frame is closed
    frame.setSize(420, 420); // Set the size of the frame
    frame.setVisible(true); // Make the frame visible
  }

  // Method to handle slider value changes
  @Override
  public void stateChanged(ChangeEvent e) {
    label.setText("°C = " + slider.getValue()); // Update the label with the current slider value
  }

  // Main method to create an instance of the Slider class
  public static void main(String[] args) {
    new Slider(); // Create an instance of Slider to start the application
  }
}
