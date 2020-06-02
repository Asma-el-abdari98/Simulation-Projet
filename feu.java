package proSAA;

import javax.swing.*;

import java.awt.*;
class feu extends JPanel{
       private static final long serialVersionUID = 1L;
            int check;
            int numRoute;
            public feu(int check, int numRoute) {
    			super();
    			this.check = check;
    			this.numRoute = numRoute;
            }
            public void paintComponent(final Graphics g) {
           super.paintComponent(g);
        	 if(numRoute==1){
                 if(check==1)
                 {     	
        		 	g.setColor(Color.red);
        			g.fillOval(340, 250, 15, 15);   //route 1
                    g.setColor(new Color(130, 65, 0));
        			g.fillOval(340, 230, 15, 15); //route 1
                    g.setColor(new Color(0, 62, 16));
        			g.fillOval(340, 210, 15, 15);//route 1
                 } else if (check==2){
                	 g.setColor(new Color(111, 0, 0));
                	 g.fillOval(340, 250, 15, 15);   //route 1
                	 g.setColor(Color.orange);
                	 g.fillOval(340, 230, 15, 15); //route 1
                	 g.setColor(new Color(0, 62, 16));
                	 g.fillOval(340, 210, 15, 15);//route 1
                 }else if (check==3){
                	 g.setColor(new Color(111, 0, 0));
                	 g.fillOval(340, 250, 15, 15);   //route 1
                	 g.setColor(new Color(130, 65, 0));
                	 g.fillOval(340, 230, 15, 15); //route 1
                	 g.setColor(Color.green);
                	 g.fillOval(340, 210, 15, 15);//route 1
                 }
            }else if(numRoute==2){
            	if(check==1)
                {     	
       		 	g.setColor(Color.red);
       		 	g.fillOval(310, 505, 15, 15);//route 2
                g.setColor(new Color(130, 65, 0));
                g.fillOval(290, 505, 15, 15); //route 2
                g.setColor(new Color(0, 62, 16));
                g.fillOval(270, 505, 15, 15);//route 2
                } else if (check==2){
               	 g.setColor(new Color(111, 0, 0));
               	 g.fillOval(310, 505, 15, 15);//route 2
               	 g.setColor(Color.orange);
               	 g.fillOval(290, 505, 15, 15); //route 2
               	 g.setColor(new Color(0, 62, 16));
               	 g.fillOval(270, 505, 15, 15);//route 2
                }else if (check==3){
               	 g.setColor(new Color(111, 0, 0));
               	 g.fillOval(310, 505, 15, 15);//route 2
               	 g.setColor(new Color(130, 65, 0));
               	 g.fillOval(290, 505, 15, 15); //route 2
               	 g.setColor(Color.green);
               	 g.fillOval(270, 505, 15, 15);//route 2
                }
            }else if(numRoute==3){
            	if(check==1)
                {     	
       		 	g.setColor(Color.red);
       			g.fillOval(565, 540, 15, 15); //route 3
                   g.setColor(new Color(130, 65, 0));
               	g.fillOval(565, 560, 15, 15);//route3
                   g.setColor(new Color(0, 62, 16));
               	g.fillOval(565, 580, 15, 15); //route 3
                } else if (check==2){
               	 g.setColor(new Color(111, 0, 0));
             	g.fillOval(565, 540, 15, 15); //route 3
               	 g.setColor(Color.orange);
             	g.fillOval(565, 560, 15, 15);//route3
               	 g.setColor(new Color(0, 62, 16));
             	g.fillOval(565, 580, 15, 15); //route 3
                }else if (check==3){
               	 g.setColor(new Color(111, 0, 0));
             	g.fillOval(565, 540, 15, 15); //route 3
               	 g.setColor(new Color(130, 65, 0));
             	g.fillOval(565, 560, 15, 15);//route3
               	 g.setColor(Color.green);
             	g.fillOval(565, 580, 15, 15); //route 3
                }
            }else if(numRoute==4){
            	if(check==1)
                {     	
       		 	g.setColor(Color.red);
       		 g.fillOval(600, 280, 15, 15);//route4
                   g.setColor(new Color(130, 65, 0));
                   g.fillOval(620, 280, 15, 15);//route 4
                   g.setColor(new Color(0, 62, 16));
                   g.fillOval(640, 280, 15, 15);//route 4
                } else if (check==2){
               	 g.setColor(new Color(111, 0, 0));
               	 g.fillOval(600, 280, 15, 15);//route4
               	 g.setColor(Color.orange);
               	 g.fillOval(620, 280, 15, 15);//route 4
               	 g.setColor(new Color(0, 62, 16));
               	 g.fillOval(640, 280, 15, 15);//route 4
                }else if (check==3){
               	 g.setColor(new Color(111, 0, 0));
               	 g.fillOval(600, 280, 15, 15);//route4
               	 g.setColor(new Color(130, 65, 0));
               	 g.fillOval(620, 280, 15, 15);//route 4
               	 g.setColor(Color.green);
               	 g.fillOval(640, 280, 15, 15);//route 4
                }
            }        
         }
      }