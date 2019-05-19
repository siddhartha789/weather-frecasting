package demo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class demo extends JFrame implements ActionListener
{
Choice c=new Choice();
JFrame j=new JFrame("Weather Forecast");
public void demo()
{

j.setLayout(null);
j.setVisible(true);
j.setSize(500,400);
j.setBackground(Color.CYAN);
j.setResizable(false);

JLabel l=new JLabel("Select City");
j.add(l);
c.add("Delhi");
c.add("Mumbai");
c.add("Pune");
c.add("Chandigarh");
c.add("Shimla");
c.add("Hyderabad");
c.add("Kashmir");
c.add("Bangaluru");
c.add("Mohali");
c.add("Jaipur");
c.add("Chennai");
j.add(c);
JButton b=new JButton("Submit");
b.addActionListener(this);
j.add(b);
j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
b.setBounds(200,200,80,40);
c.setBounds(280,150,100,30);
l.setBounds(150,122,110,80);
}   
public void actionPerformed(ActionEvent e){
 if(null==c.getSelectedItem())
 {JOptionPane.showMessageDialog(this,"Sunny  39 degree celsious");}
else switch (c.getSelectedItem()) {
        case "Delhi":
            JOptionPane.showMessageDialog(this,"Clear  40 degree celsious");
            break;
        case "Mumbai":
            JOptionPane.showMessageDialog(this,"Clear  32 degree celsious");
            break;
        case "Pune":
            JOptionPane.showMessageDialog(this,"Clear  35 degree celsious");
            break;
        case "Chandigarh":
            JOptionPane.showMessageDialog(this,"Clear  37 degree celsious");
            break;
        case "Shimla":
            JOptionPane.showMessageDialog(this,"Cloudy  20 degree celsious");
            break;
        case "Hyderabad":
            JOptionPane.showMessageDialog(this,"Clear  39 degree celsious");
            break;
        case "Kashmir":
            JOptionPane.showMessageDialog(this,"Rainy  15 degree celsious");
            break;
        case "Bangaluru":
            JOptionPane.showMessageDialog(this,"Sunny  33 degree celsious");
            break;
        case "Mohali":
            JOptionPane.showMessageDialog(this,"Windy  38 degree celsious");
            break;
        case "Jaipur":
            JOptionPane.showMessageDialog(this,"Sunny  40 degree celsious");
            break;
        default:
            JOptionPane.showMessageDialog(this,"Sunny  39 degree celsious");
            break;
    }
}
public static void main(String args[])
{
demo ob=new demo();
ob.demo();
}}
