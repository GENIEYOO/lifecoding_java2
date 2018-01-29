package ContructorConcept;


public class HouseDog extends Dog {
    public HouseDog(String name) {
        this.setName(name);
    } 
    //생성자가 생성된 경우 규칙대로만 객체를 생성할 수 있다.

    public void sleep() {
        System.out.println(this.name+" zzz in house");
    } 

    public void sleep(int hour) {
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    } 

    public static void main(String[] args) {
        HouseDog dog = new HouseDog("happy");
        System.out.println(dog.name);
    }
}