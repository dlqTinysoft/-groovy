package objectorention

/**
 * Created by 董乐强 on 2018/10/19.
 */
def person = new Person(name:'android',age:26)
println "this name is ${person.name},this age is ${person.age}"

println person.getAge()
println person.getName()

person.increaseAge(10)
println person.getAge()

//为类动态的添加一个属性
Person.metaClass.sex = 'male'
def person1 = new Person(name:'android',age:26)
println person1.sex

//给person类注入方法，为类动态的添加方法
Person.metaClass.nameUperCase = {
    ->sex.toUpperCase()
}


//注入动态的静态方法
Person.metaClass.static.createPerson={
    String name,int age -> new Person(name:name,age:age)
}

def person3 = Person.createPerson('rrrr',26)

println person3.name+"and"+person3.age










