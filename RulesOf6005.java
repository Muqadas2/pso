public static boolean mayUseCodeInAssignment(boolean writtenByYourself, 
                                             boolean availableToOthers, 
                                             boolean writtenAsCourseWork, 
                                             boolean citingYourSource, 
                                             boolean implementationRequired) {
    // Check if you are the author or part of the authoring team
    if (writtenByYourself) {
        // If you wrote the code yourself or as part of your team, it's generally allowed.
        return true;
    } else {
        // If the code is not written by yourself, consider other factors.
        
        // You may not use materials produced as course work by other students.
        if (writtenAsCourseWork) {
            return false;
        }
        
        // You must provide proper attribution if you use external sources.
        if (citingYourSource) {
            return false;
        }
        
        // You may use external sources only if the assignment allows it.
        if (implementationRequired) {
            return false;
        }
        
        // If the code is available to others, it may be appropriate to use.
        if (availableToOthers) {
            return false;
        }
        
        // If none of the above conditions are met, you may be allowed to use the code.
        return true;
    }
}
