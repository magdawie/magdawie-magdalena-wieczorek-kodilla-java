package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean name =
    @Prototipe
    public Board board() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }

    public TaskList getToDoList() {
        return new TaskList();
    }

    public TaskList getInProgressList() {
        return new TaskList();
    }

    public TaskList getDoneList() {
        return new TaskList();
    }
}
