**获取长度**
```java
a.length//数组长度
a.length()//字符串长度
a.size()//泛型集合元素个数
```

**无穷小&无穷大**
```java
Integer.MAX_VALUE
```

**泛型集合与数组的转换**
```java
T[] array = new T[size];
List<T> list = Arrays.asList(array);

List<T> list = new ArrayList<T>();
T[] array = list.toArray(new T[list.size()]);
```

**StringBuffer & String**
```java
//StringBuffer
StringBuffer s = new StringBuffer();
//添加
public StringBuffer append(String s)
//删除
public delete(int start, int end)
public StringBuffer deleteCharAt(int indexpoint)

//String
String S = new String();
//查询
charAt()
public boolean contains(CharSequence sequence) //char + "" => String

//StringBuffer ==> String
String S = s.toString()
String S = new String(s)
```

**StringBuilder & String**
```java
StringBuilder s = new StringBuilder();
s.toString();
```

**HashMap**
```java
Map<T, V> map = new HashMap<>();
map.put(key, map.getOrDefault(key) + 1);
for(T key:map.keySet()) {
    ...
}
map.getOrDefault();
```

**HashSet**
```java
Set<T> set = new HashSet<>();
set.add()
set.contains()
```

**栈**
```java
Deque<T> stack = new LinkedList<>();
stack.push(t);
stack.pop();
stack.peek();
```

**队列**
```java
Queue<T> queue = new LinkedList<>();
queue.offer(t);
queue.poll();
```

**字符串与数字互转**
```java
int i = Integer.parseInt(s);
String s = String.valueOf(i);
```

**自定义排序**
```java
Arrays.sort(a, new Comparator<T>() {
    public int compare(T t1, T t2) {
        return t1-t2;//升序
    }
})
```