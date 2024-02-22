package it.patternDesign.ChainOfResponsibility;

public class Main {


    public static void main(String[] args) throws Exception {
        Tenente tenente = new Tenente();
        Capitano capitano= new Capitano();
        Maggiore maggiore = new Maggiore();
        Colonnello colonnello = new Colonnello();
        Generale generale = new Generale();

        generale.setSuccessivo(colonnello);
        colonnello.setSuccessivo(maggiore);
        maggiore.setSuccessivo(capitano);
        capitano.setSuccessivo(tenente);
        generale.getUfficialePerStipendio(5000);

        System.out.println("Hello WOrld!!!");
    }
}
