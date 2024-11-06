package model;

import model.interfaces.Respirable;
import model.interfaces.Terrestreable;
import model.interfaces.nadarable;

public class cocodrilo implements Terrestreable, Respirable, nadarable {

    @Override
    public void terrestre() {
        System.out.println("el cocodrilo es terrestre");
    }

    @Override
    public void respirar(){
        System.out.println("el cocodrilo respira");
    }

    @Override
    public void nadar(){
        System.out.println("el cocodrilo nada");
    }
    
}
