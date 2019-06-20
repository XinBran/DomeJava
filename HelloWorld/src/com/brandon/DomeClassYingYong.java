class Car {
    private String name ;
    private double price ;
    private Person person ;	// 车应该属于一个人
    public Car(String name,double price) {
        this.name = name ;
        this.price = price ;
    }
    public void setPerson(Person person) {
        this.person = person ;
    }
    public Person getPerson() {
        return this.person ;
    }
    public String getInfo() {
        return "汽车品牌型号：" + this.name + "、汽车价值：" + this.price ;
    }
}
class Person {
    private String name ;
    private int age ;
    private Car car ;	// 一个人有一辆车
    public Person(String name,int age) {
        this.name = name ;
        this.age = age ;
    }
    public void setCar(Car car) {
        this.car = car ;
    }
    public Car getCar() {
        return this.car ;
    }
    public String getInfo() {
        return "姓名：" + this.name + "、年龄：" + this.age ;
    }
}
public class DomeClassYingYong {
    public static void main(String args[]) {
        // 第一步：声明对象并且设置彼此的关系
        Person person = new Person("林强",29) ;
        Car car = new Car("宾利",8000000.00) ;
        person.setCar(car) ;	// 一个人有一辆车
        car.setPerson(person) ;	// 一辆车属于一个人
        // 第二步：根据关系获取数据
        System.out.println(person.getCar().getInfo()) ;	// 代码链
        System.out.println(car.getPerson().getInfo()) ;
    }
}