
package RestFull;

import java.util.ArrayList;
import java.util.List;


public class KompisarDao {
    public List<Kompisar> getAllKompisar () {
        List<Kompisar> kompisar = new ArrayList<>();
        
        Kompisar k1 = new Kompisar("Freddan", 001);
        Kompisar k2 = new Kompisar("Albin", 002);
        Kompisar k3 = new Kompisar("Jäger", 1337);
        Kompisar k4 = new Kompisar("Muhammed", 004);
        Kompisar k5 = new Kompisar("Rafael", 005);
        Kompisar k6 = new Kompisar("Greger", 006);
        Kompisar k7 = new Kompisar("Sebbe", 007);
        Kompisar k8 = new Kompisar("Steffo", 8);
        Kompisar k9 = new Kompisar("Stoltx", 9);
    
    kompisar.add(k1);
    kompisar.add(k2);
    kompisar.add(k3);
    kompisar.add(k4);
    kompisar.add(k5);
    kompisar.add(k6);
    kompisar.add(k7);
    kompisar.add(k8);
    kompisar.add(k9);
    
    return kompisar;
    
    }
}
