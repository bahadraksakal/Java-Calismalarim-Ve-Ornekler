
package actionlistener_basic_calisma;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class gui extends JFrame implements ActionListener {
    JPanel jpnl;
    JButton jlb1;
    JButton jlb2;
    JButton jlb3;
    JButton jlb4;

    public gui(String baslik) {
        super(baslik);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
        this.jpnl = new JPanel();
        this.jpnl.setBounds(0, 20, 420, 400);
        this.jpnl.setLayout(null);
        this.add(this.jpnl);
        this.jlb1 = new JButton("");
        this.jlb1.setBounds(0, 0, 200, 200);
        this.jlb1.setBackground(Color.red);
        this.jlb1.setForeground(Color.red);
        this.jpnl.add(this.jlb1);
        this.jlb2 = new JButton("");
        this.jlb2.setBounds(0, 200, 200, 200);
        this.jlb2.setBackground(Color.green);
        this.jlb2.setForeground(Color.green);
        this.jpnl.add(this.jlb2);
        this.jlb3 = new JButton("");
        this.jlb3.setBounds(200, 0, 200, 200);
        this.jlb3.setBackground(Color.blue);
        this.jlb3.setForeground(Color.blue);
        this.jpnl.add(this.jlb3);
        this.jlb4 = new JButton("");
        this.jlb4.setBounds(200, 200, 200, 200);
        this.jlb4.setBackground(Color.black);
        this.jlb4.setForeground(Color.black);
        this.jpnl.add(this.jlb4);
        this.jlb1.addActionListener(this);
        this.jlb2.addActionListener(this);
        this.jlb3.addActionListener(this);
        this.jlb4.addActionListener(this);
        this.setSize(400, 420);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.jlb1)) {
            JOptionPane.showMessageDialog(null, "k\u0131rm\u0131z\u0131", "T\u0131klad\u0131n", 1);
        } else if (e.getSource().equals(this.jlb2)) {
            JOptionPane.showMessageDialog(null, "ye\u015fil", "T\u0131klad\u0131n", 1);
        } else if (e.getSource().equals(this.jlb3)) {
            JOptionPane.showMessageDialog(null, "mavi", "T\u0131klad\u0131n", 1);
        } else if (e.getSource().equals(this.jlb4)) {
            JOptionPane.showMessageDialog(null, "siyah", "T\u0131klad\u0131n", 1);
        }
    }
}
