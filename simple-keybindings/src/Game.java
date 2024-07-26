import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

/**
 * Game
 *
 * A simple example of using key bindings in a JFrame to move a JLabel with an image icon.
 */
public class Game {

  // Actions for the key bindings
  Action upAction;
  Action downAction;
  Action leftAction;
  Action rightAction;

  JFrame frame;
  JLabel label;
  ImageIcon image = new ImageIcon("ninja.png"); // Load the image icon

  // Constructor for the Game class
  Game() {
    // Set up the frame
    frame = new JFrame("Key Binding Ninja");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420, 420);
    frame.setLayout(null); // Use null layout for absolute positioning

    // Set up the label with the image icon
    label = new JLabel();
    label.setBounds(100, 100, 128, 128); // Set the initial position and size of the label
    label.setIcon(image); // Set the icon for the label

    // Initialize the actions
    upAction = new UpAction();
    downAction = new DownAction();
    leftAction = new LeftAction();
    rightAction = new RightAction();

    // Bind the UP key to the upAction
    label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
    label.getActionMap().put("upAction", upAction);

    // Bind the DOWN key to the downAction
    label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
    label.getActionMap().put("downAction", downAction);

    // Bind the LEFT key to the leftAction
    label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
    label.getActionMap().put("leftAction", leftAction);

    // Bind the RIGHT key to the rightAction
    label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
    label.getActionMap().put("rightAction", rightAction);

    // Add the label to the frame
    frame.add(label);
    frame.setVisible(true); // Make the frame visible
  }

  // Action class for moving the label up
  public class UpAction extends AbstractAction {

    @Override
    public void actionPerformed(ActionEvent e) {
      label.setLocation(label.getX(), label.getY() - 10); // Move the label up by 10 pixels
    }
  }

  // Action class for moving the label down
  public class DownAction extends AbstractAction {

    @Override
    public void actionPerformed(ActionEvent e) {
      label.setLocation(label.getX(), label.getY() + 10); // Move the label down by 10 pixels
    }
  }

  // Action class for moving the label left
  public class LeftAction extends AbstractAction {

    @Override
    public void actionPerformed(ActionEvent e) {
      label.setLocation(label.getX() - 10, label.getY()); // Move the label left by 10 pixels
    }
  }

  // Action class for moving the label right
  public class RightAction extends AbstractAction {

    @Override
    public void actionPerformed(ActionEvent e) {
      label.setLocation(label.getX() + 10, label.getY()); // Move the label right by 10 pixels
    }
  }
}
