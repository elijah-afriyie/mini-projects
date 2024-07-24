import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * MyFrame
 */
public class MyFrame extends JFrame implements KeyListener {

  JLabel label;

  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 500);
    this.setLayout(null);
    this.addKeyListener(this);

    ImageIcon icon = new ImageIcon("shuttle.png");

    label = new JLabel("Basic Shuttle Game");
    label.setBounds(0, 0, 128, 128);
    label.setIcon(icon);

    this.add(label);

    this.setVisible(true);
  }

  @Override
  public void keyTyped(KeyEvent e) {
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
    }
  }

  @Override
  public void keyPressed(KeyEvent e) {
    switch (e.getKeyCode()) {
      case 37:
        label.setLocation(label.getX() - 10, label.getY());
        break;
      case 38:
        label.setLocation(label.getX(), label.getY() - 10);
        break;
      case 39:
        label.setLocation(label.getX() + 10, label.getY());
        break;
      case 40:
        label.setLocation(label.getX(), label.getY() + 10);
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
    System.out.println("You pressed " + e.getKeyChar());
    System.out.println("You pressed " + e.getKeyCode());
  }
}
