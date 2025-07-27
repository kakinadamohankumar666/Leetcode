class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        boolean[] inStack = new boolean[26];

        for(int i=0; i<s.length(); i++){
            lastIndex[s.charAt(i) -'a'] = i;
        }

        Stack <Character> stack = new Stack<>();

        for(int i=0;  i<s.length(); i++){
            char ch = s.charAt(i);

            if (inStack[ch - 'a']) continue;

            while(!stack.isEmpty() && stack.peek() > ch && lastIndex[stack.peek() - 'a'] >i){
                inStack[stack.pop() - 'a'] = false;
            }
            stack.push(ch);
            inStack[ch-'a'] = true;
        }
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        return result.toString();
    }
}