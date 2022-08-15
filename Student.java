/**
  A student has its properties set by the user and can be changed by calling a method.
  @author Subheg Sidhu 100362765
  @version Java Version 8
  Date: May 24, 2022
 */

public class Student {

    private String firstName;
    private String surName;
    private long studentNumber;
    private double quizScore;
    private int amountOfQuiz;
    private String loginID;

    private Address address;


    /**
     * Constructs a student object with the following parameters.
     * @param first
     * @param sur
     * @param studentNum
     */
    public Student(String first, String sur, long studentNum){

        firstName = first;
        surName = sur;
        studentNumber = studentNum;

    }

    /**
     * Changes the first and surname of the Student object with the following parameters:
     * @param first
     * @param sur
     */
    public void setName(String first, String sur){

        firstName = first;
        surName = sur;


    }

    /**
     * Combines the first and surname of the student into a singular string and returns it to user.
     * @return Student's Name
     */
    public String getName(){

        String name = firstName + " " + surName;
        return name;


    }

    /**
     * Returns the student number to the user.
     * @return Student Number
     */
    public long getStudentNumber(){

        return studentNumber;

    }

    /**
     * Constructs the loginID of the student with the following requirements:
     * first character is the first character of the students first name
     * next four characters are the first four characters of the surname
     * last two digits are the last two digits of the student number
     */
    private void makeLoginID(){

        String first = firstName.substring(0,1);
        String sur = surName.substring(0,4);
        String id = studentNumber + "";
        String num = id.substring(id.length() - 2);

        loginID = first + sur + num;


    }

    /**
     * The method calls the makeLoginID() method and constructs a login ID for the student
     * then returns the ID to the user.
     * @return login ID to the user.
     */
    public String getLoginId(){

        makeLoginID();
        return loginID;



    }

    /**
     * Combines the students info into a singular string and returns it to user.
     * @return The Student's Info (First Name, Surname, Login ID and Student Number)
     */
    public String getInfo(){

        String info = firstName + ", " + surName + " (" + loginID + " " + studentNumber + ")";
        return info;

    }


    /**
     * Sets the value of the instance object "address" with the parameters inputted by the user.
     * @param number
     * @param street
     * @param city
     * @param province
     * @param postalCode
     */
    public void setAddress(String number, String street, String city, String province, String postalCode){

        address = new Address(number, street, city, province, postalCode);

    }

    /**
     * Calls the method of the Address class to return the address to user.
     * @return Student's Address
     */
    public String getAddress(){

        return address.getAddress();




    }

    /**
     * Takes quiz score and adds it to the total quiz score.
     * @param quiz
     */
    public void addQuiz(double quiz){

        quizScore = quizScore + quiz;

        amountOfQuiz = amountOfQuiz +  1;


    }

    /**
     * Returns the average quiz score to the user by using the total quiz score / amountsofquiz
     * @return Average Quiz Grade
     */
    public double getQuizAverage(){

        return quizScore / amountOfQuiz;


    }

    @Override
    public String toString(){

        return firstName + " " + surName + " " + studentNumber;

    }

}


