package com.luv2code.springdemo.mvc.validation;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode>, String{
    
    private String coursePrefix;

    @Override
    public void initializer(CourseCode arg0) {
        coursePrefix = theCourseCode.value();
    }

    @Override
    public boolean isValid(String theCode, theConstraintValidatorContext) {

        boolean result; 
        
        if(theCode != null) { 
            result = theCode.startsWith(coursePrefix);
        }else { 
            return false;
        }
    }
}