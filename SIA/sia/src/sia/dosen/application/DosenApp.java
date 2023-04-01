package sia.dosen.application;

import sia.dosen.data.Dosen;

public class DosenApp {
   public static void main(String[] args) {
    Dosen dosen = new Dosen();
    dosen.nama="Budi";
    dosen.gender="Laki-laki";
    dosen.setUmur(30);

    System.out.println(dosen.nama);
    System.out.println(dosen.gender);
    System.out.println(dosen.getUmur());
   }
    
}
