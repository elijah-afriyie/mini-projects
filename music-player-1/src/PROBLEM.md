### Question

Write a Java program that plays, pauses, restarts, and stops an audio file using a command-line interface. Your program should meet the following requirements:

1. **Audio File**: The program should work with a specified audio file named `how-deep.wav`.
2. **Commands**: The program should accept the following commands from the user:
   - `P` to play the audio file.
   - `S` to pause the audio file.
   - `R` to restart the audio file from the beginning.
   - `Q` to quit the program.
3. **Command Loop**: The program should continuously prompt the user for commands until the user chooses to quit by entering `Q`.
4. **Error Handling**: The program should handle invalid commands by displaying an error message.

Use the `javax.sound.sampled` package to handle audio playback. 

Make sure to handle exceptions appropriately for file not found, unsupported audio file format, and line unavailable errors.

**Hint**: You can use the `AudioSystem`, `Clip`, and `AudioInputStream` classes from the `javax.sound.sampled` package to implement the audio playback functionality.

### Example Output

```
P = Play
S = Pause
R = Restart
Q = Quit
Select your option:
P
(Audio plays...)
P = Play
S = Pause
R = Restart
Q = Quit
Select your option:
S
(Audio pauses...)
P = Play
S = Pause
R = Restart
Q = Quit
Select your option:
R
(Audio restarts from the beginning...)
P = Play
S = Pause
R = Restart
Q = Quit
Select your option:
Q
(Audio stops and program exits...)
```

Use the provided Java program as a reference to create your solution.