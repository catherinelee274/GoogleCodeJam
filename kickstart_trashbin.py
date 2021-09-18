# https://codingcompetitions.withgoogle.com/kickstart/round/0000000000435bae/0000000000887c32
def closestTrash(numHouses, trashLoc):
    ans = 0
    for i in range(len(trashLoc)):
        if int(trashLoc[i]) == 0:
            # find nearest 
            # look to left, look to right
            leftDist = 0 
            j = i -1
            while j >= 0:
                if int(trashLoc[j]) ==1 :
                    leftDist += abs(i-j)
                    break
                j -= 1
            
            j = i+1
            rightDist =0
            while j < len(trashLoc):
                if int(trashLoc[j]) ==1:
                    # print('1')
                    rightDist += abs(i-j)
                    break
                j += 1
            if rightDist == 0:
                ans += leftDist
            elif leftDist == 0:
                ans += rightDist
            else:
                ans += min(rightDist, leftDist)
    return ans

# def closestTrashOptimal(numHouses, trashLoc):
    # O(n) solution
    # lastI = -1 
    # for i in range(len(trashLoc)):
    #     do something

    # for i in range(len(trashLoc)-1, -1, -1):

                
    
# input() reads a string with a line of input, stripping the ' ' (newline) at the end.
# This is all you need for most problems.
t = int(input()) # read a line with a single integer
for i in range(1, t + 1):
  n = int(input())
  m = input()

  numHouses = int(n)

  answer = closestTrash(numHouses, m)
  print("Case #{}: {}".format(i, answer))
  # check out .format's specification for more formatting options

