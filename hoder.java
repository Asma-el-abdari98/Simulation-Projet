package proSAA;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class hoder extends JFrame {
  private static final long serialVersionUID = 1L;
  JButton startb ;
  JLabel t1;
  JLabel t2;
  JLabel t3;
  JLabel t4;
  Timer timer;
  Route route;
  feu f1;
  feu f2;
  feu f3;
  feu f4;
  Car c;
  Car c1, c2, c3;
  int light =1;
  int iflight=3;
  JMenuBar menubar;
  JMenu reglageParametres;
  
  		public hoder(){
    startb = new JButton("Start");
	menubar = new JMenuBar();
	reglageParametres = new JMenu("Régler paramètres");
    t1 = new JLabel();
    t2 = new JLabel();
    t3 = new JLabel();
    t4 = new JLabel();
    f1 = new feu(3, 1);		//route 1
    f2 = new feu(1, 4);		//route 4
    f3 = new feu(1, 2);		//route 2
    f4 = new feu(3, 3);		//route 3
    c = new Car(1);
    c1=new Car(2);
    c2=new Car(3);
    c3=new Car(4);
    route = new Route();
    setLayout(null);
    c.setBounds(0, 0, 1000, 1000);
    c1.setBounds(0, 0, 1000, 1000);
    c2.setBounds(0, 0, 1000, 10000);
    c3.setBounds(0, 0, 1000, 1000);
    startb.setBounds(410, 535, 100, 20);
    menubar.setBounds(0, 0, 1000, 20);
    reglageParametres.setBounds(0, 0, 100, 20);
    menubar.setBackground(new Color(0,0,0,0));
    reglageParametres.setBackground(new Color(0,0,0,0));
    c.setBackground(new Color(0,0,0,0));
    c1.setBackground(new Color(0,0,0,0));
    c2.setBackground(new Color(0,0,0,0));
    c3.setBackground(new Color(1,0,0,0));
    f1.setBackground(new Color(1,0,0,0));
    f2.setBackground(new Color(1,0,0,0));
    f3.setBackground(new Color(1,0,0,0));
    f4.setBackground(new Color(1,0,0,0));
    f1.setBounds(0, 20, 1000, 1000);
    f2.setBounds(0, 20, 1000, 1000);
    f3.setBounds(0, 20, 1000, 1000);
    f4.setBounds(0, 20, 1000, 1000);
    t1.setBounds(0, 100, 100, 40);
    route.setBounds(0, 20, 1000, 1000);
    add(c);
    add(c1);
    add(c2);
    add(c3);
    add(t1);
    add(f1);
    add(f2);  
    add(f3);  
    add(f4);  
    add(route);
    add(startb);
    event e = new event();
    startb.addActionListener(e);
    menubar.add(reglageParametres);
    add(menubar);
    event1 ev = new event1();
    reglageParametres.addActionListener(ev);
}
  public void changecolor()
  {
    if (light==1)
    {
      f1.check=3;
      f2.check=1;
      f4.check=3;
      f3.check=1;
      f1.repaint();
      f2.repaint();
      f3.repaint();
      f4.repaint();
    }
    else if(light==2)
    {
      f1.check=2;
      f2.check=2;
      f4.check=2;
      f3.check=2;
      f1.repaint();
      f2.repaint();
      f3.repaint();
      f4.repaint();
    }
    else if(light==3)
    {
      f1.check=1;
      f2.check=3;
      f4.check=1;
      f3.check=3;
      f1.repaint();
      f2.repaint();
      f3.repaint();
      f4.repaint();
    } 
  }
  public class event1 implements ActionListener{
	public void actionPerformed(ActionEvent ev) {
		if(ev.getSource()==reglageParametres){
			  JFrame f = new JFrame();
			  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      f.setSize(500, 500);
		      f.setResizable(false);
		      f.setLocationRelativeTo(null);
		      f.setVisible(true);}	
	}
  }
  public class event implements ActionListener{
	  public void actionPerformed(ActionEvent e){  
      int count = 100;
      t1.setText(""+count);
      Timeclass tc = new Timeclass(count);
      timer = new Timer(100, tc);
      timer.start();
    }
    public class Timeclass implements ActionListener{
      int counter;
      public Timeclass(int counter){
        this.counter=counter;
      } 
      public void actionPerformed(ActionEvent tc){
        counter--;
        if(c.y==8*90)
        {
          c.y=0;
         }
        if (c1.y==8*90) {
          c1.y=0;
        }
       if(light==1 || c.y!=8*20)
        {
          c.y+=8;
        }
        if(light==1 || c1.y!=8*6){
          c1.y+=8;
        }
       if (c2.x==8*130) {
          c2.x=0;
        }
        if (c3.x==8*130) {
          c3.x=0;
        }
        if(light==3 || c2.x!=8*26)
        {
          c2.x+=8;
        }
        if(light==3 || c3.x!=8*35) {
          c3.x+=8;
        }
        repaint();
        if (counter >=0) {
          t1.setText(""+counter);
        }
        else{
          if (light<iflight) {
            light++;
            if (light==2) {
              counter=30;
              changecolor();
            }  
            else{
              counter=100;
              changecolor();
            }
          }
          else if(light==iflight){
            if (light==3) {
              iflight=1;
              light--;
              counter=10;
              changecolor();
            }
            else{
              iflight=3;
              light++;
              counter=10;
              changecolor();
            }
          }
          else if(light>iflight)
          {
            light--;
            counter=100;
            changecolor();
          }
         }
      }
    }
  }
      static public void main(String args[]) {
        hoder window = new hoder();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1000, 1000);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
          }
}