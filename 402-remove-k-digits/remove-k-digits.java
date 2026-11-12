class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {

            char curr = num.charAt(i);

            while (!st.isEmpty() && k > 0 &&
                   st.peek() > curr) {
                st.pop();
                k--;
            }

            st.push(curr);
        }

        while (k > 0) {
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        sb.reverse();

        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') {
            i++;
        }

        String ans = sb.substring(i);

        return ans.isEmpty() ? "0" : ans;
    }
}