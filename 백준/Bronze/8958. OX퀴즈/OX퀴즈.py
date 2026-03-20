n = int(input())
for i in range(n):
    ox = list(input())
    score=0
    sum_score=0
    for i in ox:
        if i =='O':
            score+=1
            sum_score+=score
        else:
            score=0
    print(sum_score)