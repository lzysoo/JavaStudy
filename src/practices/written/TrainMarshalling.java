package practices.written;

/**
 * �𳵱������⣺�жϸ��������Ƿ�Ϊ���ܵõ��Ľ��������� yes���������no
 */

import java.util.Scanner;

public class TrainMarshalling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (d - c >= 2 || c - b >= 2 || b - a >= 2)
            System.out.println("No");
        else
            System.out.println("Yes");

//        int a = 1,b = 1;
//        Stack<Integer> s = new Stack<>();
//        while (b <= 4){
//            if (a == arr[b]){
//                a++;
//                b++;
//            }
//            else if(!s.empty() && s.peek() == arr[b]){
//                s.pop();
//                b++;
//            }
//            else if(a <= 4){
//                s.push(a);
//                a++;
//            }
//            else {
//                System.out.println("No");
//            }
//        }
//        System.out.println("Yes");
    }
}
