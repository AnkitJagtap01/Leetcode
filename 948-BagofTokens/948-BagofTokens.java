                right--;
                score--;
                power += tokens[right];
                // Play the token face-down
            } else if (score > 0) {
                maxScore = Math.max(maxScore, score);
                left++;
                score++;
                power -= tokens[left];
            } else {
                // Cannot play any token
                break;
            }
        }

        return maxScore;
    }
}

[
