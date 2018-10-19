package objectorention

/**
 * Created by 董乐强 on 2018/10/19.
 *
 * 1.groovy中默认都是public类型的
 */
class Person implements Action {
    String name
    Integer age
    def increaseAge(Integer years){
        this.name += years
    }

    @Override
    void eat() {

    }

    @Override
    void drink() {

    }

    @Override
    void play() {

    }
}
