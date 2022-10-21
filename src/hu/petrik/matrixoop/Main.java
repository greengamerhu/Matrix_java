package hu.petrik.matrixoop;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(7,5);
        System.out.println(m1);
        System.out.println();
        Matrix m2 = new Matrix(5,5);
        System.out.println(m2);
        System.out.printf("Mátrix elemeinek osszege: %d ", m2.getElemekOsszege() );
        System.out.println();
        System.out.printf("Mátrix pozitív elemeinek szama: %d",m2.getPozitivElemekSzama() );
        System.out.println();
        System.out.printf("Mátrix Legnagyobb elem: %d",m2.getLegnagyobbElem());
        System.out.println();
        System.out.printf("az elso sor összege: %d ", m1.sorOsszeg(1));
        System.out.println();
        System.out.printf("a második sor maximuma: %d", m1.maxElemOszlop(2));
        System.out.println();
        System.out.printf("a negyedik sor maximuma: %d", m2.maxElemOszlop(4));
        System.out.println();
        NegyzetesMatrix nm = new NegyzetesMatrix(5);
        System.out.println(nm);
        System.out.println(nm.sorOsszeg(3));
        System.out.println(nm.getFoAtloOsszeg());
        System.out.println(nm.getMellekAtoOsszeg());
        System.out.println();
        System.out.println(nm.getFoAtloAlattiOsszeg());
    }
}
