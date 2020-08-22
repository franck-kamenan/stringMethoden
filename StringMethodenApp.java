package be.intecbrussel.hoofdstuk6.stringMethoden;

public class StringMethodenApp
{
    public static void main(String[] args)
    {
        String monString = "C'est moi.";
        String autreString = "C'est pas moi.";

        System.out.println(monString);
        System.out.println(autreString);
        System.out.println(monString.concat(autreString));
        System.out.println(monString.equals(autreString));
        System.out.println(monString.indexOf('m'));
        System.out.println(monString.charAt(6));
        System.out.println(monString.indexOf("est"));
        System.out.println(monString.length());
        System.out.println(monString.replace('i', 'e'));
        System.out.println(monString.toLowerCase());
        System.out.println(monString.toUpperCase());
        System.out.println(monString.startsWith("C"));
        System.out.println(monString.endsWith("."));
        System.out.println(monString.trim());
        System.out.println(monString.substring(6));
        System.out.println(monString.substring(2, 5));
        System.out.println(monString.compareTo(autreString));
    }
}
