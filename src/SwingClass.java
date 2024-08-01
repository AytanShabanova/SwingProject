import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingClass {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(600,600);
        JPanel panel=new JPanel();
        JButton button=new JButton();
        JButton button1=new JButton();
        JLabel label=new JLabel();
        label.setText("XOS GELDINIZ ! ");
        button.setText("BELI");
        button1.setText("XEYIR");
        label.setBounds(0,0,100,100);
        button.setBounds(50,50,50,50);
        button1.setBounds(50,50,50,50);
        button.addActionListener(new ActionListener() {
          int c=1;
          @Override
          public void actionPerformed(ActionEvent e) {

              label.setText("BELI BUTONUNA "+ c++ +"DEFE TIKLANDI ");
          }
      });
      button1.addActionListener(new ActionListener() {
          int c=1;
          @Override
          public void actionPerformed(ActionEvent e) {

              label.setText("XEYIR BUTONUNA "+ c++ +"DEFE TIKLANDI ");
          }
      });
        panel.add(button1);
        panel.add(button);
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
