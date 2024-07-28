package com.donatasd;

public class LengthRule implements Rule{

    private final Integer length;

    public LengthRule(Integer length) {
        this.length = length;
    }

    @Override
    public boolean validate(String value) {
        if (value == null) {
            return false;
        }
        return value.length() > this.length;
    }
}
