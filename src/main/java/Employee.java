import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
1. Created a Class with "Paramatarized" Type
2. Because, lets just say we are not sure what is type of the roles can be.
3. Role property could be simple string like "admin", or it could be an array of roles. example: [manager, admin]
4. Since we do not know so we decided to keep it "generic"
5. So that when user of this class creates the object, he can decide whether he want to send a String as role or Arrays of multiple role.
6. Check the TestGenericsMainClass on how to create the Object for this.
*/
public class Employee<T extends List> {

    int id;
    String name;
    int age;
    T roles;

   public Employee(int id, String name, int age, T roles){
       this.id = id;
       this.name = name;
       this.age = age;
       this.roles = roles;
   }

   public void printEmployeeDetails(){
        System.out.println("id: " + id + " name: " + name + " age: " + age + " Roles: " + roles);
   }

}
