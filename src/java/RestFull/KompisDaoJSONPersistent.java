package RestFull;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;


public class KompisDaoJSONPersistent implements IKompisDao {
    
    Gson gson = new Gson();
    String bookListPath = "src\\RestFull\\kompisTxt.txt";
    
    
    public List<Kompisar> getAllKompisar(){ 
      String json = new String();
      List<Kompisar> allaKompisar = new ArrayList<Kompisar>();
      
      try (BufferedReader br = new BufferedReader(
            new FileReader(bookListPath));) {

          //FÖr att kunna uttrycka att det vi ska läsa är en List<Book>
        Type listType = new TypeToken<ArrayList<Kompisar>>(){}.getType();
        Gson gson = new Gson();
        allaKompisar = new Gson().fromJson(br, listType);
  
      } catch (IOException e) {
         e.printStackTrace();
      }
      
      return allaKompisar;
      
   } 
    
    public void persistKompisar(List <Kompisar> allaKompisar){
      String json = gson.toJson(allaKompisar);
      
      try (FileWriter writer = new FileWriter(bookListPath);) {
        writer.write(json);
  
      } catch (IOException e) {
         e.printStackTrace();
      }
    }
        
}