/*
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

    public int calculate(String operator, int firstNumber, int secondNumber) {
        int answer = 0;

        if(operator.equals("+")){
            answer = addOperation.operate(firstNumber, secondNumber);
        }else if(operator.equals("-")){
            answer = substractOperation.operate(firstNumber, secondNumber);
        }else if(operator.equals("*")){
            answer = multiplyOperation.operate(firstNumber, secondNumber);
        }else if(operator.equals("/")){
            answer = divideOperation.operate(firstNumber, secondNumber);
        }

        return answer;
    }
}
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

        String operator = "+";
        int answer = calculator.calculate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "-";
        answer = calculator.calculate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "*";
        answer = calculator.calculate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "/";
        answer = calculator.calculate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);
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
}*/
