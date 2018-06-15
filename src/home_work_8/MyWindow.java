package home_work_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyWindow extends JFrame {
    public MyWindow() {
        setBounds(500, 500, 400, 300);
        setTitle("Demo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel pan = new JPanel();
        add(pan);
        pan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("MousePos: " + e.getX() + " " + e.getY());
            }
        });

        JButton but0 = new JButton("New window");
        setLayout(new BorderLayout());
        add(but0, BorderLayout.NORTH);
        but0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                MyWindow w1 = new MyWindow();
            }
        });

        JButton but1 = new JButton("Text Message");
        add(but1, BorderLayout.SOUTH);
        but1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
               JOptionPane.showMessageDialog(null,"It works!", "Message for you",JOptionPane.WARNING_MESSAGE);
            }
        });

        setVisible(true);
    }
}

