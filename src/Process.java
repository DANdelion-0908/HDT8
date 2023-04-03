package src;

public class Process implements Comparable<Integer>{

    private String name;
    private String user;
    private String nice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNice() {
        return nice;
    }

    public void setNice(String nice) {
        this.nice = nice;
    }

    @Override
    public int compareTo(Integer o) {
        return 0;
    }
}