package JavaProject;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frame2 extends JFrame implements ActionListener{
    
JLabel namel,idl,studysectionl,mark1l,mark2l,mark3l;
JTextField namet,idt,studysectiont,mark1t,mark2t,mark3t;
JButton signupb,backb;
JPanel leftpanel;
static int size=1;
//JPasswordField passwordt;


public frame2(){
this.setTitle("Student Form");
this.setSize(400,800);
this.setVisible(false);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setResizable(false);
//Layout
this.setLayout(null);

//Label
 namel=new JLabel("Name: ");
 idl=new JLabel("ID:");
 studysectionl=new JLabel("Subject:");
 mark1l=new JLabel("First Mark:");
 mark2l=new JLabel("Second Mark:");
 mark3l=new JLabel("Final Mark:");
 
 //TesxtField
 namet=new JTextField(40);
 idt=new JTextField(7);
 studysectiont=new JTextField(40);
 mark1t=new JTextField();
 mark2t=new JTextField();
 mark3t=new JTextField();
 //Button
 signupb=new JButton ("Add");
 backb=new JButton ("Back");
 //panel
 leftpanel =new JPanel();
 

//add label
this.add(namel);
this.add(idl);
this.add(studysectionl);
this.add(mark1l);
this.add(mark2l);
this.add(mark3l);
//add textfield
this.add(namet);
this.add(idt); 
this.add(studysectiont);
this.add(mark1t);
this.add(mark2t);
this.add(mark3t);
//add botton
this.add(signupb);
this.add(backb);
//add panel
this.add(leftpanel);

signupb.addActionListener(this);
backb.addActionListener(this);
//setbondslabel
namel.setBounds(30, 80, 100, 30);
idl.setBounds(30, 120, 100, 30);
studysectionl.setBounds(30, 160, 100, 30);
mark1l.setBounds(30, 200, 100, 30);
mark2l.setBounds(30, 240, 100, 30);
mark3l.setBounds(30, 280, 100, 30);
//setbondstextfield
namet.setBounds(120, 85, 200, 25);
idt.setBounds(120, 125, 200, 25);
studysectiont.setBounds(120, 165, 200, 25);
mark1t.setBounds(120, 205, 200, 25);
mark2t.setBounds(120,  245, 200, 25);
mark3t.setBounds(120, 285, 200, 25);
//setbondsbotton
signupb.setBounds(30, 450, 120, 25);
backb.setBounds(170, 450, 120, 25);


}

@Override
    public void actionPerformed(ActionEvent e){
        String getname,getid,getstudy,getmark1,getmark2,getmark3;
        getname=this.namet.getText();
        getid=this.idt.getText();
        getstudy=this.studysectiont.getText();
        getmark1=this.mark1t.getText();
        getmark2=this.mark2t.getText();
        getmark3=this.mark3t.getText();

      // Creates a FileReader Object
//      FileReader fr = new FileReader(file); 
//      char [] a = new char[50];
//      fr.read(a);   // reads the content to the array
//      
//      for(char c : a)
//         System.out.print(c);   // prints the characters one by one
//      fr.close();
        if(e.getSource()==signupb){
    File file = new File("student.txt");
    
    try {
        
        file.createNewFile();
        FileWriter w = new FileWriter(file,true); 
        BufferedWriter br = new BufferedWriter(w);
        PrintWriter writer=new PrintWriter(br);
        writer.println(getname+"*"+getid+"*"+getstudy+"*"+getmark1+"*"+getmark2+"*"+getmark3+"*"); 
        writer.flush();
        br.close();
        writer.close();
      
    } catch (IOException ex) {
        Logger.getLogger(frame2.class.getName()).log(Level.SEVERE, null, ex);
    }
     
             frame1 frameone=new frame1();
             frameone.setVisible(true);
              this.setVisible(false);
         }else if(e.getSource()==backb){
             frame1 frameone=new frame1();
             frameone.setVisible(true);
              this.setVisible(false);
         }
             }
       

         

    
}





    


