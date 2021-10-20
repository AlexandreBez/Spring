package com.lucas.springdemo.mvc;

import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Customer {
    
    private String firstName;

    @NotNull("is required")
    @Size(min=1, message="is required")
    private String lastName;

    @Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits");
    private String postalCode;

    @Min(Value=0, message="must be greater then or equal to zero")
    @Max(Value=10, message="must be less then or equal to ten")
    @NotNull("is required")
    private Integer freePasses;

    @CourseCode
    private String courseCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

}
