// HAFIZ AQIMI BIN JUHAILI
// 20DDT21F1013

package pmujtmk.hafizaqimi.prefinal;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class updateRecord implements ActionListener {
    
    //Title
    JFrame f;
    JLabel lbl_title;
    JPanel pnl_title;
    
    //Search
    JPanel pnl_search;
    JLabel lbl_search;
    JTextField txt_search;
    JButton btn_search;
    
    //Content
    JPanel pnl_content;
    
    //Result
    JPanel pnl_id;
    JLabel lbl_id;
    JTextField txt_id;
    
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
    JPanel pnl_button;
    JButton btn_cancel, btn_update;
    
    //XAMPP
    Connection conn;
    String db_url = "jdbc:mysql://localhost/prefinal_ipt";
    String db_username = "root";
    String db_password = "";
    ResultSet rs;
    PreparedStatement stmt;
    
    updateRecord(){
        f = new JFrame("PreFinal IPT");
        f.setLayout(new BorderLayout());
        
        //Title: North
        lbl_title = new JLabel("Updating Car Requirement Record");
        pnl_title = new JPanel();
        pnl_title.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnl_title.add(lbl_title);
        
        //Search
        lbl_search = new JLabel("Search ID :");
        lbl_search.setPreferredSize(new Dimension(70,25));
        txt_search = new JTextField(5);
        btn_search = new JButton("Search");
        btn_search.addActionListener(this);
        pnl_search = new JPanel();
        pnl_search.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnl_search.add(lbl_search);
        pnl_search.add(txt_search);
        pnl_search.add(btn_search);
        
        //Content: Center
        //Result
        lbl_id = new JLabel("ID: ");
        lbl_id.setPreferredSize(new Dimension(140,15));
        txt_id = new JTextField(5);
        txt_id.setEditable(false);
        pnl_id = new JPanel();
        pnl_id.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_id.add(lbl_id);
        pnl_id.add(txt_id);
        
        //1
        lbl_1 = new JLabel("Car Plate No. :");
        lbl_1.setPreferredSize(new Dimension(140,15));
        txt_1 = new JTextField(10);
        pnl_1 = new JPanel();
        pnl_1.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_1.add(lbl_1);
        pnl_1.add(txt_1);
        
        //2
        lbl_2 = new JLabel("Car Make :");
        lbl_2.setPreferredSize(new Dimension(140,15));
        String carMake[] = {"Perodua", "Proton", "Toyota", "Nissan"};
        cb_2 = new JComboBox(carMake);
        pnl_2 = new JPanel();
        pnl_2.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_2.add(lbl_2);
        pnl_2.add(cb_2);
        
        //3
        lbl_3 = new JLabel("Car Make :");
        lbl_3.setPreferredSize(new Dimension(140,15));
        String[] carModel = {"Myvi", "Bezza", "Saga", "Iriz", "AE86", "Supra", "Skyline", "GT-R"};
        cb_3 = new JComboBox(carModel);
        pnl_3 = new JPanel();
        pnl_3.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_3.add(lbl_3);
        pnl_3.add(cb_3);
        
        //4
        lbl_4 = new JLabel("Current Mileage :");
        lbl_4.setPreferredSize(new Dimension(140,15));
        txt_4 = new JTextField(10);
        pnl_4 = new JPanel();
        pnl_4.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_4.add(lbl_4);
        pnl_4.add(txt_4);
        
        //5 - supposedly datepicker
        lbl_5 = new JLabel("Service Date :");
        lbl_5.setPreferredSize(new Dimension(140,15));
        txt_5 = new JTextField(10);
        pnl_5 = new JPanel();
        pnl_5.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_5.add(lbl_5);
        pnl_5.add(txt_5);
        
        //6
        lbl_6 = new JLabel("Next Service Mileage :");
        lbl_6.setPreferredSize(new Dimension(140,15));
        txt_6 = new JTextField(10);
        pnl_6 = new JPanel();
        pnl_6.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_6.add(lbl_6);
        pnl_6.add(txt_6);
        
        //7 - supposedly datepicker
        lbl_7 = new JLabel("Next Service Date :");
        lbl_7.setPreferredSize(new Dimension(140,15));
        txt_7 = new JTextField(10);
        pnl_7 = new JPanel();
        pnl_7.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_7.add(lbl_7);
        pnl_7.add(txt_7);
        
        //8
        lbl_8 = new JLabel("Customer Name :");
        lbl_8.setPreferredSize(new Dimension(140,15));
        txt_8 = new JTextField(10);
        pnl_8 = new JPanel();
        pnl_8.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_8.add(lbl_8);
        pnl_8.add(txt_8);
        
        //9
        lbl_9 = new JLabel("Customer Contact No. :");
        lbl_9.setPreferredSize(new Dimension(140,15));
        txt_9 = new JTextField(10);
        pnl_9 = new JPanel();
        pnl_9.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_9.add(lbl_9);
        pnl_9.add(txt_9);
        
        //10
        lbl_10 = new JLabel("Customer Contact No. :");
        lbl_10.setPreferredSize(new Dimension(140,15));
        txta_10 = new JTextArea(4,10);
        pnl_10 = new JPanel();
        pnl_10.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_10.add(lbl_10);
        pnl_10.add(txta_10);
        
        //Content add components
        pnl_content = new JPanel();
        pnl_content.setLayout(new BoxLayout(pnl_content, BoxLayout.Y_AXIS));
        pnl_content.add(pnl_search);
        pnl_content.add(pnl_id);
        pnl_content.add(pnl_1);
        pnl_content.add(pnl_2);
        pnl_content.add(pnl_3);
        pnl_content.add(pnl_4);
        pnl_content.add(pnl_5);
        pnl_content.add(pnl_6);
        pnl_content.add(pnl_7);
        pnl_content.add(pnl_8);
        pnl_content.add(pnl_9);
        pnl_content.add(pnl_10);
        
        //Button: West
        btn_cancel = new JButton("Cancel");
        btn_cancel.addActionListener(this);
        btn_update = new JButton("Update");
        btn_update.addActionListener(this);
        pnl_button = new JPanel();
        pnl_button.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pnl_button.add(btn_cancel);
        pnl_button.add(btn_update);
        
        //Frame Add Components
        f.add(pnl_title, BorderLayout.NORTH);
        f.add(pnl_content, BorderLayout.CENTER);
        f.add(pnl_button, BorderLayout.SOUTH);
        
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Back
        if (e.getSource() == btn_cancel) {
            PreFinal app = new PreFinal();
            f.dispose();
        }
        //Updating
        if (e.getSource() == btn_update) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(db_url, db_username, db_password);

                String sql = "UPDATE data_requirement SET carPlateNo=?, carMake=?,"
                        + " carModel=?, currentMileage=?, serviceDate=?, nextServiceMileage=?,"
                        + " nextServiceDate=?, customerName=?, customerContactNo=?, remarks=? WHERE id=?";
                stmt = conn.prepareStatement(sql);
                
                stmt.setString(1, txt_1.getText());
                
                stmt.setString(2, cb_2.getSelectedItem().toString());
                
                stmt.setString(3, cb_3.getSelectedItem().toString());
                
                stmt.setInt(4, Integer.parseInt(txt_4.getText()));
                
                stmt.setString(5, txt_5.getText());
                
                stmt.setInt(6, Integer.parseInt(txt_6.getText()));
                
                stmt.setString(7, txt_7.getText());
                
                stmt.setString(8, txt_8.getText());
                
                stmt.setInt(9, Integer.parseInt(txt_9.getText()));
                
                stmt.setString(10, txta_10.getText());
                
                stmt.setInt(11, Integer.parseInt(txt_id.getText()));

                int status = stmt.executeUpdate();

                if (status > 0) {
                    JOptionPane.showMessageDialog(null, "Update operation success");
                } else {
                    JOptionPane.showMessageDialog(null, "Update operation failed");
                }
                
////        Determine the selected sex
//                String sex;
//                if (rb_male.isSelected()) {
//                    sex = "Male";
//                } else if (rb_female.isSelected()) {
//                    sex = "Female";
//                } else {
//                    // Handle the case when no sex is selected
//                    JOptionPane.showMessageDialog(null, "Please select the sex");
//                    return;
//                }
//                stmt.setString(3, sex);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex);
            }
        }
        //Search
        if (e.getSource() == btn_search) {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(db_url, db_username, db_password);

                String sql = "SELECT * FROM data_requirement WHERE id = ?";
                stmt = conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
                stmt.setInt(1, Integer.parseInt(txt_search.getText()));
                rs = stmt.executeQuery();

                if(rs.next()) {
                    rs.beforeFirst();
                    while(rs.next()){
                        txt_id.setText(Integer.toString(rs.getInt("id")));

                        txt_1.setText(rs.getString("carPlateNo"));

                        cb_2.setSelectedItem(rs.getString("carMake"));
                        
                        cb_3.setSelectedItem(rs.getString("carModel"));
                        
                        txt_4.setText(Integer.toString(rs.getInt("currentMileage")));
                        
                        txt_5.setText(rs.getString("serviceDate"));
                        
                        txt_6.setText(Integer.toString(rs.getInt("nextServiceMileage")));
                        
                        txt_7.setText(rs.getString("nextServiceDate"));
                        
                        txt_8.setText(rs.getString("customerName"));
                        
                        txt_9.setText(Integer.toString(rs.getInt("customerContactNo")));
                        
                        txta_10.setText(rs.getString("remarks"));
                        
//                        //                        retrieve sex data
//                        String sex = rs.getString("sex");
//                        if ("Male".equals(sex)) {
//                            rb_male.setSelected(true);
//                        } else if ("Female".equals(sex)) {
//                            rb_female.setSelected(true);
//                        }
                    }
                    JOptionPane.showMessageDialog(null, "Data Loaded.");
                    f.pack();
                }else{
                    JOptionPane.showMessageDialog(null, "No data found.");
                    txt_search.setText("");
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error: " + ex);
            }
        }
    }
    
}
