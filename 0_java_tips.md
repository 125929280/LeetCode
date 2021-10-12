**获取长度**
```java
a.length//数组长度
a.length()//字符串长度
a.size()//泛型集合元素个数
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