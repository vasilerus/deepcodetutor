/**
 * author: Lasang Tamang, refind by Dr Vasile Rus
 * topics: Logical Operator 
 * subtopics: Logical AND, Logical OR, ternary operator 
 * goalDescription: Checks whether a year is a leap year or not.
 * source: N/A
 * input: N/A
 * output: Leap Year
 */
public class LeapYear {
    public static void main(String[] args) {

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_1: It declares variables to store and check whether the year is a leap year.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: A variable year of integer type is declared to store a year. The value of the variable year is initialized to 2020. Also, the variable leapYear of string type is defined to store a message to be displayed indicating whether the year specified is a leap year.
         * question_1: Why is the variable year declared and what is its type?
         * answer_1: A variable year of integer type is declared to store a year.
         * question_2: What value is the variable year initialized to?
         * answer_2: The value of the variable year is initialized to 2020.
         * question_3: Why is variable leapYear declared and what is its type?
         * answer_3: The variable leapYear of string type is defined to store a message to be displayed indicating whether the year specified is a leap year. 
         */
        int year = 2020;
        String leapYear;

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_2: It checks and prints whether the year is a leap year or not.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: An expression is defined using a ternary logical operator to check whether the year is a leap year. Because the expression evaluates to true for the year 2020, the string value "Leap Year" is assigned to the string variable leapYear. Therefore, the program prints to the standard output device the message "Leap Year".
         * question_1: How is the specified year checked whether it is a leap year?
         * answer_1: An expression is defined using a ternary logical operator to check whether the year is a leap year.
         * question_2: Does the expression evaluate to true for the year 2020?
         * answer_2: Yes, the expression evaluates to true.
         * question_3: What value will be assigned to the variable leapYear given that 2020 is a leap year?
         * answer_3: The string value "Leap Year" is assigned to the string variable leapYear.
         * question_4: What does the program print to the standard output device, i.e., the computer display or screen?
         * answer_4: The program prints "Leap Year".
         */
        /**
         * stm_comment: A ternary logical operator is used to check whether the value of the variable year satisfies the definition of a leap year. The ternary logical operator has three elements: the condition, the result value if the condition is TRUE, and the result value if the condition is FALSE.
         * question_1: How exactly is the specified year checked whether it is a leap year?
         * answer_1: A ternary logical operator is used to check whether the value of the variable year satisfies the definition of a leap year.
         * question_2: How many main elements do the ternary operator have and what are those elements?
         * answer_2: The ternary logical operator has three elements: the condition, the result value if the condition is TRUE, and the result value if the condition is FALSE.
         */
        leapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ? "Leap Year" : "Not a Leap year";
        System.out.println(leapYear);

    }
}