//Zachary Hansen
//Csc 142-80
//Assignment 6


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TravelExpense{
   private JFrame f;
   private JPanel p;
   private JButton reset,calc;
   private JLabel lab1,lab2,lab3,lab4,lab5,lab6,lab7,lab8;
   private JTextField field1,field2,field3,field4,field5,field6,field7,field8;
   
   //default constructor
   public TravelExpense(){
      gui();
   }
   //gui method
   public void gui(){
      f = new JFrame("Travel Expenses");
      f.setVisible(true);
      f.setSize(500,500);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      p = new JPanel();
      p.setBackground(Color.CYAN);                
      calc = new JButton("Calculate Reimbursement");
      reset = new JButton("Reset");           
      lab1 = new JLabel("Number of days on the trip:");
      lab2 = new JLabel("Amount of airfare:");
      lab3 = new JLabel("Amount of car rental:");
      lab4 = new JLabel("Miles driven:");
      lab5 = new JLabel("Parking fees:");
      lab6 = new JLabel("Taxi fees:");
      lab7 = new JLabel("Conference registration:");
      lab8 = new JLabel("Lodging charges per night:");
      field1 = new JTextField();
      field2 = new JTextField();
      field3 = new JTextField();
      field4 = new JTextField();
      field5 = new JTextField();
      field6 = new JTextField();
      field7 = new JTextField();
      field8 = new JTextField();
      p.add(calc);
      p.add(reset);
      p.add(lab1);
      p.add(field1);
      p.add(lab2);
      p.add(field2);
      p.add(lab3);
      p.add(field3);
      p.add(lab4);
      p.add(field4);
      p.add(lab5);
      p.add(field5);
      p.add(lab6);
      p.add(field6);
      p.add(lab7);
      p.add(field7);
      p.add(lab8);
      p.add(field8);
      p.setLayout(new GridLayout(20,5));
      //action listener for calc button
      calc.addActionListener(
          
          new ActionListener(){
             public void actionPerformed(ActionEvent e){
               Expense temp = new Expense(Double.parseDouble(field1.getText()),Double.parseDouble(field2.getText()),Double.parseDouble(field3.getText()),Double.parseDouble(field4.getText()),Double.parseDouble(field5.getText()),Double.parseDouble(field6.getText()),Double.parseDouble(field7.getText()),Double.parseDouble(field8.getText()));
                temp.calcTotalExpenses();
                temp.calcAllowance();
                temp.calcSavings();
             
                String expenses = " Total expenses are: "+ temp.getExpenses();
                String allowance ="Allowable Expenses: "+temp.getAllowance();
                String savings ="Amount to be paid back: "+temp.getSavings();
             
                JFrame f2 = new JFrame("Results");
                f2.setVisible(true);
                f2.setSize(300,300);
                f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
                JPanel p2 = new JPanel();
                p2.setBackground(Color.CYAN);
               
                JLabel line1 = new JLabel(expenses);
                JLabel line2 = new JLabel(allowance);
                JLabel line3 = new JLabel(savings);
                p2.setLayout(new GridLayout(3,5));
                p2.add(line1);
                p2.add(line2);
                p2.add(line3);
                f2.add(p2);
             }
          });
          //action listener for  reset button
          reset.addActionListener(
          new ActionListener(){
             public void actionPerformed(ActionEvent e){
             field1.setText("");
             field2.setText("");
             field3.setText("");
             field4.setText("");
             field5.setText("");
             field6.setText("");
             field7.setText("");
             field8.setText("");
                               }
          });
   

   
     //adds the panel into the frame
      f.add(p);
      
   }


   public static void main(String args[]){
   
      new TravelExpense();
   }
}