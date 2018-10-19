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