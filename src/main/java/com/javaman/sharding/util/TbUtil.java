/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.javaman.sharding.util;

/**
 * @author pengzhe
 * @date 2020/4/22 00:17
 * @description
 */

public class TbUtil {

    public static String getTableNameIndex(String value, Integer tbCount) {
        int hashCode = value.hashCode();
        return String.valueOf(Math.abs(hashCode % tbCount) + 1);

    }
}
