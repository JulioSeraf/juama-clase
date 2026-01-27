package solution;

import blch.framework.annotations.Solution;
import blch.framework.external.SolutionBase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Solution
public class MySolution extends SolutionBase {

  public Map<Integer, Person> map = new HashMap<>();
  public int idPer = 1;

  public Person createPerson(Object... args) {
    Person per = new Person();
    per.setName(args[2].toString());
    if (args.length > 3 && args[3].equals("age")) {
      if (args[4].getClass().getSimpleName().equals("Integer")) {
        int age = (int) args[4];
        if (age <= 0) {
          throw new IllegalArgumentException("Invalid age");
        }
        per.setAge(age);
      } else {
        throw new IllegalArgumentException("Invalid age");
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
    if (args[0].equals("COUNT") || args[0].equals("SIZE")) {
      return map.size();
    }

    if (!args[1].equals("person")) {
      throw new IllegalArgumentException("Unknown entity");
    }
    if (!args[0].equals("PUT") && !args[0].equals("GET") && !args[0].equals("REMOVE")) {
      throw new IllegalArgumentException("Unknown command");
    }
    System.out.println(map.size());
    if (args[0].equals("PUT")) {
      if (args.length == 2) {
        throw new IllegalArgumentException("Missing name");
      }
      if (args[2].equals("")) {
        throw new IllegalArgumentException("Invalid name");
      }
      if (map.isEmpty()) {
        map.put(idPer, createPerson(args));
      } else {
        map.forEach(
            (k, p) -> {
              if (p.getName().equals(args[2])) {
                throw new IllegalArgumentException("Already exists");
              }
            });
        idPer++;
        map.put(idPer, createPerson(args));
      }
      return true;
    }
    if (args[0].equals("GET")) {
      map.forEach(
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
      }
      return person;
    }

    if (args[0].equals("REMOVE")) {
      Iterator<Map.Entry<Integer, Person>> info = map.entrySet().iterator();
      while (info.hasNext()) {
        Map.Entry<Integer, Person> objPer = info.next();
        if (objPer.getValue().getName().equals(args[2])) {
          info.remove();
          return true;
        }
      }
      throw new IllegalArgumentException("Not found");
    }
    throw new NullPointerException();
  }
}
