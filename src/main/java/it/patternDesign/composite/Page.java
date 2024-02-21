package it.patternDesign.composite;

public class Page implements Component{
    private int numPages;

    public Page(int numPages) {
        this.numPages = numPages;
    }

    public int getNumPages() {
        return numPages;
    }

    @Override
    public void print() {
        System.out.println("page: "+this.numPages);
    }
}
