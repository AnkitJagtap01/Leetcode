        ')': '(',
        ']': '[',
        '}': '{',
    }

    for _, ch := range s {
        switch ch {
        case '(', '[', '{':
            stack = append(stack, ch) // push
        case ')', ']', '}':
            if len(stack) == 0 || stack[len(stack)-1] != pairs[ch] {
                return false
            }
            stack = stack[:len(stack)-1] // pop
        }
    }

    return len(stack) == 0
}

