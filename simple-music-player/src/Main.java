import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {

  public static void main(String[] args)
    throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    Scanner scanner = new Scanner(System.in);
    File file = new File("how-deep.wav");

    // Create an AudioInputStream object from the specified audio file
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

    // Obtain a Clip object for playing the audio
    Clip clip = AudioSystem.getClip();
    clip.open(audioStream);

    // Initialize an empty string to hold the user's response
    String response = "";

    // Enter a loop that will continue until the user enters 'Q' to quit
    while (!response.equals("Q")) {
      System.out.println("P = Play\nS = Pause\nR = Restart\nQ = Quit");
      System.out.println("Select your option:");

      response = scanner.next();
      response = response.toUpperCase();

      // Switch statement to handle different user responses
      switch (response) {
        case ("P"):
          clip.start();
          break;
        case ("S"):
          clip.stop();
          break;
        case ("R"):
          clip.setMicrosecondPosition(0);
          break;
        case ("Q"):
          clip.close();
          break;
        default:
          System.out.println("Error! Invalid response");
      }
    }
    // Close the Scanner object to free resources
    scanner.close();
  }
}
