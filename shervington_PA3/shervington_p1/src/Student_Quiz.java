import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;

public class Student_Quiz {

        public static int correctCounter = 0;

        public static void multiplicationQuestion(SecureRandom rand, Scanner scnr, int difficulty) {
            int a;
            int b;
            int diffVector = 0;

            switch (difficulty) {
                case 1:
                    diffVector = 9;
                    break;
                case 2:
                    diffVector = 99;
                    break;
                case 3:
                    diffVector = 999;
                    break;
                case 4:
                    diffVector = 9999;
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }


            a = rand.nextInt(diffVector) + 1;
            b = rand.nextInt(diffVector) + 1;
            System.out.printf("How much is %d times %d?\n", a, b);

            double studentAnswer = scnr.nextDouble();

            if (((studentAnswer - (double) (a * b)) < 0.00001) && ((studentAnswer - (double) (a * b)) >= 0)) {
                correctResponse();
                correctCounter += 1;
            } else {
                incorrectResponse();
            }

        }

        public static void additionQuestion(SecureRandom rand, Scanner scnr, int difficulty) {
            int a;
            int b;
            int diffVector = 0;

            switch (difficulty) {
                case 1:
                    diffVector = 9;
                    break;
                case 2:
                    diffVector = 99;
                    break;
                case 3:
                    diffVector = 999;
                    break;
                case 4:
                    diffVector = 9999;
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }

            a = rand.nextInt(diffVector) + 1;
            b = rand.nextInt(diffVector) + 1;
            System.out.printf("How much is %d plus %d?\n", a, b);

            double studentAnswer = scnr.nextDouble();

            if (((studentAnswer - (double) (a + b)) < 0.00001) && ((studentAnswer - (double) (a + b)) >= 0)) {
                correctResponse();
                correctCounter += 1;
            } else {
                incorrectResponse();
            }

        }

        public static void subtractionQuestion(SecureRandom rand, Scanner scnr, int difficulty) {
            int a;
            int b;
            int diffVector = 0;

            switch (difficulty) {
                case 1:
                    diffVector = 9;
                    break;
                case 2:
                    diffVector = 99;
                    break;
                case 3:
                    diffVector = 999;
                    break;
                case 4:
                    diffVector = 9999;
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }

            a = rand.nextInt(diffVector) + 1;
            b = rand.nextInt(diffVector) + 1;
            System.out.printf("How much is %d minus %d?\n", a, b);

            double studentAnswer = scnr.nextDouble();

            if (((studentAnswer - (double) (a - b)) < 0.00001) && ((studentAnswer - (double) (a - b)) >= 0)) {
                correctResponse();
                correctCounter += 1;
            } else {
                incorrectResponse();
            }

        }

        public static void divisionQuestion(SecureRandom rand, Scanner scnr, int difficulty) {
            int i;
            //int correctCounter = 0;
            int a;
            int b;
            int diffVector = 0;

            switch (difficulty) {
                case 1:
                    diffVector = 9;
                    break;
                case 2:
                    diffVector = 99;
                    break;
                case 3:
                    diffVector = 999;
                    break;
                case 4:
                    diffVector = 9999;
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }

            a = rand.nextInt(diffVector) + 1;
            b = rand.nextInt(diffVector) + 1;
            System.out.printf("How much is %d divided by %d?\n", a, b);

            double studentAnswer = scnr.nextDouble();

            if (((studentAnswer - (double) a / (double) b)) < 0.1) {
                correctResponse();
                correctCounter += 1;
            } else {
                incorrectResponse();
            }
        }

        public static void randomQuestion(SecureRandom rand, Scanner scnr, int difficulty) {

            int choice = rand.nextInt(4);

            switch (choice) {
                case 0:
                    multiplicationQuestion(rand, scnr, difficulty);
                    break;
                case 1:
                    additionQuestion(rand, scnr, difficulty);
                    break;
                case 2:
                    subtractionQuestion(rand, scnr, difficulty);
                    break;
                case 3:
                    divisionQuestion(rand, scnr, difficulty);
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }

        }

