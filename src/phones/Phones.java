/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phones;

/**
 *
 * @author leonguevara
 */
public class Phones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ITelephone leonPhone;
        leonPhone = new DeskPhone(123456);
        leonPhone.powerOn();
        leonPhone.callPhone(123456);
        System.out.println(leonPhone.isRinging());
        
        leonPhone = new MobilePhone(454561);
        leonPhone.callPhone(454561);
        System.out.println(leonPhone.isRinging());
    }
    
}
