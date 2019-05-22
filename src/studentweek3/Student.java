/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentweek3;

/**
 *
 * @author andyt
 */
public class Student {
    
    private int id;
    private String firstName;
    private int maxCourse;
    private boolean partTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the partTime
     */
    public boolean isPartTime() {
        return partTime;
    }

    /**
     * @param partTime the partTime to set
     */
    public void setPartTime(boolean partTime) {
        this.partTime = partTime;
    }
    
    
}
