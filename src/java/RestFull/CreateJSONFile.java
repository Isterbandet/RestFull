
package RestFull;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class CreateJSONFile {
        //Gson gson = new Gson();
        List<Kompisar> kompisList = new ArrayList<>(); 
        
    CreateJSONFile(){
        
        Kompisar k1 = new Kompisar("Freddan", 1);
        Kompisar k2 = new Kompisar("Albin", 2);
        Kompisar k3 = new Kompisar("Jäger", 3);
        Kompisar k4 = new Kompisar("Muhammed", 4);
        Kompisar k5 = new Kompisar("Rafael", 5);
        Kompisar k6 = new Kompisar("Greger", 6);
        Kompisar k7 = new Kompisar("Sebbe", 7);
        Kompisar k8 = new Kompisar("Steffo", 8);
        Kompisar k9 = new Kompisar("Stoltx", 9);
        
      
        kompisList.add(k1);
        kompisList.add(k2);
        kompisList.add(k3);
        kompisList.add(k4);
        kompisList.add(k5);
        kompisList.add(k6);
        kompisList.add(k7);
        kompisList.add(k8);
        kompisList.add(k9);
      
        Gson gson = new Gson();
      String json = gson.toJson(kompisList);
      
      try (FileWriter writer = new FileWriter("C:\\Users\\Torsten\\Documents\\NetBeansProjects\\RestFull\\src\\java\\RestFull\\Test1.txt");) {
        writer.write(json);
  
      } catch (IOException e) {
         e.printStackTrace();
      }
         
        }

    public static void main(String[] args) {
        CreateJSONFile cr = new CreateJSONFile();
    }
}

