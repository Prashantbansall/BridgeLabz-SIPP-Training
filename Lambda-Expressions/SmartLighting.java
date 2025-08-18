import java.util.*;

interface LightAction {
    void execute();
}

public class SmartLighting {
    public static void main(String[] args) {
        // Lambda expressions for different triggers
        LightAction motionDetected = () -> System.out.println("Lights ON: Motion detected!");
        LightAction nightTime = () -> System.out.println("Lights DIMMED: Night time mode.");
        LightAction voiceCommand = () -> System.out.println("Lights COLOR CHANGE: Voice command received.");

        // Simulating triggers
        List<LightAction> triggers = Arrays.asList(motionDetected, nightTime, voiceCommand);
        for (LightAction action : triggers) {
            action.execute();
        }
    }
}

