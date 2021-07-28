def solution(board, moves):
    answer = 0
    crain = []
    character = 0        

    for move in moves:
        character = findCharacter(board, move-1)
        if character>=0:
            crain.append(board[character][move-1])
            board[character][move-1] = 0
        
        if len(crain) >1:
             if isSame(crain[-2], crain[-1]):
                del crain[-1]
                del crain[-1]
                answer +=2

    return answer


def findCharacter(board, move):
    for i in range(len(board[0])):
        if board[i][move] != 0:
            return i

    return -1


def isSame(a, b):
    answer = False
    if a==b:
        answer = True

    return answer
