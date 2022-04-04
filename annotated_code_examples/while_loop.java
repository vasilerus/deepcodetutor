/**
 * topics: while loops
 * subtopics: a loop with simple loop variable increment
 * goalDescription: Find the smallest divisor of a positive number.
 * source: N/A
 * input: N/A
 * output: Smallest divisor of 15 is 3
 */
public class SmallestDivisor {
    public static void main(String[] args) {

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_1: It defines the needed variables to represent a number and its divisor.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: The variable num represents the positive number whose smallest divisor is to be found. The variable num is initialized to 15. Variable divisor is initialized to 2, the smallest possible divisor (other than 1).
         * question_1: What does variable num represent?
         * answer_1:  Variable num represents the positive number whose smallest divisor is to be found.
         * question_2: What value is variable num initialized?
         * answer_2: The variable num is initialized to 15.
         * question_3: What does variable divisor represent?
         * answer_3: Variable divisor is initialized to 2, the smallest possible divisor (other than 1).
         */
        int num = 15;
        int divisor = 2;

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_2: It finds the smallest divisor of the number num and prints it.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: A while loop is used to generate potential divisor candidates from 2 to the number itself. At each iteration, the divisor's value is incremented by 1 so that the next value is tested. The while loop ends when the remainder of the division between num and divisor is zero, which means the value of divisor is the smallest divisor of num. The "Smallest divisor of 15 is 3" is printed.
         * question_1: How are potential divisor values generated and what is the range of candidate values?
         * answer_1: A while loop is used to generate potential divisor candidates from 2 to the number itself.
         * question_2: What happens to variable divisor at each iteration?
         * answer_2: At each iteration, the divisor's value is incremented by 1 so that the next value is tested.
         * question_3: When does the while loop end?
         * answer_3: The while loop ends when the remainder of the division between num and divisor is zero, which means the value of divisor is the smallest divisor of num. 
         * question_4: What value is printed to the standard output device, i.e., the screen?
         * answer_4: The "Smallest divisor of 15 is 3" is printed.
         */
        /**
         * stm_comment: The While loop runs as long as the rest of the dividing num by the divisor is different from zero. 
         * question_1: How long does the while loop run?
         * answer_1: The While loop runs as long as the rest of dividing num by divisor is different from zero.
         */
        while (num % divisor != 0) {
            divisor += 1;
        }
        System.out.println("Smallest divisor of " + num + " is " + divisor);

    }
}