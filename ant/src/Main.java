import javax.swing.*;
import java.awt.*;

/**
 * Main class
 */
public class Main extends JFrame {
    public static void main(String[] args) {
        new Main();
    }
    /**
     *
     * Constructor
     */
    Main() {
        setTitle("TestWindow");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300, 300, 300, 300);
        JLabel label = new JLabel(sayGoodBay(), SwingConstants.CENTER);
        label.setFont(new Font("", Font.BOLD, 10));
        add(label);
        setVisible(true);
    }
    static String sayGoodBay() {
        return "Thanks for attention!\tBay!";
    }
}
