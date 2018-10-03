
public class EsattamenteCop {

	public static void main(String[] args) {
		int[] vett;
		int cont;

		vett = new int[10];
		for (int i = 0; i < 10; i++) {
			vett[i] = (int) (Math.random() * 20);
			System.out.print(vett[i] + " ");
		}

		cont = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (vett[i] == vett[j]) {
					cont++;
				}

			}
		}
		System.out.println("");
		if (cont == 1) {
			System.out.println("esattamente una coppia");
		}

	}

}