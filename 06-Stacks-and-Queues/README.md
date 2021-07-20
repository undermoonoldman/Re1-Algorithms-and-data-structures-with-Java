# 第六章-栈与队列

![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000068.png)
![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000069.png)
![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000070.png)
![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000071.png)
![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000072.png)
![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000073.png)
![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000074.png)
![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000075.png)
![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000076.png)
![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000077.png)
![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000078.png)
![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000079.png)
![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000080.png)

## 栈的常见应用

+ ### 回退功能的实现

+ ### 辅助系统函数的调用

+ ### 括号匹配等

## 别用 JDK中的 Stack 类

+ ### JDK中对于Stack类的注释如此写到，一个更加完整，一致的，后进先出的栈相关的操作，应该由 Deque 接口提供。并且，也推荐使用 Deque 这种数据结构（比如 ArrayDeque）来实现

  ![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000081.png)

+ ### 如果你想使用栈这种数据结构，Java 官方推荐的写法是这样的（假设容器中的类型是 Integer）

  ![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000083.png)

## Java 中的 Stack 类怎么了

+ ### Java 中的 Stack 类，最大的问题是，继承了 Vector 这个类

  ![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000082.png)

+ ### 简单来说，Vector 就是一个动态数组

+ ### Vector 作为动态数组，是有能力在数组中的任何位置添加或者删除元素的。因此，Stack 继承了 Vector，Stack 也有这样的能力

  ![](https://raw.githubusercontent.com/undermoonoldman/Re1-Algorithms-and-data-structures-with-Java/master/imgs/0000084.png)

+ ### 我们不希望对于栈来说，可以指定在 1 这个位置插入一个 666。这一点都不 666，而是破坏了栈这种数据结构的封装

+ ### Java 中的 Stack 实现，是被业界一直认为非常糟糕的实现。实际上，它犯了面向对象设计领域的一个基本错误：Stack 和 Vector 之间的关系，不应该是继承关系，而应该是组合关系（composition）

## Deque 接口

+ ### Deque 是双端队列的意思。所谓的双端队列，就是能在线性数据结构的两段，进行插入和删除操作

+ ### 由于 Stack 的定义是在同一端进，同一端出。所以，如果 Deque 可以满足在两段进行插入和删除，自然也能在同一端进行插入和删除，也就是可以以此为基础，做成一个 stack

+ ### 因为我们根据 Java 官方推荐的方法声明的这个 stack，虽然变量名称是 stack，但它实际上是一个 deque。这就意味着，这个 stack，可以在两段做插入和删除操作！但是，真正的栈，只能在同一端做插入和删除操作！这难道不是重蹈了 Stack 这个类的覆辙？毕竟，我们最开始分析，就说 Stack 这个类的一大问题，是继承了 Vector 这个类的若干我们不需要的方法，破坏了封装性，比如在任何一个位置插入一个元素。现在这个基于 Deque 接口的 stack，依然有我们不需要的方法啊！没错！这就是 Java 的历史遗留问题了。**这个问题至此已经无解了。**因为 Stack 这个关键字被占据了。Java 官方不想推出一个叫做 RealStack 或者 CorrectStack 一类的接口名称。所以，按照 Java 官方的推荐所建立的这个 stack，依然不完美

+ ### 实际上，Vector 这个类不仅仅是简单的一个动态数组而已，而更进一步，保证了线程安全。因为要保证线程安全，所以 Vector 实际上效率也并不高。Java 官方的 Vector 文档中明确指出了：如果你的应用场景不需要线程安全的特性，那么对于动态数组，应该使用 ArrayList
