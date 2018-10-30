import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = scanner.nextInt();
        int[][]array = new int[size][size];

        for (int i = 0; i<size;i++){
            for (int j = 0; j<size;j++){
                System.out.println("Enter element [" + i + "][" + j+"] :");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Array: ");
        for (int i = 0; i<size;i++){
            for (int j = 0; j<size;j++){
                System.out.print(array[i][j] + "  ");

            }
            System.out.println();
        }
        int max = array[0][0];
        for (int i = 0; i<size;i++){
            for (int j = 0; j<size;j++){
                if (array[i][j] > max){
                    max = array[i][j];
                }
            }
        }

        System.out.println("The max value is: " + max);

    }
}
