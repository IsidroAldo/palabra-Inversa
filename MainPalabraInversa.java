import java.util.Scanner;
class MainPalabraInversa {
public static void main(String[] args) {
    String persona;
    Scanner op= new Scanner(System.in);
    
    System.out.println("INGRESA UNA PALABRA: ");
    persona = op.nextLine();

    PalabraInversa inversa = new PalabraInversa();
    inversa.setPalabra(persona);
    
    System.out.println("palabra inversa es: "+inversa.getInversa());
    System.out.println(inversa);



    


}
    
}