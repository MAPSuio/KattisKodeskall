# Kodeskall i Java

Selve kodeskallet ligger [her](https://github.com/MAPSuio/KattisKodeskall/blob/main/Java/Kattis.java), og er en løsning på [denne](https://open.kattis.com/problems/chanukah) oppgaven.

## Detaljert beskrivelse

Kattis belager seg på standard input og standard output (lese fra terminal, skrive til terminal). For å lese fra terminalen i Java må vi importere en scanner.
```java
import java.util.Scanner;
```

Alt er objektorientert, så vi må også ha en klasse, sammen med en main-metode. Klassen kan hete hva som helst, men den må matche filnavnet du sender inn til Kattis
```java
class Kattis {
    public static void main(String[] args) {
```

Vi starter med å deklarere en scanner, slik at vi kan lese fra terminalen
```java
Scanner scanner = new Scanner(System.in);
```

Deretter leser vi den første linja, og konverterer den til et heltall i samme slengen

```java
int N = Integer.parseInt(scanner.nextLine());
```

Dette heltallet er antall "caser" i oppgaven. Så går vi gjennom dem med en for-løkke:
```java
for (int i = 0; i < N; i++) {
```

Hver case består av to heltall. Vi leser dem til en liste ved å splitte på mellomrom. Ettersom alt i utgangspunktet er mellomrom, er vi nødt til å konvertere dem til heltall om vi ønsker å kjøre matte-operasjoner på dem:
```java
String[] holiday = scanner.nextLine().split(" ");
int days = Integer.parseInt(holiday[1]);
```

Oppgaveteksten sier også
> However, each evening, an extra candle, called the shammas, is also lit (in fact, this candle is used to light the other candles).

Dermed vet vi at vi alltid vil ha _minst_ `days` lys:
```java
int candles = days;
```

Oppgaveteksten sier videre
> On the evening before each day, candles are lit in a menorah. On the first evening, one candle is lit, on the second, two are lit, and so on. But what if Chanukah lasted a different number of days? How many candles would be needed?

Vel, vi har jo antall dager lagret i `days`, så dette kan vi finne ut av! Vi løser det med en for-løkke:
```java
for (int j = 1; j < days+1; j++) {
    candles += j;
}
```

Kattis tester på standard output, som i Python er print()-funksjonen. Hva var det vi skulle printe igjen?
> For each data set there is one line of output. The single output line consists of the data set number, K, followed by a space followed by the number of candles needed for an N-day Chanukah holiday.

Aha! Vel, vi har "the data set number K" lagret i `case`, og nå vet vi jo også hvor mange lys vi trenger, lagret i `candles`. Da er det vel bare å printe!
```java
System.out.println(holiday[0] + " " + candles);
```

Voillà!

## Alternativer
Om man ønsker å lese heltall som kommer etter hverandre, og man _vet_ hvor mange som kommer, f.eks. 3, kan man kjøre

```java
int a = scanner.nextInt();
int b = scanner.nextInt();
int c = scanner.nextInt();
```

for å få dem i egne variabler, istedenfor å ha dem i en liste.
