package objectorention

/**
 * Created by 董乐强 on 2018/10/19.
 */
class Entry {
    static void main(def args){
        println '应用程序启动...'
        ApplicationManager.init()
        def person = PersonManager.createPerson(name:'zz',age:26)
        println person.name+" and "+person.age

    }

}
