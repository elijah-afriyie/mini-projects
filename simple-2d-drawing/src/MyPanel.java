import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * MyPanel demonstrates custom drawing on a JPanel.
 */
public class MyPanel extends JPanel {

  // Instance variable to hold the image
  Image image;

  // Constructor for MyPanel
  MyPanel() {
    // Load the image from a file
    image = new ImageIcon("landscape.png").getImage();

    // Set the preferred size of the panel
    this.setPreferredSize(new Dimension(500, 500));
  }

  // Override the paint method to perform custom drawing
  @Override
  public void paint(Graphics g) {
    // Cast the Graphics object to Graphics2D for more advanced control
    Graphics2D g2D = (Graphics2D) g;

    // Draw the loaded image
    g2D.drawImage(image, 0, 0, null);

    // Uncomment the following lines to draw different shapes and text

    // Draw a filled pink rectangle
    g2D.setPaint(Color.pink);
    g2D.fillRect(0, 0, 100, 200);

    // Draw a filled red arc
    g2D.setPaint(Color.red);
    g2D.fillArc(0, 0, 100, 100, 0, 180);

    // Draw a filled white arc
    g2D.setPaint(Color.white);
    g2D.fillArc(0, 0, 100, 100, 180, 180);

    // Draw a filled orange triangle
    int[] xPoints = { 150, 250, 350 };
    int[] yPoints = { 300, 150, 300 };
    g2D.setPaint(Color.orange);
    g2D.fillPolygon(xPoints, yPoints, 3);

    // Draw a blue string with a custom font
    g2D.setFont(new Font("Arial", Font.BOLD, 24));
    g2D.setPaint(Color.blue);
    g2D.drawString("U R A GENIUS", 50, 50);
  }
}
