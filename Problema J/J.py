def Jsol(prices=[]; k=0)
    sum  = 0; max = 0; min = 0; fl = 1
    Mval = 0; Mmin = 0; Mmax = -1
    while max < len(prices) or not fl:
        if fl:
            sum += prices[max]
        if sum <= k:
            if sum > Mval or (sum == Mval and max - min > Mmax - Mmin):
                Mval=sum
                Mmin=min
                Mmax=max
            max += 1
            fl = 1
        if sum >= k:
            fl = 0
            if min <= max:
                sum -= prices[min]
                min += 1   
    return(Mmax - Mmin + 1)
