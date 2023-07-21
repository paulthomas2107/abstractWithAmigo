package com.pault.amigo;

import lombok.extern.java.Log;

import java.util.Locale;

@Log
public class Main {
    public static void main(String[] args) {

        UseAbstractExample useAbstractExample = new UseAbstractExample("Paul");
        log.info(useAbstractExample.addSuffix(Locale.getDefault()));
        AbstractExample.process();

    }
}