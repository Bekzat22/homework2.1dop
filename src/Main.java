
//Доп ДЗ:
//        b) Создать 2х уровневую иерархию из 4х классов (1й - родитель --> 2й, 3й, 4й - дочерние, с отличающимися полями).
//        c) Создать Интерфейс Printable с методом void print();
//        d) Реализовать интерфейс Printable классами 2й, 3й и 4й,
//        переопределить метод интерфейса так чтобы он распечатывал всю информацию о свойствах объекта.
//        e) В классе Main создать возвращаемый метод createObject(String className),
//        который умеет создавать объекты класса 2й, 3й и 4й и после создания и задания
//        свойств объекту метод возвращает ссылку на объект (пульт). Можно использовать switch
//        для того чтоб определить какого типа нужно создать экземпляр объекта.
//        Например если в параметре передается “2й” метод должен создать объект именно этого типа.
//        f) В главном классе Main создать 3 различных объекта классов
//        2й, 3й и 4й с помощью метода createOcject, и распечатать по ним информацию методом print();
public class Main {
    public static void main(String[] args) {
        createObjects("Leo");
        createObjects("cat");
        createObjects("Drago");


        }
        public static String createObjects(String classname){
        switch (classname){
            case"Leo":
                Leo leo =new Leo("leo","domestic",50,new Partner(Print.Blue));
                leo.print();
                break;
            case "cat":
                cat cat =new cat("cat","hunter",20);
                cat.print();
                break;
            case "Drago":
                Drago drago=new Drago("Drago","fire",250);
                drago.print();
                break;
        }
        return null;


        }

    }
