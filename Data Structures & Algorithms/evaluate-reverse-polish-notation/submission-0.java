class Solution {
    public int evalRPN(String[] tokens) {    

        Stack<Integer> stack = new Stack<>();

        for(String tok : tokens){
            if(tok.equals("+") || tok.equals("-") || tok.equals("*") || tok.equals("/")){
                int b = stack.pop();
                int a = stack.pop();           
            

            switch(tok){
                case "+":
                    stack.push(a + b);
                    break;
                case "-":
                    stack.push(a - b);
                    break;
                case "*":
                     stack.push(a * b);
                     break;
                case "/":
                    stack.push(a / b);
                    break;
            }
        } else{
            stack.push(Integer.parseInt(tok));
        }
    }
        return stack.pop();
    }
}
