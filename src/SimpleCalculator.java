public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public double getAddNumber(){
        return firstNumber+secondNumber;
    }
    public double getSubNumber(){
        return firstNumber-secondNumber;
    }
    public double getMultiNumber(){
        return firstNumber*secondNumber;
    }
    public double getDivNumber(){
        return firstNumber/secondNumber;
    }
}
