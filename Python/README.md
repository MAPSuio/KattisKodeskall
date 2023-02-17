# Kodeskall i Python

## Detaljert beskrivelse
Når man løser Kattis-oppgaver i Python _må_ man ikke bruke funksjoner, men det er ryddigere.

Vi deklarerer en funksjon main:
```python
def main():
```

Vi leser inn et heltall (en string som vi konverterer til et heltall):
```python
N = int(input())
```

Dette heltallet er antall "caser" i oppgaven. Så går vi gjennom dem med en for-løkke:
```python
for _ in range(n):
```

Hver case består av to heltall. Dermed kan vi splitte input, som i utgangspunktet gir oss en string. Ettersom vi _vet_ at det alltid bare vil være 2 elementer, kan vi "unwrappe dem". De leses fortsatt inn som strings, så vi må konvertere dem til heltall om vi skal gjøre noen matte-operasjoner på dem:
```python
(case, days) = input().split()
days = int(days)
```

Oppgaveteksten sier også
> However, each evening, an extra candle, called the shammas, is also lit (in fact, this candle is used to light the other candles).

Dermed vet vi at vi alltid vil ha _minst_ `days` lys:
```python
candles = days
```

Oppgaveteksten sier videre
> On the evening before each day, candles are lit in a menorah. On the first evening, one candle is lit, on the second, two are lit, and so on. But what if Chanukah lasted a different number of days? How many candles would be needed?

Vel, vi har jo antall dager lagret i `days`, så dette kan vi finne ut av! Vi løser det med en for-løkke:
```python
for i in range(1, days+1):
    candles += i
```

Kattis tester på standard output, som i Python er print()-funksjonen. Hva var det vi skulle printe igjen?
> For each data set there is one line of output. The single output line consists of the data set number, K, followed by a space followed by the number of candles needed for an N-day Chanukah holiday.

Aha! Vel, vi har "the data set number K" lagret i `case`, og nå vet vi jo også hvor mange lys vi trenger, lagret i `candles`. Da er det vel bare å printe!
```python
print(case, candles)
```

Voillà!

## Alternativer
For å lese inn en liste med heltall (på samme linje) kan man gjøre følgende:

```python
ints = map(int, input().split())
```

Istedenfor å kjøre en forløkke fra 1 til N, kan man gjøre følgende:

```python
total = sum(range(1, days+1)) + days
```
