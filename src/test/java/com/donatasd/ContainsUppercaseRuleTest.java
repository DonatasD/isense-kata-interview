package com.donatasd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsUppercaseRuleTest {
    ContainsUppercaseRule rule = new ContainsUppercaseRule();

    @Test
    public void shouldFailWithNull() {
        Assertions.assertFalse(rule.validate(null));
    }

    @Test
    public void shouldPassWithValidPassword() {
        var string = "Ąbc";
        Assertions.assertTrue(rule.validate(string));
    }

    @Test
    public void shouldFailWithInvalidPassword() {
        var string = "ąbc";
        Assertions.assertFalse(rule.validate(string));
    }

    @Test
    public void shouldFailWithEmptyPassword() {
        var string = "";
        Assertions.assertFalse(rule.validate(string));
    }
}
