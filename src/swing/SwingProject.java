package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingProject {
    public static void main(String[] args) {
        JFrame jFrame=getframe();
        JPanel jPanel=new JPanel();
        jFrame.add(jPanel);
        JButton jButton=new JButton("SUBSCRIBE");
        JButton jButton1=new JButton("Aytan");
        JButton jButton2=new JButton("Diana");

        jPanel.add(jButton);
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.BLACK);
                jPanel.setBorder(BorderFactory.createMatteBorder(
                        1, 5, 10, 5, Color.red));
            }
        }
        );
    }

    static JFrame getframe(){
        JFrame jframe=new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
        jframe.setSize(300,300);
        jframe.setLocation(500,500);
        jframe.setTitle("Hello world");
        Toolkit tk=Toolkit.getDefaultToolkit();
        Dimension dm=tk.getScreenSize();
        jframe.setBounds(dm.width/2-150,dm.height/2-350,300,700);




        return jframe;

    }

}
