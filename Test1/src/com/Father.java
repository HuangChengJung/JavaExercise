package com;

public abstract class Father {
    Father.InnerClass1 innerClass1 = new Father.InnerClass1();
    
    public void method1(){
        System.out.print("Hello ");
        method2();
        System.out.println(" !:Test1");
    }
    public abstract void method2();
    
    static class InnerClass1{
         void method3() {
             System.out.println("Hello world !:Test2");
        }
    }
    
    abstract class InnerClass2<T>{
        InnerClass2(T t){
            System.out.print("Hello ");
            method4(t);
            System.out.println(" !:Test3");
        }
        
        abstract void method4(T t);
    }

    public void method5(){
        new InnerClass1().method3();
    }

    interface InnerClass3<T>{
        T method6();
    }
}