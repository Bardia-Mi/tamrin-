package hotel.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReserveInfoForm extends JDialog{
    private JComboBox comboBox1;
    private JTextField daytxt;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JButton cancelButton;
    private JButton applyButton;
    private JPanel ReserveInfoPanel;


    public ReserveInfoForm(JFrame jFrame3){
        super(jFrame3);
        setTitle("Enter your room information");
        setContentPane(ReserveInfoPanel);
        setSize(620,500);
        setModal(true);
        setLocationRelativeTo(jFrame3);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        //apply room info
        applyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CheckInForm checkInForm=new CheckInForm(null);
                dispose();
            }
        });

        //cancel room
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        setVisible(true);
    }
}
