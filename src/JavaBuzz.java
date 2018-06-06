
public class JavaBuzz {

    public String generate(int num){
        if (num % 15 == 0) {
            return "javabuzz";
        } else if (num % 5 == 0) {
            return "buzz";
        } else {
            return "java";
        }
    }

}
