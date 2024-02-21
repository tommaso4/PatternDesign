package it.patternDesign.composite;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Page page1 = new Page(1);
        Page page2 = new Page(2);
        Page page3 = new Page(3);
        Page page4 = new Page(4);
        Page page5 = new Page(5);
        Page page6 = new Page(6);
        Page page7 = new Page(7);
        Page page8 = new Page(8);
        Page page9 = new Page(9);
        page1.print();
        System.out.println("-----------------------");

        Section section1 = new Section(1);
        section1.addSinglePage(page1);
        section1.addSinglePage(page2);
        section1.addSinglePage(page3);
        section1.addSinglePage(page4);
        section1.print();
        System.out.println("----------------");

        Section section2 = new Section(2);
        section2.addSinglePage(page5);
        section2.addSinglePage(page6);
        section2.addSinglePage(page7);
        section2.addSinglePage(page8);
        section2.addSinglePage(page9);

        Libro libro = new Libro("HelloWorld",22);
        libro.addSection(section1);
        libro.addSection(section2);
        System.out.println("totalPages: " + libro.getTotalPages());
        libro.print();
    }
}
