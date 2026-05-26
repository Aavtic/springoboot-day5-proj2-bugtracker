package com.day5proj2.dao;

import com.day5proj2.utils.DBUtil;
import com.day5proj2.models.Bug;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BugDAO {
    public void insertBug(Bug bug) {
        Connection conn = DBUtil.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO bugs (id, title, description, status, project_id, assigned_to, bug_id) VALUES (?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, bug.getId());
            ps.setString(2, bug.getTitle());
            ps.setString(3, bug.getDescription());
            ps.setString(4, bug.getStatus());
            ps.setInt(5, bug.getProject_id());
            ps.setInt(6, bug.getAssigned_to());
            ps.setInt(7, bug.getBug_id());
            
            ps.executeUpdate();


            System.out.println("Bug inserted successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // public List<Bug> getAllBugs(Bug bug) {
    //     Connection conn = DBUtil.getConnection();
    //     try {
    //         PreparedStatement ps = conn.prepareStatement("SELECT * from bugs");
    //         ps.executeQuery();
    //         System.out.println("Bug inserted successfully");
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }

    // }
}
