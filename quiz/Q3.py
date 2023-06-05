weights = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
k = 5

# 3.3
def is_possible(capacity, weights, k):
    day = 1
    temp = 0
    for i in range(len(weights)):
        if temp + weights[i] <= capacity:
            temp += weights[i]
        else:
            day += 1
            temp = weights[i]
    return day <= k

#3.5
def min_capacity(weights, k):
    min_cap = max(weights)
    max_cap = sum(weights)
    while min_cap < max_cap:
        mid = (min_cap + max_cap) // 2
        if is_possible(mid, weights, k):
            max_cap = mid
        else:
            min_cap = mid + 1
    return min_cap

def main():
    temp = min_capacity(weights, k)
    print(temp)

main()