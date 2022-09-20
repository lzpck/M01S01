package Exercicios;

/*
O sistema de pontuação por partida no Campeonato Brasileiro de Futebol funciona assim:
	Vitória = 3 pontos
	Derrota = 0 pontos
	Empate  = 1 ponto
Dado que o time 'Tabajara F.C.' tem 12 vitórias, 2 derrotas e 6 empates, implemente um código em Java para calcular
a quantidade de pontos e de jogos deste time e imprimir no console a frase abaixo (preenchendo-a com os respectivos valores):
"O time <NOME_DO_TIME> acumulou <NRO_DE_PTOS> após jogar <NRO_PARTIDAS> partidas".
Dicas:
- Crie variáveis para guardar o valor de vitórias, derrotas e empates.
- Crie outra variável para guardar o número de partidas (soma de vitórias, derrotas e empates).
- Crie outra variável para receber o resultado do cálculo de pontos.
 */
public class Exercicio8 {
    public static void main(String[] args) {
        String nomeTime = "Tabajara F.C";
        int vitorias = 12;
        int empates = 6;
        int derrotas = 2;
        int partidas = vitorias + empates + derrotas;
        int pontos = (vitorias * 3) + (empates);

        System.out.println("O time " + nomeTime + " acumulou " + pontos + " pontos após jogar " + partidas + " partidas." );
    }
}
