# https://codingcompetitions.withgoogle.com/kickstart/round/0000000000435bae/0000000000887dba#analysis
def happiness(days, n, maxAttractions, attractions):
    happinessCount = []
    for day in range(days):
        # calc happiness for this day 
        # choose maxAttractions (K) to ride today, ie 
        # sort by max happiness
        validAttractions = []
        for a in attractions:
            if day >= a[1] and day <= a[2]:
                validAttractions.append(a)
        validAttractions.sort(key = lambda x:x[0])
        sum = countHappiness(validAttractions[:maxAttractions])
        happinessCount.append(sum)
    maxN = max(happinessCount)
    # ans = happinessCount.index(maxN)
    return maxN
def countHappiness(arr):
    sum = 0
    for a,b,c in arr:
        sum += a
    return sum
    
# input() reads a string with a line of input, stripping the ' ' (newline) at the end.
# This is all you need for most problems.
t = int(input()) # read a line with a single integer
for i in range(1, t + 1):
  d, n, k = input().split(" ")
  d = int(d)
  n = int(n)
  k = int(k)
  attractions = []
  for _ in range(n):
      h, s ,e = input().split(" ")
      attractions.append([int(h),int(s),int(e)])

  # greedy approach
  # choose days w highest happiness

  answer = happiness(d, n, k, attractions)
  print("Case #{}: {}".format(i, answer))
  # check out .format's specification for more formatting options

