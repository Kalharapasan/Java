class A{
 void method() {
   System.out.println(5);
 }
}
class B extends A {
 void method(int num1) {
  System.out.println(num1);
 }
}

class C extends B{
 void method(double num1) {
   System.out.println(num1);
 }

 public static void main(String[] args) {
  C obj = new C();
  obj.method();
  obj.method(56);
  obj.method(55.25);

 }
 
}
