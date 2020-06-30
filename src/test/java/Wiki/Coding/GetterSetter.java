package Wiki.Coding;

public class GetterSetter {

    private String name;
    private int age;
    private int weight;

    public GetterSetter(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Second {
    public static void main(String[] args) {

        GetterSetter cat = new GetterSetter("Barsik", 18, 4);
        System.out.println(cat.getAge());
        cat.setAge(5);
        System.out.println(cat.getAge());

    }
}
