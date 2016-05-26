example_list = ['03:03', '02:15', '07:42', '3:23', '23:59']

def to_int(some_string):
    time_int = int(some_string.split(':')[0])*60 + int(some_string.split(':')[1])
    #303 , 215
    return time_int

def get_smallest_duration(example_list):
    if len(example_list) < 2:
        raise IndexError('List must be greater than two elements!')

    min_so_far = abs(to_int(example_list[0]) - to_int(example_list[1]))
    early_time = ""
    end_time = ""
    for i,time in enumerate(example_list):
        if i == 0:
            continue
        # don't check i = 0 and j = 0 because the difference will be 0
        potential_min = abs(to_int(example_list[i]) - to_int(example_list[i-1]))
        if potential_min < min_so_far:
            min_so_far = min(min_so_far, result)
            early_time = time
            end_time = time_j
        # Only want to update time if min lower

    return min_so_far, early_time, end_time

print get_smallest_duration(example_list)