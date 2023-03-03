import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TryAgain extends JFrame{
    TryAgain(){

        JButton tryAgainButton = new JButton();
        JButton exitButton = new JButton();

        tryAgainButton.setText("PlayAgain");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));
        EventHandler handler = new EventHandler();
        tryAgainButton.addActionListener(handler);

        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 25));
        ExitHandler Exit = new ExitHandler();
        exitButton.addActionListener(Exit);

        this.add(tryAgainButton);
        this.add(exitButton);

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
         this.getContentPane().setBackground(Color.gray);

        
    }
     // Event Handler
     private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            //Goes to game frame
            new MainMenu();

            // Close frame
            dispose();
        }
       
    }
     // Event Handler
     private class ExitHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
           

            // Close frame
            dispose();
        }
       
    }
}
