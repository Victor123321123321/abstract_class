import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int[][] a;
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int x = scanner.nextInt();
        a = new int[y][x];
        for(int i = 0; i < y; i++){
            for(int j = 0; j < x; j++){
                a[i][j] = i * j;
            }
        }
    }
}


