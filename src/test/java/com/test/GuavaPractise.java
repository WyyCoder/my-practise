package com.test;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.*;
import com.google.common.primitives.Ints;
import org.apache.commons.collections.BidiMap;

import java.util.List;

/**
 *
 * guava 新的日期API列举几个 安利了一波
 *
 * update 2017/8/17
 *
 * Created by Wangpeng on 2017/8/17.
 */
public class GuavaPractise {

    private static final Joiner joiner = Joiner.on(",").useForNull("*"); //字符串连接器

    private static final Splitter s = Splitter.on(",").trimResults().omitEmptyStrings();//字符串分割器

    private static final CharMatcher charMatcher = CharMatcher.DIGIT;

    private static final CharMatcher getCharMatcher = CharMatcher.ANY;

    public static void main(String[] args) {

       /* guavaStringHandler();

        nativeMethod();*/

        guavaCollect();

    }

    //字符串的一些工具类
    public static void guavaStringHandler(){
        //把集合/数组中的元素join在一起
        String join = joiner.join(Lists.newArrayList("a", null, "b"));
        System.out.println(join);

        for (String s : s.split("a,   ,b,,")){
            System.out.println("|" + s + "|");
        }

        //字符串的匹配和解耦
        System.out.println(charMatcher.retainFrom("asdadasa2edsc"));

        System.out.println(charMatcher.removeFrom("213dsad"));

        String s = getCharMatcher
                .inRange('a', 'b')
                .or(getCharMatcher.is('n'))
                .replaceFrom("wangpeng", "*");
        System.out.println(s);
    }

    //原生类型的一些api
    public static void nativeMethod(){

        //几个基本数据类型的大概都提供了这个集合方法
        List<Integer> integers = Ints.asList(1, 2, 3, 4);

        //数组拼接，返回String
        String join = Ints.join("+", 1, 2, 3);
        System.out.println(join);

        //数组合并
        int[] concat = Ints.concat(new int[]{1, 2}, new int[]{3, 4});

        //在一个数组中获取最大最小值
        System.out.println("最小值：" + Ints.min(concat) + "最大值：" + Ints.max(concat));

        System.out.println(Ints.contains(concat,6));//是否包含

        int[] ints = Ints.toArray(integers);//集合数组的转换

    }

    //集合处理的api
    public static void guavaCollect(){

        //一个无序的可以重复的集合类。游离在jdk List和Set之间的
        HashMultiset<Object> objects = HashMultiset.create();
        objects.add("1");
        objects.add("1");
        objects.add("3");
        objects.add("1");
        System.out.println(objects.count("1"));

        //一个一对多的map,其父类是Multimap
        Multimap<String, String> multimap = ArrayListMultimap.create();
        multimap.put("a", "A");
        multimap.put("a", "A");
        multimap.put("b", "B");
        System.out.println(multimap.get("a"));

        //一个可以改变视图
        List<String> strings = ImmutableList.of("a", "b");
        List<String> strings1 = ImmutableList.copyOf(strings);

        //一个双向的map
        BiMap<String, String> objectObjectHashBiMap = HashBiMap.create();
        objectObjectHashBiMap.put("a", "1");
        objectObjectHashBiMap.forcePut("1a", "11");
        System.out.println(objectObjectHashBiMap.inverse().get("11"));

    }

}
