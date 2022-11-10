/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3_Inheritance;

/**
 * created by AbelLevran_21343038
 * @author Bellevran
 */
public class gajah {

    private static hewan mygajah;
    //meng-overwrite method pada class hewan
    public static void testClassMethod(){
        System.out.println("The Ckass Method in Hewan");
    }
    
    public static void testInstanceMethod(){
        System.out.println("The Instance Method in Gajah");
    }
    
    public static void main(String args[]){
        gajah mygGajah = new gajah();
        hewan myHewan = mygajah;
        hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
