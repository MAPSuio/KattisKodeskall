# Kodeskall i Kotlin

Selve kodeskallet ligger [her](https://github.com/MAPSuio/KattisKodeskall/blob/main/Kotlin/kattis.kt), og er en løsning på [denne](https://open.kattis.com/problems/chanukah) oppgaven.

## Detaljert beskrivelse
Siden Kotlin er et kompilert språk (som Java), er det avhengig av å ha en main-metode, slik at kompilatoren vet hvor programmet skal starte å kjøre
```kotlin
fun main() {
```

Vi bruker `readLine()` for å lese fra terminalen, og `!!` fordi vi _vet_ at vi får et input. Vi konverterer det enkelt til et heltall med `toInt()`
```kotlin
val n = readLine()!!.toInt()
```

Dette heltallet er antall "caser" i oppgaven. Så går vi gjennom dem med en for-løkke:
```kotlin
for (i in 1..n) {
```

Hver case består av to heltall. Dermed kan vi splitte input, som i utgangspunktet gir oss en string. Ettersom vi _vet_ at det alltid bare vil være 2 elementer, kan vi "unwrappe dem". De leses fortsatt inn som strings, så vi må konvertere dem til heltall om vi skal gjøre noen matte-operasjoner på dem. I Kotlin kan man ikke bytte type etter å ha deklarert variabler, så vi må opprette en ny `daysInt`, som vi bruker videre:
```kotlin
val (case, days) = readLine()!!.split(" ")
val daysInt = days.toInt()
```

Oppgaveteksten sier også
> However, each evening, an extra candle, called the shammas, is also lit (in fact, this candle is used to light the other candles).

Dermed vet vi at vi alltid vil ha _minst_ `daysInt` lys:
```kotlin
var candles = daysInt
```

Oppgaveteksten sier videre
> On the evening before each day, candles are lit in a menorah. On the first evening, one candle is lit, on the second, two are lit, and so on. But what if Chanukah lasted a different number of days? How many candles would be needed?

Vel, vi har jo antall dager lagret i `daysInt`, så dette kan vi finne ut av! Vi løser det med en for-løkke. I Kotlin er ranges inklusive (i motsetning til f.eks. Python), så vi vil telle _til og med_ daysInt.
```kotlin
for (j in 1..daysInt) {
    candles += j
}
```

Kattis tester på standard output, som i Kotlin er println()-funksjonen. Hva var det vi skulle printe igjen?
> For each data set there is one line of output. The single output line consists of the data set number, K, followed by a space followed by the number of candles needed for an N-day Chanukah holiday.

Aha! Vel, vi har "the data set number K" lagret i `case`, og nå vet vi jo også hvor mange lys vi trenger, lagret i `candles`. For å få dem på samme linje kan vi benytte
noe som kalles [string interpolation](https://www.baeldung.com/kotlin/string-interpolation):
```kotlin
println("$case $candles")
```

Voillà!

## Alternativer
For å lese inn en liste med heltall (på samme linje) kan man gjøre følgende:

```kotlin
val ints = readLine()!!.split(" ").map(String::toInt)
```

Istedenfor å kjøre en forløkke fra 1 til N, kan man gjøre følgende:

```kotlin
candles = sum(1..daysInt) + daysInt
```

Ranges i Kotlin er ganske morsomme. For-løkker kan også skrives slik:

```kotlin
0.until(n).forEach {
    ...
}
```

eller, eventuelt:

```kotlin
(1..n).forEach {
    ...
}
```
