import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * MyFrame
 */
public class MyFrame extends JFrame {

  // Constructor
  MyFrame() {
    this.setTitle("Little Frame for xFraga"); // Sets title of frame
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set default close operation
    this.setResizable(false); // Prevent frame from being resized
    this.setSize(720, 720); // Resize from to desired size
    this.setVisible(true); // Make frame visible

    ImageIcon imgIcon = new ImageIcon("avatar.png"); // Set custom icon
    this.setIconImage(imgIcon.getImage());

    this.getContentPane().setBackground(new Color(0x1c2b3a)); // Set background of frame
  }
}
