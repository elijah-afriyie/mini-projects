import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * DragPanel class that allows dragging an image across the panel.
 */
public class DragPanel extends JPanel {

  // Load the image to be dragged
  ImageIcon image = new ImageIcon("image.png");

  // Store the width and height of the image
  final int WIDTH = image.getIconWidth();
  final int HEIGHT = image.getIconHeight();

  // Points to store the position of the image and the previous mouse point
  Point imageCorner;
  Point prevPt;

  // Constructor to initialize the panel and add listeners
  DragPanel() {
    // Initial position of the image
    imageCorner = new Point(0, 0);

    // Instantiate listener classes
    ClickListener clickListener = new ClickListener();
    DragListener dragListener = new DragListener();

    // Add mouse listener for clicks
    this.addMouseListener(clickListener);
    // Add mouse motion listener for dragging
    this.addMouseMotionListener(dragListener);
  }

  // Override paintComponent to draw the image at its current position
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    // Draw the image at its current position
    image.paintIcon(
      this,
      g,
      (int) imageCorner.getX(),
      (int) imageCorner.getY()
    );
  }

  // Inner class to handle mouse clicks
  private class ClickListener extends MouseAdapter {

    @Override
    public void mousePressed(MouseEvent e) {
      System.out.println("Mouse Pressed");
      // Capture the point where the mouse is pressed
      prevPt = e.getPoint();
    }
  }

  // Inner class to handle mouse dragging
  private class DragListener extends MouseMotionAdapter {

    @Override
    public void mouseDragged(MouseEvent e) {
      System.out.println("Mouse Dragged");
      // Capture the current mouse position
      Point currentPt = e.getPoint();
      // Update the position of the image
      imageCorner.translate(
        (int) (currentPt.getX() - prevPt.getX()),
        (int) (currentPt.getY() - prevPt.getY())
      );
      // Update the previous point to the current point
      prevPt = currentPt;
      // Repaint the panel to reflect the new image position
      repaint();
    }
  }
}
