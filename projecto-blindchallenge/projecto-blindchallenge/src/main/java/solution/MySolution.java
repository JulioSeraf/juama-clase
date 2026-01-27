package solution;

import blch.framework.annotations.Solution;
import blch.framework.external.SolutionBase;
import java.util.HashMap;

@Solution
public class MySolution extends SolutionBase {

  @Override
  public Object execute(Object... args) {
    HashMap<String, Object> person = new HashMap<>();
    if (args.length == 0) {
      throw new IllegalArgumentException("No arguments");
    }
    if (args.length == 1) {
      throw new IllegalArgumentException("Missing entity");
    }
    if (args.length == 2) {
      return 0;
    }
    if (args.length > 2) {
      return true;
    } 
    if(args[0].equals("PUT")){
        if(person.isEmpty()) person.put("name", args[2]);
        
    }
  }
}
