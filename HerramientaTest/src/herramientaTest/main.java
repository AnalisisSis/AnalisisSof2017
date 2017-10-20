package herramientaTest;

public class main {
	private int[] vector;
	public main(){
		vector=new int[6];
		for (int i = 0; i < vector.length; i++) {
			vector[i]=i+1;
		}
	}
	
	public int[] getvector(){
		int[] copia=new int[this.vector.length];
		for (int i = 0; i < vector.length; i++) {
			copia[i]=vector[i];
		}
		return copia;
	}
	
	public void mostrarVector(){
		for (int j = 0; j < vector.length; j++) {
			System.out.print(vector[j] +" ");
		}
		
	}
	
	public static void main(String[] args) {
//		main j=new main();
//		j.mostrarVector();
//		int[] devuelto=j.getvector();
//		devuelto[4]=10;
//		System.out.println("");
//		for (int i = 0; i < devuelto.length; i++) {
//			System.out.print(devuelto[i] +" ");
//		}
//		System.out.println("");
//		j.mostrarVector();
		
//		while (en.hasMoreElements()) {
//			type type = (type) en.nextElement();
//			
//		}
//		int[] juli={3,1,2,1};
		int[] juli={4,1,2,3,3};
		System.out.println(balancedSum(juli)); 
		
		System.out.println( Math.pow(2, 3));
		
		
	}
	
	static int balancedSum(int[] sales) {
        int sumaIzq=0;
        int sumaDer=0;
        for(int i=2;i<sales[0];i++){
            for(int j=1;j<i;j++){
                sumaIzq+=sales[j];
            }
            for(int j=(i+1);j<sales.length;j++){
                sumaDer+=sales[j];
            }
            if(sumaIzq==sumaDer){
                return (i-1);
            }else{
               sumaIzq=0;
               sumaDer=0; 
            }
        }
        return 0;
    }

}
