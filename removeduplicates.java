public class removeduplicates {

    public static void remove(String str, int idx, boolean[] map, StringBuilder newstr) {

        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(idx);

        if (map[currchar - 'a']) {
            remove(str, idx + 1, map, newstr);
        } else {
            map[currchar - 'a'] = true;
            remove(str, idx + 1, map, newstr.append(currchar));
        }
    }

    public static void main(String args[]) {

        String str = "aapanacollege";

        remove(str, 0, new boolean[26], new StringBuilder(""));
    }
}