package com.example.javaspringbootbytecodervalidation.bytecoder;

import com.example.javaspringbootbytecodervalidation.data.OrderDTO;
import com.example.javaspringbootbytecodervalidation.data.ValidationResult;
import de.mirkosertic.bytecoder.api.Export;

public class OrderValidator {
    @Export("validate")
    public static ValidationResult validate(OrderDTO orderDTO, String operationId) {
        ValidationResult result = new ValidationResult(operationId);

        result.pushError("This error is always present! for now");


        /* orderDTO.name.isBlank()      => No such method : java/lang/String.isBlank()Z*/
        /* orderDTO.name.isEmpty()      => Uncaught TypeError: var5.Z$isEmpty$$ is not a function*/
        /* orderDTO.name.length() == 0  => Uncaught TypeError: Cannot read properties of undefined (reading 'length') */
        if (orderDTO.name == null || orderDTO.name.length() == 0) {
            result.putError("name", "Name is empty!");
        }

        if (orderDTO.id == 1) {
            result.putError("id", "The id is equal to 1!");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
