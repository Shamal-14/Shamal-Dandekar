import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

class MusicalInstrument {
    String name;

    MusicalInstrument() {
        this.name = "Unknown Instrument";
    }

    MusicalInstrument(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Playing some instrument sound...");
    }

    public void playSound(String filePath) {
        try {
            File soundFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            // Wait until the sound finishes
            Thread.sleep(1000);

        } catch (Exception e) {
            System.out.println("Could not play sound: " + e.getMessage());
        }
    }

    public void display() {
        System.out.println("Instrument: " + name);
    }
}

// ---------------------------------------------------------
class Piano extends MusicalInstrument {
    Piano() {
        super("Piano");
    }

    public void play() {
        System.out.println("🎹 Piano is playing...");
        playSound("piano.wav");
    }
}

// ---------------------------------------------------------
class Guitar extends MusicalInstrument {
    Guitar() {
        super("Guitar");
    }

    public void play() {
        System.out.println("🎸 Guitar is playing...");
        playSound("guitar.wav");
    }
}

// ---------------------------------------------------------
class Drum extends MusicalInstrument {
    Drum() {
        super("Drum");
    }

    public void play() {
        System.out.println("🥁 Drum is playing...");
        playSound("drum.wav");
    }
}

// ---------------------------------------------------------
class TestMusic {
    public static void main(String[] args) {

        MusicalInstrument mi;

        mi = new Piano();
        mi.display();
        mi.play();
        System.out.println();

        mi = new Guitar();
        mi.display();
        mi.play();
        System.out.println();

        mi = new Drum();
        mi.display();
        mi.play();
        System.out.println();
    }
}
