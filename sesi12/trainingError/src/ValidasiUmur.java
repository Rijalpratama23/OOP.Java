public class ValidasiUmur{
    
    public void cekUmur(int umur)  throws ValidasiException  {
        if(umur < 17) {
            throw new ValidasiException("Anda masih budak ololeho");
        }
    }

    
}
