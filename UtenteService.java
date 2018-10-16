package com.javacode.esempio;


import java.util.ArrayList;import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/UtenteService")
public class UtenteService {
	@GET
	@Path("/Utente")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Utente> getTrackInJSON() {
		List<Utente> listUtente = new ArrayList<Utente>();
		Utente u1 = new Utente();
		u1.setId(1);
		u1.setName("name1");
		u1.setMessage("Ciao");
		u1.setDate(new Date());
		listUtente.add(u1);
		return listUtente;
	}
	
	
}