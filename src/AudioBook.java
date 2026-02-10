import java.time.LocalDate;
import java.util.Date;

public class AudioBook extends Document{
    int duration;
    String narrator;

    public AudioBook(String id, String  title, int duration, String narrator, int borrowPeriod, boolean isBorrowed, LocalDate date){
        super(id, title,borrowPeriod,isBorrowed, date);
        this.duration = duration;
        this.narrator = narrator;
    }

    public int getDuration() {
        return duration;
    }

    public String getNarrator(){
        return narrator;
    }

    public int getBorrowPeriod(){
        return 14;
    }
    public String  getDocumentType(){
        return "Audio Book";
    }

    public void displayInfo(){
        System.out.println("Name : "+title);
        System.out.println("Max borrow period : "+borrowPeriod);
        System.out.println("Duration : "+duration);
        System.out.println("Narrator : "+narrator);
        if (isBorrowed){
            System.out.println("Status : Unavailable");
        }else {
            System.out.println("Status : Available");
        }
    }

}
