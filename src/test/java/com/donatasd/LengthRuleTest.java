package com.donatasd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthRuleTest {
    LengthRule rule = new LengthRule(8);

    @Test
    public void shouldFailWithNull() {
        Assertions.assertFalse(rule.validate(null));
    }

    @Test
    public void shouldPassWithValidPassword() {
        var string = "123456789";
        Assertions.assertTrue(rule.validate(string));
    }

    @Test
    public void shouldFailWithShortenThanRequiredPassword() {
        var string = "1234567";
        Assertions.assertFalse(rule.validate(string));
    }

    @Test
    public void shouldFailWithEmptyPassword() {
        var string = "";
        Assertions.assertFalse(rule.validate(string));
    }
}
