package it.patternDesign.ChainOfResponsibility;

public abstract class Ufficiale {
    private int stipendio;
    private Ufficiale successivo;

    public int getStipendio() {
        return stipendio;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }

    public Ufficiale getSuccessivo() {
        return successivo;
    }

    public void setSuccessivo(Ufficiale successivo) {
        this.successivo = successivo;
    }

    public abstract String setTipoUfficiale();

    public Ufficiale getUfficialePerStipendio(int stipendio) throws Exception {

        if (stipendio <= 5000 && stipendio % 1000 == 0) {
            if (stipendio == getStipendio()) {
                System.out.println(this.setTipoUfficiale());
                return this;
            } else {
                System.out.println("Hello!");
                return getSuccessivo().getUfficialePerStipendio(stipendio);
            }
        }else {
            throw new Exception("Stipendio maggiore di 5000 o non divisibile per mille");
        }
    }
}
