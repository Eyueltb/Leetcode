package Zend;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Markdown is a formatting syntax used by many documents (these instructions, for example!)
 * because of its plain-text simplicity and its ability to be translated directly into HTML.
 *
 * # Specification
 *
 * Write a simple markdown parser function that will take in a single line of markdown
 * and translate it into the appropriate HTML. To keep it simple,
 * support only one feature of markdown in atx syntax: headers.
 * Headers are designated by 1-6 hash characters followed by a space, followed by text.
 * The number of hashes determines the header level of the HTML output.
 *
 * Header content should only come after the initial hashtag(s) plus a space character.
 * Invalid headers should just be returned as the markdown that was received, no translation necessary.
 * Spaces before the hashes and after the header should be kept in the output, but between the hashes and the text only one space is allowed.
 *
 * # Examples
 *
 *  "# Header" should return "<h1›Header</h1›"
 *   "## Header" should return "<h2>Header</h2>"
 *  "###### Header" should return "<h6>Header</h6>"
 * "####### Header" should return "####### Header" (too many hashes)
 *  "### Header" should return "### Header" (too many spaces between)
 *  "Header" should return "Header" (no hashes)
 * # Input
 * A string that contains markdown text.
 *
 * # Output
 * A string that contains html formatted text,
 * if the input is valid markdown. Otherwise it just returns the input.
 */

public class MarkdownParser {

    /** TODo- Design Markdown Parser
     *  1. if hash(#) is 1 upto 6 and no too many space between # and header replace hash by header (1 to 6)
     *  2. if too many space between hash(#) and header or number of hash(#) < 0 or > 6 then print hash no replacement
     */
    public String getMarkDown(String str){
        //Step 1 split the String-separate string by space ex-# Header->{#,Header}
        //step 2- based on the value of hash and space decide what to do
        String [] marsk=str.split(" ");
        Arrays.stream(marsk).forEach(System.out::println);
        String h=getHeader(marsk[0].length());/** Get header based of the number of # */
        System.out.println(h);
        if(h.length()!=0){
           String [] hs=h.split(" ");
            if(hs.length==0)
                return marsk[1];
            else
                return hs[0]+marsk[1]+hs[1];
        }
        return marsk[1];
    }
    private String getHeader(int n){
      System.out.println(n);
        if(n>=1 && n<=6){
            String s = switch (n) {
                case 1-> "<h1> </h1>";
                case 2-> "<h2> </h2>";
                case 3-> "<h3> </h3>";
                case 4-> "<h4> </h4>";
                case 5-> "<h5> </h5>";
                case 6-> "<h6> </h6>";
                default-> throw new IllegalStateException("Unexpected value: " + n);
            };
            return s;
        }
        return "";
    }
    public static void main(String[] args) {
        MarkdownParser markdownParser=new MarkdownParser();
        String result="";
        result=markdownParser.getMarkDown(" Header");
        System.out.println(result);

    }
}
