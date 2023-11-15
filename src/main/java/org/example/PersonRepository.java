package org.example;

import java.util.*;

public class PersonRepository {
    private List<Person> personList = new ArrayList<>();
    private Map<String, Person> personMap = new HashMap<>();

    public Optional<Person> getPersonByIdList(String id){
        Person person = Optional.ofNullable(this.personMap.get(id)).orElse(new Person("","",DaysOfWeek.MONDAY,Gender.DIVERSE));
        return Optional.of(person);
    }
    public Optional<Person> getPersonByIdMap(String id){
        Person person = null;
        for(Person person1 : personList){
            if(person1.id().equals(id)){
                person = Optional.of(person1).orElse(new Person("","",DaysOfWeek.MONDAY,Gender.DIVERSE));
            }
        }
        return Optional.ofNullable(person);
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
        Person person = null;
        for(Person person1 : personList){
            if(person1.name().equals(name)){
                person = person1;
            }
        }
        return Optional.ofNullable(person);
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
