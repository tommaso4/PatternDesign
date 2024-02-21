package it.patternDesign.ChainOfResponsibility;

public class Capitano extends Ufficiale{
    public Capitano() {
        setStipendio(2000);
    }

    @Override
    public String setTipoUfficiale() {
        return "Capitano";
    }
}
