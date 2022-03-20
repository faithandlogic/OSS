func mostWordsFound(sentences []string) int {
    max := 0
    for i := 0; i < len(sentences); i++ {
        word_count  := 1
        for _, v := range sentences[i] {
            if v == 32 {
                word_count++
            }
        }
        if word_count > max {
            max = word_count
        }
    }
    return max
}