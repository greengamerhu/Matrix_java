package hu.petrik.matrixoop;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(5,5);
        System.out.println(m1);
        System.out.println();
        Matrix m2 = new Matrix(5,5);
        System.out.println(m2);
        System.out.printf("Mátrix elemeinek osszege: %d ", m2.getElemekOsszege() );
        System.out.println();
        System.out.printf("Mátrix pozitív elemeinek szama: %d",m2.getPozitivElemekSzama() );
        System.out.println();
        System.out.printf("Mátrix Legnagyobb elem: %d",m2.getLegnagyobbElem() );

    }
}
