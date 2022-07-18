//use o comando package é usado para organizar o código e resolver conflitos com classes de mesmo nome
package br.com.alurajava.help;

//Use o comando import para importar e usar diretamente a classe/procedimento sem ter que informar o caminho completo

public class javaTips {

}

/* Os modificadores de acesso são: public, protected, default e private.
    public - Todos tem acesso
    Default - Tem acesso a um atributo default (identificado pela ausência de modificadores) todas as classes que estiverem no mesmo pacote que a classe que possui o atributo.
    protected - ele é praticamente igual ao default, com a diferença de que se uma classe (mesmo que esteja fora do pacote) estende da classe com o atributo protected, ela terá acesso a ele. Então o acesso é por pacote e por herança.
    private - A única classe que tem acesso ao atributo é a própria classe que o define, ou seja, se uma classe Pessoa declara um atributo privado chamado nome, somente a classe Pessoa terá acesso a ele.
*/

/**
 * Comentario com dois ** são usados para separar os comentários do dev em relação aos comentários de documentação da classe, feita pelo Autor
 * @author - Felipe
 * @since - 08/06/2020
 * @version - 1.0
 * Tambem é possível gerar uma documentação de forma automatica, baseada nesses comentários, usando o Javadoc
 */

/* Arquivo .jar como usar e como gerar
Pode-se gerar um arquivo .jar, que nada mais é do que um zip com a estrutura dos arquivos na pasta src.
Dessa forma pode-se importar esse .jar em outro projeto.

Tambem é possível gerar um .jar como executável, para isso no momento de exportar o jar deve-se apontar onde está a classe Main.
 */

// Todas as Strings em Java são imutaveis

// O método ToString herdado da classe Object pode ser sobreescrito (com a notation @Override) e assim podemos usar o metodo toString para imprimir o objeto de uma forma "customizada"

//serialVersionUID - É um atributo que é usado para identificar a versão do objeto serializado.
// Quando mudanças em sua estrutura quebram o código é uma boa pratica alterar esse numero



