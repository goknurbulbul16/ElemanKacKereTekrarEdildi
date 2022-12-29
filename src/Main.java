import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        for (int element: list) {
            System.out.print(element+ ", ");
        }
        Arrays.sort(list);

        System.out.print("\n");
        System.out.println("--------------------");

        System.out.println("Tekrar Sayıları");
        System.out.println("--------------------");


        int count = 0;
        int tempnumber = list[0];
        for (int i = 0; i < list.length; i++) {
            if (i == 0 || tempnumber != list[i]) {
                for (int k : list) {
                    if (k == list[i]) {
                        count++;
                        tempnumber = list[i];
                    }
                }
                System.out.println(list[i]+ " sayısı " + (count) + " kere tekrar edildi.");
            }
            count = 0;
        }
    }
}