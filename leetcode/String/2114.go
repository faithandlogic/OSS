// input is an array of strings, each string within the array may contain more than 1 word
func mostWordsFound(sentences []string) int {
    max := 0 // max number of words within string of array
    // loops through each index of array
	// counts how many words at each index
	for i := 0; i < len(sentences); i++ {
		// word count starts at 1 given every string has at least 1 words
        word_count  := 1
		// loops through every char in current index of array
        for _, v := range sentences[i] {
			// checks if char is a ' '
            if v == 32 {
				// if there is a space then the word count increases
                word_count++
            }
        }
		// if the current strings word count is greater than the current max amount of words, the new max is now the current number of words.
        if word_count > max {
            max = word_count
        }
    }
	// return the number of words in the string with the most words
    return max
}