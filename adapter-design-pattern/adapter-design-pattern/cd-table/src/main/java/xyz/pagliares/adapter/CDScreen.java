package xyz.pagliares.adapter;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * @author Rodrigo Martins Pagliares
 */
public class CDScreen {
    private JFrame screen;
    private JTable table;
    private JScrollPane scrollPane;
    private JLabel screenTitle;
    private CDAdapter cdA;
   
    public CDScreen() {
        screen = new JFrame("CD Collection");
        screen.setSize(700, 150);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configuring the Adapter
        CD pavement = new CD("Pavement", "Slanted & Enchanted", "Matador", 1995);
        CD teenage = new CD("Teenage Fanclub", "Shadows", "Apple", 2010);
        CD radiohead = new CD("Radiohead", "In Rainbows", "ABC", 2008);        
        CD wilco = new CD("Wilco", "A ghost is born", "xyz", 2006);
        
        cdA = new CDAdapter();
        cdA.addCD(pavement);
        cdA.addCD(teenage);
        cdA.addCD(radiohead);
        cdA.addCD(wilco);
        
        table = new JTable(cdA);
        scrollPane = new JScrollPane(table);
    }

    public void configureScreen() {
        Container c = screen.getContentPane();
        c.add(scrollPane, BorderLayout.CENTER);
    }

    public void render() {
        screen.setVisible(true);
    }

    public static void main(String[] args) {
        CDScreen cd = new CDScreen();
        cd.configureScreen();
        cd.render();
    }
}
