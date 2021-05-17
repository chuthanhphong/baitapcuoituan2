package bt2;

import javax.swing.text.Document;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        String id =Scanner.next();
        System.out.print("Enter nxb:");
        String nxb = Scanner.nextLine();
        System.out.print("Enter number: ");
        int number = Scanner.nextInt();
        System.out.print("Enter author: ");
        Scanner.nextLine();
        String author = Scanner.nextLine();
        System.out.print("Enter page number: ");
        int pageNumber = Scanner.nextInt();
        Library book = new Book(id, nxb, number, author, pageNumber);
        BookManagement.addDocument(book);


    }
}
