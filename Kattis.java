// Oppgave: https://open.kattis.com/problems/chanukah

import java.util.Scanner;

class Kattis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leser den første linja
        int N = Integer.parseInt(scanner.nextLine());
        
        // Leser de neste N linjene
        for (int i = 0; i < N; i++) {
            String[] holiday = scanner.nextLine().split(" ");
            int days = Integer.parseInt(holiday[1]);

            // Ettersom vi alltid tenner en "ekstra" lykt per dag
            int candles = days;

            // Gjør beregningen fra oppgaveteksten
            for (int j = 1; j < days+1; j++) {
                candles += j;
            }
            
            // Gir Kattis resultatet slik det er beskrevet i "Sample Output 1"
            System.out.println(holiday[0] + " " + candles);
        }
        scanner.close();
    }
}
