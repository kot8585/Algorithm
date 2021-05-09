package mine;

public class Friend implements Comparable<Friend>{
    private String name;
    private int age;

    public Friend(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Friend o) {
        return (this.age > o.age) ? 1 :
                (this.age < o.age) ? -1 : 0;
    }
}
