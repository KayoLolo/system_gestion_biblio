import java.time.LocalDate;
import java.util.Date;

public class Book extends Document {

    int ISBN;
    int nbPages;

    public Book(String id, int idBook, String title, int nbPages, int borrowPeriod, boolean isBorrowed, Date date){
        super(id,title, borrowPeriod, isBorrowed, date);
        this.ISBN= idBook;
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
            System.out.println("Status : Available");
        }else {
            System.out.println("Status : Unavailable");
        }
    }

    public int getBorrowPeriod() {
        if (borrowPeriod>21){
            System.out.println("overdue");
        }
        return 21;
    }

    public String  getDocumentType(){
        return "AudioBook";
    }
}
