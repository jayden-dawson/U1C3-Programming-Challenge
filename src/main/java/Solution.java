public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    private String calcModel;
    private int idNumber;

    public Solution(String model, int id) {
        calcModel = model;
        idNumber = id;
    }

    public Solution(int id) {
        calcModel = "TI-84";
        idNumber = id;
    }

    public String getCalcModel() {
        String getModel = calcModel;
        return getModel;
    }

    public void setCalcModel(String newModel) {
        calcModel = newModel;
    }

    public int getIdNumber() {
        int getId = idNumber;
        return getId;
    }

    public void setIdNumber(int newId) {
        idNumber = newId;
    }

    public void incrementId() {
        idNumber += 1;
    }

    public double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public double subtract(double num1, double num2) {
        double subtraction = num1 - num2;
        return subtraction;
    }

    public double multiply(double num1, double num2) {
        double product = num1 * num2;
        return product;
    }

    public int quotient(int num1, int num2) {
        int quotient = num1 / num2;
        return quotient;
    }

    public int remainder(int num1, int num2) {
       int remainder = num1 % num2;
        return remainder;
    }

    public String divisionResult(int num1, int num2) {
        int remainder = num1 % num2;
        int quotient = num1 / num2;
        String str1 = quotient + " R " + remainder;
        return str1;
    }

    public String coordinatePair(int x, int y) {
        String str2 = ("(" + x + ", " + y + ")");
        return str2;
    }

    public int average(int num1, int num2) {
         double num3 = (num1 + num2) / 2.0;
         int num4 = (int) (num3 + .5);
        return num4;
    }

    public String info() {
        String str3 = "This calculator is a model " + calcModel + " with id " + idNumber;
        return str3;
    }

}
