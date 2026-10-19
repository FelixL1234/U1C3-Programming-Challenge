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
        return calcModel;
    }

    public void setCalcModel(String newModel) {
        calcModel = newModel;
    }

    public int getIdNumber() {
        return idNumber;
    }

    /*
        Solution calc = new Solution(1001);
    calc.getCalcModel();
    calc.getIdNumber();
    */

    public void setIdNumber(int newId) {
        idNumber = newId;
    }

    public void incrementId() {
        idNumber += 1;
    }

    public double add(double num1, double num2) {
        return (num1 + num2);
    }

    public double subtract(double num1, double num2) {
        return (num1 - num2);
    }

    public double multiply(double num1, double num2) {
        return (num1 * num2);
    }

    public int quotient(int num1, int num2) {
        int quotientResult = num1 / num2;
        return quotientResult;
    }

    public int remainder(int num1, int num2) {
        return num1 % num2;
    }

    public String divisionResult(int num1, int num2) {
        int intQuotient = num1 / num2;
        int remainder = num1 % num2;
        return intQuotient + " R " + remainder;
    }

    public String coordinatePair(int x, int y) {
        return "(" + x + ", " + y + ")";
    }

    public int average(int num1, int num2) {
        double sum = num1 + num2;
        int result = (int) ((sum / 2) + 0.5);
        return result;
    }

    public String info() {
        return "This calculator is a model " + calcModel + " with id " + idNumber;
    }

}
