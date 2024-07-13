## Audio Player Program

### Description

This Java program allows users to play, pause, restart, and stop an audio file using a command-line interface. The program continuously prompts the user for commands until the user chooses to quit. It handles common audio playback functionalities using the `javax.sound.sampled` package.

### Features

- **Play (P)**: Start playing the audio file.
- **Pause (S)**: Pause the audio playback.
- **Restart (R)**: Restart the audio playback from the beginning.
- **Quit (Q)**: Stop the audio and exit the program.
- **Error Handling**: Displays an error message for invalid commands.

### Requirements

- Java Development Kit (JDK) 8 or higher.
- An audio file named `how-deep.wav` in the same directory as the program.

### Usage

1. **Compile the program**:

   ```bash
   javac Main.java
   ```

2. **Run the program**:

   ```bash
   java Main
   ```

3. **Follow the on-screen prompts**:
   - Enter `P` to play the audio.
   - Enter `S` to pause the audio.
   - Enter `R` to restart the audio from the beginning.
   - Enter `Q` to stop the audio and exit the program.

### Code Explanation

```java
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("how-deep.wav");

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("P = Play\nS = Pause\nR = Restart\nQ = Quit");
            System.out.println("Select your option:");

            response = scanner.next();
            response = response.toUpperCase();

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
        scanner.close();
    }
}
```

### How It Works

1. **File Handling**: The program uses the `File` class to locate the audio file `how-deep.wav`.
2. **Audio System**: The `AudioSystem` class is used to get an `AudioInputStream` for the file.
3. **Clip**: An audio `Clip` object is obtained and opened with the audio stream.
4. **User Interaction**: The program uses a `Scanner` to read user input and a `while` loop to continuously prompt the user for commands.
5. **Command Execution**: The `switch` statement executes different commands (`P`, `S`, `R`, `Q`) based on user input.
6. **Exception Handling**: The program handles potential exceptions like `UnsupportedAudioFileException`, `IOException`, and `LineUnavailableException`.

### Notes

- Ensure that the audio file `how-deep.wav` is present in the same directory as the program before running it.
- The program will display an error message if an invalid command is entered.
