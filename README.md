## my-practise自己平时练习的各种代码，会提交到这个仓库中。并且也会记录一些在平时学习遇到的问题和知识点
### 读《Java核心技术》知识点总结
    * Java基本数据类型 char一种用于表示Unicode编码的字符单元的字符类型。<br>
    * Sting、StringBuilder、StringBuffer三者的不同：StringBuilder速度最快，String最慢，之所以StringBuilder快是因为不用每次新建String对象。 <br>            StringBuffer是线程安全的，StringBuilder是非线程安全的。<br>
    * 数组是一种数据结构，用来存储同一类型值的集合。<br>
    * Arrays.sort()该方法在jdk1.7之前和jdk1.7实现有所不同，1.7对其优化了。该方法底层是调用了DualPivotQuicksort.sort()方法。<br>
    * 代码块{}、静态块static{}、构造器三个最先加载的是静态块其实是代码块，最后是构造器。
 ### 平时积累的知识点
      * 覆盖索引：是select的数据列只用从索引中就能够取得，不必读取数据行，换句话说查询列要被所建的索引覆盖。<br>
      * 一个介绍Mysql索引比较好的博客，记录下来:http://blog.csdn.net/garfielder007/article/details/54295577。<br>
      * Mysql 'explain'显示了MySQL如何使用索引来处理select语句以及连接表。可以帮助选择更好的索引和写出更优化的查询语句。<br>
      * transient关键字是用来禁止该变量进行序列化的<br>
      * 读Arraylist源码发现该类好多地方都使用到了Arrays.copy()这个方法，还有System.arraycopy()这个方法，以后试着读一下这两个类<br>
      * 记录一个小的Mysql知识点union all 关键字可以将两个表合成一个表
        
 
