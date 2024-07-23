import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBar {

  JFrame frame;
  JProgressBar bar;

  ProgressBar() {
    frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420, 420);
    frame.setLayout(null);

    bar = new JProgressBar();
    bar.setValue(0);
    bar.setBounds(0, 0, 420, 50);
    bar.setStringPainted(true);

    bar.setString("Done!");
    bar.setForeground(Color.RED);
    bar.setBackground(Color.BLACK);

    frame.add(bar);

    frame.setVisible(true);

    fill();
  }

  public void fill() {
    int counter = 0;

    while (counter <= 100) {
      bar.setValue(counter);
      if (counter == 100) {
        bar.setForeground(Color.GREEN);
      }
      try {
        Thread.sleep(50);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      counter += 1;
    }
  }
}
