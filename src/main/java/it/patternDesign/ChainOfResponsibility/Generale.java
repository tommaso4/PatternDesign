package it.patternDesign.ChainOfResponsibility;

public class Generale extends Ufficiale{
    public Generale() {
        setStipendio(5000);
    }

    @Override
    public String setTipoUfficiale() {
        return "Generale";
    }
}
