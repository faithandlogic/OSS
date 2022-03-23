class Solution(object):
    def mostWordsFound(self, sentences):
        """
        :type sentences: List[str]
        :rtype: int
        """
        max_words = 0  # Initialize max word count to 0
        for i in sentences:  # Loop through the for loop
            #  Split and save its length to avoid splitting again, making the code faster at the cost of memory
            word_count = len(i.split(" "))
            if word_count > max_words:  # If the word count is higher than max_words, override it
                max_words = word_count
        return max_words  # Return the max word count


'''
Runtime: 29 ms, faster than 80.84% of Python online submissions for Maximum Number of Words Found in Sentences.
Memory Usage: 13.8 MB, less than 20.65% of Python online submissions for Maximum Number of Words Found in Sentences.
'''
