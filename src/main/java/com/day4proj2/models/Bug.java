package com.day5proj2.models;

public class Bug {
    private int id;
    private String title;
    private String description;
    private String status;
    private int project_id;
    private int assigned_to;
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public int getProject_id() {
        return project_id;
    }


    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }


    public int getAssigned_to() {
        return assigned_to;
    }


    public void setAssigned_to(int assigned_to) {
        this.assigned_to = assigned_to;
    }


    public int getBug_id() {
        return bug_id;
    }


    public void setBug_id(int bug_id) {
        this.bug_id = bug_id;
    }


    private int bug_id;


    public Bug(int id, String title, String description, String status, int project_id, int assigned_to, int bug_id) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.project_id = project_id;
        this.assigned_to = assigned_to;
        this.bug_id = bug_id;
    }
    
}
