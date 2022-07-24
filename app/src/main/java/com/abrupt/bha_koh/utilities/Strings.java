package com.abrupt.bha_koh.utilities;

public enum Strings {
    HELLO_WORLD,
    SAMPLE_PARAGRAPH,
    DRAGONS;

    public String localizedString() {
        switch(this) {
            case HELLO_WORLD:
                return "Hello World!";
            case SAMPLE_PARAGRAPH:
                return "Lorem ipsum dolor sit amet";
            case DRAGONS:
                return "Dragons' strength varies by many factors... etc... etc... see what I'm getting at?";
            default:
                return "No string found.";
        }
    }
}
