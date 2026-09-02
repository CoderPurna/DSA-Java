package String;

public class StringQ3 {
    static void main(String[] args) {
        //count the vowels in a string
        String str = "Hello World";
        String str1 = str.toLowerCase();
        char [] str2 = str1.toCharArray();
        int count = 0;
        for(char ch : str2){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }

        System.out.println("The Number of vowels is "+count);
    }
}
