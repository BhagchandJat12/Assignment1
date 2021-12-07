import java.awt.Color;

import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class GenerateIDframe implements ActionListener{

    JFrame frame;
    JTextField label;
    JButton GenerateId;
    GenerateIDframe(){
         frame= new JFrame();
        frame.setSize(500,500);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setBackground(Color.GREEN);
        label= new JTextField();
        label.setBorder(new LineBorder(Color.BLUE));
        label.setBounds(150,50,200, 30);
        
        
        GenerateId= new JButton("Generate ID");
        GenerateId.setBorder(new LineBorder(Color.CYAN));
        GenerateId.setBounds(170,150,70,30);
        GenerateId.addActionListener(this);
        frame.add(label);
        frame.add(GenerateId);
    }
       public void actionPerformed(java.awt.event.ActionEvent evt){
            Random random= new Random();
            String ID="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
            StringBuilder sb= new StringBuilder();
            StringBuilder st= new StringBuilder();
            StringBuilder sm= new StringBuilder();
            for(int i=1;i<=8;i++){
                sb.append(ID.charAt(random.nextInt(ID.length())));
                st.append(ID.charAt(random.nextInt(ID.length())));
                sm.append(ID.charAt(random.nextInt(ID.length())));
            }
            label.setText(sb.toString()+"-"+st.toString()+"-"+sm.toString());
        

    }

    public static void main(String ...BhagchandJat) {
       GenerateIDframe gf= new GenerateIDframe();
        
    

  /*  @Override
    public void actionPerformed(ActionEvent e) {
        Random random= new Random();
        String ID="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb= new StringBuilder();
        StringBuilder st= new StringBuilder();
        StringBuilder sm= new StringBuilder();
        for(int i=1;i<=8;i++){
            sb.append(ID.charAt(random.nextInt(ID.length())));
            st.append(ID.charAt(random.nextInt(ID.length())));
            sm.append(ID.charAt(random.nextInt(ID.length())));
        }
        label.setText(sb.toString()+"-"+st.toString()+"-"+sm.toString());
    
        */
    }
}
