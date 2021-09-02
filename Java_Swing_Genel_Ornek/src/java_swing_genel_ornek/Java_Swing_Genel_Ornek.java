/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_swing_genel_ornek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author bahad
 */
public class Java_Swing_Genel_Ornek extends JFrame implements ActionListener, ItemListener {
    JButton jbt;
    JButton jbt2;
    JTextField jtf;
    JPanel jpnl;
    JLabel jlb;
    JCheckBox jcb;

    Java_Swing_Genel_Ornek(String s) {
        super(s);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
        this.jpnl = new JPanel();
        this.jpnl.setBounds(0, 20, 600, 400);
        this.jpnl.setLayout(null);
        this.add(this.jpnl);
        this.jcb = new JCheckBox("Java");
        this.jcb.setBounds(280, 150, 100, 30);
        this.jcb.setSelected(false);
        this.jcb.addItemListener(this);
        this.jpnl.add(this.jcb);
        this.jlb = new JLabel("Bu bir etikettir");
        this.jlb.setBounds(170, 300, 100, 30);
        this.jpnl.add(this.jlb);
        this.jbt = new JButton("Buton1");
        this.jbt.setBounds(10, 40, 100, 30);
        this.jpnl.add(this.jbt);
        this.jbt2 = new JButton("Buton2");
        this.jbt2.setBounds(50, 280, 50, 80);
        this.jpnl.add(this.jbt2);
        this.jtf = new JTextField("varsayılan");
        this.jtf.setBounds(100, 140, 180, 30);
        this.jpnl.add(this.jtf);
        this.jbt.addActionListener(this);
        this.jbt2.addActionListener(this);
        this.jlb.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Mouse geldi", "Olay var", 2);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("mouse cikti");
            }
        });
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Adiyos", "Bye", 1);
            }
        });
        this.setSize(600, 420);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.jbt)) {
            JOptionPane.showMessageDialog(null, "Buton1'e basıldı", "Olay var!!", 3);
            this.jtf.setText("" + Math.pow(2.0, 3.0));
            this.jlb.setText("Etiket değişti!");
        } else if (e.getSource().equals(this.jbt2)) {
            JOptionPane.showMessageDialog(null, this.jtf.getText(), "Olay var!!", 2);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource().equals(this.jcb)) {
            System.out.println(this.jcb.isSelected());
        }
    }  

    public static void main(String[] args) {
        Java_Swing_Genel_Ornek ahmet = new Java_Swing_Genel_Ornek("Benim pencerem");
    }
}
    

