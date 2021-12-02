/*
Магнитики с кодом.
Части рабочего java-приложения разбросаны по всему холодильнику. Можете ли вы сгруппировать элементы так, чтобы итоговая программа выводила текст,
приведенный ниже:

% java ExTestDrive yes
thaws

% java ExTestDrive yes
throws

Можете сами добавлять столько скобок, сколько понадобится

System.out.print("r");

try{

System.out.print("t");

doRisky(test);

System.out.println("s");

}   finally {

System.out.print("o");

class MyEx extends Exception{ }
public class ExTestDrive {

System.out.print("w");

if("yes".equals(t)){

System.out.print("a");

throw new MyEx();

} catch (MyEx e){

static void doRisky(String t) throws MyEx{
        System.out.print("h");

public static void main(String[] args) {
        String test = args[0];
 */



//Правильное решение:
class MyEx extends Exception{ }

public class ExTestDrive {
    public static void main(String[] args) {
        String test = args[0];  //В этой строке если заменить  args[0] на к примеру "yes" или "no" то всё работает нормально!
        try{
            System.out.print("t");
            doRisky(test);
            System.out.print("o");
        } catch (MyEx e){
            System.out.print("a");
        }   finally {
            System.out.print("w");
        }
        System.out.println("s");
    }

    static void doRisky(String t) throws MyEx{
        System.out.print("h");
        if("yes".equals(t)){
            throw new MyEx();
        }
        System.out.print("r");
    }
}
/*
Примечание:
в этот массив попадают аргументы командной строки String test = args[0];
то есть если мы запускаем программу из командной строки то там можно передать какие-нибудь значения

если запускаем из IDE, то там по умолчанию ничего не передается и массив этот нулевой длины

в Intellij IDEA в меню Run - Edit Configurations...
и там:
(смотри файл "Untitled.png", который лежит в папке src)
 */
