public class CharCount {
    public static void main(String[] args){
        String str = "WorldofTanks";
        char search = 'o';
        int count = SearchString(str, search);
        System.out.println("Character "+search+" appears "+count+" times");
    }

    static int SearchString(String str, char search){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == search){
                count++;
            }
        }
        return count;
    }
}
