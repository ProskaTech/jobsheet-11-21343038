/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan4_Inheritance;

/**
 * created by AbelLevran_21343038
 * @author Bellevran
 */
public class b extends a {
    private int b;
    
    public void setB (int nilai){
        b = nilai;
    }
    
    public int getB() {
        return b;
    }
    //melakukan override terhadap method tampilkanNilai()
    //yang terhadap pada kelas A
    public void tampilkanNilai(){
        super.tampilkanNilai(); //melakukan method dalam kelas A
        System.out.println("Nilai b = " +getB());
    }
}
