            }
        }
    }
    // pass 2: bottom-right -> top-left
    for i := m-1; i >= 0; i-- {
        for j := n-1; j >= 0; j-- {
            if i+1 < m && dist[i+1][j]+1 < dist[i][j] {
                dist[i][j] = dist[i+1][j] + 1
            }
            if j+1 < n && dist[i][j+1]+1 < dist[i][j] {
                dist[i][j] = dist[i][j+1] + 1
            }
        }
    }
    return dist
}

