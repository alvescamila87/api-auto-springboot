package com.camila.autospringboot.services;

import com.camila.autospringboot.domain.Auto;
import com.camila.autospringboot.feign.AutoClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoService {

    // declarar a dependência do AutoClient
    private AutoClient autoClient;

    // criar construtor da classe
    public AutoService(AutoClient client) {
        this.autoClient = client;
    }

    public List<Auto> getAutoForSale() {
        return this.autoClient.getAutos();
    }
}
