/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package billpayment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author TUSHAR
 */
public class Example extends JFrame {
    JTabbedPane jtab;
    BILLPANEL p1;
    BILLPANEL p2;
    BILLPANEL p3;
    JButton b;
    JButton b2;
    static int i;
    public Example()
    {
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        Example.i = 0;
        b2 = new JButton("add");
        jtab = new JTabbedPane();
        jtab.setBounds(100,40,300,300);
        p1 = new BILLPANEL();
        p2 = new BILLPANEL();
        p3 = new BILLPANEL();
        p1.add(new JLabel("tushar singhal"));
        p2.add(new JLabel("amarjeet"));
        p3.add(new JLabel("ramesh"));
        b = new JButton("ok");
        jtab.addTab("tab1",p1);
        jtab.addTab("tab2",p2);
        jtab.addTab("tab 3",p3);
        b.setBounds(100,400,50,30);
        b2.setBounds(200,400,50,30);
        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
               remov(e);
            }
        });
        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                addmy(e);
            }
        });
        add(jtab);
        add(b);
        add(b2);

        /*jtab.setMnemonicAt(0,KeyEvent.VK_0);
        jtab.setMnemonicAt(1,KeyEvent.VK_1);
        jtab.setMnemonicAt(2,KeyEvent.VK_2);
        //jtab.setMnemonicAt(3, WIDTH);*/

    }
    public void addmy(ActionEvent e)
    {
        Example.i--;
        if(i == 1)
        jtab.add(p2);
        else if(i == 0)
            jtab.add(p3);
    }
    public void remov(ActionEvent e)
    {
      Example.i++;
      if(i == 1)
          jtab.remove(p3);
      else if(i == 2)
          jtab.remove(p2);

    }
    public static void main(String args[]) {
        new Example();
    }
}
