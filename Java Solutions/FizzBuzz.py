class Solution(object):
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        sol=[]
        for i in range(1,n+1):
            if((i%3==0)and(i%5>0)):
                sol.append("Fizz")
            elif((i%5==0)and(i%3>0)):
                sol.append("Buzz")
            elif((i%3==0)and(i%5==0)):
                sol.append("FizzBuzz")
            else:
                sol.append(str(i))
        return sol
            
                