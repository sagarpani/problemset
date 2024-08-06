//Check whether the desired character is present in the given string


public class Problem_015 {
    public static void main(String[] args) {
        String str = "Worldwide";
        char src = 'd';
        System.out.println("Does the given string contain the desired character : "+linearSearch(str, src));
    }

    static boolean linearSearch(String str, char src){
      if(str.isEmpty()) return false;
      for(char ch : str.toCharArray()){
          if(ch == src) return true;
      }
      return false;
    }
}
