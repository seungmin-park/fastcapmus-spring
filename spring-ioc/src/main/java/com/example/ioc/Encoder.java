package com.example.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class Encoder {

    private IEncoder iEncoder;

    public Encoder(@Qualifier("base64Encoder") IEncoder iEncoder){
        this.iEncoder = iEncoder;
    }

    public String encode(String message){
        return iEncoder.encode(message);
    }
}
