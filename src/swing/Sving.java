package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Sving {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        Dimension dimension=toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250,dimension.height/2-150,500,300);

       jFrame.add(new MyComponenet());
       // String[] fonts=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        //for (String s:fonts){
          //  System.out.println(s);
        //}
    }
    static class MyComponenet extends JComponent{
        @Override
        protected void paintComponent(Graphics g) {
           Graphics2D g2=(Graphics2D)g;
           Font font=new Font("Arial",Font.BOLD,20);
           g2.setFont(font);
           g2.drawString("hello world",20,20);
            Point2D p1=new Point2D.Double(70,70);
            Point2D p2=new Point2D.Double(190,190);
            Line2D l2=new Line2D.Double(p1,p2);
            Ellipse2D el=new Ellipse2D.Double();
            el.setFrameFromDiagonal(p1,p2);
            Rectangle2D rc=new Rectangle2D.Double();
            rc.setFrameFromDiagonal(p1,p2);
            try {
                URL url=new URL("https://images.pexels.com/photos/851037/pexels-photo-851037.jpeg");
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            Image image=new ImageIcon("C:\\Users\\UFAZ\\Desktop\\photo").getImage();
            g2.drawImage(image,220,50,null);

            g2.draw(l2);

            g2.setPaint(Color.GREEN);
            g2.draw(el);
            g2.draw(rc);
            

        }
    }
}
