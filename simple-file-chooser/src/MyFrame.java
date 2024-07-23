import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {

  JButton button;

  // Constructor for MyFrame
  MyFrame() {
    // Set up JFrame properties
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    button = new JButton("Select File");
    button.addActionListener(this);

    this.add(button);
    this.pack();
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      JFileChooser fileChooser = new JFileChooser();
      fileChooser.setCurrentDirectory(new File("."));

      fileChooser.showOpenDialog(null);

      System.out.println(
        "Selected file: " + fileChooser.getSelectedFile().getAbsolutePath()
      );
    }
  }
}
