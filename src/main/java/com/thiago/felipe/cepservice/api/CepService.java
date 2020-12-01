package com.thiago.felipe.cepservice.api;

import com.thiago.felipe.cepservice.impl.Address;

public interface CepService {
    Address SearchAddress (String cep);
}
