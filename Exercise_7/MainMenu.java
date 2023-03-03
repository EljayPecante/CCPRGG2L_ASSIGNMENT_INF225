import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

    MainMenu(){

        // JLabel
        JLabel imageLabel = new JLabel();
        // Cat Image download from Internet
        ImageIcon catImage = new ImageIcon("PoleDancingCat.gif");
        // set image label to frame
        imageLabel.setIcon(catImage);

        // JButton
        JButton startButton = new JButton();
        startButton.setText("Start Game");
        startButton.setFont(new Font("Arial", Font.BOLD, 50));

        // Add event
        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);

        // Add Label and image to frame
        this.add(imageLabel);
        this.add(startButton);

        // Frame layout
        this.setLayout(new FlowLayout());
        // Frame title
        this.setTitle("Snake Game");
        // Terminates
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Frame size
        this.setSize(700, 800 );
        // Puts frame
        this.setLocationRelativeTo(null);
        // MAke frame appear
        this.setVisible(true);
        // Dsiable resize
        this.setResizable(false);
        // set background color
        this.getContentPane().setBackground(Color.GRAY);


    }

    // Event Handler
    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            //Goes to color menu
            new ColorMenu();

            // Close frame
            dispose();
        }


    }
}
