def count_valid_pairs(arr):
    arr.sort()
    left, right = 0, len(arr) - 1
    count = 0
    
    while left < right:
        if arr[left] + arr[right] > 0:
            count += (right - left)
            right -= 1
        else:
            left += 1
            
    return count

# Read input
N = int(input().strip())
arr = list(map(int, input().strip().split()))

# Get the number of valid pairs
result = count_valid_pairs(arr)

# Print the result
print(result)
