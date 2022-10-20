package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootApplication
@SpringBootTest
public class BoardTestSuite {
   @Autowired
   private Board board;

    @Test
    public void testTaskAdd(){
        board.getToDoList();
        board.getInProgressList();
        board.getDoneList();


    }

}
