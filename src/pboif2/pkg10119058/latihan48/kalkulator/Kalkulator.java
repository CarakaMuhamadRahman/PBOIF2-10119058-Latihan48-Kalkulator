/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan48.kalkulator;

/**
 *
 * @author 
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk bagaimana cara me manage
 *                     method di java.
 */
public class Kalkulator {
    private double value1;
    private double value2;
    
    public double getValue1() {
        return this.value1;
    }
    public void setValue1(double value1) {
        this.value1 = value1;
    }
     public double getValue2() {
        return this.value2;
    }
    
    public void setValue2(double value2) {
        this.value2 = value2;
    }
    
    public void setNameProject() {
        System.out.println("Project Calculator");
    }
    
    public void setNoteProject() {
        System.out.println("This project shown you how to manage method in java");
    }
    
    public double add(double val1, double val2) {
        return val1 + val2;
    }
    
    public double minus(double val1, double val2) {
        return val1 - val2;
    }
    
    public double multiplication(double val1, double val2) {
        return val1 * val2;
    }
    
    public double division(double val1, double val2) {
        return val1 / val2;
    }
}
