import java.util.Scanner;

class Hanoi {
    static int count=0;
    private static void hanoi(int n, int from, int to) {
        int tmp;
        if (n==1) {
            count++;
            System.out.println("move from "+from+" to "+to);
        }
        else {
            tmp=free(from,to);
            hanoi(n-1,from,tmp);
            System.out.println("move from "+from+" to "+to);
            count++;
            hanoi(n-1,tmp,to);
        }
    }
    private static int free(int a, int b) {
        return (6-(a+b));
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n,from,to;
        System.out.print("n=");
        n=in.nextInt();
        System.out.print("from=");
        from=in.nextInt();
        System.out.print("to=");
        to=in.nextInt();
        hanoi(n,from,to);
        System.out.println("count="+count);
    }
}
