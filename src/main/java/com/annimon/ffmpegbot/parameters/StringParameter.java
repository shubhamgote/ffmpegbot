package com.annimon.ffmpegbot.parameters;

import java.util.List;

public abstract class StringParameter extends Parameter<String> {
    public StringParameter(String id, String name, List<String> possibleValues, String value) {
        super(id, name, possibleValues, value);
    }
}
