package objectorention

/**
 * Created by 董乐强 on 2018/10/19.
 * 1.即像接口，又像抽象类
 */
trait DefaultAction {
    abstract void eat()
    void play(){
        println 'i can play'
    }
}