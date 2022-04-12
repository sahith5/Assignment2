import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Character> set=new HashSet<>();
        String s= sc.nextLine().toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            System.out.println(s.charAt(i));
            set.add(s.charAt(i));

        }
        if(set.size()==26)
        {
            System.out.println("it has 26 Charectors");
        }
        else
        {
            System.out.println("No it dont have 26 Charectors");
        }
        //timecomplexity is O(n)
        //SpaceComplexity id O(n)



    }
}
