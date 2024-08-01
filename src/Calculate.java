import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculate {
    void calculate(){
        JFrame f=new JFrame("CALCULATE");
        JLabel l1,l2,l3;
        JTextField t1,t2,t3;
        JButton btn;
        l1=new JLabel("birinci ededi daxil edin");
        l1.setBounds(50,10,200,30);
        t1=new JTextField();
        t1.setBounds(50,40,200,30);

        l2=new JLabel("ikinci ededi daxil edin");
        l2.setBounds(50,70,200,30);
        t2=new JTextField();
        t2.setBounds(50,100,200,30);
        l3=new JLabel("CEM");
        l3.setBounds(50,130,200,30);
        t3=new JTextField();
        t3.setBounds(50,160,200,30);
        btn=new JButton("CEM");
        btn.setBounds(50,220,200,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int c=a+b;
                String sum=String.valueOf(c);
                t3.setText(sum);
            }
        });



        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(btn);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);


    }

    public static void main(String[] args) {
        new Calculate().calculate();
    }
}
