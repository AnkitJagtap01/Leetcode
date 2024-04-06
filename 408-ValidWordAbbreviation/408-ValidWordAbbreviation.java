                }
                wordIndex++;
                abbrIndex++;
            }
        }

        return wordIndex == word.length() && abbrIndex == abbr.length(); // Both strings should be fully traversed
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String word = "internationalization";
        String abbr = "i12iz4n";
        System.out.println(solution.validWordAbbreviation(word, abbr)); // Output: true
    }
}

"
