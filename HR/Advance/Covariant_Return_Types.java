import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Flower {
    public String whatsYourName(){
        String str="I have many names and types.";
        return str;
    }
}

class Jasmine extends Flower{
    public String whatsYourName(){
        String str="Jasmine";
        return str;
}
}

class Lily extends Flower {
    public String whatsYourName(){
        String str="Lily";
        return str;
}
}

class Region {
    public Flower yourNationalFlower(){
        return new Flower();
    }
}

class WestBengal extends Region {
     public Jasmine yourNationalFlower(){
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {
     public Lily yourNationalFlower(){
        return new Lily();
}
}


public class Covariant_Return_Types {
  public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s = reader.readLine().trim();
      Region region = null;
      switch (s) {
        case "WestBengal":
          region = new WestBengal();
          break;
        case "AndhraPradesh":
          region = new AndhraPradesh();
          break;
      }
      Flower flower = region.yourNationalFlower();
      System.out.println(flower.whatsYourName());
    }
}