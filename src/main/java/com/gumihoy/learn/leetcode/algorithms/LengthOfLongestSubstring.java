package com.gumihoy.learn.leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * <p>
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * <p>
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * @author kongtong.ouyang on 2018/12/14.
 */
public class LengthOfLongestSubstring {


    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int result = 0;
        Map<Character, Integer> map = new HashMap<>(128);

        for (int i = 0, j = 0; i < len; i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(map.get(s.charAt(i)), j);
            }
            result = Math.max(result, j - i + 1);
            map.put(s.charAt(i), i + 1);
        }


        return result;
    }


}
