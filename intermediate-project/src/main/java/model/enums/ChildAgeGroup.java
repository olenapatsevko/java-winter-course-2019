package model.enums;

public enum ChildAgeGroup {
    INFANT(0, 1),
    TODDLER(2, 2),
    PRESCHOOLER(3, 5),
    SCHOOL_AGED(6, 12),
    ADOLESCENT(13, 19);

    private int minAge;
    private int maxAge;

     ChildAgeGroup(int minAge, int maxAge) {
         this.minAge = minAge;
         this.maxAge = maxAge;
     }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }


    /**
     * @return some kind of to string method with explains to a user which age in included in each category
     */
    public String description() {
        return "For" + this + " age range vary from " + this.minAge + " to " + this.maxAge + " \n";
    }

    /**
     * it's a cover of a valueOf method with allows us to read a name of an enum this any case
     *
     * @param s name of the enum with any case
     * @return new enum
     */
    public static ChildAgeGroup createChildAgeGroup(String s) {
        return ChildAgeGroup.valueOf(s.toUpperCase());

    }


}
