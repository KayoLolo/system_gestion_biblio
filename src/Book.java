import java.time.LocalDate;
import java.util.Date;

public class Book extends Document {

    int ISBN;
    int nbPages;

    public Book(String id, int ISBN, String title, int nbPages, int borrowPeriod, boolean isBorrowed, LocalDate date){
        super(id,title, borrowPeriod, isBorrowed, date);
        this.ISBN= ISBN;
        this.nbPages = nbPages;
    }


    public int getIdBook(){
        return ISBN;
    }

    public int getNbPages(){
        return nbPages;
    }

    public void displayInfo(){
        System.out.println("Name : "+title);
        System.out.println("Pages : "+nbPages);
        System.out.println("Max borrow period : "+borrowPeriod);
        if (isBorrowed){
            System.out.println("Status : Unavailable");
        }else {
            System.out.println("Status : Available");
        }
        System.out.println(getDate());
    }

    public int getBorrowPeriod() {
        if (borrowPeriod>21){
            System.out.println("overdue");
        }
        return 21;
    }

    public String  getDocumentType(){
        return "Book";
    }
}
