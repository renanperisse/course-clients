package com.devsuperior.clients.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public static final String RESOURCE_NOT_FOUND = "Recurso não encontrado!";

    public ResourceNotFoundException(String msg) {
        super(msg);
    }
}
