package pattern.interpreter;

//非终结符表达式类
public  class AndExpression implements AbstractExpression {
    private AbstractExpression city = null;
    private AbstractExpression person = null;
    public AndExpression(AbstractExpression city, AbstractExpression person) {
        this.city = city;
        this.person = person;
    }
    public boolean interpret(String info) {
        String s[] = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}

