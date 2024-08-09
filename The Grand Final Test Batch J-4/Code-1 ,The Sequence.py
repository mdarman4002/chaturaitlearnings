def find_kth_element(n, k):
    # Recursive function to find the k-th element
    def recursive_find(level, index):
        if level == 1:
            return 1  # Base case: the sequence is [1] at level 1
        
        # Calculate the length of the sequence at the previous level
        length_of_previous_level = (1 << (level - 1)) - 1
        center_position = length_of_previous_level + 1

        if index == center_position:
            return level  # The center element is the current level number
        elif index < center_position:
            return recursive_find(level - 1, index)  # Search in the left half
        else:
            return recursive_find(level - 1, index - center_position)  # Search in the right half
    
    return recursive_find(n, k)

# Read inputs
if __name__ == "__main__":
    n, k = map(int, input().split())
    print(find_kth_element(n, k))
