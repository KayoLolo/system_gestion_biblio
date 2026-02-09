import java.time.LocalDate;
import java.util.Date;

public abstract class Document {
    protected String title;
    protected int borrowPeriod;
    protected boolean isBorrowed;
    private String id;
    private LocalDate date;

    public Document(String id, String title, int borrowPeriod, boolean isBorrowed, LocalDate date){
        this.id = id;
        this.title = title;
        this.borrowPeriod = borrowPeriod;
        this.isBorrowed =isBorrowed;
        this.date =date;

    }

    public LocalDate getDateEmprunt(){
        return date;
    }

    public String getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }


    public boolean getStatus(){
        return isBorrowed;
    }

    public abstract String getDocumentType();

    public abstract int getBorrowPeriod();

    public abstract void displayInfo();



}
