package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

//    public static void main(String[] args) {
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//
//
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        String myText = "myText";
//        myText = poemBeautifier.beautify(myText);
//        System.out.println(myText);
//
//        myText = poemBeautifier.beautify(myText);
//        System.out.println(myText);
//
//        myText = poemBeautifier.beautify(myText);
//        System.out.println(myText);
//
//        myText = poemBeautifier.beautify(myText);
//        System.out.println(myText);
//
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);
//
//    }
//        public static void main(String[] args) {
//            People.getList().stream()                         // [1]
//                    .forEach(System.out::println);                 // [2]
//        }

//    public static void main(String[] args) {
//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]
//
//        System.out.println(theResultStringOfBooks);
////    }
//public static void main(String[] args) {
//    BookDirectory theBookDirectory = new BookDirectory();
//
//    Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//            .filter(book -> book.getYearOfPublication() > 2005)
//            .collect(Collectors.toMap(Book::getSignature, book -> book));             // [1]
//
//    System.out.println("# elements: " + theResultMapOfBooks.size());             // [2]
//    theResultMapOfBooks.entrySet().stream()
//            .map(entry -> entry.getKey() + ": " + entry.getValue())                   // [3]
//            .forEach(System.out::println);                                            // [4]
//}
    public static void main(String[] args) {
        Forum theUsersDirectory = new Forum();
        Map <Integer, ForumUser>  theUsersMapDirectory = theUsersDirectory.getList().stream()
                .filter(user -> user.getNumberOfPosts() > 1)
                .filter(user -> user.getGender() == 'M')
                .filter(user -> ChronoUnit.YEARS.between(user.getBirthDate(), LocalDate.now()) >= 20 )
                .collect((Collectors.toMap(user -> user.getUserID(), user -> user)));

        System.out.println(theUsersMapDirectory);
    }


}





