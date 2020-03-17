package com.leroy.practice.designmode.facotry;

import com.leroy.practice.designmode.facotry.model.Animal;
import com.leroy.practice.designmode.facotry.model.Cat;
import com.leroy.practice.designmode.facotry.model.Dog;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author luobs
 * @version 1.0
 * @date Created in 2020年03月01日 12:23
 * @since 1.0
 */
public class SimpleFactory {


    public static Animal createAnimal(Animal animal) {
        if (animal instanceof Cat) {
            return new Cat();
        }
        if (animal instanceof Dog) {
            return new Dog();
        }
        return null;


    }
}
