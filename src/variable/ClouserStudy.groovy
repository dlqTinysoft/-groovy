package variable

/**
 * Created by 董乐强 on 2018/10/18.
 */
//定义一个闭包
def clouser = {println 'Hello groovy!'}
clouser.call()
clouser()

//箭头前是参数，后是闭包体，就是代码块
def clouser1 = { String name-> println "Hello ${name}"}
clouser1.call("groovy")
clouser1("groovy")
def name = 'groovy'
clouser1(name)

//多个参数
def clouser2 = { String name1,int age-> println "Hello ${name},${age}"}
clouser2(name,4)

//默认参数
def  clouser3 = {println "Hello ${it}"
return "Hello ${it}"}
clouser3(name);
//闭包返回值,如果没有返回值，则返回为null
result = clouser3(name)
println result

//求指定number的阶层
int x = 10
int fab(int number){
    int result = 1
    1.upto(number,{num->result *=num})
    return result
}

x = fab(5)
println x

int fab2(int number){
    int result = 1
    //闭包也可以放到函数的括号外
    number.downto(1){
        num -> result*=num
    }
    return result
}
y = fab2(5)
println y

//累加
int cal(int number){
    int result
    //将闭包放在方法外，其实也是传给方法了,times只有一个
    //参数，是闭包类型，闭包作为参数，写到方法外了
    number.times {
        num -> result +=num
    }
    return result
}

z = cal(101)
println z

/*================groovy闭包的进阶==================*/














