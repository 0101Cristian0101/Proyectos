package ejercicio_7_parcial;

public class Ejercicio_7p {

		public static int sizeof(int l) {
			return 4;
		}

		public static int sizeof(double m) {
			return 8;
		}
		
		public static int sizeof(short p) {
			return 1;
		}
		public static int sizeof(long r) {
			return 8;
		}
		public static int sizeof(float mf) {
			return 4;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int i, x = 4, w = 9, q;
				for (i = -1; i < 20; i += 3) {
					x++;
					for (q = 4; q < 11; q++) {
						do {
							i = +3;
							w = sizeof(i);
							i = x + w;
							x = w + i;
						} while (x < 15);
					}
				}
				System.out.println("x: " + x + " i: " + i);
			}
		}
	
