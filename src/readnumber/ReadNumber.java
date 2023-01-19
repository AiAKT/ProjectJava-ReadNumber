/*
Name : Miss.Nutnicha Chusin
ID : 6130200358
Section : 830
Description : Enter an integer along with the read word 
              then print them all out, when entering negative numbers.
              Ascending order when printed.
*/
package readnumber;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class ReadNumber {
    public static void main(String[] args) {
        try{
            Map<Integer,String> map = new HashMap();
            Scanner inp = new Scanner(System.in);
            for(;;){
                int num;
                String sum;
                System.out.println("--------------------------------------------");
                System.out.print("Enter your number : ");
                num=inp.nextInt();
                if(num<0){
                    break;
                }
                if(map.containsKey(num)){
                    System.out.print("Read that : ");
                    System.out.println(map.get(num));
                }
                else{
                    System.out.println("!!! I can't read this number !!!");
                    System.out.print("Please tell how to read this number with me : ");
                    sum=inp.next();
                    map.put(num, sum);
                }
            }
            System.out.println("--------------------------------------------");
            System.out.println(map);
        }
        catch(Exception e){
            System.out.println("!!! You enter the wrong information !!!");
        }
    }
}