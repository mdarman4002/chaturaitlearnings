def custom_odd_even_sort(arr):
    # Separate the odd and even numbers
    odd_numbers = [x for x in arr if x % 2 != 0]
    even_numbers = [x for x in arr if x % 2 == 0]
    
    # Sort odd numbers in descending order
    odd_numbers.sort(reverse=True) 
    
    # Sort even numbers in ascending order
    even_numbers.sort()
    
    # Combine the sorted lists
    sorted_array = odd_numbers + even_numbers
    
    return sorted_array

# Read input
N = int(input().strip())
arr = list(map(int, input().strip().split()))

# Get the sorted array
result = custom_odd_even_sort(arr)

# Print the result
print(" ".join(map(str, result)))
