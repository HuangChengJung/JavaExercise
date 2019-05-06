package com;

public class Son extends Father{

    public static void main(String[] args){
        
        Father base = new Son();
        
        //試驗一
        base.method1();
        
        //試驗二
        base.innerClass1.method3();

        //試驗三
        Vo vo1 = new Vo();
        vo1.setName("world");
        base.new InnerClass2<Vo>(vo1){
            @Override
            void method4(Vo vo) {
                System.out.print(vo.getName());
            }
        };
        
        //試驗四
        base.method5();

        //試驗五
        @SuppressWarnings("unused")
        Father.InnerClass3<Vo> a = ()->{
            Vo vo = new Vo();
            return vo;
        };
    }
    
    @Override
    public void method2(){
        System.out.print("world");
    }
}