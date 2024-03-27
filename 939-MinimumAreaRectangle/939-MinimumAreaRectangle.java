                    // Check for the existence of the other two corners
                    if (pointSet.contains(p1[0] + "_" + p2[1]) && pointSet.contains(p2[0] + "_" + p1[1])) {
                        int area = Math.abs(p2[0] - p1[0]) * Math.abs(p2[1] - p1[1]);
                        minArea = Math.min(minArea, area);
                    }
                }
            }
        }
        
        return minArea == Integer.MAX_VALUE ? 0 : minArea;
    }
}

[
