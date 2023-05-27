package com.example.javaspringbootbytecodervalidation.data;

import java.util.*;

public class ValidationResult {
    public List<String> errors;
    public Map<String, String> errorsMappedToField;
    public String operationId;

    public ValidationResult(String operationId) {
        errors = new ArrayList<>();
        errorsMappedToField = new HashMap<>();
        this.operationId = operationId;
    }

    public void pushError(String error) {
        this.errors.add(error);
    }

    public void putError(String name, String error) {
        this.errorsMappedToField.put(name, error);
    }
}
