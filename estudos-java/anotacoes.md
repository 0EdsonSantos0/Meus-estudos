Introdução á Plataforma Java

O que é Java ?

O que é uma  IDE?
Ambiente de Desenvolvimento Integrado
 
Java Sintaxe 
Anatomia das Classes

-Estrutura inicial
	Um código de um programa é estruturado a partir de palavras pré-definidas pela linguagem, são essas que utilizamos para definir variáveis, classes, métodos ...

Sintaxe para declarar um classe:
public class MinhaClasse {
	//Conteúdo do código
}

Obs:. Os nomes das classes devem sempre começar com letra maiúscula.

O que escrever no conteúdo da classe ?
	Se por acaso a classe for executável, terá que ter um método com nomenclatura especial:
 
public class MinhaClasse {
	public static void main(String [] args) {
	}
}

Padrão de nomenclatura

-Arquivo.java
	Todo arquivo da linguagem deve ter .java e deve começar com a letra maiúscula. 

-Nome da classe deve ser o nome do arquivo

-Nome das variáveis
	Toda variável deve começar com a letra minúscula, mas se for composta a segunda palavra do nome de começar com a letra maiúscula.

obs:. para variáveis com valores pré-determinados, será imposta a seguinte nomenclatura:
	final TIPO NOMES_DA_VARIÁVEL(todo maiúsculo) = VALOR;   

Deve conter apenas letras, _ (underline), $ ou os números de 0 a 9;

Deve obrigatoriamente se iniciar por uma letra (preferencialmente), _ ou $, jamais com número;

Deve iniciar com uma letra minúscula (boa prática – ver abaixo);

Não pode conter espaços;

Não podemos usar palavras-chave da linguagem;

O nome deve ser único dentro de um escopo.

Declaração de métodos e variáveis

Para as variáveis:
TIPO NomeBemDefinido = Atribuição(opcional, dependendo do contexto);

Para métodos:
TipoDoRetorno NomeObjetivoNoInfinitivo Parametro(s)

identação
escrever o código de forma hierárquica, facilitando a visualização e entendimento do código

Organizando arquivos
Organizar através de packages

Java beans 
estruturação de escrita

    Váriaveis
    Uma variável deve ser clara, sem abreviações ou definição sem sentido;

    Uma variável é sempre no singular, exceto quando se referir a um array ou coleção.

    Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês.

    Métods
    Deverão ser nomeados como verbos. Em princípio, todas as letras devem ser minúsculas, com exceção da primeira letra de cada palavra composta, a partir da segunda palavra.


##Tipos e Variáveis


