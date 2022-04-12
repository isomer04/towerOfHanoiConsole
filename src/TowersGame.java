import java.util.Scanner;

public class TowersGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {

            Stack<Integer> stack1 = new ArrayStack<>();
            Stack<Integer> stack2 = new ArrayStack<>();
            Stack<Integer> stack3 = new ArrayStack<>();

            //improvement #1 I would like to make them dynamic stack tower
            // make a javafx animation project.
            // make a simple javafx town of hanoi project


            System.out.println("Initial stack contents: " + stack1);
            System.out.println("Initial stack contents: " + stack2);
            System.out.println("Initial stack contents: " + stack3);


            for (int i = 8 ; i >= 1; i--) {
                stack1.push(i);
            }

            System.out.println("Contents of stack: " + stack1);
//            stack1.push(6);


            String  choiceAgain = "y";


            boolean again = true;
            while (again) {


                // To be honest I didn't face that much trouble
                // because it is almost identical to the card game. Most of the code I took from that game
                //faced trouble #2 I couldn't keep repeating

                System.out.println("Choose a tower to move FROM: (1 - 3)");

                int choiceFrom = scan.nextInt();

                switch(choiceFrom){
                    case 1:

                        System.out.println("Choose a tower to move TO: (1 - 3)");
                        int choiceTo = scan.nextInt();

                        // Improvement #2 I want to have dynamic tower here instead of hard coded choice.
//                        Also, I am seeing a duplicate warning. I want to improve it.
                        if(choiceTo == 2) {
                            stack2.push(stack1.pop());

                        }else if (choiceTo == 1){
                        System.out.println("You cannot choose the same tower");

                        continue;
                    }
                        else if (choiceTo == 3){
                            stack3.push(stack1.pop());

                        } else {
                            System.out.println("Tower doesn't exist");
                            continue;
                        }
                        break;


                    case 2:
                        System.out.println("Choose a tower to move TO: (1 - 3)");
                        choiceTo = scan.nextInt();

                        if(choiceTo == 1) {
                            stack1.push(stack2.pop());

                        }
                        else if (choiceTo == 2) {
                            System.out.println("You cannot choose the same tower");

                            continue;

                        } else if (choiceTo == 3){
                            stack3.push(stack2.pop());

                        } else {
                            System.out.println("Tower doesn't exist");
                            continue;
                        }
                        break;

                    case 3:
                        System.out.println("Choose a tower to move TO: (1 - 3)");
                        choiceTo = scan.nextInt();

                        if(choiceTo == 1) {
                            stack1.push(stack3.pop());

                        }
                        else if (choiceTo == 3) {
                            System.out.println("You cannot choose the same tower");

                            continue;

                        } else if (choiceTo == 2){
                            stack2.push(stack3.pop());

                        } else {
                        System.out.println("Tower doesn't exist");
                        continue;
                    }
                        break;


                }

                System.out.println("Ending stack1 contents: " + stack1);
                System.out.println("Ending stack2 contents: " + stack2);
                System.out.println("Ending stack3 contents: " + stack3);

                System.out.println("Would you like to move another disk? (y/n) " );
                choiceAgain = scan.next();

//                if(choiceAgain == "n"){
//                    again = false;
//                    System.out.println(false);
//
//                    break;
//                } else {
//                    again = true;
//                    System.out.println(true);
//
//
//                }

                switch (choiceAgain){
                    case "y":
                        again = true;
                        break;

                    default:
                        again = false;

                }


            }


        } catch (UnsupportedOperationException e) {
            System.out.println("Exception");
        }

    }



}
