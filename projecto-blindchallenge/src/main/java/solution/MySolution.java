package solution;

import blch.framework.annotations.Solution;
import blch.framework.external.SolutionBase;
import java.util.HashMap;

@Solution
public class MySolution extends SolutionBase {

  public static HashMap<Integer, Person> info = new HashMap<>();
  public int count = 0;

  public Person createPerson(Object... args) {
    Person per = new Person();
    per.setName(args[2].toString());
    if (args.length > 3) {
      if (args[4].getClass().getSimpleName().equals("Integer")) {
        int age = (int) args[4];
        if (age <= 0) {
          throw new IllegalArgumentException("Invalid age");
        }
        per.setAge(age);
      }
    }

    if (args.length > 5) {
      per.setEmail(args[6].toString());
    }
    return per;
  }

  @Override
  public Object execute(Object... args) {
    HashMap<Object, Object> person = new HashMap<>();
    if (args.length == 0) {
      throw new IllegalArgumentException("No arguments");
    }
    if (args.length == 1) {
      throw new IllegalArgumentException("Missing entity");
    }
    if (args.length == 2) {
      return 0;
    }
    System.out.println(info.size());

    System.err.println(person.size());

    if (args[0].equals("PUT")) {
      if (info.isEmpty()) {
        info.put(count, createPerson(args));
      } else {
        info.forEach(
            (k, p) -> {
              if (p.getName().equals(args[2])) {
                throw new IllegalArgumentException("Already exists");
              }
            });
        count++;
        info.put(count, createPerson(args));
      }

      return true;
    }

    if (args[0].equals("GET")) {
      info.forEach(
          (k, p) -> {
            if (p.getName().equals(args[2])) {
              person.put("name", p.getName());
              if (p.getAge() != 0) {
                person.put("age", p.getAge());
              }
              if (p.getEmail() != null) {
                person.put("email", p.getEmail());
              }
            }
          });
      if (person.isEmpty()) {
        throw new IllegalArgumentException("Not found");
      } else {
        return person;
      }
    }

    if (args[0].equals("REMOVE")) {
      info.forEach(
          (k, p) -> {
            if (p.getName().equals(args[2])) {}
          });
      count--;
      return true;
    }
    if (count >= 1) {
      return count;
    }

    return false;
  }
}
