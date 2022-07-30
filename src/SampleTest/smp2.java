package SampleTest;

import java.util.*;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public List<Integer> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Integer> subordinates) {
        this.subordinates = subordinates;
    }
};

public class smp2 {
    public static void main(String[] args) {
//        Employee e1 = new Employee();
//        Employee e2 = new Employee(4,5,new ArrayList<>(Arrays.asList(2,3)));
//       e1.setId(1);
//
//       e1.setImportance(11);
//
//       e1.setSubordinates(new ArrayList<>(Arrays.asList(2,3)));
//
//        getImportance((List<Employee>) e1);

       List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,2,new ArrayList<>(Arrays.asList(2,4))));
        emp.add(new Employee(2,3,new ArrayList<>(Arrays.asList(5,7))));
        emp.add(new Employee(3,3,new ArrayList<>()));
        emp.add(new Employee(5,7,new ArrayList<>(Arrays.asList(7,7))));
        smp2.getImportance(emp);
    }


    public static int getImportance(List<Employee> employees) {
        // HashMap<Integer, List<Integer>> neighMap = new HashMap<>();
        // HashMap<Integer, Integer> impMap = new HashMap<>();
        // for(int i = 0 ; i < employees.size(); i++){
        //  //   neighMap.computeIfAbsent(employees.get(i),x -> new ArrayList<Integer>()).add(employees.get(i+2));\
        //     neighMap.computeIfAbsent(employees.get(i))
        // }


//        HashMap<Integer,List<Integer>> nMap = new HashMap<>();
         // HashMap<Integer,Employee> eMap = new HashMap<>();
//        for(int i = 0 ; i < employees.size(); i++){
//         //   nMap.computeIfAbsent(employees.get(i).id,x-> new ArrayList<>()).add(employees.get(i).subordinates);
//         //   nMap.put(employees.get(i).id,employees.get(i).subordinates);
//
//        }

        HashMap<Integer , Employee> map = new HashMap<>();
        for(Employee employee : employees){
            map.put(employee.id, employee); //over here we are storing the corresponding Id with the object of the empoyee
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        int total = 0;
        while(!q.isEmpty()){
            int curr = q.poll();
            Employee obj = map.get(curr);
            total += obj.id;
            for(int sub : obj.subordinates ){
                q.add(sub);
            }
        }



        System.out.println(employees.get(0).subordinates);
      //  System.out.println(employees.size());
        return 2;
    }
}