import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book pb1 = new ProgrammingBook("PB","alo",100,"ti","java","basic");
        Book pb2 = new ProgrammingBook("PB","blo",100,"tito","java","basic");
        Book pb3 = new ProgrammingBook("PB","clo",100,"titoti","java","basic");

        Book fb1 = new FictionBook("FB","met",150,"ti","vientuong1");
        Book fb2 = new FictionBook("FB","qua",150,"nua","vientuong2");
        Book fb3 = new FictionBook("FB","di",150,"thoi","vientuong3");

        bookList.add(pb1);
        bookList.add(pb2);
        bookList.add(pb3);
        bookList.add(fb1);
        bookList.add(fb2);
        bookList.add(fb3);

        int count = 0;
        for (Book b:bookList){
            if(b instanceof ProgrammingBook && ((ProgrammingBook)b).getLanguage().equals("java")){
                count ++;
            }
        }
        System.out.println("so sách ngôn ngữ java = " + count);
    }
}