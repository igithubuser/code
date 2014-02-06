package Window;

import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
        
public class Logic extends JFrame implements KeyListener {
    public boolean w,a,s,d;
    public int x,y;
    
    public Logic(){
    System.out.println("Logic is being called");
    w = a = s = d = false;
    x = y = 0;
    while(true) {
    System.out.println("Logic Loop");
    if(w == true) {y-=5;repaint();}
    if(a == true) {x-=5;repaint();}
    if(s == true) {y+=5;repaint();}
    if(d == true) {x+=5;repaint();}
    }
    
    }
    public void keyPressed(KeyEvent e) {
    if(e.getKeyCode() == e.VK_W) {w = true;}
    if(e.getKeyCode() == e.VK_A) {a = true;}
    if(e.getKeyCode() == e.VK_S) {s = true;}
    if(e.getKeyCode() == e.VK_D) {d = true;}
    }
    public void keyReleased(KeyEvent e) {
    if(e.getKeyCode() == e.VK_W) {w = false;}
    if(e.getKeyCode() == e.VK_A) {a = false;}
    if(e.getKeyCode() == e.VK_S) {s = false;}
    if(e.getKeyCode() == e.VK_D) {d = false;}
    }
    public void keyTyped(KeyEvent e) {}
}