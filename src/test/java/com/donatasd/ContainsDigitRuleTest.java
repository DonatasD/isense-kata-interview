package com.donatasd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDigitRuleTest {
    ContainsDigitRule rule = new ContainsDigitRule();

    @Test
    public void shouldFailWithNull() {
        Assertions.assertFalse(rule.validate(null));
    }

    @Test
    public void shouldPassWithValidPassword() {
        var string = "A1B";
        Assertions.assertTrue(rule.validate(string));
    }

    @Test
    public void shouldFailWithShortenThanRequiredPassword() {
        var string = "ABCDE";
        Assertions.assertFalse(rule.validate(string));
    }

    @Test
    public void shouldFailWithEmptyPassword() {
        var string = "";
        Assertions.assertFalse(rule.validate(string));
    }
}
