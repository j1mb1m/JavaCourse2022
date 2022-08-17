package by.itacademy.hw6;

/*Практика методов классов оберток
●	Создайте объекты класса Double, используя методы valueOf().
●	Преобразовать значение типа String к типу double. Используем метод Double.parseDouble().
●	Преобразовать объект класса Double ко всем примитивным типам.
●	Вывести значение объекта Double на консоль.
●	Преобразовать литерал типа double к строке: String d = Double.toString(3.14);
*/
public class Task7 {
    public static void main(String[] args) {

        //1.Создайте объекты класса Double, используя методы valueOf()
        Double num1 = Double.valueOf("31.22");
        Double num2 = Double.valueOf(.1005);
        //4. Вывести значение объекта Double на консоль.
        System.out.println(num1);
        System.out.println(num2);

        //2. Преобразовать значение типа String к типу double. Используем метод Double.parseDouble().
        System.out.println("Convert String -> double: " + convertToPrimitiveTypeDouble("23.0005405"));

        //3. Преобразовать объект класса Double ко всем примитивным типам.
        convertToPrimitiveType(num2);

        //5.Преобразовать литерал типа double к строке: String d = Double.toString(3.14);
        convertToString(3.14);
    }

    public static void convertToPrimitiveType(Double dbl) {

        byte b = dbl.byteValue();
        short s = dbl.shortValue();
        int i = dbl.intValue();
        long l = dbl.longValue();
        float f = dbl.floatValue();
        double d = dbl;

        System.out.println("Convert Double \"" + dbl + "\"  to ");
        System.out.println("byte : " + b);
        System.out.println("short : " + s);
        System.out.println("int : " + i);
        System.out.println("long : " + l);
        System.out.println("float : " + f);
        System.out.println("double : " + d);
        System.out.println();
    }

    public static double convertToPrimitiveTypeDouble(String str){
       return Double.parseDouble(str);
    }

    public static void convertToString(double d){
        String str2 = Double.toString(d);
        System.out.printf("Class %s, value %s", str2.getClass().getSimpleName(), str2);
    }

}
