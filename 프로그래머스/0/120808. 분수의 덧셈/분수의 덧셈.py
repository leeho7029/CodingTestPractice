def solution(numer1, denom1, numer2, denom2):
    answer = []
    numer = numer1 * denom2 + numer2 * denom1
    denom = denom1 * denom2
    max_num = 1

    for i in range(1, min(numer, denom) + 1):
        if numer % i == 0 and denom % i == 0:
            max_num = i
            

    numer = numer // max_num
    denom = denom // max_num
    answer.append(numer)
    answer.append(denom)
    return answer

