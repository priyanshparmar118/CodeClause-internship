//code clause internship 
class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[30];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " book has been added.\n");
    }

    void showAvailabelBooks(){
        System.out.println("Available Books are: \n");
        for(String book : this.books){
            if(book == null){
                continue;
            }
            System.out.println("# " + book);
        }
    }

    void issueBook(String book){
        for (int i=0; i<this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println(book +" book has been issued.\n");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist.\n");
    }

    void returnBook(String book){
        addBook(book);
    }
}

public class online_library {
    public static void main(String[] args) {
        System.out.println("----------------Library Management System----------------");
        Library centralLibrary = new Library();
        centralLibrary.addBook("Java Advance");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("Learn Python ");

        centralLibrary.showAvailabelBooks();

        centralLibrary.issueBook("Java Advance");

        centralLibrary.showAvailabelBooks();

        centralLibrary.returnBook("Java Advance");

        centralLibrary.showAvailabelBooks();
    }
}