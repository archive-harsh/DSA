
class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int m = p.length();

        List<Integer> al = new ArrayList<>();

        char[] pc = p.toCharArray();
        Arrays.sort(pc);

        for (int i = 0; i <= s.length() - m; i++) {

            String sub = s.substring(i, i + m);

            char[] sc = sub.toCharArray();
            Arrays.sort(sc);

            if (Arrays.equals(pc, sc)) {
                al.add(i);
            }
        }

        return al;
    }
}
