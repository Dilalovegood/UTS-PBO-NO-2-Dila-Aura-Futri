
package lingkaran;


public class SetengahLingkaran extends Lingkaran{
    
    double hasil;
    public SetengahLingkaran(){
        hasil = 0;
    }
    @Override
    public void hitungLuas() {
        hasil = (panjang * lebar) * (Math.PI * lebar * lebar);
    }
    
    public double getHasil(){
        return hasil;
    }
}
