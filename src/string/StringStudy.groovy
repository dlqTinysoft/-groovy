package string

import org.codehaus.groovy.runtime.StringGroovyMethods

/**
 * Created by 董乐强 on 2018/10/18.
 */
//第一种定义字符串
def name = 'a single \' a \'string'
print(name.class)

//第二种定义字符串,可以定义字符串的格式
def thupleName = '''three signle string '''

thupleName = ''' 
line one
line two
line three'''
print(thupleName)
//第三种定义方式,双引号定义字符串，常用.又称可扩展字符串
def doubleName = "this a common String"
print(doubleName.class)

def name1 = "android"
//对字符串进行扩展,name1可以是任意的表达式
def sayHello = "Hello: ${name1}"

println(sayHello)
println(sayHello.class)

def sum= "The sum of 2 and 3 equals ${2+3}"
println(sum)

//String 和 GString是相互转换的，自动转换的
def result = echo(sum)
println(result)
String echo(String message){
    return message
}

/*======================字符串的方法=======================*/
def str = "groovy Hello"
//字符串填从方法
println str.center(8,'a')

println str.padLeft(8,'a')

//字符串比较方法
def str2 = 'Hello'
println str>str2
println str.compareTo(str2)

//索引,下面两种方法都可以
println str.getAt(0)
println  str[0]
println str[0..1] //可以传入范围

//字符串的减法函数
println str.minus(str2)
println str - str2

//字符串逆向操作
println str.reverse()

//首字符大写
println str.capitalize()

//判断是否为数字类型
println str.isNumber()

//字符串转换函数
//println str.toInteger()



























