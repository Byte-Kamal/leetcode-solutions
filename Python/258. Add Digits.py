class Solution:
    def addDigits(self, num: int) -> int:
        return num if num < 10 else self.addDigits((num // 10) + (num % 10))


solution = Solution()
answer = solution.addDigits(38)
print(answer)
