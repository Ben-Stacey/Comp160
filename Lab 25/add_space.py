def add_space(file_name, destination):
    f1 = open(file_name)
    x = f1.read()
    result = ''
    count = 0
    x = str(x)
    while  count < len(x):
        x.index(count)
        result += x + ' '
        int(result)
    f2 = open(destination, "w")
    f2.write(result)
    f2.close()

add_space("1.txt", "2.txt")