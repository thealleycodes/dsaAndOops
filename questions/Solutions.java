class Solutions {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "floight"};


        if (strs == null || strs.length == 0) {
            System.out.println("");
            return;
        }

        // Step 1: find minimum length
        int minimumLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minimumLength) {
                minimumLength = strs[i].length();
            }
        }

        // Step 2: build prefix character by character
        StringBuilder prefix = new StringBuilder();

        for (int charIndex = 0; charIndex < minimumLength; charIndex++) {
            char currentChar = strs[0].charAt(charIndex);//flow

            for (int stringIndex = 1; stringIndex < strs.length; stringIndex++) {
                if (strs[stringIndex].charAt(charIndex) != currentChar) {
                    System.out.println(prefix.toString());
                    return;
                }
            }

            prefix.append(currentChar);
        }

        // Step 3: print result
        System.out.println(prefix.toString());
    }
}
