/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package billpayment;

import java.util.Calendar;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
/**
 *
 * @author TUSHAR
 */
public class NewClass {
    public static void main(String args[]) {
        GregorianCalendar cl = new GregorianCalendar();
        Date ob = new Date();
        int mm = ob.getMonth();
        System.out.println(ob.getDate()+"/"+ob.getMonth()+"/"+new GregorianCalendar().get(Calendar.YEAR));
    }

}
