package com.donatasd;

public class ContainsDigitRule implements Rule {
    @Override
    public boolean validate(String value) {
        if (value == null) {
            return false;
        }

        for (int i = 0; i < value.length(); i++) {
            if (Character.isDigit(value.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
