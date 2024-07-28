package com.donatasd;

import java.util.List;

public class PasswordStrengthFactory {

    public static PasswordStrengthValidator generateDefault() {
        return new PasswordStrengthValidator(List.of(
                new LengthRule(8),
                new ContainsDigitRule(),
                new ContainsUppercaseRule()
        ));
    }
}
