        }
        
        if(index >= A.length){
            return -1;
        }
        
        A[index] = A[index] - n;
        return A[index + 1];
    }
}
[
