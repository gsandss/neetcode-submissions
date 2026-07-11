
class Solution {
    public int evalRPN(String[] tokens) {
        //"1","2","+","3","*","4","-"
        Stack<Integer> numbers = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+":
                    int num1 = numbers.pop();
                    int num2 = numbers.pop();
                    int sum = num1 + num2;
                    numbers.push(sum);
                    break;
                case "-":
                    int right = numbers.pop();
                    int left = numbers.pop();
                    numbers.push(left - right);
                    break;
                case "*":
                    // multiply
                    numbers.push(numbers.pop() * numbers.pop());
                    break;
                case "/":
                    int r = numbers.pop();
                    int l = numbers.pop();
                    numbers.push(l / r);
                    break;
                default:
                    numbers.push(Integer.valueOf(token));
            }
        }

        return numbers.pop();
    }
}

