/**
 * topics: nested if-Else 
 * subtopics: nested if-ELse 
 * goalDescription: Check Whether a number is Even number less than 10 or Odd.
 * source: N/A
 * input: N/A
 * output: 8 is even number less than 10
 */
public class EvenOdd {
	public static void main(String[] args) {

		/**
		 * domain_model_question: What is the goal of the following block of code?
		 * logical_step_1: It declares a variable to store a number to check whether it is odd or even.
		 * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
		 * logical_step_details: A variable num of integer type is declared to store the number to be checked whether is even or odd. The variable num is initialized to the integer value 9.
		 * question_1: Why is variable num declared and what is its data type?
		 * answer_1: A variable num of integer type is declared to store the number to be checked whether is even or odd.
		 * question_2: What value is the variable num initialized to?
		 * answer_2: The variable num is initialized to the integer value 9.
		 */

		int num = 8;
		/**
		 * domain_model_question: What is the goal of the following block of code?
		 * logical_step_2: It performs a test to check if the number is even number less than ten or odd and prints the result.
		 * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
		 * logical_step_details: To check whether a number is even or odd, the remainder of the number divisible by 2 is calculated using the remainder % operator. The number is even if the remainder is 0, otherwise, it is odd. If the number is even, we check if the number is less than 10. In this case, since 8 is even number less than ten program prints "8 is even number less than 10".
		 * question_1: How does the code check whether the number is even or odd?
		 * answer_1:  To check whether a number is even or odd, the remainder of the number divisible by 2 is calculated using the remainder % operator.
		 * question_2: When is the number even or odd based on the remainder operation's result?
		 * answer_2: The number is even if the remainder is 0, otherwise, it is odd.
		 * question_3: What happens if number is even in the following block of code?
		 * answer_3: If the number is even, it is checked if the number is less than 10.
		 * question_3: What is printed to the standard output when num is 12?
		 * answer_3: In this case, the program prints "12 is even number greater than 10".
		 */
		/**
		 * stm_comment: The code block inside the then branch of the if statement executes when the condition evaluates to true, which is the case in this example. 
		 * question_1: What happens if the condition of the first if statement is true?
		 * answer_1: The code block inside the if statement checks if the number is less than 10 or not.
		 * question_2: What happens if the condition of the second if statement is true?
		 * answer_2: The code block inside the if statement prints the given prompt with number, i.e. "is even number less than 10"
		 */

		if (num % 2 == 0) {
			if (num<10) {
				System.out.println(num + " is even number less than 10");
			} else {
				System.out.println(num + " is even number greater than 10");
			}
		} else {
			System.out.println(num + " is odd");
		}

	}
}