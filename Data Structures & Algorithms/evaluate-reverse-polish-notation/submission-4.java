class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>val=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){

                int operands1=(int)val.pop();
                int operands2=(int)val.pop();
                int result=evaluteExp(operands1,operands2,tokens[i]);
                val.push(result);
            }
            else{
                val.push(Integer.parseInt(tokens[i]));
            }
        }
        return val.peek();
    }
    public int evaluteExp(int op1,int op2,String exp){
        if(exp.equals("+")){
            return op1+op2;
        }
        if(exp.equals("-")){
            return op2-op1;
        }
        if(exp.equals("*")){
            return op1*op2;
        }
        if(exp.equals("/")){
            if(op1==0){
                return 0;
            }
            return op2/op1;
        }
        return 0;
    }
}

