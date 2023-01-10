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

    Métodos
    Deverão ser nomeados como verbos. Em princípio, todas as letras devem ser minúsculas, com exceção da primeira letra de cada palavra composta, a partir da segunda palavra.


	##Tipos e Variáveis
	Existem, para todos os tipos de dados, uma palavra pré-determinada
	São esses os tipos primitivos, são tipos que não são considerados objetos, pu seja, representam valores brutos e são armazenados diretamente na pilha de memória(memory stack) 

	Variáveis e Constantes
	As constantes são valores armazenados em memória que não podem ser mudados depois de de declarados. Em java, é destinado _final_ para elas. Por convenção, esta palavra deve ser escrita em caixa alta.

/

	##Operadores
	São símbolos especiais usados para operações matemáticas.

		####Classificação
		Atribuição
		Representado pelo símbolo "=", usado para determinar valores de variáveis.

		Aritméticos
		Utilizado para realiazar operações matemáticas, são eles: soma(+), subtração(-), multiplicação (*), divisão(/).

		* Para variáveis do tipo texto, o "+" é usado para concatenar. *

		Unários 
		São aplicados juntamente com outro operador. Fazem trabalho básicos como incrementar, decrementar, inverter valores numériocs e boolenos.

		(++) icremento de valor --> soma 1 unidade ao valor.

		(--) decremento de valor --> subtrai uma unidade do valor.

		(!) negação de valor --> nega expressão booleana

		Ternário
		Forma resimida de uma condição.

		<Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false>
		
		Relacionados
		Avaliam relação entre duas variáveis e retornam um valor booleano.

		(==) IGUAL A
		(!=) DIFERENTE DE
		(>) MAIOR QUE
		(>=) MAIOR OU IGUAL QUE 
		(<) MENOR QUE
		(<=) MENOR OU IGUAL QUE

		Lógicos
		Cria expressões maiores a partir da junções de duas ou mais expressões lógicas.

		&& Operador lógico "E"
		|| Operador lógico "OU"

/
		##Métodos 
		Os métodos correspondem a funções ou sub-rotinas dentro da classe

		Critérios de nomeação
		Esses critérios não são obrigatórios.
		São eles:
		-Deve ser nomeado como verbo;
		-Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).

		Critérios de definição de métodos
		É possível usar uma convenção estrutural determinados pelos métodos abaixo:

			1.Qual a proposta principal ?
			2.Qual o tipo de retorno esperado após executar o mesmo?
			*OBS:. Caso o método não retorne nenhum valor ele será representado pela palavra-chave "void".
			3.Quais os parâmetros(argumentos) necessários ?
			4. O método precisa de exceção?
			5.Qual a visibilidade do método?

/
		##Escopo
		Ambiente onde uma variável pode ser acessada.
		No java, o escopo de variável vai de acordo com o bloco onde foi declarada.

		Escopo de classe
		Os atributos (variáveis) são declarados no corpo principal da Classe, sendo portanto, acessíveis por todos os métodos.

		Escopo de método
		Caso você declare uma variável DENTRO DE UM MÉTODO, o escopo dessa variável está limitado apenas ao corpo desse método, ou seja, dentro das chaves que limitam o método.
/

		##Palavras reservadas
		São indicadores de uma linguagem que já possuem finalidade específicas, portanto, não podem ser usardas em outras finalidades.

		-Java possui 52 palavras reservadas;
		-São escritas em minúsculo;
		- Em algumas IDEs possuem uma cor especial de acordo com sua categoria;

			Classificação
			####Controles de pacotes
			####Modificadores de acesso
			####Primitivos
			####Modificadoes de classes, variáveis pu métodos

	##Java Doc
		####Tags
		Representam dadosrelevantes paea a compreensão da proposta de uma classe e os conjuntos de seus métodos e atributos.

		#### Javadoc
		É um gerador de documentação criada para a documentar a API dos programas em Java

		// No terminal execute o comando abaixo

		javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java

	##Terminal e Argumentos 
		####Argumentos
		Quando executamos uma classe, que contenha o método main, o mesmo permite que passemos um array [] de argumentos, do tipo String.
		
		java MinhaClasse agumentoUm argumentoDois





