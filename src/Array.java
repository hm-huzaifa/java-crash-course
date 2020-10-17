import java.util.Scanner;

public class Array {
    public static void main(String... args){

//        String[] names = new String[6];
//        names[0] = "Talha";
//        names[1] = "Huzaifa";
//        names[2] = "8sam";
//        names[3] = "Hasan";
//        names[4] = "Abdul Haddi";
//        names[5] = "Mushtaq Nafees";

//        for (int i = 0; i < 6; i++){
//
//            System.out.println(names[i]);
//
//        }
        // For Each Loop
//        for (String name: names){
//            System.out.println(name);
//        }

        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[5];
        for (int i=0; i < 5; i++){
        System.out.print("Enter Marks: ");
        nums[i] = scanner.nextInt();
        }

        for (int num:nums) {
            System.out.println(num);
        }

//        int[] marks = {95, 60, 65, 99};
//
//        for (int mark: marks) {
//            System.out.println(mark);
//        }


    }
}
