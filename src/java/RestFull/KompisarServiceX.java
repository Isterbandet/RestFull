package RestFull;

import java.util.List;
import javax.ws.rs.GET; 
import javax.ws.rs.Path; 
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType; 
@Path("/KompisarServiceX")

public class KompisarServiceX {
    KompisarDao kompisdao = new KompisarDao();
    List<Kompisar> allaKompisar = kompisdao.getAllKompisar();
    
    
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
        for (Kompisar k: kompisar )
    
    }

}
