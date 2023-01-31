
//Основная ДЗ
//        a)  Создать иерархию из 3х классов (1й -> 2й -> 3й уровень иерархии), последний 3й класс сделать не наследуемым
//        b)  Все поля классов должны быть приватными, одно из полей должно быть сложного типа созданного вами же (4й класс), одно из полей сделать сложного типа (enum)
//        c)  В классах не должно быть setter-ов, только getter-ы и конструкторы
//        d)  Добавить перегруженные методы (2-3 шт.) в класс 2-го уровня иерархии, один из них сделать неперезаписываемым
//        e)  В классе 3-го уровня перезаписать один из методов родителя
//        f)  В главном классе (Main) Создать объект класса 2-го уровня (objectA) и 2 объекта класса 3-го уровня (objectB, objectC),
//        также распечатать все свойства объектов и вызвать перегруженные методы через каждый из экземпляров ваших объекто

public class Main {
    public static void main(String[] args) {
        cat objectA=new cat("Leo","hunter",70);
        Leo objectB=new Leo("cheetah","hunter",27,"loyal",new Partner(Print.Blue));
        Leo objectC=new Leo("spinky","domestic",12,"tricky",new Partner(Print.Black));
        cat[] anm={objectB,objectA,objectC};
        for (cat cat: anm) {

            if(cat instanceof Leo){
                System.out.println(cat.getName()+" "+cat.getBreed()+" " +cat.makeVoice(" ")+" "+cat.getSpeed()+
                        " "+((Leo) cat).getPartner().getPrint()+" "+((Leo) cat).getType());
            }
            else {
                System.out.println(cat.getName()+" "+cat.getBreed()+" " +cat.makeVoice(" ")+" "+cat.getSpeed());
            }


        }

        }

    }
