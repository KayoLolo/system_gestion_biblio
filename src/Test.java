import java.time.LocalDate;


public class Test {

    public static void main(String[] args){
        Library centralLib = new Library("Central Library");
        Book book1 = new Book("1", 1, "book 1", 30, 21, true, LocalDate.of(2026,1, 1));
        Book book2 = new Book("2", 2, "book 2", 41, 21, false, LocalDate.of(2026,1, 1));
        Magazine mag1 = new Magazine("3",1, "magazine 1", 1, 21, 7, true, LocalDate.of(2026, 1, 1));
        Magazine mag2 = new Magazine("4",2, "magazine 2", 2, 34, 7, false, LocalDate.of(2026, 1, 1));
        DVD dvd1 = new DVD("5", "dvd 1",70, 18, 5, true, LocalDate.of(2026, 1, 1));
        DVD dvd2 = new DVD("6", "dvd 2",80, 12, 5, false, LocalDate.of(2026, 1, 1));
        AudioBook audBook1 = new AudioBook("7", "audBook 1", 20, "nar 1", 14, true, LocalDate.of(2026, 1, 1));

        book2.displayInfo();
        book2.borrow();
        book2.displayInfo();
        System.out.println("----------");
        book1.displayInfo();
        book1.borrow();
        System.out.println(book2);



    }

}
