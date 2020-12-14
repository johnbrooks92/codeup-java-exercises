import java.time.Period;
import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {

        Person[] personArr = new Person[3];
        personArr[0] = new Person("John");
        personArr[1] = new Person("Matt");
        personArr[2] = new Person("Tom");

        Person[] newPArr = addPerson(personArr, new Person("tod"));
        for (Person person: newPArr) {
            System.out.println(person.getName());
        }
    }
    public static Person[] addPerson(Person[] pArr, Person person) {
        Person[] newArr = Arrays.copyOf(pArr,pArr.length + 1);
        newArr[newArr.length-1] = person;
        return newArr;
    }

}