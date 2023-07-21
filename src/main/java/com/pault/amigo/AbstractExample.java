package com.pault.amigo;

import lombok.extern.java.Log;

@Log
public abstract class AbstractExample {

    abstract String addSuffix(Object prefix);

    static void process() {
        log.info("Doing stuff....");
    }
}
