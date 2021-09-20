package pattern.interpreter;

//抽象表达式类
public  interface AbstractExpression {
   //解释方法
    public boolean interpret(String info);
}