object R15385 extends App:
  def foo[A <: Int]: A = 0.asInstanceOf[A]
  def bar[A <: Int](a: A): A = a

  foo
  bar(1)
