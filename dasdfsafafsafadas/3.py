a = [23, 23, 20, 6, 5, 2, -1, -10, -11, -100]  # список элементов
N = len(a)  # количество элементов
c = 0  # счетчик
print(a)


for i in range(N-1):
    for j in range(N-1-i):
        c += 1
        if a[j] > a[j+1]:
            a[j], a[j+1] = a[j+1], a[j]

print(a)
print(c)
