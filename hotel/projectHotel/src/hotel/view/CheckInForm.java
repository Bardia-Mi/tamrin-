package hotel.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class CheckInForm extends JDialog{
    private JComboBox nationtxt;
    private JTextField nametxt;
    private JTextField napasstxt;
    private JTextField phonetxt;
    private JTextField costtxt;
    private JButton cancelButton;
    private JButton applyButton;
    private JPanel CheckInPanel;

    public CheckInForm(JFrame jFrame5){

        super(jFrame5);
        setTitle("edit your information");
        setContentPane(CheckInPanel);
        setSize(620,500);
        setModal(true);
        setLocationRelativeTo(jFrame5);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        //aplly check in and pay
        applyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String price = costtxt.getText();
                Integer money = Integer.valueOf(price);
                nationtxt.setSelectedIndex(1);

              if (money<=100 && money>=20){
                  JOptionPane.showMessageDialog(null,"Mission Accomplished","successful",JOptionPane.QUESTION_MESSAGE);
                  dispose();
              }else {
                  JOptionPane.showMessageDialog(null, "Money Is Not Matched ", "error", JOptionPane.ERROR_MESSAGE);
              }

            }
        });

        //cancel check in
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setVisible(true);
        costtxt.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
//                costtxt.setText();
            }
        });
    }
}
