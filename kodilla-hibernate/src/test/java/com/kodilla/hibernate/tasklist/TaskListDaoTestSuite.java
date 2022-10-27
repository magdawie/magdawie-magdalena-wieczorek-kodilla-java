package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListDaoTestSuite {

    private TaskListDao taskListDao;
    private static final String LISTNAME = "Test list ame";
    private static final String DESCRIPTION = "Test desc";
    @Test
    void testFindByListName(){
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        int id = taskList.getId();
        Optional<TaskList> readTaskList = taskListDao.findById(id);
        assertTrue(readTaskList.isPresent());
        taskListDao.deleteById(id);


    }

}
