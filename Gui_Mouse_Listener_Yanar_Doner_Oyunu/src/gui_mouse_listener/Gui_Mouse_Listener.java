/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_mouse_listener;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author bahad
 */
public class Gui_Mouse_Listener extends JFrame{
    JPanel jpnl;
    JLabel[] jlbs = new JLabel[16];

    public Gui_Mouse_Listener(String baslik) {
        super(baslik);
        GridLayout lgl = new GridLayout(4, 4);
        this.setDefaultCloseOperation(3);
        this.jpnl = new JPanel();
        this.jpnl.setBounds(0, 19, 400, 419);
        this.jpnl.setLayout(lgl);
        this.add(this.jpnl);
        for (int i = 0; i < this.jlbs.length; ++i) {
            this.jlbs[i] = new JLabel("jlb" + i);
            this.jlbs[i].setBackground(Color.white);
            this.jlbs[i].setOpaque(true);
            this.jlbs[i].setBorder(BorderFactory.createLineBorder(Color.black));
            this.jlbs[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(final MouseEvent evt) {
                    ((JLabel)evt.getSource()).setBackground(Color.black);
                }
                
                @Override
                public void mouseExited(final MouseEvent evt) {
                    ((JLabel)evt.getSource()).setBackground(Color.white);
                }
            });
            this.jpnl.add(this.jlbs[i]);
        }
        this.setSize(600, 420);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Gui_Mouse_Listener panel = new Gui_Mouse_Listener("Yanar-Doner");
    }
}

