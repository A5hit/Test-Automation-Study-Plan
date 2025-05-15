package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapLookup {
    public static void main(String[] args) {
        Map<String, String> credentials = new HashMap<>();

        credentials.put("admin", "admin");
        credentials.put("user1", "userPass");
        credentials.put("user2", "userPass");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username: ");
        String username = sc.nextLine();

        System.out.println("Enter Password: ");
        String password = sc.nextLine();

        if(credentials.containsKey(username) && password.equals(credentials.get(username))){
            System.out.println("✅ Login Successful!");
        }
        else{
            System.out.println("❌ Invalid Login");
        }




    }
}
