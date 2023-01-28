/*
class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(
                new AddOperation(),
                new SubstractOperation(),
                new MultiplyOperation(),
                new DivideOperation()
        );

        int firNum = 140;
        int secNum = 60;

        int answer = calculator.add(firNum, secNum);
        System.out.println(" + answer = " + answer);

        answer = calculator.substract(firNum, secNum);
        System.out.println(" - answer = " + answer);

        answer = calculator.multiply(firNum, secNum);
        System.out.println(" * answer = " + answer);

        answer = calculator.divide(firNum, secNum);
        System.out.println(" / answer = " + answer);
    }
}
class Calculator {
    private AddOperation addOperation;
    private SubstractOperation substractOperation;
    private MultiplyOperation multiplyOperation;
    private DivideOperation divideOperation;

    public Calculator(AddOperation addOperation, SubstractOperation substractOperation, MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        this.addOperation = addOperation;
        this.substractOperation = substractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }

    public int add(int firstNumber, int secondNumber){
        return addOperation.operate(firstNumber, secondNumber);
    }

    public int substract(int firstNumber, int secondNumber){
        return substractOperation.operate(firstNumber, secondNumber);
    }

    public int multiply(int firstNumber, int secondNumber){
        return multiplyOperation.operate(firstNumber, secondNumber);
    }

    public int divide(int firstNumber, int secondNumber){
        return divideOperation.operate(firstNumber, secondNumber);
    }
}
class AddOperation {
    public int operate(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}
class SubstractOperation {
    public int operate(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
}
class MultiplyOperation {
    public int operate(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
}
class DivideOperation {
    public int operate(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
}
*/
