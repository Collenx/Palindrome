package com.palindrome.packagex;

/**
 * Created by masulukc on 9/19/2015.
 */
import java.util.Collections;
import java.util.ArrayList;
public class Palindrome
{
    private String word;
    //constructor
    public Palindrome() {}

    //getter
    public String getWord() {
        return word;
    }
    //method to compare if a string is an Palindrome
    public boolean compareWord(String word) {
        this.word = word;
        //declaring variable
        String reversedword ="";
        boolean tf = true;
        ArrayList<String> cw = new ArrayList<String>();
        //adding the word to an arraylist
        for (int i = 0; i < word.length(); i++)
        {
            cw.add(word.substring(i,i+ 1));
        }

        //reversing the words in Array list
        Collections.reverse(cw);

        // concatinating from arraylist elements to one word
        for (int i = 0; i < cw.size(); i++)
        {
            reversedword = reversedword.concat(cw.get(i));

        }

        //comparing a palindrome
        if (word.equals(reversedword))

            tf =true;


        else {tf = false;}

        return tf;
    }
}
