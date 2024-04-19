import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

public class Design extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
     public  void paint(Graphics g) {
         Graphics2D g2=(Graphics2D) g;
         g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
         BasicStroke pen1=new BasicStroke(4);
         BasicStroke pen2=new BasicStroke(2);

         int[] xPoints={373,480,494,502,490,521,524,493,510,503,483,374};
         int[] yPoints={230,192,165,169,192,187,198,202,219,224,205,243};

         // основание
         g2.setStroke(pen1);
         Ellipse2D.Double e3=new Ellipse2D.Double(170,290,240,215);
         g2.setColor(Color.WHITE);
         g2.fill(e3);
         g2.setColor(Color.BLACK);
         g2.draw(e3);
         //рука справа
         g2.drawPolyline(xPoints,yPoints,12);
         //корпус
         Ellipse2D.Double e2=new Ellipse2D.Double(205, 180,175,150);
         g2.setColor(Color.WHITE);
         g2.fill(e2);
         g2.setColor(Color.BLACK);
         g2.draw(e2);
         //рука слева
         GeneralPath gp2=new GeneralPath();
         gp2.moveTo(230,237);//1
         gp2.lineTo(127,209);//2
         gp2.lineTo(102,230);//3
         gp2.lineTo(96,225);//4
         gp2.lineTo(117,206);//5
         gp2.lineTo(81,200);//6
         gp2.lineTo(83,190);//7
         gp2.lineTo(119,196);//8
         gp2.lineTo(104,170);//9
         gp2.lineTo(111,166);//10
         gp2.lineTo(127,196);//11
         gp2.lineTo(233,224);//12
         gp2.closePath();
         g2.setColor(Color.WHITE);
         g2.fill(gp2);
         g2.setColor(Color.BLACK);
         g2.draw(gp2);
         //голова
         Ellipse2D.Double e1=new Ellipse2D.Double(240, 100, 110, 100);
         g2.setColor(Color.WHITE);
         g2.fill(e1);
         g2.setColor(Color.BLACK);
         g2.draw(e1);
         //шляпа
         // поля шляпы
         Ellipse2D.Double e4=new Ellipse2D.Double(225,95,140,25);
         g2.setColor(Color.WHITE);
         g2.fill(e4);
         g2.setColor(Color.BLACK);
         g2.draw(e4);
         //шляпа
         //циллиндр
         GeneralPath gp1=new GeneralPath();
         gp1.moveTo(255,97);//1
         gp1.lineTo(255,51);//2
         gp1.quadTo(255,39,272,39);//3
         gp1.lineTo(323,39);//4
         gp1.quadTo(340,39,340,51);//5
         gp1.lineTo(340,99);//6
         gp1.quadTo(340,101,336,101);//7
         gp1.lineTo(259,101);//8
         gp1.quadTo(255,101,255,97);
         gp1.closePath();
         g2.setColor(Color.WHITE);
         g2.fill(gp1);
         g2.setColor(Color.BLACK);
         g2.draw(gp1);
         //Шляпа
         //полоска
         g2.drawLine(255,80,340,80);
         // пуговицы
         g2.setStroke(pen2);
         g2.drawOval(307, 280,10,10);
         g2.drawOval(307, 255,10,10);
         g2.drawOval(307, 230,10,10);
         //глаза
         g2.drawOval(282, 130,12,12);
         g2.drawOval(315, 130,12,12);
         //рот
         g2.drawOval(276, 169,10,10);
         g2.drawOval(292, 174,10,10);
         g2.drawOval(309, 174,10,10);
         g2.drawOval(324, 168,10,10);
         //нос
         GeneralPath gp3=new GeneralPath();
         gp3.moveTo(302,148);
         gp3.lineTo(370,148);
         gp3.lineTo(306,165);
         gp3.closePath();
         g2.setColor(Color.WHITE);
         g2.fill(gp3);
         g2.setColor(Color.BLACK);
         g2.draw(gp3);g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);


     }

}
