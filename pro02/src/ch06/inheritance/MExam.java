package ch06.inheritance;

/**
 * @author : 김아름
 * @date   : 2020. 5. 8.
 * @description : 인터페이스는 다중 상속 가능하다. 클래스는 다중 상속 불가능하다. 클래스와 인터페이스 동시에 상속 가능하다.
 */

interface AB { }
interface BC { }
class DF { }

class Sub extends DF implements AB,BC { }

public class MExam {

}
