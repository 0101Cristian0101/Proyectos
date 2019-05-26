package conjunto_4_consecutivos;

public class Conjunto_4_consecutivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Alumno: Tarazona Silva Cristian

		int [] lista= {2,3,4,1,0,1,50,8,7,12,5};// la lista se puede modificar de acuerdo 
												//a los numeros que se deseen considerar.
		int []aux=new int[lista.length-3];
		
		int M,L,aux2=1,ñ;
		int p;
		for(int i=0; i<lista.length-3;i++) {
			p=i;
			M=lista[i];
			for(int j=i+1; j<=3+i;j++) {
				L=lista[j];
				aux2=aux2*L;
			}
			ñ=M*aux2;
			aux[p]=ñ;
			aux2=1;
		}
		
		int iNumeroMayor, iPosicion;
		iNumeroMayor = aux[0];
		iPosicion = 0;
		for (int x=1;x<aux.length;x++) {
			if (aux[x]>iNumeroMayor){
				   iNumeroMayor = aux[x];
				   iPosicion = x;
				}
		}
		System.out.println("el conjunto de 4 numeros consecutivos del listado ");
		System.out.println("que generan un producto maximo es: ");
				
		int k=0;
		System.out.print("{ ");
		while(k<4) {
			System.out.print( lista[iPosicion+k]+" " );
			k++;
		}	
		System.out.print(" }");
	}

}
