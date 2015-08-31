package algorithms;

/**
 * Algorithms.
 * 
 * https://leetcode.com
 * 
 */
public class Solution {

	public static void main(String[] args) {
//		titleToNumber("EO");
//		titleToNumber_2("ABC");// 3 * 26^0 + 2 * 26^1 + 1 * 26^2
		convertToTitle(titleToNumber_2("ACC"));
//		lengthOfLastWord("a");
		
		factorial(4);
	}

	/*FIXME ---------------------------------------------------------------------------*/
	
	/**
	 * 171 Excel Sheet Column Number
	 * 
	 * Give a column title as apper in an Excel sheet, 
	 * return its corresponding column number.
	 * 
	 * For example:
	 * A --> 1, B --> 2, C --> 3
	 * ...
	 * Z --> 26, AA --> 27, AB -- 28
	 * ...
	 * AZ --> 52, BA --> 53, BB --> 54
	 * 
	 * mine.
	 */
	public static int titleToNumber(String s){
		int lenght = s.length() - 1;
		int num = 0;
		for(int i = 0 ; i <= lenght; i++){
			num += ((s.charAt(lenght - i) - 'A' + 1) * Math.pow(26,i));
		}
		System.out.println("---------------");
		System.out.println(s + " --> " + num);
		return num;
	}
	
	
	/**
	 * other solution.
	 */
	public static int titleToNumber_2(String s) {
        int l = s.length();
        int count = 0;
        for(int i = 0; i<l;i++ ){
            count = count * 26  + s.charAt(i) - 'A' + 1;
        }
        System.out.println("---------------");
		System.out.println(s + " --> " + count);
        return count;
    }
	
	/*FIXME ---------------------------------------------------------------------------*/
	
	/**
	 * 168 Excel Sheet Column Title 
	 * 
	 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
	 * 
	 * For example:
	 * 1 -> A
     * 2 -> B
     * 3 -> C
     * ...
     * 26 -> Z
     * 27 -> AA
     * 28 -> AB 
	 */
	public static String convertToTitle(int n){
		StringBuffer sb = new StringBuffer();
		int num = n;
		int tag = 0;
		while(num > 0){
			tag = (num % 26 == 0 ? 26 : (num % 26));
			sb.insert(0, (char)(tag + 64));
			num = (num % 26 == 0 ? (num / 26 - 1) : (num / 26));
		}
		System.out.println("---------------");
		System.out.println(n + " --> " + sb.toString());
		return sb.toString();
	}
	
	/*FIXME ---------------------------------------------------------------------------*/
	
	/**
	 * 	58 Length of Last Word
	 *  
	 *  Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
	 *  return the length of last word in the string.
	 *  
	 *  If the last word does not exist, return 0.
	 *  
	 *  Note: A word is defined as a character sequence consists of non-space characters only.
	 *  
	 *  For example:
	 *	Given s = "Hello World",
	 *	return 5.
	 *  
	 */
	public static int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        int l = strs.length;
        if(l <= 0){
        	return 0;
        }
        System.out.println("58 length Of Last Word : " + strs[l -1].length());
        return strs[l -1].length();
    }
	
	/*FIXME ---------------------------------------------------------------------------*/
	
	/**
	 * n!
	 */
	 public static int factorial(int n){
		 if(n == 1){
			 return 1;
		 }
		 return n * factorial(n - 1);
	 }
	
	 /*FIXME ---------------------------------------------------------------------------*/
	 
	 
	 
}
