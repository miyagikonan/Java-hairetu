import java.util.Scanner;
public class ArrayPractice02 {
    public static void main(String[] args) {

        System.out.println("要素数の入力");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var num1 = Integer.parseInt(s1);
        var oo = new int[num1] ;

        System.out.println("各要素の入力");
        for (var i = 0; i < oo.length; i++) {
            var s2 = sc.nextLine();
            var num2 = Integer.parseInt(s2);
            oo[i] = num2;
        }

        var sum = 0;
        for (var i = 0; i < oo.length; i++){
            sum += oo[i];
        }
        double ave = (double)sum / oo.length;

        System.out.println("合計値：" + sum);
        System.out.println("平均値：" + ave);

        sc.close();


    }
}
