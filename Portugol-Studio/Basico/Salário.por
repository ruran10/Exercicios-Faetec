programa
{
    funcao inicio()
    {
        real salario, percentual, novoSalario

        escreva("Digite o salário atual do funcionário: ")
        leia(salario)
        
        escreva("Digite o percentual de aumento: ")
        leia(percentual)

        novoSalario = salario + (salario * percentual / 100.0)

        escreva("O novo salário é: R$ ", novoSalario)
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 377; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */