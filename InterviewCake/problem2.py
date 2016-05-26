# https://www.interviewcake.com/question/product-of-other-numbers

example_list =  [1, 7, 3, 4]

def get_products_of_all_ints_except_at_index(list_of_numbers):
    if len(list_of_numbers) < 2:
        raise IndexError("You must have more than that")
    product_list = []
    for i,number in enumerate(list_of_numbers):
        if (i < len(list_of_numbers) - 1):
            factor_array = list_of_numbers[i+1:] + list_of_numbers[:i]
            product = 1
            for factor in factor_array:
                product *= factor
            product_list.append(product)
        else:
            factor_array = list_of_numbers[:i]
            product = 1
            for factor in factor_array:
                product *= factor
            product_list.append(product)
    return product_list

print get_products_of_all_ints_except_at_index(example_list)
