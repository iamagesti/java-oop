package sia.mahasiswa.application;

import sia.mahasiswa.data.Mahasiswa;

public class MahasiswaApp {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("12345", "Budi","Laki-laki","03839495");
        System.out.println(mhs.nim);
        System.out.println(mhs.nama);
        System.out.println(mhs.gender);
        System.out.println(mhs.PhoneNumber);
    }
}
