import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;

public class SwingArea {
    public static void main(String[] args) {
        new SwingArea().area();
    }
    void area(){
        JFrame f=new JFrame("SOZ VE HERF HESABLAYICI");
        JLabel l1,l2;
        JTextArea area;
        JButton btn;
        l1=new JLabel();
        l1.setBounds(20,25,100,30);
        l2=new JLabel();
        l2.setBounds(120,25,300,30);
        area=new JTextArea();
        area.setBounds(20,75,250,200);
        btn=new JButton("HESABLA");
        btn.setBounds(100,300,120,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String text= area.getText();
              String words[]=text.split("\\s");
              l1.setText("SOZ : "+words.length);
              l2.setText("HERF VE BOSLUQ : "+text.length());
            }
        });
        f.add(l1);
        f.add(l2);
        f.add(btn);
        f.add(area);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }


}
