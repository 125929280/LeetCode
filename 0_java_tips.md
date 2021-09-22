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
public StringBuffer append(String s)
public delete(int start, int end)
public StringBuffer deleteCharAt(int indexpoint)

//String
String S = new String();
public boolean contains(CharSequence sequence) //char + "" => String
```