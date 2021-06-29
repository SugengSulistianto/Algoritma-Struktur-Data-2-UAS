/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author ACER
 */
public class AntrianApp {
    public static void main(String[] args){
        Antrian antrian = new Antrian(10);
        antrian.enqueque(91);
        antrian.display();
        antrian.enqueque(60);
        antrian.display();
        System.out.println("Nilai yang paling depan = " + antrian.peek());
        System.out.print("Nama saya adalah Sugeng Sulistianto ");
        System.out.println(" ");
        antrian.enqueque(70);
        System.out.println("");
        antrian.display();
        System.out.println("Yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        System.out.println("Nilai yang paling depan = " + antrian.peek());
        
    }
}