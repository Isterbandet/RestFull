
package RestFull;


import java.util.List;

public interface IKompisDao {
    
    //hämta data
    public List<Kompisar> getAllKompisar();
    
    //spara ner data
    public void persistKompisar(List<Kompisar> allaKompisar);
    
}
