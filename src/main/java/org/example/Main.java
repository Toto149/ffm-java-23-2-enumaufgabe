package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("1", "John", DaysOfWeek.FRIDAY,Gender.MALE);
        Person person2 = new Person("2", "Jessica", DaysOfWeek.FRIDAY,Gender.FEMALE);
        Person person3 = new Person("3", "Michael", DaysOfWeek.SATURDAY,Gender.MALE);
        PersonRepository repo = new PersonRepository();
        repo.addPerson(person);
        repo.addPerson(person2);
        repo.addPerson(person3);
        System.out.println("============= GetPersonById Method =======================");
        System.out.println(repo.getPersonById("1"));
        System.out.println(repo.getPersonById("2"));
        System.out.println(repo.getPersonById("3"));
        System.out.println(repo.getPersonById("4"));
        System.out.println("============= Get Weekday Method =======================");
        System.out.println(repo.getPersonById("1").get().favoriteDay().weekDayAsString());
        System.out.println(repo.getPersonById("2").get().favoriteDay().weekDayAsString());
        System.out.println(repo.getPersonById("3").get().favoriteDay().weekDayAsString());
        System.out.println("============= Favorite Day Person Method =======================");
        System.out.println(repo.findPersonsByFavoriteDay(DaysOfWeek.THURSDAY));
        System.out.println(repo.findPersonsByFavoriteDay(DaysOfWeek.FRIDAY));
        System.out.println("============= countPerson By Gender =======================");
        System.out.println(repo.countPersonByGender(Gender.MALE));
        System.out.println(repo.countPersonByGender(Gender.FEMALE));
        System.out.println(repo.countPersonByGender(Gender.DIVERSE));
        System.out.println("============= findPersonByName =======================");
        System.out.println("John gibt es: " + repo.findPersonByName("John"));
        System.out.println("Jan wird hingegen nicht gefunden: " + repo.findPersonByName("Jan"));
    }
}