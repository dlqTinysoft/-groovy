package objectorention

import org.apache.tools.ant.taskdefs.Expand

/**
 * Created by 董乐强 on 2018/10/19.
 * 模拟一个应用管理类
 */
class ApplicationManager {
    static void init(){
        ExpandoMetaClass.enableGlobally()
        //为第三方类添加方法
        Person.metaClass.static.createPerson={
            String name ,int age -> new Person(name:name,age:age)
        }
        println '应用程序初始化完成...'
    }
}
