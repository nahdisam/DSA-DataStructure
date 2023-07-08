
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Main {
    
    public Person findPersonById(long personId){
        Long before = System.currentTimeMillis();
        List<Person> people = new ArrayList<>();
        for(Person person : people){
            if(person.getId().equals(personId)){
                Long after = System.currentTimeMillis();
                System.out.println(after - before);
                return person;
            } else {
            }
        }
        return null;
    }
    public Person findPersonByIdOption2(Long PersonId){
        Map <Long,Person> people = new HashMap<>();
        int hashCode=PersonId.hashCode();
        Person[]map = new Person[Integer.MAX_VALUE];
        map[hashCode]=new Person();
        people.put(PersonId,new Person());
        return people.get(PersonId);
    }
    public static void main(String[] args) {
//        SingleDimensionArray sda = new SingleDimensionArray(10);
//        sda.insert(0, 10);
//        sda.insert(1, 20);
//        sda.insert(2, 30);
//        sda.insert(2, 30);
//        sda.set(20);
//       NewStack stk =  new NewStack(4);
//       boolean result =  stk.isEmpty();
//        System.out.println("result = "+result);

    }
    
}
