import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Main  {
    public static void main(String[] args) {

       JFrame jFrame=getframe();
       jFrame.add(new MyComponent());

//       String[] fonts=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//        for (String s:fonts) {
//            System.out.println(s);
//
//        }
    }
    static class MyComponent extends JComponent{
        @Override
        protected void paintComponent(Graphics g) {
            Font font=new Font("Arial",Font.ITALIC,20);
            Graphics2D g2=(Graphics2D)g;
            g2.setFont(font);
            g2.drawString("Ayten",50,50);
            try {
                URL url=new URL("https://images.pexels.com/photos/851037/pexels-photo-851037.jpeg");
                Image image=new ImageIcon("C:\\Users\\UFAZ\\Desktop\\photo.jpg").getImage();
                g2.drawImage(image,220,50,null);

            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }


        }
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
        jframe.setBounds(dm.width/2-150,dm.height/2-450,300,900);




       return jframe;

    }


}