public class Main {
    public static void main(String[] args) {
        System.out.println(stroll(31, 28));
        System.out.println(stroll(12, 28));
        System.out.println(stroll(50,-12));
        System.out.println(stroll(25,65));
        System.out.println(stroll(32,30));

    }
    public static String stroll(int age, int temperature){

        if(age >=20 && age <= 40  && temperature >=20 && temperature<= 30){
            return "Иди гуляй резко вылетай на район";
        } else if (age <=20 && temperature >=0 && temperature <=30){
            return  "Идем Гулять броооо";
        } else if (age >=45 && temperature >= -10 && temperature <= 25){
            return "Сиди дома и пей чай";
        }else {
            return "Сиди дома и пей чай ЖЫЫ ЕССТЬ"; // если ты читаешь этот код,знай что ты красавчик
        }
    }
}
