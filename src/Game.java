import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {

    JFrame window; // import javax.swing.JFrame;
    Container container; // import java.awt.Container;
    JPanel titleNamepanel, startButtonPanel; // import javax.swing.JPanel;
    JLabel titleNameLabel; // import javax.swing.JLabel;
    JButton startButton; // import javax.swing.JButton;

    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90); // import java.awt.Font;
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 30); // import java.awt.Font;

    public static void main(String[] args) {
        
        new Game();
    }

    public Game() {

        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK); // import java.awt.Color;
        window.setLayout(null);
        

        container = window.getContentPane();

        titleNamepanel = new JPanel();
        // creates a space for the text
        titleNamepanel.setBounds(100,100,600,150);
        titleNamepanel.setBackground(Color.black);
        titleNameLabel = new JLabel("ADVENTURE"); // title
        titleNameLabel.setForeground(Color.white); // color of the text
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.setFocusPainted(false); // removes the outline on start
        startButton.setBorderPainted(true);

        titleNamepanel.add(titleNameLabel);
        startButtonPanel.add(startButton); // adds the button to the startButtonPanel
        // adds the layer of the panels
        container.add(titleNamepanel);
        container.add(startButtonPanel);
        
        window.setVisible(true);
        window.setResizable(false);
    }
}
