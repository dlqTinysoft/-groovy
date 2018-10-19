package variable

/**
 * Created by 董乐强 on 2018/10/18.
 */
def scriptClouser = {
    println "scriptClouser this:"+this//代表闭包定义处的类
    println "scriptClouser owner:"+owner//代表闭包定义处的类或者对象
    println "scriptClouser delegate:"+delegate//代表做任意对象
    //delegate默认与owner一致
}

//scriptClouser.call()
//相当于定义了一个内部类
class Person{
    def static classClouser={
        println "classClouser this:"+this//代表闭包定义处的类
        println "classClouser owner:"+owner//代表闭包定义处的类或者对象
        println "classClouser delegate:"+delegate//代表做任意对象
        //delegate默认与owner一致
    }
    def static say(){
        classClouser={
            println "methodClouser this:"+this//代表闭包定义处的类
            println "methodClouser owner:"+owner//代表闭包定义处的类或者对象
            println "methodClouser delegate:"+delegate//代表做任意对象
            //delegate默认与owner一致
        }
        classClouser.call()
    }

}
Person.classClouser.call()
Person.say()
class Person1{
    def  classClouser={
        println "classClouser this:"+this//代表闭包定义处的类
        println "classClouser owner:"+owner//代表闭包定义处的类或者对象
        println "classClouser delegate:"+delegate//代表做任意对象
        //delegate默认与owner一致
    }
    def  say(){
        classClouser={
            println "methodClouser this:"+this//代表闭包定义处的类
            println "methodClouser owner:"+owner//代表闭包定义处的类或者对象
            println "methodClouser delegate:"+delegate//代表做任意对象
            //delegate默认与owner一致
        }
        classClouser.call()
    }

}

Person1 p = new Person1()
p.classClouser.call()
p.say()


//在闭包中定义闭包
def nestClouser={
    def innerClouser = {
        println "innerClouser this:"+this//代表闭包定义处的类
        //owner,delegate指定最近的闭包对象
        println "innerClouser owner:"+owner//代表闭包定义处的类或者对象
        println "innerClouser delegate:"+delegate//代表做任意对象
        //delegate默认与owner一致
    }
    //可以修改delegate
    innerClouser.delegate = p
    innerClouser.call()
}

nestClouser.call()

/**
 * 闭包委托策略
 */
class Student{
    String name

    def pretty = {"My name is ${name}"}

    String toString(){
        pretty.call()
    }
}

class Teacher{
    String name1
}

def stu = new Student(name:'Sarash')
def tea = new Teacher(name1:'Ondroid')

println stu.toString()

stu.pretty.delegate = tea
//委托策略 首先从tea找name,如果没有在从stu中找name
stu.pretty.resolveStrategy = Closure.DELEGATE_FIRST
println stu.toString()















