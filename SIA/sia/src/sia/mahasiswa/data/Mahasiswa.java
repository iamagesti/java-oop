package sia.mahasiswa.data;

import sia.abstracts.person;

public class Mahasiswa extends person {
    public String nim;
    public String nama;
    public String PhoneNumber;

    public Mahasiswa (String nim, String nama,String gender, String PhoneNumber){
        this.nim = nim;
        this.nama = nama;
        this.gender = gender;
        this.PhoneNumber = PhoneNumber;

    }
    
    
}
