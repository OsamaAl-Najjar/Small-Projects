package JavaProject;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;


public class frame1 extends JFrame implements ActionListener{
    
JLabel idl,passwordl,name11,id11,study11,mark11,mark22,mark33;
JTextField idt,passwordt;
//JPasswordField passwordt;
JButton Loginb,singupb,removeb;
JPanel leftpanel;
 String name1,id1,study1,mark1,mark2,mark3;
     int loc1,loc2,loc3,loc4,loc5,loc6;



public frame1(){
this.setTitle("Student Form");
this.setSize(400,800);
this.setVisible(true);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setResizable(false);
//Layout
this.setLayout(null);

//Label
 
 idl=new JLabel("ID:");
// name=new JLabel("Name :");
// id=new JLabel("ID :");
// study=new JLabel("Study Section :");
// mark1=new JLabel("First Mark :");
// mark2=new JLabel("Second Mark :");
// mark3=new JLabel("Final Mark :");
              name11=new JLabel();
             id11=new JLabel();
             study11=new JLabel();
             mark11=new JLabel();
             mark22=new JLabel();
             mark33=new JLabel();
             
 passwordl=new JLabel("Password: ");
 
 //TesxtField

 idt=new JTextField(20);
 passwordt=new JTextField(40);

 //Button
 Loginb=new JButton ("Show Information");
 singupb=new JButton ("Add a Student");
 removeb=new JButton ("Remove");
 //panel
 leftpanel =new JPanel();
 

//add label
this.add(idl);
this.add(idt);
this.add(name11);
this.add(id11);
this.add(study11);
this.add(mark11);
this.add(mark22);
this.add(mark33);
//this.add(passwordl);
//this.add(passwordt);
this.add(Loginb);
this.add(singupb);
this.add(removeb);



Loginb.addActionListener(this);
singupb.addActionListener(this);
removeb.addActionListener(this);
//setbondslabel
idl.setBounds(30, 50, 100, 30);
name11.setBounds(30, 100, 100, 30);
id11.setBounds(30, 140, 100, 30);
study11.setBounds(30, 180, 100, 30);
mark11.setBounds(30, 220, 100, 30);
mark22.setBounds(30, 260, 100, 30);
mark33.setBounds(30, 300, 100, 30);
//passwordl.setBounds(30, 120, 100, 30);
//passwordt.setBounds(120, 125, 200, 25);
idt.setBounds(120, 55, 200, 25);
Loginb.setBounds(40, 600, 120, 25);
singupb.setBounds(190, 600, 120, 25);
removeb.setBounds(190, 640, 120, 25);




}


@Override
    public void actionPerformed(ActionEvent e){
        frame2 frametwo=new frame2();
         frametwo.setVisible(false);
         String id;
         String getname,getid;
        
       // getname=this.namet.getText();
        getid=this.idt.getText();
   
   if(e.getSource()==singupb){
         frametwo.setVisible(true);
       this.setVisible(false);

     
   }else 
    if (e.getSource()==Loginb){
     FileReader fr;
            try {
                fr = new FileReader("student.txt");
//               String [] a = new String[50];
                BufferedReader read= new BufferedReader(fr);
                StringBuffer newline=new StringBuffer();
                String o;
                while((o=read.readLine())!=null){
                   
            this.loc1=o.indexOf("*");
            this.loc2=o.indexOf("*",loc1+1);
            this.loc3=o.indexOf("*",loc2+1);
            this.loc4=o.indexOf("*",loc3+1);
            this.loc5=o.indexOf("*",loc4+1);
            this.loc6=o.indexOf("*",loc5+1);
              this.name1=o.substring(0,loc1);
              this.id1=o.substring(loc1+1,loc2);
              this.study1=o.substring(loc2+1,loc3);
              this.mark1=o.substring(loc3+1,loc4);
              this.mark2=o.substring(loc4+1,loc5);
              this.mark3=o.substring(loc5+1,loc6);
                if(id1.equals(getid)){
             name11.setText("Name :"+this.name1);
             id11.setText("ID :"+this.id1);
             study11.setText("Study Section :"+this.study1);
             mark11.setText("First Mark :"+this.mark1);
             mark22.setText("Second Mark :"+this.mark2);
             mark33.setText("Final Mark :"+this.mark3);
              System.out.println(id1);
                }
                else{
                newline.append(o);
                newline.append("\n");
                }
                fr.close();}
//                if(!id1.equals(getid)){
//             name11.setText("");
//             id11.setText("");
//             study11.setText("");
//             mark11.setText("");
//             mark22.setText("");
//             mark33.setText("");
//             JOptionPane.showMessageDialog(null,"Not Found");}
               
            } catch (IOException ex) {
                
                System.out.println(ex);
            }
    
    }else 
    if (e.getSource()==removeb){
       
            name11.setText("");
             id11.setText("");
             study11.setText("");
             mark11.setText("");
             mark22.setText("");
             mark33.setText("");
             idt.setText("");
}}
}