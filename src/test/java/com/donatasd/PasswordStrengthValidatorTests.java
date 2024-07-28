package com.donatasd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PasswordStrengthValidatorTests {
    PasswordStrengthValidator validator = PasswordStrengthFactory.generateDefault();

    @ParameterizedTest
    @ValueSource(strings = {"AbcdE12345", "ąčęė1234A", "Password123" })
    public void shouldPass(String value) {
        Assertions.assertTrue(validator.validate(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc123456", "Abcdefght", "Ab12" })
    public void shouldFail(String value) {
        Assertions.assertFalse(validator.validate(value));
    }
}
