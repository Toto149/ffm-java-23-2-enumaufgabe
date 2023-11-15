package org.example;

import java.util.*;

public class PersonRepository {
    private List<Person> personList = new ArrayList<>();
    private Map<String, Person> personMap = new HashMap<>();
    public Optional<Person> getPersonById(String id){
        for(Person person : personList){
            if(person.id().equals(id)){
               return Optional.of(person);
            }
        }
        return Optional.empty();
    }
    public Optional<Person> getPersonById2(String id){
        Person person = this.personMap.get(id);
        if(person != null){
            return Optional.of(person);
        }

        return Optional.empty();
    }

    public void addPerson(Person person){
        this.personList.add(person);
        this.personMap.put(person.id(), person);
    }
    public int countPersonByGender(Gender gender){
        int count = 0;
        for(Person person : personList){
            if(person.gender()==gender){
                count++;
            }
        }
        return count;
    }

    public Optional<Person> findPersonByName(String name){
        for(Person person : personList){
            if(person.name().equals(name)){
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
    public List<Person> findPersonsByFavoriteDay(DaysOfWeek favoriteDay){
        List<Person> personList1 = new ArrayList<>();
        for(Person person : personList){
            if(person.favoriteDay()==favoriteDay){
                personList1.add(person);
            }
        }
        return personList1;
    }


}
