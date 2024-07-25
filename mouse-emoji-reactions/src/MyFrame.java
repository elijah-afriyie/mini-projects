import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener {

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

    label = new JLabel();
    label.setBackground(Color.RED);
    label.setOpaque(true);
    label.addMouseListener(this);
    label.setHorizontalAlignment(JLabel.CENTER);

    this.add(label);

    this.setVisible(true);
  }

  @Override
  public void mouseClicked(MouseEvent e) {}

  @Override
  public void mousePressed(MouseEvent e) {
    label.setBackground(Color.YELLOW);
    label.setIcon(pain);
    label.setText("Ouchhhh... it hurts!!!");
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    label.setBackground(Color.GREEN);
    label.setIcon(relief);
    label.setText("I'm feeling better now!");
  }

  @Override
  public void mouseEntered(MouseEvent e) {
    label.setBackground(Color.GREEN);
    label.setIcon(happy);
    label.setText("Hehe... I'm happy you're here!");
  }

  @Override
  public void mouseExited(MouseEvent e) {
    label.setBackground(Color.RED);
    label.setIcon(sad);
    label.setText("Oh no, I'm sad you're leaving!");
  }
}
