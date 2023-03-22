package com.code;
class PackageTest{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}

//jar 경로에 컴파일)  javac -d ./ PackageTest.java
//실행)              java com.code.PackageTest
/*
class파일이 classpath에 없을 경우 -cp 태그를 활용해 클래스 패스를 일시적으로 지정해서 실행할 수 있다.
ex) pwd에 class파일이 있는 경우
java -cp ./ PackageTest
*/