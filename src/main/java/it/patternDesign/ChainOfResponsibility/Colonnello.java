package it.patternDesign.ChainOfResponsibility;

public class Colonnello extends Ufficiale{
    public Colonnello() {
        setStipendio(4000);
    }

    @Override
    public String setTipoUfficiale() {
        return "Colonello";
    }
}
