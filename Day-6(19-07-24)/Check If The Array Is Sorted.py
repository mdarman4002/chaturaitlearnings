def is_sorted(arr):
    for i in range(len(arr) - 1):
        if arr[i] > arr[i + 1]:
            return False
    return True

# Read input
n = int(input().strip())
arr = list(map(int, input().strip().split()))

# Check if the array is sorted
result = is_sorted(arr)

# Print the result
print(result)
