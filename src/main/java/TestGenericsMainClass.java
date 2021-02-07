import java.util.ArrayList;
import java.util.HashMap;

/*
This is how you made Employee class more flexible to take different types of data types.
Notice, we have three examples below:
1. Sending the Role as String, and the class is accepting it.
2. Sending the Role as ArrayList and HashMap and in both the cases Class is accepting it.
3. Only thing is that while creating the Employee Object you have to define the value of type "T".
 */
public class TestGenericsMainClass {

    public static void main(String[] args){

        //1. Create Employee object with only single role
        Employee<String> empWithSingleRole = new Employee<String>(1,"Akash",36,"Admin");
        empWithSingleRole.printEmployeeDetails();

        //2. Create a employee with multiple roles stored in array
        ArrayList<String> listRoles = new ArrayList<String>();
        listRoles.add("Admin");
        listRoles.add("Manager");
        listRoles.add("HR");
        Employee<ArrayList<String>> employeeWithMultipleRoleArrayList = new Employee<ArrayList<String>>(2,"Timothy",29,listRoles);
        employeeWithMultipleRoleArrayList.printEmployeeDetails();

        //3. Create a employee with multiple roles stored in Hash Map
        HashMap<String, String> hmRoles = new HashMap<String, String>();
        hmRoles.put("Admin","Desc: CRUD ops");
        hmRoles.put("Manager","Desc: Management of Teams");
        hmRoles.put("HR","Desc: HR Ops");
        Employee<HashMap<String,String>> employeeWithMultipleRoleHashMap = new Employee<HashMap<String,String>>(3,"SunShun",25,hmRoles);
        employeeWithMultipleRoleHashMap.printEmployeeDetails();
    }
}

/*
Output of Above Program:
id: 1 name: Akash age: 36 Roles: Admin
id: 2 name: Timothy age: 29 Roles: [Admin, Manager, HR]
id: 3 name: SunShun age: 25 Roles: {HR=Desc: HR Ops, Admin=Desc: CRUD ops, Manager=Desc: Management of Teams}
 */
