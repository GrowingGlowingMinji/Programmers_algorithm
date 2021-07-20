def solution(n):
    answer = ''

    if(isEven(n)):
        answer = '수박'*(n//2)
    else:
        answer =  '수박'*(n//2)+'수'



    return answer


def isEven(n):

    if(n%2==0):
        result = True
    else:
        result = False
    return result
