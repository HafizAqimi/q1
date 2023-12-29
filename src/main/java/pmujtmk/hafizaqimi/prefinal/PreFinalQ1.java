// HAFIZ AQIMI BIN JUHAILI
// 20DDT21F1013

package pmujtmk.hafizaqimi.prefinal;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class PreFinalQ1 {

    //Title
    JFrame f;
    JLabel lbl_title;
    JPanel pnl_title, pnl_north;
    
    //Content
    JPanel pnl_center, pnl_content;
    //comp 1
    JPanel pnl_1;
    JLabel lbl_1;
    JTextField txt_1;
    
    //comp 2
    JPanel pnl_2;
    JLabel lbl_2;
    JComboBox cb_2;
    
    //comp 3
    JPanel pnl_3;
    JLabel lbl_3;
    JComboBox cb_3;
    
    //comp 4
    JPanel pnl_4;
    JLabel lbl_4;
    JTextField txt_4;
    
    //comp 5 - supposedly datepicker
    JPanel pnl_5;
    JLabel lbl_5;
    JTextField txt_5;
    
    //comp 6
    JPanel pnl_6;
    JLabel lbl_6;
    JTextField txt_6;
    
    //comp 7 - supposedly datepicker
    JPanel pnl_7;
    JLabel lbl_7;
    JTextField txt_7;
    
    //comp 8
    JPanel pnl_8;
    JLabel lbl_8;
    JTextField txt_8;
    
    //comp 9
    JPanel pnl_9;
    JLabel lbl_9;
    JTextField txt_9;
    
    //comp 10
    JPanel pnl_10;
    JLabel lbl_10;
    JTextArea txta_10;
    
    //Button
    JPanel pnl_submit;
    JButton btn_submit;
    
    PreFinalQ1(){
        f = new JFrame("PreFinal IPT");
        f.setLayout(new BorderLayout());
        
        //Title: North
        lbl_title = new JLabel("Car Service Record Management System");
        pnl_title = new JPanel();
        pnl_title.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnl_title.add(lbl_title);
        
        //Content: Center
        //1
        lbl_1 = new JLabel("Car Plate No. :");
        txt_1 = new JTextField(10);
        pnl_1 = new JPanel();
        pnl_1.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_1.add(lbl_1);
        pnl_1.add(txt_1);
        
        //2
        lbl_2 = new JLabel("Car Make :");
        String carMake[] = {"Perodua", "Proton", "Toyota", "Nissan"};
        cb_2 = new JComboBox(carMake);
        pnl_2 = new JPanel();
        pnl_2.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_2.add(lbl_2);
        pnl_2.add(cb_2);
        
        //3
        lbl_3 = new JLabel("Car Make :");
        String carModel[] = {"Myvi", "Bezza", "Saga", "Iriz", "AE86", "Supra", "Skyline", "GT-R"};
        cb_3 = new JComboBox(carModel);
        pnl_3 = new JPanel();
        pnl_3.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_3.add(lbl_3);
        pnl_3.add(cb_3);
        
        //4
        lbl_4 = new JLabel("Current Mileage :");
        txt_4 = new JTextField(10);
        pnl_4 = new JPanel();
        pnl_4.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_4.add(lbl_4);
        pnl_4.add(txt_4);
        
        //5 - supposedly datepicker
        lbl_5 = new JLabel("Service Date :");
        txt_5 = new JTextField(10);
        pnl_5 = new JPanel();
        pnl_5.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_5.add(lbl_5);
        pnl_5.add(txt_5);
        
        //6
        lbl_6 = new JLabel("Next Service Mileage :");
        txt_6 = new JTextField(10);
        pnl_6 = new JPanel();
        pnl_6.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_6.add(lbl_6);
        pnl_6.add(txt_6);
        
        //7 - supposedly datepicker
        lbl_7 = new JLabel("Next Service Date :");
        txt_7 = new JTextField(10);
        pnl_7 = new JPanel();
        pnl_7.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_7.add(lbl_7);
        pnl_7.add(txt_7);
        
        //8
        lbl_8 = new JLabel("Customer Name :");
        txt_8 = new JTextField(10);
        pnl_8 = new JPanel();
        pnl_8.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_8.add(lbl_8);
        pnl_8.add(txt_8);
        
        //9
        lbl_9 = new JLabel("Customer Contact No. :");
        txt_9 = new JTextField(10);
        pnl_9 = new JPanel();
        pnl_9.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_9.add(lbl_9);
        pnl_9.add(txt_9);
        
        //10
        lbl_10 = new JLabel("Customer Contact No. :");
        txta_10 = new JTextArea(4,10);
        pnl_10 = new JPanel();
        pnl_10.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_10.add(lbl_10);
        pnl_10.add(txta_10);
        
        //Content add components
        pnl_center = new JPanel();
        pnl_center.setLayout(new BoxLayout(pnl_center, BoxLayout.Y_AXIS));
        pnl_center.add(pnl_1);
        pnl_center.add(pnl_2);
        pnl_center.add(pnl_3);
        pnl_center.add(pnl_4);
        pnl_center.add(pnl_5);
        pnl_center.add(pnl_6);
        pnl_center.add(pnl_7);
        pnl_center.add(pnl_8);
        pnl_center.add(pnl_9);
        pnl_center.add(pnl_10);
        
        //Button: West
        btn_submit = new JButton("Submit");
        pnl_submit = new JPanel();
        pnl_submit.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pnl_submit.add(btn_submit);
        
        //Frame Add Components
        f.add(pnl_title, BorderLayout.NORTH);
        f.add(pnl_center, BorderLayout.CENTER);
        f.add(pnl_submit, BorderLayout.SOUTH);
        
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        PreFinalQ1 app = new PreFinalQ1();
    }
}
