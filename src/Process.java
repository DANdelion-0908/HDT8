package src;

public class Process implements Comparable<Integer>{

    private String name;
    private String user;
    private String nice;

    /**
     * This function returns the name of the person
     * 
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * This function sets the name of the object to the name passed in as a parameter
     * 
     * @param name The name of the parameter.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This function returns the user
     * 
     * @return The user name.
     */
    public String getUser() {
        return user;
    }

    /**
     * This function sets the user variable to the user parameter
     * 
     * @param user The user name to use for authentication.
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * This function returns the value of the variable nice
     * 
     * @return The value of the variable nice.
     */
    public String getNice() {
        return nice;
    }

    /**
     * This function sets the value of the variable nice to the value of the parameter nice
     * 
     * @param nice The name of the parameter.
     */
    public void setNice(String nice) {
        this.nice = nice;
    }

    /**
     * It compares the nice value of the current process to the nice value of the other process.
     * 
     * @param other the other process to compare to
     * @return The difference between the two integers.
     */
    @Override
    public int compareTo(Integer integer) {
        int thisNice = Integer.parseInt(this.nice);
        int otherNice = integer;
        return Integer.compare(thisNice, otherNice);
    }

}