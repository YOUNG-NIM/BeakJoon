import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User{
    int age;
    String name;
    User(){}
    User(int age, String name){
        this.age = age;
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

public class Main {
    public static void main(String[]args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<User> user = new ArrayList<>();

        String[] str;
        int age;
        String name;

        for(int i=0; i<N; i++){
            str = br.readLine().split(" ");
            age = Integer.parseInt(str[0]);
            name = str[1];
            User temp = new User(age, name);
            user.add(temp);
        }
        Collections.sort(user, new Comparator<User>(){
            public int compare(User u1, User u2){
                return u1.getAge() - u2.getAge();
            }
        });

        for(User u : user){
            System.out.print(u.getAge() + " " + u.getName() + "\n");
        }

    }
}
