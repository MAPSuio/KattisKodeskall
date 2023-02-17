def main():
    n = int(input())
    for _ in range(n):
        (case, days) = input().split()
        days = int(days)

        total = days
        for i in range(1, days+1):
            total += i
        
        print(case, total)

main()
