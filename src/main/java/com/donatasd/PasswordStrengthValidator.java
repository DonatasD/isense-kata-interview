package com.donatasd;

import java.util.List;

public class PasswordStrengthValidator {

    private final List<Rule> rules;

    PasswordStrengthValidator(List<Rule> rules) {
        this.rules = rules;
    }

    public boolean validate(String value) {
        return this.rules.stream().allMatch((rule) -> rule.validate(value));
    }
}
