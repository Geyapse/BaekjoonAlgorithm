test = int(input())
AXIS = Q1 = Q2 = Q3 = Q4 = 0
for i in range(test):
    a, b=map(int, input().split())
    if a==0 or b==0:
        AXIS += 1
    if a>0 and b>0:
        Q1 += 1
    if a<0 and b>0:
        Q2 += 1
    if a<0 and b<0:
        Q3 += 1
    if a>0 and b<0:
        Q4 += 1

print("Q1: %d" % Q1)
print("Q2: %d" % Q2)
print("Q3: %d" % Q3)
print("Q4: %d" % Q4)
print("AXIS: %d" % AXIS)