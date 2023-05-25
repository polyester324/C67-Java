package Lesson_10.homework.taskAdditional;


public class User implements Cloneable{
    private int cloneType;
    private int id;
    private Laptop laptop;

    public User(int cloneType, int id, Laptop laptop) {
        this.cloneType = cloneType;
        this.id = id;
        this.laptop = laptop;
    }

    public int getCloneType() {
        return cloneType;
    }

    public void setCloneType(int cloneType) {
        this.cloneType = cloneType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "User{" +
                "cloneType=" + cloneType +
                ", id=" + id +
                ", laptop=" + laptop +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        switch (cloneType){
            case 1 -> {return super.clone();}  // shallow cloning
            case 2 -> {  // deep cloning
                User user = (User) super.clone();
                user.laptop = (Laptop) laptop.clone();
                return user;}
            default -> throw new IllegalStateException("Unexpected value: " + cloneType);
        }
    }
}


