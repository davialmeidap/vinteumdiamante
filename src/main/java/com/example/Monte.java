package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte {
    private List<Carta> cartas = new ArrayList<>();

    public Monte() {
          for (Naipe n : Naipe.values()) {
            for (int v = 1; v <= 13; v++) {
                cartas.add(new Carta(v, n));
            }
        }
    }
     
    public void embaralhar() {
        Collections.shuffle(cartas);
    }
 
    public Carta virar() {
        return cartas.removeFirst();
    }

    
}
