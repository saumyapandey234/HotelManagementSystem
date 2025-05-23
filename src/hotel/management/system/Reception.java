package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Reception extends JFrame implements ActionListener {
    JButton newCustomer,rooms,department,allEmployee,managerInfo,customers,searchRoom,update, roomStatus,pickup,
            logout,checkout;
    Reception(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        newCustomer=new JButton("New Customer Form");
        newCustomer.setBounds(10,30,200,30);
        newCustomer.setBackground(Color.black);
        newCustomer.setForeground(Color.white);
        newCustomer.addActionListener(this);
        add(newCustomer);
        
        rooms=new JButton("Rooms");
        rooms.setBounds(10,70,200,30);
        rooms.setBackground(Color.black);
        rooms.setForeground(Color.white);
        rooms.addActionListener(this);
        add(rooms);
        
        JButton department=new JButton("Department");
        department.setBounds(10,110,200,30);
        department.setBackground(Color.black);
        department.setForeground(Color.white);
        department.addActionListener(this);
        add(department);
        
        allEmployee=new JButton("All Employees");
        allEmployee.setBounds(10,150,200,30);
        allEmployee.setBackground(Color.black);
        allEmployee.setForeground(Color.white);
        allEmployee.addActionListener(this);
        add(allEmployee);
        
        customers=new JButton("Customer Info");
        customers.setBounds(10,190,200,30);
        customers.setBackground(Color.black);
        customers.setForeground(Color.white);
        customers.addActionListener(this);
        add(customers);
        
        managerInfo=new JButton("Manager Info");
        managerInfo.setBounds(10,230,200,30);
        managerInfo.setBackground(Color.black);
        managerInfo.setForeground(Color.white);
        managerInfo.addActionListener(this);
        add(managerInfo);
        
        checkout=new JButton("Checkout");
        checkout.setBounds(10,270,200,30);
        checkout.setBackground(Color.black);
        checkout.setForeground(Color.white);
        checkout.addActionListener(this);
        add(checkout);
        
        update=new JButton("Update Status");
        update.setBounds(10,310,200,30);
        update.setBackground(Color.black);
        update.setForeground(Color.white);
        update.addActionListener(this);
        add(update);
        
        roomStatus=new JButton("Update Room Status");
        roomStatus.setBounds(10,350,200,30);
        roomStatus.setBackground(Color.black);
        roomStatus.setForeground(Color.white);
        roomStatus.addActionListener(this);
        add(roomStatus);
        
        pickup=new JButton("Pickup Service");
        pickup.setBounds(10,390,200,30);
        pickup.setBackground(Color.black);
        pickup.setForeground(Color.white);
        pickup.addActionListener(this);
        
        add(pickup);
        
        searchRoom=new JButton("Search Room ");
        searchRoom.setBounds(10,430,200,30);
        searchRoom.setBackground(Color.black);
        searchRoom.addActionListener(this);
        searchRoom.setForeground(Color.white);
        
        add(searchRoom);
        
        logout=new JButton("Logout");
        logout.setBounds(10,470,200,30);
        logout.setBackground(Color.black);
        logout.setForeground(Color.white);
        logout.addActionListener(this);
        add(logout);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
        JLabel image =new JLabel(i1);
        image.setBounds(250,30,500,470);
        add(image);
        
        
        
        
        
        
        
        
        
        setBounds(350,200,800,570);
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==newCustomer){
            setVisible(false);
            new AddCustomer();
            
        }else if(ae.getSource()==rooms){
            setVisible(false);
            new room();
            
        }else if(ae.getSource()==department){
            setVisible(false);
            new Department();
        }else if(ae.getSource()==allEmployee){
            setVisible(false);
            new EmployeeInfo();
        }else if(ae.getSource()==managerInfo){
            setVisible(false);
            new ManagerInfo();
        }else if(ae.getSource()==customers){
            setVisible(false);
            new CustomerInfo();
        }else if(ae.getSource()==searchRoom){
            setVisible(false);
            new Searchroom();
        }else if(ae.getSource()==update){
            setVisible(false);
            new UpdateCheck();
        }else if(ae.getSource()==roomStatus){
            setVisible(false);
            new UpdateRoom();
        }else if(ae.getSource()==pickup){
            setVisible(false);
            new Pickup();
        }else if(ae.getSource()==checkout){
            setVisible(false);
            new Checkout();
        }else if(ae.getSource()==logout){
            setVisible(false);
        }
    }
    public static void main(String args[]){
        new Reception();
    }
    
}
