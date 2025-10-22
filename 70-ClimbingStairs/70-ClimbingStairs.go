        return n
    }

    oneStepBefore := 2
    twoStepsBefore := 1
    total := 0

    for i := 3; i <= n; i++ {
        total = oneStepBefore + twoStepsBefore
        twoStepsBefore = oneStepBefore
        oneStepBefore = total
    }

    return total
}

