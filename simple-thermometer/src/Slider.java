import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * SliderDemo
 */
public class Slider implements ChangeListener {

  JFrame frame;
  JPanel panel;
  JLabel label;
  JSlider slider;

  Slider() {
    frame = new JFrame("Slider Demo");
    panel = new JPanel();
    label = new JLabel();
    slider = new JSlider(0, 100);

    slider.setPreferredSize(new Dimension(400, 200));
    slider.setFont(new Font("Arial", Font.PLAIN, 12));

    slider.setPaintTicks(true);
    slider.setMinorTickSpacing(10);

    slider.setPaintTrack(true);
    slider.setMajorTickSpacing(25);

    slider.setPaintLabels(true);

    slider.setOrientation(SwingConstants.VERTICAL);
    slider.addChangeListener(this);

    label.setFont(new Font("Arial", Font.PLAIN, 22));
    label.setText("°C = " + slider.getValue());

    panel.add(slider);
    panel.add(label);
    frame.add(panel);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420, 420);
    frame.setVisible(true);
  }

  @Override
  public void stateChanged(ChangeEvent e) {
    label.setText("°C = " + slider.getValue());
  }
}
