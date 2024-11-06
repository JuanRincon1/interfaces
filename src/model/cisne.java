package model;

import model.interfaces.Respirable;
import model.interfaces.Terrestreable;
import model.interfaces.nadarable;
import model.interfaces.volarable;

public class cisne implements Terrestreable, Respirable, volarable, nadarable{

    @Override
    public void respirar() {
        System.out.println("el cisne respira");
    }

    @Override
    public void terrestre() {
        System.out.println("el cisne es terrestre");
    }

    @Override
    public void volar() {
        System.out.println("el cisne vuela");
    }
    
    @Override
    public void nadar() {
        System.out.println("el cisne nada");
    }
}
