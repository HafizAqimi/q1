// HAFIZ AQIMI BIN JUHAILI
// 20DDT21F1013

package pmujtmk.hafizaqimi.prefinal;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.*;

public class viewAllRecord implements ActionListener {
    
    //Title
    JFrame f;
    JLabel lbl_title;
    JPanel pnl_title;
    
     //Content
    JPanel pnl_content;
    JScrollPane jsp;
    
    //Table to Display all patient data
    DefaultTableModel model;
    JTable table;
    
    //Button
    JPanel pnl_button;
    JButton btn_back;
    
    Connection conn;
    String db_url = "jdbc:mysql://localhost/prefinal_ipt";
    String db_username = "root";
    String db_password = "";
    ResultSet rs;
    PreparedStatement stmt;
    
    viewAllRecord(){
        f = new JFrame("PreFinal IPT");
        f.setLayout(new BorderLayout());
        
        //Title: North
        lbl_title = new JLabel("All Car Service Data Record");
        pnl_title = new JPanel();
        pnl_title.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnl_title.add(lbl_title);
        
        //Content: Center
        model = new DefaultTableModel();
        table = new JTable(model);
        fetch_data();

        pnl_content = new JPanel();
        pnl_content.setLayout(new BoxLayout(pnl_content, BoxLayout.X_AXIS));
        jsp = new JScrollPane(table);
        pnl_content.add(jsp);
        
        //Button: West
        btn_back = new JButton("Cancel");
        btn_back.addActionListener(this);
        pnl_button = new JPanel();
        pnl_button.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pnl_button.add(btn_back);
        
        //Frame Add Components
        f.add(pnl_title, BorderLayout.NORTH);
        f.add(pnl_content, BorderLayout.CENTER);
        f.add(pnl_button, BorderLayout.SOUTH);
        
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void fetch_data(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(db_url, db_username, db_password);
            
            String sql = "SELECT * FROM data_requirement";
            stmt = conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                rs.beforeFirst();
                JOptionPane.showMessageDialog(null, "Data Fetched!");
                
                //Reviews column names
                int columnCount = rs.getMetaData().getColumnCount();
                for(int i = 1; i <= columnCount; i++){
                    model.addColumn(rs.getMetaData().getColumnName(i));
                }
                
                // Reviews data
                while(rs.next()){
                    Object[] row = new Object[columnCount];
                    for(int i = 1;i <= columnCount;i++){
                        row[i - 1] = rs.getObject(i);
                    }
                    model.addRow(row);
                }
            }else{
                JOptionPane.showMessageDialog(null, "No data available!");
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Back
        if (e.getSource() == btn_back) {
            PreFinal app = new PreFinal();
            f.dispose();
        }
    }
    
}
