                cr, cc := q[0][0], q[0][1]
                q = q[1:]
                for _, d := range dirs {
                    nr, nc := cr+d[0], cc+d[1]
                    if nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == '1' {
                        grid[nr][nc] = '0'
                        q = append(q, [2]int{nr, nc})
                    }
                }
            }
        }
    }
    return islands
}


