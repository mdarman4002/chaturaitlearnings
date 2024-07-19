def reach_destination(target):
    target = abs(target)  # Consider only the positive target due to symmetry
    sum_moves = 0
    moves = 0
    
    while sum_moves < target or (sum_moves - target) % 2 != 0:
        moves += 1
        sum_moves += moves
    
    return moves

# Read input
target = int(input().strip())

# Get the minimum number of moves
result = reach_destination(target)

# Print the result
print(result)
