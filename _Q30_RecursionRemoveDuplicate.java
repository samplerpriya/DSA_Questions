public class _Q30_RecursionRemoveDuplicate
{
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        // base call
        if(idx == str.length()){  // idx badte badte last tk chla gya phir print newStr and band krdena return
            System.out.println(newStr);
            return;
        }

        //kaam
        // character niklo aur check kro ki ye map me exist krta h ki nhi
        char currChar = str.charAt(idx); // jis bhi index pr me hu uska character mene nikal diya aur store kr lia current character me
        if(map[currChar - 'a'] == true){ // map[currchar] index nikl jayega phir.. check krega ki ye value true h kya ... if true means duplicateh
            //duplicate
            // phir next index nikalna h
            removeDuplicate(str, idx+1, newStr, map);
        }
        else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newStr.append(currChar), map);
        }
    }



    // FRIENDS PAIRING PROBLEM
    public static int friendsPairing(int n){
        // Base case
        if(n == 1 || n == 2){
            return n;
        }

        // choices
        //single
        int fnm1 = friendsPairing(n - 1);

        //pair
        int fnm2 = friendsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        //total ways
        int totWays = fnm1 + pairWays;
        return totWays;

        // this all is written in one line of code
//        return friendsPairing(n - 1) + (n-2) * friendsPairing(n - 2);
    }



    // PRINT BINARY STRING PROBLEM
    // PRINT ALL BINARY STRINGS OF SIZE N WITHOUT CONSECUTIVE ONES

    public static void printBinString(int n, int lastPlace, StringBuilder str){
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        //kaaam
        if(lastPlace == 0){
            printBinString(n-1, 0, str.append("0"));
            printBinString(n-1,1, str.append("1") );
        }
        else {
            printBinString(n-1, 0, str.append("0"));
        }

    }
    public static void main(String[] args) {
        String str = "appnacollege";
        removeDuplicate(str, 0,new StringBuilder(""), new boolean[26]);

        System.out.println(friendsPairing(3));
        printBinString(3, 0, new StringBuilder("") );
    }
}
