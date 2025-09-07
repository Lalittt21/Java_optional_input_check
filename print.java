import java.util.Optional;
import java.util.Scanner;
public class print{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Optional<String> name;
    do{
        System.out.println("Enter your name:");
    String input = sc.nextLine();
     name = Optional.ofNullable(input.isEmpty()?null:input);
    if(name.isPresent()){
        System.out.println("Welcome to the website:"+name.get()); 
    }
    else
    System.out.println("Error:Entering a name is manditory");
    
    
}while(name.isEmpty());
    }
}

