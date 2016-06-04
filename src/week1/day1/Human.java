package week1.day1;

/**
 * Created by mykhailov on 22.05.2016.
 */
public class Human {

//    String name;
//    int age;
//    String sex;
//    int height;
//    int weight;

    private String name;
    private int age;
    private String sex;
    private int heiht;
    private int weight;

    public Human() {

    }

//    public void init(String name, int age, String sex, int height, int weight) {
        public Human(String name, int age, String sex,int heiht, int weight){
            this.name = name;
            this.age = age;
//        this.sex = sex;
//        this.heiht = heiht;
//        this.weight = weight;
        }

    public void init( int weight) {
        this.weight = weight;
    }

    public Human(String name, int age, String sex) {

        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null) return;

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHeiht() {
        return heiht;
    }

    public void setHeiht(int heiht) {
        this.heiht = heiht;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String asString() {
        return String.format("Name - %s, age - %d, height - %d", name, age, heiht);
//        return "Name - " + name + ", age - " + age + ", height - " + heiht;
    }
}
