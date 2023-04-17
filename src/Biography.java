import java.util.ArrayList;
import java.util.Scanner;

public class Biography {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
         This will be our actual program that we define author and his books
         In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

         Full name = Stefan Zweig
         County = Austria
         Is still alive: No (28 November 1881 – 22 February 1942)
         Some of his books as listed below:

         BookName                            Genre           TotalPage
         Amok                                tale            189
         The Royal Game                      novella         53
         24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

        //YOUR CODE HERE
        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite author’s first name?");
        String firstName = input.nextLine();

        System.out.println("What is your favorite author’s last name?");
        String lastName = input.nextLine();

        System.out.println("Where is your favorite author from?");
        String country = input.nextLine();

        System.out.println("Is your favorite author alive? Y/N");
        boolean isAlive = input.next().equalsIgnoreCase("Y");
        int age = 0;


        if (isAlive) {
            System.out.println("How old is your favorite author?");
            age = input.nextInt();
        }
        ArrayList<Book> books = new ArrayList<>();

        String bookInfo = "";
        do {
            System.out.println("Would you like to enter book information? (Y/N)");
            bookInfo = input.next();
            input.nextLine();

            if (bookInfo.toUpperCase().startsWith("Y")) {
                System.out.println("What is the book name?");
                String name = input.nextLine();

                System.out.println("What is the genre of the book?");
                String genre = input.next();

                System.out.println("How many pages does book have?");
                int numberOfPages = input.nextInt();
                books.add(new Book(name, genre, numberOfPages)); //makes it into a list

            } else System.out.println("THE END RESULT OF ABOVE PROGRAM");


        }

        while (bookInfo.toUpperCase().startsWith("Y")); //when user inputs Y for book information
        Author author = new Author(firstName, lastName, country, isAlive);
        System.out.println("Authors information = " + author);
        System.out.println("Author's books are as listed below: ");

        for (Book b : books) {
            System.out.println(b);

        }
    }
}