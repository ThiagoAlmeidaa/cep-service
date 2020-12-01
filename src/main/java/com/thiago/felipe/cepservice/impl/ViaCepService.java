package com.thiago.felipe.cepservice.impl;

import com.thiago.felipe.cepservice.AbstractCepService;

public class ViaCepService extends AbstractCepService {

    public ViaCepService(String dominio) {
        super(dominio);
    }

    @Override
    protected String buildPath(String cep) {
        return String.format("ws/%s/json", cep);
    }
}
