/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author ACER
 */
public class TumpukanApp {
    public static void main(String[] args) {
        Tumpukan tumpukan =  new Tumpukan(10);
        tumpukan.push(91);
        tumpukan.baca();
        tumpukan.push(30);
        tumpukan.baca();
        long nilaitop = tumpukan.peek();
        System.out.print("nilaitop = " +nilaitop);
        System.out.println(" ");
        System.out.print("Nama saya adalah Sugeng Sulistianto ");
        System.out.println(" ");
        System.out.print("nilai yang dihapus = 30 ");
        System.out.println(" ");
        tumpukan.pop();
        tumpukan.baca();
        tumpukan.push(40);
        tumpukan.baca();
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println(" ");
        
    }

}
