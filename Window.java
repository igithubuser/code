package Window;

//main does not call public Window() idk why
//I ran some test in another program and got it to work
//beyound that its all working as i intended

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JFrame;

public class Window extends Logic implements Runnable{

    Image dbImage = createImage(600,300);
    Graphics dbGraphics = dbImage.getGraphics();
    Thread th;
    
    public void run() {
    th = new Thread(this);
    try {
    th.start();
    } catch (Exception e) {
    e.printStackTrace();}
    }
       
    public Window() {
    System.out.println("Window is being called");
    setSize(600,300);
    setTitle("Window");
    setResizable(false);
    setVisible(true);
    setBackground(Color.WHITE);
    addKeyListener(this);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void paint(Graphics g) {
    System.out.println("Paint is being called");
    dbGraphics.clearRect(x,y,x+10,y+10);
    dbGraphics.drawRect(x,y,x+10,y+10);
    g.drawImage(dbImage, 0, 0, this);
    }
    
    public void update(Graphics g) {
    paint(g);
    }
    
    public static void main(String[] args) {
    System.out.println("main is being called");
    new Window();
    }

}