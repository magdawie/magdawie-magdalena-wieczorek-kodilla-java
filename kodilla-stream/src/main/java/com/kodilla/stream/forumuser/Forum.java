package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

  public Forum() {
            theForumUserList.add(new ForumUser(1, "Dylan Murphy",
                'M', LocalDate.of(2002, 01, 01), 2));
            theForumUserList.add(new ForumUser(2, "Phoebe Pearson",
                'F', LocalDate.of(2002, 01, 01), 5));
            theForumUserList.add(new ForumUser(3, "Morgan Walsh",
                'M', LocalDate.of(2002, 01, 01), 3));
            theForumUserList.add(new ForumUser(4, "Aimee Murphy",
                'F', LocalDate.of(2002, 01, 01), 0));
            theForumUserList.add(new ForumUser(5, "Ryan Talley",
                'M', LocalDate.of(1258, 01, 01), 3));
            theForumUserList.add(new ForumUser(6, "Madelynn Carson",
                'F', LocalDate.of(1896, 01, 01), 3));
            theForumUserList.add(new ForumUser(7, "Giancarlo Guerrero",
                'M', LocalDate.of(2000, 01, 01), 5));
    }
    public  List<ForumUser> getList() {
        return new ArrayList<>(theForumUserList);
    }
}
