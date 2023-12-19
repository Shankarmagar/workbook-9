package com.pluralsight.simplespring;

import org.springframework.stereotype.Component;
@Component
public class FortuneTeller {
    public String predictTheFuture() {
        return "I see a wonderful new opportunity coming your way";
    }
}
