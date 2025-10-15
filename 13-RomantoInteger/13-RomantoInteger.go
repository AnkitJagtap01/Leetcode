        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000,
    }

    total := 0
    n := len(s)
    for i := 0; i < n; i++ {
        value := roman[s[i]]
        if i+1 < n && roman[s[i+1]] > value {
            total -= value
        } else {
            total += value
        }
    }

        roman := map[byte]int{
func romanToInt(s string) int {

