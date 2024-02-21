package it.patternDesign.composite;

import java.util.ArrayList;
import java.util.List;

public class Section implements Component{
    private List<Page> pages = new ArrayList<Page>();
    private int numSections;
    public Section(int numSections) {

        this.numSections = numSections;
    }
    public void addSinglePage(Page page) {
        pages.add(page);
    }

    public List<Page> getPages() {
        return pages;
    }

    @Override
    public void print() {
        for (Component page : pages) {
            page.print();
        }
    }
}
