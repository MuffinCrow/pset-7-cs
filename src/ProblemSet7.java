public class ProblemSet7 {
    public static void main(String[] args) {

    }
    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    public String surroundMe(String in, String out) {
        //in = escapeBuild(in);
        //out = escapeBuild(out);
        System.out.println(out.length());
        if (in == null) {
            return null;
        } else if (out == null || out.length() != 4) {
            return in;
        } else {
            String[] aut = out.split("");

            String output = "";

            output = aut[0] + aut[1] + in + aut[2] + aut[3];
            //output = escapeDestroy(output);
            return output;
        }
    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text (overlapping, as needed).
     */
    public String endsMeet(String text, int n) {
        //text = escapeBuild(text);
        if (text == null) {
            return null;
        } else if (text.length() < 1 || text.length() > 10) {
            return text;
        } else if (n < 1 || n > text.length()) {
            return text;
        } else {
            String output = text.substring(0, n) + text.substring(text.length() - n);
            return output;
        }
    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */
    public String middleMan(String text) {
        //text = escapeBuild(text);
        if (text == null) {
            return null;
        } else if (text.length() < 3 || text.length() % 2 == 0) {
            return text;
        } else {
            int bot = (int) Math.floor(text.length() / 2) - 1;
            int top = bot + 3;

            String output = text.substring(bot, top);
            //output = escapeDestroy(output);
            return output;
        }
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    public boolean isCentered(String text, String target) {
        //text = escapeBuild(text);
        //target = escapeBuild(target);
        if (text == null || text.length() < 3 || text.length() % 2 == 0 || target == null || target.length() != 3) {
            return false;
        } else {
            int bot = (int) Math.floor(text.length() / 2) - 1;
            int top = bot + 3;

            String temp = text.substring(bot, top);

            if (temp.equals(target)) {
                return true;
            } else {
                return false;
            }
        }
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */
    public int countMe(String text, char suffix) {
        //text = escapeBuild(text);
        boolean check = checkLetter(String.valueOf(suffix));
        int count = 0;

        if (text == null || check == false) {
            return -1;
        } else {
            String[] array = text.split("", 0);

            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(String.valueOf(suffix)) && (i+1) == array.length) {
                    count++;
                } else if (array[i].equals(String.valueOf(suffix)) && array[i+1].equals(" ")) {
                    count++;
                }
            }
            return count;
        }
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */
    public int triplets(String text) {
        //text = escapeBuild(text);
        int count = 0;

        if (text == null) {
            return -1;
        } else {
            String[] a = text.split("", 0);
            for (int i = 0; i < a.length; i++) {
                if ((i+3) > a.length) {
                    break;
                }
                if (a[i].equals(a[i+1]) && a[i].equals(a[i+2])) {
                    count++;
                }
            }
            return count;
        }
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */
    public long addMe(String text) {
        //text = escapeBuild(text);
        long output = 0;

        if (text == null) {
            return -1;
        } else {
            String simp = checkNumber(text);
            if (simp.length() != 0) {
                String[] a = simp.split("", 0);

                for (int i = 0; i < a.length; i++) {
                    output += Long.parseLong(a[i]);
                }
            }
            return output;
        }
    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */
    public long sequence(String text) {
        //text = escapeBuild(text);
        int count = 1;
        int tempc = 1;
        boolean same = false;

        if (text == null) {
            return -1;
        } else {
            String[] a = text.split("", 0);
            for (int i = 0; i < text.length(); i++) {
                if (i+1 < text.length()) {
                    if (a[i].equals(a[i + 1])) {
                        same = true;
                        count++;
                        while (same == true) {
                            if (i+count < a.length) {
                                if (a[i].equals(a[i + count])) {
                                    count++;
                                } else {
                                    same = false;
                                }
                            } else {
                                same = false;
                            }
                        }
                    }
                }
                if (count > tempc) tempc = count;
                count = 1;
            }
            if (text.length() < 1) tempc = 0;
            return tempc;
        }
    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    public String intertwine(String a, String b) {
       // a = escapeBuild(a);
        //b = escapeBuild(b);
        if (a == null || b == null) {
            return null;
        } else {
            String[] aa = a.split("", 0);
            String[] ba = b.split("", 0);
            String output = "";

            for (int i = 0; i < ((aa.length > ba.length) ? aa.length: ba.length); i++) {
                if ((i+1) <= aa.length) {
                    output += aa[i];
                }
                if((i+1) <= ba.length) {
                    output += ba[i];
                }
            }
            //output = escapeDestroy(output);
            return output;
        }
    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */
    public boolean isPalindrome(String text) {
        //text = escapeBuild(text);
        if (text == null) return false;
        String[] txt = text.split("", 0);
        String texts = "";
        int opp = 0;

        for (int i = txt.length - 1; i >= 0; i--) {
            texts += txt[i];
            opp++;
        }
        boolean output = false;
        if (text.equals(texts)) {
            output = true;
        }
        return output;
    }

    public static String checkNumber (String s) {
        String[] z = s.split("", 0);
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            switch (z[i]) {
                case "1" :
                case "2" :
                case "3" :
                case "4" :
                case "5" :
                case "6" :
                case "7" :
                case "8" :
                case "9" :
                case "0" :
                    output += z[i];
                    break;
            }
        }
        return output;
    }

    public static boolean checkLetter (String s) {
        s = s.toLowerCase();
        switch (s) {
            case "a" :
            case "b" :
            case "c" :
            case "d" :
            case "e" :
            case "f" :
            case "g" :
            case "h" :
            case "i" :
            case "j" :
            case "k" :
            case "l" :
            case "m" :
            case "n" :
            case "o" :
            case "p" :
            case "q" :
            case "r" :
            case "s" :
            case "t" :
            case "u" :
            case "v" :
            case "w" :
            case "x" :
            case "y" :
            case "z" :
                return true;
            default :
                return false;
        }
    }

    //Takes escape sequences and makes them readable characters
    public static String escapeBuild(String text) {
        if (text != null) {
            text = text.replace("\\", "\\\\");
            text = text.replace("\t", "\\t");
            text = text.replace("\b", "\\b");
            text = text.replace("\n", "\\n");
            text = text.replace("\r", "\\r");
            text = text.replace("\f", "\\f");
            text = text.replace("\'", "\\'");
            text = text.replace("\"", "\\\"");
        }

        return text;
    }

    //Takes readable escape sequences and turns them into functional escape sequences
    public static String escapeDestroy(String text) {
        if (text != null) {
            text = text.replace("\\\\", "\\");
            text = text.replace("\\t", "\t");
            text = text.replace("\\b", "\b");
            text = text.replace("\\n", "\n");
            text = text.replace("\\r", "\r");
            text = text.replace("\\f", "\f");
            text = text.replace("\\'", "\'");
            text = text.replace("\\\"", "\"");
        }

        return text;
    }

}