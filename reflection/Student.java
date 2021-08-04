package reflection;


/**
 * @author wangyimu
 * @create 2021-08-04-21:55
 */
public class Student {
    private String name = "yimu";
    public int age = 25;

    public Student() {
        System.out.println("Student()");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Studenr(String,name)");
    }

    private void eat(){
        System.out.println("i am eat");
    }
    public void sleep(){
        System.out.println("i am pig");
    }
    private void function(String str) {
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        /*
        1.通过getClass获取Class对象
        */

        Student s1 = new Student();
        Class c1 = s1.getClass();

        /*
            2.直接通过 类名.class 的方式得到,该方法最为安全可靠，程序性能更高
        这说明任何一个类都有一个隐含的静态成员变量 class
        */

        Class c2 = Student.class;

        /*
            3、通过 Class 对象的 forName() 静态方法来获取，用的最多，
            但可能抛出 ClassNotFoundException 异常
        */

        Class c3 = null;
        try{
            // //注意这里是类的全路径，如果有包需要加包的路径
            c3 = Class.forName("reflection.Student");
        }catch(Exception e){
            e.printStackTrace();
        }

        //一个类在 JVM 中只会有一个 Class 实例,即我们对上面获取的
        //c1,c2,c3进行 equals 比较，发现都是true

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c3));

    }
}