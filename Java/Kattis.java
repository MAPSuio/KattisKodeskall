import java.util.Scanner;

class Kattis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < N; i++) {
            String[] holiday = scanner.nextLine().split(" ");
            int days = Integer.parseInt(holiday[1]);
            int candles = days;

            for (int j = 1; j < days+1; j++) {
                candles += j;
            }
            
            System.out.println(holiday[0] + " " + candles);
        }
        scanner.close();
    }
}
