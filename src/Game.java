import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Game {

    JFrame window; // import javax.swing.JFrame;
    Container container; // import java.awt.Container;
    JPanel titleNamepanel, startButtonPanel, mainTextPanel; // import javax.swing.JPanel;
    JLabel titleNameLabel; // import javax.swing.JLabel;
    JButton startButton; // import javax.swing.JButton;
    JTextArea mainTextArea; // import javax.swing.JTextArea;

    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90); // import java.awt.Font;
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 30); // import java.awt.Font;

    TitleScreenHandler tsHandler = new TitleScreenHandler();

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

        // function
        startButton.addActionListener(tsHandler);

        titleNamepanel.add(titleNameLabel);
        startButtonPanel.add(startButton); // adds the button to the startButtonPanel
        // adds the layer of the panels
        container.add(titleNamepanel);
        container.add(startButtonPanel);
        
        window.setVisible(true);
        window.setResizable(false);
    }

    public void createGameScreen() {

        titleNamepanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.blue);
        container.add(mainTextPanel);

        mainTextArea = new JTextArea("This is the main text area. This game is going to be great.");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true); // word wrap to true
        mainTextPanel.add(mainTextArea);
        
    }

    // import java.awt.event.ActionEvent;
    // import java.awt.event.ActionListener;
    public class TitleScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            
            createGameScreen();
        }
    }
}
