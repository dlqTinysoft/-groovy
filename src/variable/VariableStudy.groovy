package variable

/**
 * Created by 董乐强 on 2018/10/18.
 */
//得出结论，groovy都是对象类型，基本类型会转换为对象类型

//强类型定义变量
int x = 10

double y = 3.14

//println y.class

//println x.class

//弱类型定义变量类型，可以理解def为java中的object类型
def x_1 = 11

def y_1 = 3.1415

def name = 'android'

println x_1.class
println y_1.class
println(name.class)
x_1 = 'test'
print(x_1.class)

//总结：自己用，则定义为弱类型，如果其他人调用，则定义为强类型





