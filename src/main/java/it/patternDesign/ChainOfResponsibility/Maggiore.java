package it.patternDesign.ChainOfResponsibility;

public class Maggiore extends Ufficiale{
    public Maggiore() {
        setStipendio(3000);
    }

    @Override
    public String setTipoUfficiale() {
        return "Maggiore";
    }
}
