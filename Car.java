package proSAA;

import javax.swing.*;

import java.awt.*;

public class Car extends JPanel 
{
       private static final long serialVersionUID = 1L;

       int y=0;

       int x=0;

       int choose;
       
       public Car(int choose) {
   		super();
   		this.choose = choose;
   	}
       public void paintComponent(final Graphics g) {
             super.paintComponent(g);
             if(choose==1)
             {
              g.setColor(Color.black);

              g.fillOval(365, 30+y, 10, 10);

              g.fillOval(390, 30+y, 10, 10);

              g.fillOval(365, 55+y, 10, 10);       

              g.fillOval(390, 55+y, 10, 10);

              g.setColor(new Color(201,201,201));

              g.fillRect(370, 23+y, 25, 50);

              g.setColor(Color.black);

              g.drawRect(375, 35+y, 12, 25);

             }
             else if(choose==2)

             {

              g.setColor(Color.black);

              g.fillOval(470, 620-y, 10, 10);

              g.fillOval(495, 620-y, 10, 10);

              g.fillOval(470, 645-y, 10, 10);       

              g.fillOval(495, 645-y, 10, 10);

              g.setColor(new Color(128,64,64));

              g.fillRect(475, 610-y, 25, 50);

              g.setColor(Color.black);

              g.drawRect(480, 625-y, 12, 15);

             }

             

         else if (choose==3) {

              g.setColor(Color.black);

              g.fillOval(10+x, 430, 10, 10);

              g.fillOval(10+x, 455, 10, 10);

              g.fillOval(35+x, 430, 10, 10);       

              g.fillOval(35+x, 455, 10, 10);

              g.setColor(new Color(207,24,189));

              g.fillRect(3+x, 435, 50, 25);

              g.setColor(Color.black);

              g.drawRect(10+x, 440, 25, 12);     

             }

           

           else if (choose==4) {

              g.setColor(Color.black);

              g.fillOval(900-x, 325, 10, 10);

              g.fillOval(900-x, 350, 10, 10);

              g.fillOval(925-x, 325, 10, 10);       

              g.fillOval(925-x, 350, 10, 10);

              g.setColor(new Color(208,217,53));

              g.fillRect(890-x, 330, 50, 25);

              g.setColor(Color.black);

              g.drawRect(900-x, 335, 25, 12);     

             }  

      }

}