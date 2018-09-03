package z.learn.guava;

import com.google.common.base.Strings;

import java.util.Date;

class StringsExample {

    void example() {
        padEnd();
        repeat();
        suffix();
        lenient();
    }

    private void padEnd() {
        System.out.println("pad " + Strings.padEnd("abc", 10, 'x'));
    }

    private void repeat() {
        System.out.println("repeat " + Strings.repeat("abc", 3));
    }

    private void suffix() {
        System.out.println("find suffix " + Strings.commonSuffix("aabbbbbcc", "aaccccc"));
    }

    private void lenient() {
        // lenient: 宽容; 宽大的，仁慈的; <古>减轻痛苦的，缓解的;
        System.out.println(Strings.lenientFormat("lenient %s, %s", new Date()));   // 允许输入参数于格式不匹配
        System.out.println(Strings.lenientFormat("lenient %s, %s", new Date(), "abc", 123));   // test Mon Sep 03 22:31:02 CST 2018, abc [123]
    }
}
