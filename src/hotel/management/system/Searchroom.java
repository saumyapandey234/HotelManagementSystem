package hotel.management.system;



import java.awt.*;

import java.sql.*;
import javax.swing.*;

import net.proteanit.sql.DbUtils;
import java.awt.event.*;


public class Searchroom extends JFrame implements ActionListener {
	JTable table;
        JButton back,submit;
        JComboBox bedType;
        JCheckBox  available;

	
                Searchroom() {
		
		getContentPane().setBackground(Color.WHITE);
                setLayout(null);
                
		JLabel text = new JLabel("Search For Room");
		text.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text.setBounds(400, 30, 200, 30);
		add(text);
                
                JLabel l1 = new JLabel("Bed Type");
		l1.setBounds(50, 100, 100, 20);
		add(l1);
                
                bedType=new JComboBox(new String[] {"Single Bed","Double Bed"});
                bedType.setBounds(150,100,150,25);
                bedType.setBackground(Color.white);
                add(bedType);
                
                available=new JCheckBox("Only display Available");
                available.setBounds(650,100,190,25);
                available.setBackground(Color.white);
                add(available);
                
                JLabel  ll=new JLabel("Room Number");
                ll.setBounds(50,160,100,20);
                add(ll);
        
                JLabel  l2=new JLabel("Availability");
                l2.setBounds(270,160,100,20);
                add(l2);
        
                JLabel  l3=new JLabel("Cleaning Status");
                l3.setBounds(450,160,100,20);
                add(l3);
        
                JLabel  l4=new JLabel("Price");
                l4.setBounds(670,160,100,20);
                add(l4);
                
                JLabel  l5=new JLabel("Price");
                l5.setBounds(870,160,100,20);
                add(l5);
                
                table = new JTable();
		table.setBounds(0, 200, 1000, 300);
		add(table);
        
                
                try{
                    conn c = new conn();
                    ResultSet rs = c.s.executeQuery("select * from room");
                    table.setModel(DbUtils.resultSetToTableModel(rs));
            
                }catch(Exception e){
                e.printStackTrace();
                }
                
                submit=new JButton("Submit");
                submit.setBackground(Color.black);
                submit.setForeground(Color.white);
                submit.addActionListener(this);
                submit.setBounds(300,520,120,30);
                add(submit);
        
                back=new JButton("Back");
                back.setBackground(Color.black);
                back.setForeground(Color.white);
                back.addActionListener(this);
                back.setBounds(500,520,120,30);
                add(back);
        
        
        
        
            setLayout(null);
            setBounds(300,200,1000,600);
            setVisible(true);
		
		
		
		
		
		
	}
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == submit){
                try{
                    String query="select * from  room where bed_type = '"+bedType.getSelectedItem()+"'";
                    String query2="select * from room where availability ='Available' AND '"+bedType.getSelectedItem()+"'";
                    conn c=new conn();
                    ResultSet rs;
                    if(available.isSelected()){
                        rs=c.s.executeQuery(query2);
                        
                    }else {
                        rs=c.s.executeQuery(query);
                        
                    }
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                }catch(Exception e){
                    e.printStackTrace();
                    
                }
            }else{
            setVisible(false);
            new Reception();
            }
            
        }
                
        public static void main(String args[]){
            new Searchroom();
        }
}
