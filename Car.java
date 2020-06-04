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

              g.setColor(Color.green);

              g.fillRect(370, 23+y, 25, 50);

              g.setColor(Color.black);

              g.drawRect(375, 35+y, 12, 25);

             }
             else if(choose==2)

             {

              g.setColor(Color.black);

              g.fillOval(485, 620-y, 10, 10);

              g.fillOval(510, 620-y, 10, 10);

              g.fillOval(485, 645-y, 10, 10);       

              g.fillOval(510, 645-y, 10, 10);

              g.setColor(Color.green);

              g.fillRect(490, 610-y, 25, 50);

              g.setColor(Color.black);

              g.drawRect(495, 625-y, 12, 15);

             }

             

             else if (choose==3) {

              g.setColor(Color.black);

              g.fillOval(10+x, 425, 10, 10);

              g.fillOval(10+x, 450, 10, 10);

              g.fillOval(35+x, 425, 10, 10);       

              g.fillOval(35+x, 450, 10, 10);

              g.setColor(Color.green);

              g.fillRect(3+x, 430, 50, 25);

              g.setColor(Color.black);

              g.drawRect(10+x, 435, 25, 12);     

             }

            

            else if (choose==4) {

              g.setColor(Color.black);

              g.fillOval(900-x, 325, 10, 10);

              g.fillOval(900-x, 350, 10, 10);

              g.fillOval(925-x, 325, 10, 10);       

              g.fillOval(925-x, 350, 10, 10);

              g.setColor(Color.green);

              g.fillRect(890-x, 330, 50, 25);

              g.setColor(Color.black);

              g.drawRect(900-x, 335, 25, 12);     

             }  

      }

}