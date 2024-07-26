import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * MyPanel is a custom JPanel that animates an image bouncing around the panel.
 * It uses a Timer to periodically update the position of the image.
 */
public class MyPanel extends JPanel implements ActionListener {

  // Panel dimensions
  final int PANEL_WIDTH = 500;
  final int PANEL_HEIGHT = 500;

  // Images for background and ball
  Image ball;
  Image backgroundImg;

  // Timer to control animation speed
  Timer timer;

  // Velocity of the ball in pixels per update
  int xVelocity = 3;
  int yVelocity = 1;

  // Current position of the ball
  int x = 0;
  int y = 0;

  /**
   * Constructor for MyPanel.
   * Initializes the panel and loads images.
   */
  MyPanel() {
    // Set the preferred size of the panel
    this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));

    // Load images for background and ball
    backgroundImg = new ImageIcon("retroSpaceC.png").getImage();
    ball = new ImageIcon("ball.png").getImage();

    // Initialize the Timer to call actionPerformed() every 10 milliseconds
    timer = new Timer(10, this);
    timer.start(); // Start the timer to begin animation
  }

  /**
   * Paints the panel's content.
   * This method is called whenever the panel needs to be repainted.
   */
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g); // Call the superclass's paintComponent method to ensure proper painting
    Graphics2D g2d = (Graphics2D) g;

    // Draw the background image
    g2d.drawImage(backgroundImg, 0, 0, getWidth(), getHeight(), this);

    // Draw the ball image at its current position
    g2d.drawImage(ball, x, y, this);
  }

  /**
   * Called by the Timer every 10 milliseconds.
   * Updates the position of the ball and checks for collisions with the panel's edges.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    // Update the position of the ball
    x += xVelocity;
    y += yVelocity;

    // Check if the ball has hit the left or right edge
    if (x < 0 || x + ball.getWidth(this) > PANEL_WIDTH) {
      xVelocity = -xVelocity; // Reverse horizontal direction
    }

    // Check if the ball has hit the top or bottom edge
    if (y < 0 || y + ball.getHeight(this) > PANEL_HEIGHT) {
      yVelocity = -yVelocity; // Reverse vertical direction
    }

    // Request a repaint to update the ball's position on the panel
    repaint();
  }
}
