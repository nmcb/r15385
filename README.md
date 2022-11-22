scala 3.2.0 compiles - and javap shows:

`public static <A extends java.lang.Object> A foo();`

which is wrong - as java does not abstract types over primitives - it should be bound to `Int`

ref below in javap's output

```
% javap -p -v ./target/scala-3.2.0/classes/R15385.class
Classfile /Users/marco/code/nmcb/r15385/target/scala-3.2.0/classes/R15385.class
  Last modified 22 Nov 2022; size 913 bytes
  SHA-256 checksum e8fcfd86b3be7756a09c823ff68e952f747a4cbac47f7d8fd26171dca28f4be8
  Compiled from "R15385.scala"
public final class R15385
  minor version: 0
  major version: 52
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // R15385
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 7, attributes: 3
Constant pool:
   #1 = Utf8               R15385
   #2 = Class              #1             // R15385
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               R15385.scala
   #6 = Utf8               bar
   #7 = Utf8               (I)I
   #8 = Utf8               <A:Ljava/lang/Object;>(TA;)TA;
   #9 = Utf8               R15385$
  #10 = Class              #9             // R15385$
  #11 = Utf8               MODULE$
  #12 = Utf8               LR15385$;
  #13 = NameAndType        #11:#12        // MODULE$:LR15385$;
  #14 = Fieldref           #10.#13        // R15385$.MODULE$:LR15385$;
  #15 = NameAndType        #6:#7          // bar:(I)I
  #16 = Methodref          #10.#15        // R15385$.bar:(I)I
  #17 = Utf8               delayedInit
  #18 = Utf8               (Lscala/Function0;)V
  #19 = Utf8               (Lscala/Function0<Lscala/runtime/BoxedUnit;>;)V
  #20 = NameAndType        #17:#18        // delayedInit:(Lscala/Function0;)V
  #21 = Methodref          #10.#20        // R15385$.delayedInit:(Lscala/Function0;)V
  #22 = Utf8               executionStart
  #23 = Utf8               ()J
  #24 = NameAndType        #22:#23        // executionStart:()J
  #25 = Methodref          #10.#24        // R15385$.executionStart:()J
  #26 = Utf8               foo
  #27 = Utf8               ()I
  #28 = Utf8               <A:Ljava/lang/Object;>()TA;
  #29 = NameAndType        #26:#27        // foo:()I
  #30 = Methodref          #10.#29        // R15385$.foo:()I
  #31 = Utf8               main
  #32 = Utf8               ([Ljava/lang/String;)V
  #33 = NameAndType        #31:#32        // main:([Ljava/lang/String;)V
  #34 = Methodref          #10.#33        // R15385$.main:([Ljava/lang/String;)V
  #35 = Utf8               scala$App$_setter_$executionStart_$eq
  #36 = Utf8               (J)V
  #37 = NameAndType        #35:#36        // scala$App$_setter_$executionStart_$eq:(J)V
  #38 = Methodref          #10.#37        // R15385$.scala$App$_setter_$executionStart_$eq:(J)V
  #39 = Utf8               scala$App$_setter_$scala$App$$initCode_$eq
  #40 = Utf8               (Lscala/collection/mutable/ListBuffer;)V
  #41 = NameAndType        #39:#40        // scala$App$_setter_$scala$App$$initCode_$eq:(Lscala/collection/mutable/ListBuffer;)V
  #42 = Methodref          #10.#41        // R15385$.scala$App$_setter_$scala$App$$initCode_$eq:(Lscala/collection/mutable/ListBuffer;)V
  #43 = Utf8               Code
  #44 = Utf8               Signature
  #45 = Utf8               SourceFile
  #46 = Utf8               TASTY
  #47 = Utf8               Scala
{
  public static <A extends java.lang.Object> A bar(A);
    descriptor: (I)I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #14                 // Field R15385$.MODULE$:LR15385$;
         3: iload_0
         4: invokevirtual #16                 // Method R15385$.bar:(I)I
         7: ireturn
    Signature: #8                           // <A:Ljava/lang/Object;>(TA;)TA;

  public static void delayedInit(scala.Function0<scala.runtime.BoxedUnit>);
    descriptor: (Lscala/Function0;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #14                 // Field R15385$.MODULE$:LR15385$;
         3: aload_0
         4: invokevirtual #21                 // Method R15385$.delayedInit:(Lscala/Function0;)V
         7: return
    Signature: #19                          // (Lscala/Function0<Lscala/runtime/BoxedUnit;>;)V

  public static long executionStart();
    descriptor: ()J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #14                 // Field R15385$.MODULE$:LR15385$;
         3: invokevirtual #25                 // Method R15385$.executionStart:()J
         6: lreturn

  public static <A extends java.lang.Object> A foo();
    descriptor: ()I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #14                 // Field R15385$.MODULE$:LR15385$;
         3: invokevirtual #30                 // Method R15385$.foo:()I
         6: ireturn
    Signature: #28                          // <A:Ljava/lang/Object;>()TA;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #14                 // Field R15385$.MODULE$:LR15385$;
         3: aload_0
         4: invokevirtual #34                 // Method R15385$.main:([Ljava/lang/String;)V
         7: return
    Signature: #32                          // ([Ljava/lang/String;)V

  public static void scala$App$_setter_$executionStart_$eq(long);
    descriptor: (J)V
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=2, args_size=1
         0: getstatic     #14                 // Field R15385$.MODULE$:LR15385$;
         3: lload_0
         4: invokevirtual #38                 // Method R15385$.scala$App$_setter_$executionStart_$eq:(J)V
         7: return

  public static void scala$App$_setter_$scala$App$$initCode_$eq(scala.collection.mutable.ListBuffer);
    descriptor: (Lscala/collection/mutable/ListBuffer;)V
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #14                 // Field R15385$.MODULE$:LR15385$;
         3: aload_0
         4: invokevirtual #42                 // Method R15385$.scala$App$_setter_$scala$App$$initCode_$eq:(Lscala/collection/mutable/ListBuffer;)V
         7: return
    Signature: #40                          // (Lscala/collection/mutable/ListBuffer;)V
}
SourceFile: "R15385.scala"
  TASTY: length = 0x10 (unknown attribute)
   00 24 5A BB 51 F1 D9 00 00 89 1D 55 AC 14 40 00

  Scala: length = 0x0 (unknown attribute)
```
