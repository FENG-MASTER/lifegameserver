package com.fengmaster.lifegameserver.infrastructure.common;


import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonValue;

public final class JsonRaw {

    private final String value;

    public JsonRaw(String value) {
        this.value = value;
    }

    @JsonValue
    @JsonRawValue
    public String value() {
        return this.value;
    }
}
