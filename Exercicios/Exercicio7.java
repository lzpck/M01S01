package Exercicios;

/*
Implemente em Java um código para calcular e imprimir no console a área de um triângulo de base 12 cm, e altura de 8 cm,
sabendo que a fórmula da área do triângulo é:
	A = ( base * altura ) / 2
Dicas:
- Declare as variáveis 'base' e 'altura' e atribua os respectivos valores;
- Declare e atribua na variável 'area' o valor da expressão aritmética da fórmula indicada;
- Imprima o resultado no console.

 */

public class Exercicio7 {
    public static void main(String[] args){
        int base = 12;
        int altura = 8;
        float area = (base * altura) / 2;
        System.out.println(area);
    }
}
