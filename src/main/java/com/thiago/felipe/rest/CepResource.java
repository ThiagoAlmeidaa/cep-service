package com.thiago.felipe.rest;


import com.thiago.felipe.cepservice.api.CepService;
import com.thiago.felipe.model.Address;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cep")
public class CepResource {

    @Inject
    CepService service;

    @GET
    @Path("/{cep}")
    @Produces(MediaType.APPLICATION_JSON)
    public Address getEndreco (@PathParam("cep") final String cep){
        return service.SearchAddress(cep);
    }
}
