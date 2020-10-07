if __name__ == "__main__":
    with open("input.in", "r") as inpu:
        with open("output.out", "w") as output:
            output.write(str(staircase(inpu.readline(), inpu.readline().split())))

def staircase(n, X):
    cache = [0 for _ in range(n + 1)]
    cache[0] = 1
    for i in range(1, n + 1):
        cache[i] += sum(cache[i - x] for x in X if i - x >= 0)
    return cache[n]