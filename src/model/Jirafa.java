package model;

import model.interfaces.Respirable;
import model.interfaces.Terrestreable;

public class Jirafa implements Terrestreable, Respirable  {
    @Override
    public void respirar() {
        System.out.println("la Jirafa Respira");
        
    }

    @Override
    public void terrestre() {
        System.out.println("Jirafa es terrestre");
    }
}
