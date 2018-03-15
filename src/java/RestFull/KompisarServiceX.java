package RestFull;

import java.util.List;
import javax.ws.rs.GET; 
import javax.ws.rs.Path; 
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType; 
@Path("/KompisarServiceX")

public class KompisarServiceX {
    private static KompisarDao kompisdao = new KompisarDao();
    private static List<Kompisar> allaKompisar = kompisdao.getAllKompisar();
    
    
    @GET
    @Path("/kompisarJSON")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Kompisar> getKompisarJSON(){
        return kompisdao.getAllKompisar();
    }
    @GET
    @Path("/kompisarJSON/{namn}")
    @Produces(MediaType.APPLICATION_JSON)
    public Kompisar hittaPolare(@PathParam("namn") String namn){
        Kompisar komp = new Kompisar();
        for (Kompisar k: allaKompisar ){
            if (k.getNamn().equals(namn)){
                komp = k;
            }
        
    }
    return komp;
    }
    
    @GET
    @Path("/kompisarJSON/{namn}/delete")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteNameByName(@PathParam("namn") String namn){
        Response res = new Response("Person borttagen", Boolean.FALSE);
        
        int indexToRemove= -1;
        for (int i=0; i < allaKompisar.size(); i++){
            if (allaKompisar.get(i).getNamn().equals(namn)){
                indexToRemove = i;
            }
        }
        if (indexToRemove != 1){
            allaKompisar.remove(indexToRemove);
            res.setBoolean(Boolean.TRUE);
  
        }
        return res;
    
        
        
    }
}

//http://www.localhost:8080/RestFull/rest/KompisarServiceX/kompisarJSON