class fatorial{
	public static void main(String[] args){

		for(int fatorial = 1; fatorial < 10; fatorial++){
			System.out.print(fatorial + " ! = 1");
			
			int resultado = 1;
			for(int i = 2; i <= fatorial; i++){
				System.out.print(" * " + i);
				 resultado *= i;
			}

			System.out.println(" = " + resultado);
		}
	}
}

// O fatorial de um número n (n pertence ao conjunto dos números naturais) é sempre o produto de todos os seus antecessores, incluindo si próprio e excluindo o zero.
// Importante: n >= 0 (n maior ou igual a zero) , ou seja, não existe fatorial para números negativos.
// O fatorial de 0 ( 0! ) é 1, pois o produto de número nenhum é 1.
// 6! = 6 . 5 . 4 . 3 . 2 . 1 = 720 