import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * MyFrame
 * This class creates a JFrame window with a menu bar containing
 * File, Edit, and Help menus. Each menu has menu items with icons.
 */
public class MyFrame extends JFrame implements ActionListener {

  JMenu fileMenu;
  JMenu editMenu;
  JMenu helpMenu;

  JMenuItem openItem;
  JMenuItem saveItem;
  JMenuItem exitItem;

  // Constructor for MyFrame
  MyFrame() {
    // Set up JFrame properties
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 500);
    this.setLayout(new FlowLayout());

    // Load and resize the icons for menu items
    ImageIcon openIcon = resizeIcon("open.png", 16, 16);
    ImageIcon saveIcon = resizeIcon("save.png", 16, 16);
    ImageIcon exitIcon = resizeIcon("exit.png", 16, 16);

    // Create menu bar
    JMenuBar menuBar = new JMenuBar();

    // Create menus
    fileMenu = new JMenu("File");
    editMenu = new JMenu("Edit");
    helpMenu = new JMenu("Help");

    // Add menus to the menu bar
    menuBar.add(fileMenu);
    menuBar.add(editMenu);
    menuBar.add(helpMenu);

    // Create menu items
    openItem = new JMenuItem("Open");
    saveItem = new JMenuItem("Save");
    exitItem = new JMenuItem("Exit");

    // Add action listeners to the menu items
    openItem.addActionListener(this);
    saveItem.addActionListener(this);
    exitItem.addActionListener(this);

    // Add Mnemonics to the menus
    fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F for File
    editMenu.setMnemonic(KeyEvent.VK_E); // Alt + E for Edit
    helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H for Help

    // Add Mnemonics to the menu items
    openItem.setMnemonic(KeyEvent.VK_O); // O for Open
    saveItem.setMnemonic(KeyEvent.VK_S); // S for Save
    exitItem.setMnemonic(KeyEvent.VK_X); // X for Exit

    // Set icons for the menu items
    openItem.setIcon(openIcon);
    saveItem.setIcon(saveIcon);
    exitItem.setIcon(exitIcon);

    // Add menu items to the File menu
    fileMenu.add(openItem);
    fileMenu.add(saveItem);
    fileMenu.add(exitItem);

    // Add the menu bar to the JFrame
    this.setJMenuBar(menuBar);
    this.setVisible(true);
  }

  // Method to resize the icon
  // This method takes the path to the image file and the desired width and height
  // It creates an ImageIcon, scales the image to the specified dimensions, and returns a new ImageIcon
  private ImageIcon resizeIcon(String path, int width, int height) {
    ImageIcon icon = new ImageIcon(path);
    Image img = icon.getImage();
    Image resizedImage = img.getScaledInstance(
      width,
      height,
      Image.SCALE_SMOOTH
    );
    return new ImageIcon(resizedImage);
  }

  // Override actionPerformed to handle menu item click events
  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == openItem) {
      System.out.println("You have opened a file");
    } else if (e.getSource() == saveItem) {
      System.out.println("You have saved a file");
    } else if (e.getSource() == exitItem) {
      System.exit(0);
    }
  }
}
