public class Employee5  {
    int id;
    String name;

    Employee5(int i,String n){
        this.id=i;
        this.name=n;
    }

    void info()
    {
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
    }

    public static void main(String[] args) {

        Employee5 em1 = new Employee5(5683, "sumona");
        em1.info();
    }
}
