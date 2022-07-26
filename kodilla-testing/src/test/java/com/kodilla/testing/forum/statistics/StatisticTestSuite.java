package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import com.kodilla.testing.library.BookLibrary;
import com.kodilla.testing.library.LibraryDatabase;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

public class StatisticTestSuite {
    private static int testCounter = 0;
    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Mock
    private Statistics  statisticsMock ;

    @Test
    void testNumberOfPostsZero() {
        // Given
        StatCalculate postsLibrary = new StatCalculate(statisticsMock);
        // When
        when(statisticsMock.postsCount()).thenReturn(0);
        // Then

        postsLibrary.calculateAdvStatistics();
        assertEquals(0, postsLibrary.getNumberOfPosts());

    }
    @Test
    void testNumberOfPostsThousand() {
        // Given
        StatCalculate postsLibrary1 = new StatCalculate(statisticsMock);
        // When
        when(statisticsMock.postsCount()).thenReturn(1000);
        // Then

        postsLibrary1.calculateAdvStatistics();
        assertEquals(1000, postsLibrary1.getNumberOfPosts());
    }
    @Test
    void testNumberOfCommentsZero() {
        StatCalculate commentLibrary = new StatCalculate(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(0);
        commentLibrary.calculateAdvStatistics();
        assertEquals(0, commentLibrary.getNumberOfComments());
    }
    @Test
    void testNumberOfCommentLowerThanPosts() {
        StatCalculate commentLibrary = new StatCalculate(statisticsMock);

        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.postsCount()).thenReturn(150);
        commentLibrary.calculateAdvStatistics();
        assertEquals(true, commentLibrary.getNumberOfComments()< commentLibrary.getNumberOfPosts());
    }
    @Test
    void testNumberOfCommentHigherThanPosts() {
        StatCalculate commentLibrary = new StatCalculate(statisticsMock);

        when(statisticsMock.commentsCount()).thenReturn(150);
        when(statisticsMock.postsCount()).thenReturn(50);        commentLibrary.calculateAdvStatistics();
        assertEquals(true, commentLibrary.getNumberOfComments()> commentLibrary.getNumberOfPosts());
    }
    @Test
    void testNumberOfUsersZero() {
        StatCalculate userLibrary1 = new StatCalculate(statisticsMock);
        List <String> userNamesList = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(userNamesList);
        userLibrary1.calculateAdvStatistics();
        assertEquals(0, userLibrary1.getNumberOfUsers());
    }
    @Test
    void testNumberOfUsersHundred() {
        StatCalculate userLibrary1 = new StatCalculate(statisticsMock);
        List <String> userNamesList = new ArrayList<>();
        for(int n=0; n<100; n++ ){
            userNamesList.add("strng");
        }
        when(statisticsMock.usersNames()).thenReturn(userNamesList);
        userLibrary1.calculateAdvStatistics();
        assertEquals(100, userLibrary1.getNumberOfUsers());
    }
}
