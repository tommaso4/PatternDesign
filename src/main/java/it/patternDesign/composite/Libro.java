package it.patternDesign.composite;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Component{
    private List<Section> sections = new ArrayList<Section>();
    private String title;
    private int price;

    public Libro(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public int getTotalPages() {
        int totalPages = 0;
        for (Section c : sections) {
            totalPages += c.getPages().size();
        }
        return totalPages;
    }
    public void addSection(Section section){
        sections.add(section);
    }

    @Override
    public void print() {
        for (Section c : sections) {
            c.print();
        }
    }
}
