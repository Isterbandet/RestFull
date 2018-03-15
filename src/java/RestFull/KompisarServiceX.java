package RestFull;

import java.util.List;
import javax.ws.rs.GET; 
import javax.ws.rs.POST;
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
        return allaKompisar;//kompisdao.getAllKompisar();
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
        Response inte = new Response("Personen finns inte ", Boolean.FALSE);
        
        boolean inList = false;
        int idToRemove = -1;
        Kompisar kompisToRemove = null;
        
        for(Kompisar k : allaKompisar ){
            if (k.getNamn().equals(namn)){
                kompisToRemove = k;
            }
        }
        
        if (kompisToRemove != null){
            allaKompisar.remove(kompisToRemove);
            return res;
        }
        return inte;
    }
    @POST
    @Path("/kompisar/add")
    //@Produces(MediaType.APPLICATION_JSON)
    public Response addKompis(Kompisar k){
        Response res = new Response("Kompis addad", Boolean.FALSE);
        allaKompisar.add(k);
        res.setBoolean(Boolean.TRUE);
        return res;
        
    }
    

   
}
        
//        int indexToRemove= -1;
//        for (int i=0; i < allaKompisar.size(); i++){
//            if (allaKompisar.get(i).getNamn().equals(namn)){
//                indexToRemove = i;
//           }
//        }
//        
//        if (!allaKompisar.contains(namn)){
//            allaKompisar.remove(indexToRemove);
//            return inte;//res.getMessage("Personen HIttades inte!", Boolean.FALSE);
//        }
//        
//        
//        if (indexToRemove != 1){
//            allaKompisar.remove(indexToRemove);
//            res.setBoolean(Boolean.TRUE);
//  
//        }
        //return res;
    
        
        
 

//http://www.localhost:8080/RestFull/rest/KompisarServiceX/kompisarJSON