package com.day5proj2.main;


import com.day5proj2.models.Bug;
import com.day5proj2.dao.BugDAO;


/**
 * Hello world!
 *
 */
public class Main 
{
    static int id = 0;
    public static void main( String[] args ) {
        BugDAO bdao = new BugDAO();

        Bug bug = new Bug(1, "Issue with login", "Login screen is not working correctly", "Severe", 1, 1, 1);
        bdao.insertBug(bug);
    }
}
