import java.util.Scanner;

public class MDArray {

    public static void main(String[] args) {

//        int[][] table = {
//        {45, 98, 12, 64},   // 0
//        {84, 23, 68, 12},
//        {15, 97, 74, 26},
//        {71, 43, 30, 54}
//        };
//
//        for (int r = 0; r < table.length; r++){
//            int[] row = table[r];
//            for (int c = 0; c < row.length; c++){
//                System.out.print(row[c] + " ");
//            }
//            System.out.println();
//        }

        int[][] jadool = new int[4][4];

        Scanner scanner = new Scanner(System.in);

        for (int r = 0; r < jadool.length; r++){

            int[] row = jadool[r];

            for (int c = 0; c < jadool.length; c++){

                System.out.print("Enter (" + r + "," + c + "): ");
                jadool[r][c] = scanner.nextInt();
            }
        }

        System.out.println("Jadool: ");

        for (int r = 0; r < jadool.length; r++){

            int[] row = jadool[r];

            for (int c = 0; c < row.length; c++){

                System.out.print(row[c] + " ");
            }
            System.out.println();
        }


    }
}
