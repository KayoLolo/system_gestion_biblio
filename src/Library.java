import java.time.LocalDate;
import java.util.ArrayList;

public class Library {

    private ArrayList<Document> documents;
    private int documentCount;
    private String library;

    public Library(){
        documents = new ArrayList<>();

    }

    public void addDocument(Document doc){
        for (int i = 0; i<documents.size(); i++){
            if (doc!=null){
                documents.add(doc);
            }
        }
    }




    public void removeDocument(String documentId){
        for (int i =0; i<documents.size(); i++){
            if ( documents.get(i).getId().equals(documentId)){
                documents.remove(i);
                return;
            }
        }
    }



//    public ArrayList<Document> getAvailableDocuments() {
//        ArrayList<Document> availableDocs = new ArrayList<>();
//        for (int i =0; i<documents.size(); i++){
//            if (documents.get(i).getStatus()){
//                availableDocs.add(documents.get(i));
//            }
//        }
//        return availableDocs;
//    }

    public ArrayList<Document> getAvailableDocuments2(){
        return new ArrayList<>(documents.stream().filter(document -> !document.getStatus()).toList());
    }





//    public ArrayList<Document> getDocumentsByType(String type) {
//        ArrayList<Document> documentType = new ArrayList<>();
//        documents.stream().filter(document -> {
//                if(document.getDocumentType().equals(type)){
//                    documentType.add(document);
//                }
//                return false;
//        });
//        return documentType;
//    }

    public ArrayList<Document> getDocumentsByType(String type){
        return new ArrayList<>(documents.stream().filter(document -> document.getDocumentType().equals(type)).toList());
    }


//    public ArrayList<Document> getOverdueDocument(String type) {
//        ArrayList<Document> documentType = new ArrayList<>();
//        documents.stream().filter(document -> {
//                if( LocalDate.now() - document.getDateEmprunt() > document.getBorrowPeriod()){
//                    documentType.add(document);
//                }
//                return false;
//        });
//        return documentType;
//    }


    public ArrayList<Document> getOverdueDocument() {
        ArrayList<Document> documentType = new ArrayList<>();
        for (int i=0; i<documents.size(); i++){
            if (documents.get(i).getDateEmprunt() )

        }
    }

    public double calculateTotalLateFees() {

    }


    public void displayAllDocuments() {
        for (int i = 0; i < documentCount; i++) {
            documents.get(i).displayInfo(); // Polymorphisme !
        }
    }


    public ArrayList<Document> findDocument(String title) {
        return new ArrayList<>(documents.stream().filter(document -> document.getTitle().equals(title)).toList());
    }


}
