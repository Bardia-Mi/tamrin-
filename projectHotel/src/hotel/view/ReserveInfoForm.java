package hotel.view;

import hotel.rooms.RoomEnti;
import hotel.rooms.RoomServ;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReserveInfoForm extends JDialog{
    private JComboBox capacitytxt;
    private JTextField daytxt;
    private JComboBox roomtypetxt;
    private JComboBox roomviewtxt;
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


                System.out.println("type= "+ roomtypetxt.getSelectedItem() );
                System.out.println("view= "+ roomviewtxt.getSelectedItem());
                System.out.println("capacity= "+ capacitytxt.getSelectedItem() );


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
