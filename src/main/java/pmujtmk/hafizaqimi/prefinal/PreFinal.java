// HAFIZ AQIMI BIN JUHAILI
// 20DDT21F1013

package pmujtmk.hafizaqimi.prefinal;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PreFinal implements ActionListener {

    //Title
    JFrame f;
    JLabel lbl_title;
    JPanel pnl_title;
    
    //Content
    JPanel pnl_content;
    JButton btn_view, btn_update;
    
    
    PreFinal(){
        f = new JFrame("PreFinal IPT");
        f.setLayout(new BorderLayout());
        
        //Title: North
        lbl_title = new JLabel("Car Service Record Management System");
        pnl_title = new JPanel();
        pnl_title.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnl_title.add(lbl_title);
        
        //Content: Center
        btn_view = new JButton("View All Records");
        btn_view.addActionListener(this);
        
        btn_update = new JButton("Update a Record");
        btn_update.addActionListener(this);
        
        pnl_content = new JPanel();
        pnl_content.setLayout(new BoxLayout(pnl_content, BoxLayout.X_AXIS));
        pnl_content.add(btn_view);
        pnl_content.add(btn_update);
        
        //Frame Add Components
        f.add(pnl_title, BorderLayout.NORTH);
        f.add(pnl_content, BorderLayout.CENTER);
        
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        PreFinal app = new PreFinal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //View record
        if (e.getSource() == btn_view) {
            viewAllRecord app = new viewAllRecord();
            f.dispose();        
        }
        
        //Update a record
        if (e.getSource() == btn_update) {
            updateRecord app = new updateRecord();
            f.dispose();        
        }
    }
}
