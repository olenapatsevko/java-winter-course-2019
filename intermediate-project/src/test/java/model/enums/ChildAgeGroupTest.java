package model.enums;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChildAgeGroupTest {

    @Test
    public void description() {
        assertEquals("For ADOLESCENT age range vary from 13 to 19 ".trim(), ChildAgeGroup.ADOLESCENT.description().trim());
    }

    @Test
    public void createChildAgeGroup() {
        assertEquals(ChildAgeGroup.ADOLESCENT, ChildAgeGroup.createChildAgeGroup("adolescent"));
        assertEquals(ChildAgeGroup.INFANT, ChildAgeGroup.createChildAgeGroup("InFaNt"));
        assertEquals(ChildAgeGroup.TODDLER, ChildAgeGroup.createChildAgeGroup("TOddLER"));
        assertEquals(ChildAgeGroup.SCHOOL_AGED, ChildAgeGroup.createChildAgeGroup("ScHOOL_AGED"));


    }
}