        private static void correctResponse() {
            Random random = new Random();
            int response = random.nextInt(4);

            switch (response) {
                case 0:
                    System.out.println("Very good!\n");
                    break;
                case 1:
                    System.out.println("Excellent!\n");
                    break;
                case 2:
                    System.out.println("Nice work!\n");
                    break;
                case 3:
                    System.out.println("Keep up the good work!\n");
                    break;
                default:
                    System.out.println("ERROR\n");
                    break;
            }
        }

        private static void incorrectResponse() {
            Random random = new Random();
            int response = random.nextInt(4);

            switch (response) {
                case 0:
                    System.out.println("No. Please try again.\n");
                    break;
                case 1:
                    System.out.println("Wrong. Try once more.\n");
                    break;
                case 2:
                    System.out.println("Don't give up!\n");
                    break;
                case 3:
                    System.out.println("No. Keep trying.\n");
                    break;
                default:
                    System.out.println("ERROR\n");
                    break;
            }
        }

        private static void results(double correct) {
            int correctPercent = (int) ((correct / 10.0) * 100.0);

            if (correctPercent >= 75) {
                System.out.println("Congratulations, you are ready to go to the next level!\n");
            } else if (correctPercent < 75) {
                System.out.println("Please ask your teacher for extra help.\n");
            } else if (correctPercent < 0) {
                System.out.println("ERROR\n");
            }
        }

        private static boolean continueOrQuit(Scanner scnr) {
            System.out.println("Would you like to begin a new session?\n1 = Yes\n2 = No\n");
            int userAnswer = scnr.nextInt();

            if (userAnswer == 1) {
                correctCounter = 0;
                return false;
            } else if (userAnswer == 2) {
                return true;
            }

            return continueOrQuit(scnr);
        }

        static int selectDifficulty(Scanner scnr) {
            System.out.println("Which difficulty would you like?\n" +
                    "1) Single-digit numbers\n2) Two-digit numbers\n3) Three-digit numbers\n" +
                    "4) Four-digit numbers");

            int selection = scnr.nextInt();

            if (!((selection < 5) && (selection > 0))) {
                System.out.println("INVALID INPUT");
                return selectDifficulty(scnr);
            }

            return selection;
        }

        static void problemType(Scanner scnr, SecureRandom rand, int difficulty) {
            System.out.println("Which kind of problems would you like to do?\n" +
                    "1) Addition Problems\n2) Multiplication Problems\n3) Subtraction Problems\n" +
                    "4) Division Problems\n5) Random types of problems");

            int selection = scnr.nextInt();
            int i;

            switch (selection) {
                case 1:
                    for (i = 0; i < 10; ++i) {
                        additionQuestion(rand, scnr, difficulty);
                    }
                    break;
                case 2:
                    for (i = 0; i < 10; ++i) {
                        multiplicationQuestion(rand, scnr, difficulty);
                    }
                    break;
                case 3:
                    for (i = 0; i < 10; ++i) {
                        subtractionQuestion(rand, scnr, difficulty);
                    }
                    break;
                case 4:
                    for (i = 0; i < 10; ++i) {
                        divisionQuestion(rand, scnr, difficulty);
                    }
                    break;
                case 5:
                    for (i = 0; i < 10; ++i) {
                        randomQuestion(rand, scnr, difficulty);
                    }
                    break;
            }
        }

        public static void main(String[] args) {
            SecureRandom rand = new SecureRandom();
            Scanner scnr = new Scanner(System.in);
            boolean quit = false;
            int difficulty;

            while (quit == false) {
                difficulty = selectDifficulty(scnr);

                problemType(scnr, rand, difficulty);

                results(correctCounter);

                quit = continueOrQuit(scnr);

            }
        }


}
