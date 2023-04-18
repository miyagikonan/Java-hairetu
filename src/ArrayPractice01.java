public class ArrayPractice01 {
    public static void main(String[] args) {

        var number = new int[10];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;
        number[5] = 6;
        number[6] = 7;
        number[7] = 8;
        number[8] = 9;
        number[9] = 10;
       var sum = 0;

       for (var i = 0; i < number.length; i++){
           sum += number[i];
       }
        double ave = (double)sum / number.length;

       System.out.println("合計値：" + sum);
       System.out.println("平均値：" + ave);


    }
}
