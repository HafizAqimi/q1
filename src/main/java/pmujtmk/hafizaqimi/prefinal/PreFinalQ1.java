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
    
    //comp 5
    JPanel pnl_5;
    JLabel lbl_5;
    JTextField txt_5;
    
    
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
        
        //Content add components
        pnl_center = new JPanel();
        pnl_center.setLayout(new GridLayout(10,1));
        pnl_center.add(pnl_1);
        pnl_center.add(pnl_2);
        pnl_center.add(pnl_3);
        pnl_center.add(pnl_4);
        
        //Frame Add Components
        f.add(pnl_title, BorderLayout.NORTH);
        f.add(pnl_center, BorderLayout.CENTER);
        
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        PreFinalQ1 app = new PreFinalQ1();
    }
}
