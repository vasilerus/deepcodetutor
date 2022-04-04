/**
 * topics: Classes and Objects
 * subtopics: Object intilazation, getter and setter method, accessing methods
 * goalDescription: A program to translate a point.
 * source: N/A
 * input: N/A
 * output: New coordinates is (18, 8)
 */
public class Point {

    /**
     * domain_model_question: What is the goal of the following block of code?
     * logical_step_1: It declares variables to represent a point in a 2-dimensional space and methods to access them.
     * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
     * logical_step_details: Variables x and y represent the coordinates of a point in a 2-dimensional space. The getter methods get the coordinates of the point. The setter method sets the coordinates of the point.
     * question_1: What do variables x and y represent and what is their type?
     * answer_1: Variables x and y represent the coordinates of a point in a 2-dimensional space and are of type private integer.
     * question_2: What does a getter method do?
     * answer_2: The getter methods get the coordinates of the point.
     * question_3: What does a setter method do?
     * answer_3: The setter method sets the coordinates of the point.
     */
    /**
     * stm_comment: The x and y coordinates are declared private to make them accessible only to their class.
     * question_1: Why are coordinates x and y declared as private?
     * answer_1: The x and y coordinates are declared private to make them accessible only to their class.
     */
    private int x;
    private int y;
    public void setX(int newX) { this.x = newX; }
    public int getX() { return x; }
    public void setY(int newY) { this.y = newY; }
    public int getY() { return y; }

    /**
     * domain_model_question: What is the goal of the following block of code?
     * logical_step_2: It defines a method to translate a point.
     * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
     * logical_step_details: A method translate is defined with input parameters dx and dy to shift the x and y coordinates of a point. To translate a point, the method adds offset values dx and dy to x and y, respectively. 
     * question_1: How is a method translate defined?
     * answer_1: A method translate is defined with input parameters dx and dy to shift the x and y coordinates of a point.
     * question_2: How exactly is a point translated?
     * answer_2: To translate a point, the method adds offset value dx and dy to x and y respectively.
     /**
     * stm_comment: The input parameter dx and dy indicates the offset along the x and y coordinates, respectively.
     * question_1: What do the input parameters dx and dy represent?
     * answer_1: The input parameter dx and dy indicates the offset along the x and y coordinates, respectively.
     */
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public static void main(String[] args) {

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_3: It creates an object to represent a point.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: To represent a point, an object of class Point is declared and initialized to a newly created object by calling new(). The value of the x coordinate is initialized to 7. The value of the y coordinate is initialized to 2.
         * question_1: How is a Point object declared and initialized?
         * answer_1: To represent a point, an object of class Point is declared and initialized to a newly created object by calling new().
         * question_2: What value is the x coordinate initialized to?
         * answer_2: The value of x coordinate is initialized to 7. 
         * question_3: What value is the coordinate initialized to?
         * answer_3: The value of the y coordinate is initialized to 2.
         */
        /**
         * stm_comment: A new point is created by calling the new operator on the Point class.
         * question_1: Why is the new operator called in this line of code?
         * answer_1:  A new point is created by calling the new operator on the Point class.
         */
        Point point = new Point();
        point.setX(7);
        point.setY(2);

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_4: It translates a point and prints a new set of coordinates for a given Point object.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: The method translate is called to move the point in the 2-dimensional space. After calling the translate method, the values of x and y are 18 and 8, respectively.
         * question_1: Why is the method translate called?
         * answer_1: The method translate is called to move a point in a 2-dimensional space.
         * question_2: What is the value of x and y coordinates after calling the translate method?
         * answer_2: After calling the translate method, the value of x and y coordinates are 18 and 8, respectively.
         */
        /**
         * stm_comment: The parameter values 11 and 6 represent the offsets along the x and y coordinates.
         * question_1: What do parameters 11 and 6 represent?
         * answer_1:  The parameter values 11 and 6 represent desired offsets along the x and y coordinates.
         */
        point.translate(11, 6);
        System.out.println("New coordinates is (" + point.getX() + ", " + point.getY() + ")");

    }
}