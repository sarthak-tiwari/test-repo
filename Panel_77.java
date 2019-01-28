import javax.swing.*;
import java.awt.*;

/*
    Author - Jainish Soni
    GitID - 77

 */
public class Panel_77 extends JPanel implements PanelInterface {

    public String p_Name = "Jainish Soni";
    JLabel label;
    public Panel_77(){

        this.setLayout(new GridBagLayout());
        label = new JLabel(p_Name);
        label.setAlignmentX(CENTER_ALIGNMENT);
        this.add(label);
        this.setAlignmentX(CENTER_ALIGNMENT);
    }

    @Override
        public void sayHi(boolean flag){
        if (flag){
            label.setText("Hi Jainish Soni");
        }
        else {
            label.setText("Jainish Soni");
        }
    }
}
