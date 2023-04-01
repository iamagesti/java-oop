package sia.dosen.data;

import sia.abstracts.person;

public class Dosen extends person {
    private Number umur;
    
    public void setUmur (Number umur){
        this.umur = umur;
    }

    public Number getUmur (){
        return this.umur;
    }
}
