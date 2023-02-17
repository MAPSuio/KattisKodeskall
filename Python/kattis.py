def main():
    n = int(input())
    for _ in range(n):
        (case, days) = input().split()
        days = int(days)

        candles = days
        for i in range(1, days+1):
            candles += i
        
        print(case, candles)

main()
