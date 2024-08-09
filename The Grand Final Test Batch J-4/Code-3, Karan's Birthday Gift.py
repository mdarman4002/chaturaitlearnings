def minCoins(coins, X):
    dp = [float('inf')] * (X + 1)
    dp[0] = 0

    for coin in coins:
        for i in range(coin, X + 1):
            dp[i] = min(dp[i], dp[i - coin] + 1)

    return dp[X] if dp[X] != float('inf') else -1

X = int(input())
coins = list(map(int, input().split()))
print(minCoins(coins, X))
