import java.awt.*;  
import javax.swing.*;

/**
* SER-516 Software Agility
* Panel_17 that displays name Label along with Hi Label
* @author Manikanta Chintakunta, mchintak@asu.edu
* @version 1.3
* @since 01-18-19
*/

@SuppressWarnings("serial")
public class Panel_17 extends JPanel implements PanelInterface {
	private JLabel message_label;
	private JLabel name_label;
	
    public Panel_17() 
    {
    	name_label = new JLabel("Manikanta Chintakunta");
    	name_label.setFont(new Font("TimesRoman", Font.BOLD ,25));
	this.add(name_label);
	message_label = new JLabel("<html><br />Hi</html>",JLabel.CENTER);
	message_label.setFont(new Font("TimesRoman", Font.BOLD ,15));
	this.add(message_label);
	this.setBackground(Color.GRAY);
	message_label.setVisible(false);
    }
    /**
    * Visibility of the Hi Label is set using a flag
    * @param flag holds the value either true or false
    */
    public void sayHi(boolean flag){
	this.message_label.setVisible(flag);
    }	
}
    
