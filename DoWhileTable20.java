package javahomeworkweek3;

public class DoWhileTable20 {
    public static void main(String[] args) {
        int table=20;
        int i = 1;
        do {
            System.out.println( table + "X" + i + "=" + i++ * table);
        }
        while (i<=10);
    }
}
