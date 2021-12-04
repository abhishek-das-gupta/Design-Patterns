Builder Introduction\
What "Problems Builder Design Pattern" solves ?
1.  When we want an object to be immutable as a result class constructor may require
a lot of information (arguments). This may also lead to overhead of maintaining the
 order of parameters while calling the constructor (or creating an object).
 
What is "Builder Design Pattern"?
1. In Builder, we remove the logic related to object construction from "client" code
& abstract  it in a separate class.
2. It provides an interface for creating "parts" of the resultant object


Implementation Considerations:
1. You can easily create an immutable class by implementing builder as inner static
class. You'll find this type of implementation quite frequently used even if 
immutability is not a main concern.

Design Consideration:
1. "Too many constructor argument"

Real World Examples:
1. StringBuilder
2. ByteBuffer
3. CharBuffer
2. CalendarBuilder in Java8 

Difference b/w Builder and Prototype Pattern:
1. 