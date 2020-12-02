package com.thiago.felipe.cepservice.impl;

import com.thiago.felipe.cepservice.AbstractCepService;

import javax.enterprise.context.Dependent;

@Dependent
public class ViaCepService extends AbstractCepService {
    private static final String DOMINIO = "https://viacep.com.br/";

    public ViaCepService() {
        super(DOMINIO);
    }

    @Override
    protected String buildPath(final  String cep) {
        return "ws/" + cep + "/json";
    }
}
