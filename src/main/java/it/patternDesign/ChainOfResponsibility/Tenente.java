package it.patternDesign.ChainOfResponsibility;

public class Tenente extends Ufficiale{
    public Tenente() {
        setStipendio(1000);
    }

    @Override
    public String setTipoUfficiale() {
        return "Tenente";
    }
}
