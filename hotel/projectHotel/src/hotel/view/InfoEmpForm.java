package hotel.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfoEmpForm extends JDialog{
    private JTextField nametxt;
    private JTextField nationtxt;
    private JTextField phonetxt;
    private JTextField addresstxt;
    private JTextField positiontxt;
    private JTextField incometxt;
    private JButton cancelButton;
    private JButton applyButton;
    private JPanel InfoEmpPanel;


    public InfoEmpForm(JFrame jFrame2){
        super(jFrame2);
        setTitle("enter your information");
        setContentPane(InfoEmpPanel);
        setSize(650,500);
        setModal(true);
        setLocationRelativeTo(jFrame2);


        //save,edit,delete information
        applyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Mission Accomplished","successful",JOptionPane.QUESTION_MESSAGE);
                dispose();
            }
        });


        //cancel
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        setVisible(true);
    }
}
