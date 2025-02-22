package com.thiago.felipe.cepservice;

import com.thiago.felipe.cepservice.api.CepService;
import com.thiago.felipe.model.Address;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public  abstract class AbstractCepService implements CepService {
    private final WebTarget target;
    private final String dominio;

    protected final String insertTrailingSlash(String path){
        return path.endsWith("/") ? path : path + "/";
    }

    public AbstractCepService(String dominio) {
        this.dominio = dominio;
        Client client = ClientBuilder.newClient();
        this.target = client.target(dominio);
    }

    protected abstract String buildPath(String cep);

    protected String getFullPath (String cep){
        return this.dominio + buildPath(cep);
    }

    @Override
    public Address SearchAddress(String cep) {
        return target.path(buildPath(cep)).request().get(Address.class);
    }
}
