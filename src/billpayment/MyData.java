/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package billpayment;

import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author wsunny
 */


/*

public class MyData {

   public String getBillDate(){
//       Date d =new Date();
//        Integer mm = d.getMonth();
//        Integer dd = d.getDate();
//        Integer yy = d.getYear();


       GregorianCalendar calender = new GregorianCalendar();
       Integer dd = calender.get(Calendar.DAY_OF_MONTH);
       Integer mm = calender.get(Calendar.MONTH);
       Integer yy = calender.get(Calendar.YEAR);

       String billdate =  dd.toString()+"/"+mm.toString()+"/"+yy.toString();
       return billdate;
   }
    
   public MyData(){

   }

   public int getNewBillNo (){
       int newBill;
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
        return newBill;
   }

   public int getCurrentBillNo (){
       int cbillno;
       try {
            DataInputStream dis =new DataInputStream(new FileInputStream(f));
            cbillno =  dis.readInt();
            dis.close();

        } catch (Exception ex) {
            Logger.getLogger(TestFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cBillno;
   }


}
*/