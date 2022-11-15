
package UtsJava;

import lingkaran.Lingkaran;

public class MainLingkaran{
    
    public static void main(String[] args) {
        Lingkaran circle_satu = new SetengahLingkaran();
        LuasSetengah luassatu = new LuasSetengah(circle_satu);
        
        luassatu.hitung();
        luassatu.tampilkan();
        
     
    }
}
