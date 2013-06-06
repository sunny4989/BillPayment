/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package billpayment;

//import billpayment.MyData;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
import java.util.Date;
/**
 *
 * @author wsunny
 */
public class TestFile {

    public static void main(String arg[]) {
            Date ob = new Date();

        //MyData d1 = new MyData();
      //  System.out.println(d1.getBillDate());

        File f = new File("testFile.txt");

        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
            dos.writeInt(20);
            dos.writeInt(30);
            dos.close();

            DataInputStream dis =new DataInputStream(new FileInputStream(f));
            int in1 =  dis.readInt();
            int in2 =  dis.readInt();

            System.out.println("From File: "+in1+" -- "+ in2);
            dis.close();

        } catch (Exception ex) {
            Logger.getLogger(TestFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

