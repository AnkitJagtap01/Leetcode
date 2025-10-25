    dfs = func(r, c int) {
        if r < 0 || r >= m || c < 0 || c >= n || image[r][c] != orig {
            return
        }
        image[r][c] = color
        dfs(r+1, c)
        dfs(r-1, c)
        dfs(r, c+1)
        dfs(r, c-1)
    }

    dfs(sr, sc)
    return image
}


