public class ArrayPractice03 {
    public static void main(String[] args) {

        int[] arrey = {1,2,3,4,5,6,7,8,9,};

            for (var i = 0; i < 9; i++) {
                for (var j = 0; j < 9; j++) {
                    var w = arrey[i] * arrey[j];
                    System.out.println(arrey[i] + "×" + arrey[j] + "=" + w);
                }
                System.out.println("---------------");
            }

    }
}
