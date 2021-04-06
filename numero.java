public class numero {
public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
    char aux = in.next().charAt(0);
    System.out.println("El caracter leido es: " + aux
        + "\n Su valor Ascii Decimal es:" + (int) aux
        + "\n Su valor Ascii Hexadecimal es:" + Integer.toHexString((int) aux)
        + "\n Su valor Ascii Octal es:"+Integer.toOctalString((int)aux));
}
}
