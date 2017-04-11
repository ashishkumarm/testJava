package com.problems.leetcode;

import java.util.Scanner;

import static com.problems.leetcode.DesignTinyurl.Codec.decode;
import static com.problems.leetcode.DesignTinyurl.Codec.encode;

/**
 * Created by ashishkumar.m on 11/04/17.
 */
public class DesignTinyurl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputUrl = in.next();

        System.out.println("encoded inputUrl = " + encode(inputUrl));
        System.out.println("decoded inputUrl = " + decode(inputUrl));
    }


static class Codec {

    // Encodes a URL to a shortened URL.
    public static String encode(String longUrl) {
        return  null;
    }

    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) {
        return  null;
    }
}

}


