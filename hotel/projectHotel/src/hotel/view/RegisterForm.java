package hotel.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterForm extends JDialog{
    private JTextField usertxt;
    private JTextField passtxt;
    private JButton cancelButton;
    private JButton loginButton;
    private JPanel registerPanel;

    public RegisterForm(JFrame jFrame1){
        super(jFrame1);
        setTitle("enter username & password");
        setContentPane(registerPanel);
        setSize(520,480);
        setModal(true);
        setLocationRelativeTo(jFrame1);

        //login employee
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uname1="emad";
                String pass1="emad1234";

                String uname2="bardia";
                String pass2="bardia1234";

                String uname3="negar";
                String pass3="negar1234";

                String uname4="sara";
                String pass4="sara1234";

                String uname5="nora";
                String pass5="nora1234";


                if(uname1.equals(usertxt.getText()) && pass1.equals(passtxt.getText())) {
                    InfoEmpForm infoEmpForm = new InfoEmpForm(null);
                    dispose();
                }else if(uname2.equals(usertxt.getText()) && pass2.equals(passtxt.getText())) {
                    InfoEmpForm infoEmpForm = new InfoEmpForm(null);
                    dispose();
                }else if(uname3.equals(usertxt.getText()) && pass3.equals(passtxt.getText())) {
                    InfoEmpForm infoEmpForm = new InfoEmpForm(null);
                    dispose();
                }else if(uname4.equals(usertxt.getText()) && pass4.equals(passtxt.getText())) {
                    InfoEmpForm infoEmpForm = new InfoEmpForm(null);
                    dispose();
                }else if(uname5.equals(usertxt.getText()) && pass5.equals(passtxt.getText())) {
                    InfoEmpForm infoEmpForm = new InfoEmpForm(null);
                    dispose();
                }
                else{

                    JOptionPane.showMessageDialog(null,"invalid username or password","error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        //close
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        setVisible(true);
    }

}
