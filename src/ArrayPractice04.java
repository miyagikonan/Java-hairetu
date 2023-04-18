public class ArrayPractice04 {
    public static void main(String[] args) {

        var number = new int[10];
        number[0] = 5;
        number[1] = 7;
        number[2] = 8;
        number[3] = 1;
        number[4] = 9;
        number[5] = 2;
        number[6] = 3;
        number[7] = 6;
        number[8] = 4;
        number[9] = 10;

        var temp = 0;

        for (var i = 0; i < number.length; i++){

            for (int j = 0; j < number.length - 1; j++) {
                if(number[j] > number[j+1]){
                    temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

    }

}
