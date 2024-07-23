import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {

  JButton button;
  JLabel label;

  // Constructor for MyFrame
  MyFrame() {
    // Set up JFrame properties
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    button = new JButton("Pick a Color");
    button.addActionListener(this);

    label = new JLabel("Hello, Bro!");
    label.setBackground(Color.WHITE);
    label.setFont(new Font("Arial", Font.BOLD, 16));
    label.setOpaque(true);

    this.add(button);
    this.add(label);

    this.pack();
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      JColorChooser colorChooser = new JColorChooser();

      Color color = colorChooser.showDialog(null, "Pick a Color", Color.black);

      label.setForeground(color);
    }
  }
}
