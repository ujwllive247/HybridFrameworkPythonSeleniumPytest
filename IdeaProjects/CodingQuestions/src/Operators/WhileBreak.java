package Operators;

public class WhileBreak {
    public static void main(String[] args) {
        int i = 10;
        while (i < 20){
            System.out.println(i);
            i++;
            if(i ==15){
                break;
            }
        }
    }
}
