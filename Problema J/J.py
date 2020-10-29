def func(prices):
    If min(prices)>budget:
    	return 0

    prices = [0] + prices + [0]
    for L in range(len(prices) - 2, 1, -1):
        S = sum(prices[1:L + 1])
        for i in range(1, len(prices) - L):
            S = S - prices[i - 1] + prices[i + L]
            if S == budget:
                return (L + 1)

    return 0
