import javax.swing.*;

public class SnakeWindow {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Mein Spiel");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 🔽 Bild laden (aus assets-Ordner)
        ImageIcon bild = new ImageIcon("assets/spieler.png");

        // 🔽 Label erstellen mit Bild
        JLabel label = new JLabel(bild);

        // 🔽 Bild ins Fenster packen
        frame.add(label);

        frame.setVisible(true);
    }
}
