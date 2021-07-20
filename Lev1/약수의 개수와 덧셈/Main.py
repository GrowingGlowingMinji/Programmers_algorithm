def solution(left, right):
    answer = 0

    for i in range(left, right+1):
        if(isDoubleMul(i)):
            answer -= i
        else:
            answer += i


    return answer


def isDoubleMul(n):
    if(n in createArr()):
        answer=True
    else:
        answer=False

    return answer

def createArr():
    arr = []
    for i in range(1, 32):
        arr.append(i * i)

    return arr
