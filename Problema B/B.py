import sys

def staircase(n, X):
    cache = [0 for _ in range(n + 1)]
    cache[0] = 1
    for i in range(1, n + 1):
        cache[i] += sum(cache[i - x] for x in X if i - x >= 0)
    return cache[n]

if __name__ == "__main__":
    a = int(str(sys.stdin.readline()))
    b = str(sys.stdin.readline()).split()
    b = list(map(int, b)) 
    print(staircase(a, b))