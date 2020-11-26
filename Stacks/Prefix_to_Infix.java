public class PrefixToInfix
{
public static boolean isOperator(char x)
{
switch(x)
{
case '+' :
case '-' :
case '/' :
case '*' :
return true;
}
return false;
}
//Convert Prefix to Infix expression.
public static String preToInfix(String exp)
{
char exp1[] = exp.toCharArray();
Stack<string> s = new Stack<>();
int length = exp.length();
//Reading from right to left.
for(int i = length -1; i>=0; i--)
{
if(isOperator(exp1[i]))
{
String op1 = s.pop();
String op2 = s.pop();
String temp = "(" + op1 + exp1[i] + op2 + ")";
s.push(temp);
}
else
{
s.push(Character.toString(exp1[i]));
}
}
return s.pop();
}
