# Generics allow you to write classes, interfaces, and methods that work with multiple, unspecified data types while enforcing strict type-checking at compile-time. They are foundational for clean and robust programming.
# Generics, available since JSE 5.0, have made using the Java Collection Framework easier, more convenient, and safer. Type misuse errors are now detected at compile time.
'''java
List list = new ArrayList();
list.add("Hello");
String value = (String) list.get(0);
'''
## In Java, generic types without a parameter type are called Raw Types.
## Such a language construct is valid, but in most cases results in a compiler warning.
## But what if we try to cast the type to a number?
'''java
List list = new ArrayList();
list.add("Hello");
String value = (String) list.get(0);
Integer iValue = (Integer) list.get(0); // error
'''
## We get an error in runtime:
## java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
# There are only three cases when it is correct to use a generic type without a parameter:
## Java version < 5.0 in the project;
## In a class literal: List<String>.class won’t work, you need to write List.class;
## In the instanceof operator: instead instanceof List<Integer> must be instanceof List.
'''java
if(object instanceof List){
....
}
'''
## With the advent of Generics, the need for type checking and casting has disappeared.
<img width="847" height="443" alt="image" src="https://github.com/user-attachments/assets/b1e37b88-a477-4547-af9a-f504427e6e1a" />
## When the compilation running of the project, the compiler removes information about generic types from the bytecode of the class file. This process is called type erasure.
## In the bytecode, we will see List instead of List<String>. This decision made it possible to maintain backward compatibility without recompiling Java 4 code.
