package javahomeworkweek3;

public class WhileLoopTable9 {
    public static void main(String[] args) {
        int table9 = 9;
        int a=1;
        while (a<=10){
            System.out.println(table9 + " X " + a + "   =  " + a++ * table9);
        }
    }
}
