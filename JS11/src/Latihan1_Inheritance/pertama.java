/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan1_Inheritance;

/**
 * created by AbelLevran_21343038
 * @author Bellevran
 */
public class pertama {
    private int a = 10;
    
    protected void terprotek(){
        System.out.println("Method ini hanya untuk anaknya");
        System.out.println("------------------------------");
    }
    
    public void info(){
        System.out.println("a = " + a);
        System.out.println("Dipanggil pada = " + this.getClass().getName());
    }
}
