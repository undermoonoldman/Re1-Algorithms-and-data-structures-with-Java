# 第五章-数组

## 基于Java内部的数组，二次封装一个数组类，该数组类分为两种，静态数组与动态数组

1. ### 静态数组

   ### 静态数组指在初始分配空间时容量就已经确定好了，而且应该提供以下功能

   + #### 获取数组的容量

   + #### 获取数组中元素的个数

   + #### 判断数组是否为空

   + #### 在某索引位置插入元素

   + #### 在头部插入元素

   + #### 在尾部插入元素

   + #### 获取某索引位置的元素

   + #### 修改某索引位置元素

   + #### 查找数组中是否有某元素

   + #### 查找数组中某元素所在的索引，如果不存在该元素，则返回-1

   + #### 删除某索引位置的元素，并返回该元素

   + #### 删除头部元素并返回

   + #### 删除尾部元素并返回

   + #### 删除某指定元素(如存在多个相同元素，仅删除找到的第一个)

2. ### 动态数组

   ### 动态数组除了上面静态数组提供的全部功能外，还需要在添加元素与删除元素时提供数组容量伸缩的功能

   ![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000057.png)
   ![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000058.png)
   ![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000059.png)
   ![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000060.png)
   ![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000061.png)
   ![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000062.png)
   ![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000063.png)
   ![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000064.png)
   ![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000065.png)
   ![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000066.png)
   ![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000067.png)