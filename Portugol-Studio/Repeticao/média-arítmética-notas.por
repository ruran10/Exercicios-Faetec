programa
{
	funcao inicio()
	{
		real notas[3]
		real media = 0.0
		real soma =0.0
		inteiro contador

		para(contador=0;contador<3;contador++){
			escreva("Digite a nota do Aluno: ")
			leia(notas[contador])
			escreva("\n")
			soma = notas[contador] + soma
			
		}
		media = soma/3
		escreva("Está é a média do aluno : ",media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 30; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */