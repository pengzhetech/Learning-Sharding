/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.javaman.sharding.controller;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author pengzhe
 * @date 2020/4/24 20:23
 * @description
 */

public class WordCount {
    public static void main(String[] args) {
        wordCount("A Better Butter");
    }

    private static void wordCount(String worlds) {
        List<String> lists = new ArrayList<>();
        String[] wordsArr1 = worlds.split("");
        List<String> filterStrings = Stream.of(wordsArr1).filter(s -> !" ".equalsIgnoreCase(s))
                .collect(Collectors.toList());
        filterStrings.forEach(word -> {
            if (word.length() != 0) {
                lists.add(word);
            }
        });
        Map<String, Integer> wordsCount = new TreeMap<>();
        lists.forEach(string -> wordsCount.merge(string, 1, Integer::sum));
        System.out.println(wordsCount);
    }

}
