import java.time.LocalDate;

public class Magazine extends Document{

    int editNum;
    int editFreq;
    int nbPages;

    public Magazine(String id, int editNum, String title, int editFreq, int nbPages, int borrowPeriod, boolean isBorrowed, LocalDate date){
        super(id, title,  borrowPeriod, isBorrowed, date);
        this.editNum = editNum;
        this.editFreq = editFreq;
        this.nbPages= nbPages;
    }

    public int getEditNum(){
        return editNum;
    }

    public int getEditFreq(){
        return editFreq;
    }

    public int getBorrowPeriod(){
        return 7;
    }

    public String getDocumentType(){
        return "Magazine";
    }

    public void displayInfo(){
        System.out.println("Name : "+title);
        System.out.println("Max borrow period : "+borrowPeriod);
        System.out.println("Edition number: "+editNum);
        System.out.println("Edition frequency : "+editFreq);
        if (isBorrowed){
            System.out.println("Status : Unavailable");
        }else {
            System.out.println("Status : Available");
        }
    }
}
