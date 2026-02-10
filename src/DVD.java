import java.time.LocalDate;
import java.util.Date;

public class DVD extends Document{
    int duration;
    int ageClassification;

    public DVD(String id, String title, int duration, int ageClassification, int borrowPeriod, boolean isBorrowed, LocalDate date){
        super(id, title, borrowPeriod, isBorrowed, date);
        this.duration = duration;
        this.ageClassification = ageClassification;
    }

    public int getDuration(){
        return duration;
    }

    public int getClassification(){
        return ageClassification;
    }

    public int getBorrowPeriod(){
        return 5;
    }

    public String getDocumentType(){
        return "DVD";
    }

    public void displayInfo(){
        System.out.println("Name : "+title);
        System.out.println("Max borrow period : "+borrowPeriod);
        System.out.println("Duration : "+duration);
        System.out.println("Classification : "+ageClassification);
        if (isBorrowed){
            System.out.println("Status : Unavailable");
        }else {
            System.out.println("Status : Available");
        }
    }

}
