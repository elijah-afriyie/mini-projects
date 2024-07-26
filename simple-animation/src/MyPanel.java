import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel extends JPanel implements ActionListener {

  final int PANEL_WIDTH = 500;
  final int PANEL_HEIGHT = 500;

  Image ball;
  Image backgroundImg;

  Timer timer;
  int xVelocity = 3;
  int yVelocity = 1;

  int x = 0;
  int y = 0;

  MyPanel() {
    this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    backgroundImg = new ImageIcon("retroSpaceC.png").getImage();
    ball = new ImageIcon("ball.png").getImage();

    timer = new Timer(10, this);
    timer.start();
  }

  @Override
  public void paint(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.drawImage(backgroundImg, 0, 0, getWidth(), getHeight(), this);
    g2d.drawImage(ball, x, y, null);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    x += xVelocity;
    y += yVelocity;

    // Bounce off the edges
    if (x < 0 || x + ball.getWidth(this) > PANEL_WIDTH) {
      xVelocity = -xVelocity;
    }
    if (y < 0 || y + ball.getHeight(this) > PANEL_HEIGHT) {
      yVelocity = -yVelocity;
    }

    repaint(); // Request a repaint to update the panel
  }
}
