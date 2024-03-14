                ans += map.get(sum-k);
            if(map.containsKey(sum-k)){
            }

            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            } else {
                map.put(sum, 1);
            }
        }

        return ans;
        
[
