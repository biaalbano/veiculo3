public class Principal {
    
    public static void main(String[] args) {
        
        Bike bike =new Bike("Giant","Giant","Azul",2023);

        System.out.println(bike.getNome());
        System.out.println(bike.getMarca());
        System.out.println(bike.getCor());
        System.out.println(bike.getAno());

        Mobilete mobilete =new Mobilete("Monark","Monark","Preto",2023);

        System.out.println(mobilete.getNome());
        System.out.println(mobilete.getMarca());
        System.out.println(mobilete.getCor());
        System.out.println(mobilete.getAno());

        Patinete patinete =new Patinete("Bandeirantes","Bandeirantes","Rosa", 2023);

        System.out.println(patinete.getNome());
        System.out.println(patinete.getMarca());
        System.out.println(patinete.getCor());
        System.out.println(patinete.getAno());
}
}