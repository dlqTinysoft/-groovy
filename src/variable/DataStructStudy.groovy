package variable

import java.util.stream.Collectors

/**
 * Created by 董乐强 on 2018/10/18.
 */

//列表学习
//arrayList定义
def list = [1,2,3,4,5]

println list.class

println list.size()
//数组定义
def array = [1,2,3,4,5] as int []

println array.class
//数组定义
int [] array2 = [1,2,3,4,5]

//排序
def sortList = [6,-3,9,-7,1,5]
sortList.sort()
Collections.sort(sortList)
println sortList

Comparator mc = {a,b -> a ==b ?0:Math.abs(a) < Math.abs(b)?-1:1}
Collections.sort(sortList,mc)
println sortList

sortList.sort{a,b -> a == b ?0 :Math.abs(a)<Math.abs(b)?1:-1}
println sortList

//列表的查找

def findList = [-3,9,6,2,-7,1,5]

int result = findList.find{
    return it%2 ==0
}

println result

def result1 = findList.findAll{
    return it % 2 != 0
}
println result1.toListString()

//列表中比较大小
println findList.min()
println findList.max()

println findList.min({return Math.abs(it)})
println findList.max({return Math.abs(it)})

def num = findList.count{
    return it % 2 == 0
}

println num


/*=============map定义====================*/

def colors = [red:'ff000000',
              green:'ooffoo',
              blue:'0000ff']

println colors.getAt("red")
//下标操作符
println colors['red']
//点的方式来获取操作符
println colors.blue

//添加元素
colors.yellow = 'ffooff'
println colors['yellow']

println colors.toMapString()

colors.complex=[a:1,b:2]//添加任意类型的对象
println colors.toMapString()

//定义map时，1.key必须是不可变的字符串，就是单引号字符串

println colors.getClass()//使用的是linkedHashMap


HashMap colors1 = [red:'ff000000',
              green:'ooffoo',
              blue:'0000ff']
println colors1.getClass()



//groovy 中对map的一些操作

def students = [
        1:[number:'0001',name:'Bob',score:55,sex:'male'],
        2:[number:'0002',name:'Johnny',score:62,sex:'female'],
        3:[number:'0003',name:'Claire',score:73,sex:'female'],
        4:[number:'0004',name:'Amy',score:66,sex:'male']
]

//遍历
students.each {
    def student -> println "the key is ${student.key},this" +
            "value is ${student.value}"
}

//闭包参数，不能乱传递，必须按照顺序
students.eachWithIndex{ def student,int index ->
    println "index is ${index},\"the key is ${student.key},this\" +\n" +
            "            \"value is ${student.value}\""
}

students.each{
    key,value->
        println "the key is ${key},this" +
                "value is ${value}"
}

students.each{
    key,value->
        println "this index is ,the key is ${key},this" +
                "value is ${value}"
}


//Map的查找操作
def entry = students.find {
    def student -> return student.value.score>=60
}
println entry

def entrys = students.findAll {
    def student ->return student.value.score>=60
}
println entrys

def count = students.count {
    def student -> return student.value.score>=60 && student.value.sex=='male'
}
println count

def names = students.findAll {
    def student -> return student.value.score>=60
}.collect {
    return it.value.name
}
println names.toListString()

//分组
def group = students.groupBy {
    def student ->
        return student.value.score >=60 ?'及格':'不及格'
}

println group.toMapString()

//排序
def sort = students.sort{
    def student1,def student2 ->
        Number score1 = student1.value.score
        Number score2 = student2.value.score

        return score1 == score2?0:score1<score2 ?-1:1
}

println sort.toMapString()

def range = 1..10
println range[0]
println range.contains(10)
println range.from
println range.to

//遍历
range.each {
    println it
}

for(i in range){
    println i
}

def result2 = getGrade(75)
println result2
def getGrade(Number number){
    def result
    switch (number){
        case 0..<60:
            result = '不及格'
            break
        case 60..<70:
            result = '及格'
            break
        case 70..80:
            result = '良好'
            break
        case 80..100:
            result = '优秀'
            break
    }
    return result//返回result
}











