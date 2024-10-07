func isVowel(c byte) bool {
\treturn c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u' ||
\t\tc == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U'
}

func swap(chars []byte, start int, end int) {
    chars[start], chars[end] = chars[end], chars[start];
}

func reverseVowels(s string) string {
    start := 0;
    end := len(s) - 1;
    sChar := []byte(s);

    for start < end {
        for start < len(s) && !isVowel(sChar[start]) {
            start++;
        }
        for end >= 0 && !isVowel(sChar[end]) {
            end--;
        }
        if start < end {
            swap(sChar, start, end);
            start++;
            end--;
        }
    }
    return string(sChar);
}