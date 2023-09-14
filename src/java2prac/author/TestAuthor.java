package java2prac.author;

import java2prac.author.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("John Doe", "johndoe@example.com", 'M');

        System.out.println(author.toString());
        author.setEmail("newemail@example.com");
        System.out.println(author.toString());
    }
}
