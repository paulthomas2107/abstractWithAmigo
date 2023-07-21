package com.pault.amigo;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;

import java.util.Locale;

@Log
@AllArgsConstructor
public class UseAbstractExample extends AbstractExample {

    private String name;

    @Override
    String addSuffix(Object object) {
        if (object instanceof Locale) {
            return (this.name + " " + Locale.getDefault().getDisplayCountry());
        }
        else {
            return null;
        }
    }
}
