/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtable_customrenderer_ornek;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author bahad
 */
public class JTable_CustomRenderer_Ornek extends JFrame {
    JTable jtbl;
    JScrollPane js;
    static DefaultTableModel model = new DefaultTableModel(80, 80);

    JTable_CustomRenderer_Ornek() {
        super("Bu pencerede bir JTable var!");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        this.setLayout(null);
        this.jtbl = new JTable(model);
        this.jtbl.setAutoResizeMode(0);
        this.jtbl.setDefaultRenderer(Object.class, (TableCellRenderer)new CustomRenderer());
        this.js = new JScrollPane(this.jtbl);
        this.js.setHorizontalScrollBarPolicy(32);
        this.js.setVerticalScrollBarPolicy(22);
        this.js.setBounds(0, 20, 640, 640);
        this.js.setVisible(true);
        this.add(this.js);
        this.doldur(model);
        this.setSize(1280, 720);
        this.setVisible(true);
    }

    void doldur(DefaultTableModel model) {
        for (int i = 50; i < 70; ++i) {
            for (int j = 0; j < 20; ++j) {
                model.setValueAt("X", i, j);
            }
        }
    }

    public static void main(String[] args) {
        JTable_CustomRenderer_Ornek deneme = new JTable_CustomRenderer_Ornek();
    }
}
