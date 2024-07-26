import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 * MyFrame class that allows selecting a file using JFileChooser.
 */
public class MyFrame extends JFrame implements ActionListener {

  JButton button;

  // Constructor for MyFrame
  MyFrame() {
    // Set up JFrame properties
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    // Initialize and add action listener to the button
    button = new JButton("Select File");
    button.addActionListener(this);

    // Add the button to the frame
    this.add(button);
    this.pack();
    this.setVisible(true);
  }

  // Override actionPerformed to handle button click events
  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      // Create a JFileChooser instance
      JFileChooser fileChooser = new JFileChooser();
      // Set the current directory to the project's root directory
      fileChooser.setCurrentDirectory(new File("."));

      // Show the open file dialog
      int result = fileChooser.showOpenDialog(null);

      // If a file is selected, print the absolute path of the selected file
      if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        System.out.println("Selected file: " + selectedFile.getAbsolutePath());
      }
    }
  }
}
