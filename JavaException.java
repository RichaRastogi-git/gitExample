public class JavaException{
public static void main (String exception[]){
try{
int i=0;
int j=10;
int k=j/i;
System.out.println(k);
}
catch(ArithemticException e){
e.printStackTrace();
}
}
}
