public class SIASystemApp {
    public static void main(String[] args)  {
       Mahasiswa mhs = new Mahasiswa();
       mhs.NIM = "41821120000";
       mhs.Nama = "Agesti";
       mhs.Address="Jl. Raden Fatah";
       mhs.Contact= "083483849395";
       mhs.getMahasiswaInfo();
       
       Dosen dsn = new Dosen();
       dsn.NID ="201";
       dsn.Nama ="Zico";
       dsn.Address="Jl.Merdeka I";
       dsn.Contact="0837436465355";
       dsn.EducationBackground="S1 Teknik Informatika";
       dsn.getDosenInfo();
    }
}
