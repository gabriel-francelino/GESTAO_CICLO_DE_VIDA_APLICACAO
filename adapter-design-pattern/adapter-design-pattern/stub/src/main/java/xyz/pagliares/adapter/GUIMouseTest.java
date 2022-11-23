package xyz.pagliares.adapter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 * @author Rodrigo Martins Pagliares
 */
public class GUIMouseTest {
    private JFrame jFrame;
    public GUIMouseTest() {
        jFrame = new JFrame();
        jFrame.setSize(500, 400);
        jFrame.addMouseListener(new MyMouseListener());
        jFrame.setVisible(true);
    }

    class MyMouseListener extends MouseAdapter {
        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("mouse entered the JFrame");
        }

        @Override
        public void mouseExited(MouseEvent e) {
             System.out.println("mouse exited the JFrame");
        }

        @Override
        public void mouseClicked(MouseEvent e) {
           System.out.println("mouse was clicked");
        }
    }

    public static void main(String[] args) {
        GUIMouseTest g = new GUIMouseTest();
    }
}
