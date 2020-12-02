package com.thiago.felipe.cepservice.api;

import com.thiago.felipe.model.Address;

import javax.enterprise.context.Dependent;

@Dependent
public interface CepService {
    Address SearchAddress (String cep);
}
