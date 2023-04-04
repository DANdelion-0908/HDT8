package src;

public class Process implements Comparable<Integer>{

    private String name;
    private String user;
    private String nice;

    /**
     * This function returns the name.
     * 
     * @return A name.
     */
    public String getName() {
        return name;
    }

    /**
     * This function sets the name.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This function gets the user.
     * 
     * @return A user.
     */
    public String getUser() {
        return user;
    }

    /**
     * This function sets the user.
     * 
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * This function gets the nice value.
     * 
     * @return An int nice.
     */
    public String getNice() {
        return nice;
    }

    /**
     * This function sets the nice value.
     * 
     * @param nice
     */
    public void setNice(String nice) {
        this.nice = nice;
    }

    @Override
    /**
     * This function compares two nice values.
     * 
     * @param integer
     * @return -1, 0 or 1 depending on which nice is bigger.
     */
    public int compareTo(Integer integer) {
        int thisNice = Integer.parseInt(this.nice);
        int otherNice = integer;
        return Integer.compare(thisNice, otherNice);
    }

}