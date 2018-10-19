package variable

/**
 * Created by 董乐强 on 2018/10/18.
 */

def x = 1.23
def result
switch (x){
    case 'foo':
        result ='found foo'
        break
    case 'bar': result = 'bar'
        break
    case [1.23,4,5,6,'inlist']: result = 'list'//列表
        break
    case 12..30:
        result = 'range'//范围
        break
    case  Integer:
        result = 'integer'
        break
    case BigDecimal:
        result = 'big decimal'
        break
    default:
        result = 'default'
}
println result

//for循环语句
//对范围的for循环
def sum= 0
for(i in 0..9){
    sum += i
}
println sum
sum = 0
//对list的循环
for(i in [1,2,3,4,5,6,7,8,9]){
    sum +=i
}
println sum
sum = 0

//对map的循环
for(i in ['lili':1,'luck':2,'xiaoming':3]){
    sum += i.value;
}

println sum












