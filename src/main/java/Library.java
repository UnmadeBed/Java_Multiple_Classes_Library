import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> collection;

    public Library(String name, ArrayList<Book> collection){
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public String getName(){
        return this.name;
    }

    public int bookCount(){
        return collection.size();
    }


}
