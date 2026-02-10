import java.time.LocalDate;


public class Test {

    public static void main(String[] args){
        Library centralLib = new Library("Central Library");
        Book book1 = new Book("1", 1, "book 1", 30, 21, true, LocalDate.of(2026,2, 9));
        Book book2 = new Book("2", 2, "book 2", 41, 21, false, LocalDate.of(2026,1, 1));
        Magazine mag1 = new Magazine("3",1, "magazine 1", 1, 21, 7, true, LocalDate.of(2026, 1, 1));
        Magazine mag2 = new Magazine("4",2, "magazine 2", 2, 34, 7, false, LocalDate.of(2026, 1, 1));
        DVD dvd1 = new DVD("5", "dvd 1",70, 18, 5, true, LocalDate.of(2026, 1, 1));
        DVD dvd2 = new DVD("6", "dvd 2",80, 12, 5, false, LocalDate.of(2026, 1, 1));
        AudioBook audBook1 = new AudioBook("7", "audBook 1", 20, "nar 1", 14, true, LocalDate.of(2026, 1, 1));



        centralLib.addDocument(book2);
        centralLib.addDocument(book1);
        centralLib.addDocument(mag1);
        centralLib.addDocument(mag2);
        centralLib.addDocument(dvd1);
        centralLib.addDocument(dvd2);
        centralLib.addDocument(audBook1);
        centralLib.displayAllDocuments();
        System.out.println("----------");
        book2.displayInfo();
        System.out.println("----------");
        //book2.setDateBorrow(LocalDate.of(2026,2, 8));
        book2.displayInfo();
        System.out.println("----------");
        book2.borrowDocument();
        book2.displayInfo();
        System.out.println("----------");
        book1.displayInfo();
        book1.borrowDocument();
        System.out.println("----------");
        book1.returnDocument();
        book1.displayInfo();
        System.out.println(book2);
        System.out.println("----------");
        System.out.println("the result is"+centralLib.findDocument("book 1"));
        System.out.println(centralLib.getDocumentsByType("book"));
        System.out.println(centralLib.getDocumentsByType("audiobook"));
        System.out.println("----------");
        System.out.println(centralLib.getOverdueDocument());
        System.out.println("----------");
        System.out.println(centralLib.getAvailableDocuments());
        System.out.println("----------");
        centralLib.removeDocument("1");
        centralLib.displayAllDocuments();



    }

}
