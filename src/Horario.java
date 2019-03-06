
public class Horario {
	public static void main(String[] args) {
		String rojo = "\033[31m";
		String verde = "\033[32m";
		String naranja= "\033[33m";
		String azul = "\033[34m";
		String morado = "\033[35m";
		String blanco = "\033[37m";
		System.out.println(naranja + "LMarc  " + naranja + "LMarc  " + verde + "FOL  " + rojo + "BDat  " + azul + "EDes  ");
		System.out.println(naranja + "LMArc  " + naranja + "LMArc  " + verde + "FOL  " + rojo + "BDat  " + azul + "EDes  ");
		System.out.println(azul  + "EDes   " + morado + "PRO  " + morado + "  PRO  " + blanco + "SInf  " + rojo + "BDat  ");
		System.out.println(blanco + "  R   " + blanco + "E" + blanco + "    C  " + blanco + "  R  " + blanco + "  E  " + blanco + "   O");
		System.out.println(verde + "FOL" + morado + "    PRO" + morado + "    PRO" + blanco + "  SInf" + rojo + "  BDat");
		System.out.println(morado + "PRO" + blanco + "    SInf" + rojo + "   BDat" + morado + " PRO" + blanco + "  SInf");
		System.out.println(morado + "PRO" + blanco + "    SInf" + rojo + "   BDat" + morado + " PRO" + blanco + "  SInf");
	}
}
