package by.teachmeskills.firstproject;

public class ApplicationDemo {
    public static void main(String[] args) {
        System.out.println("I'm Vegan and your not lol! Haha");
        int a = 4;
        int b = 4;
        double c = 4.2;

        if (a<c){
            System.out.println(a+ " < "+c);
        }else{
            a++;
            System.out.println(a+" > " + c);
        }

        int d = 11;
        switch (d){
            case 10:
                d++;
                System.out.println(d);
                break;
            case 11:
                d++;
                System.out.println(d + "");
                break;
            default:
                System.out.println("Нет совпадений");
                break;
        }





    }
}
