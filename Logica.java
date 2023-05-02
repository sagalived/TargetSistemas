
public class Logica {
    public static void main(String[] args) {
        double distanciaCarro = 100.0; // km
        double velocidadeCarro = 110.0; // km/h
        double distanciaCaminhao = 99.33; // km
        double velocidadeCaminhao = 80.0; // km/h
        double tempoCarro = distanciaCarro / velocidadeCarro;
        double tempoCaminhao = distanciaCaminhao / velocidadeCaminhao;

        if (tempoCarro < tempoCaminhao) {
            System.out.println("O carro estará mais próximo de Ribeirão Preto quando se cruzarem na rodovia.");
        } else {
            System.out.println("O caminhão estará mais próximo de Ribeirão Preto quando se cruzarem na rodovia.");
        }
    }
}
/*

a) 1, 3, 5, 7, 9

b) 2, 4, 8, 16, 32, 64, 128
A lógica é multiplicar o número anterior por 2

c) 0, 1, 4, 9, 16, 25, 36, 49
A lógica é elevar o número da posição correspondente ao quadrado

d) 4, 16, 36, 64, 100
A lógica é adicionar 12 ao número anterior para obter o próximo número na sequência.

e) 1, 1, 2, 3, 5, 8, 13
A lógica é a soma dos 2 números anteriores para obter o próximo número na sequência, seguindo a sequência de Fibonacci.

f) 2, 10, 12, 16, 17, 18, 19, 20
A lógica é adicionar 8 ao número anterior e, em seguida, adicionar 2 ou 1 (alternadamente) para obter o próximo número na sequência.

*************************************************************************************************************************************************
4 - Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia. O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de Franca em direção a Ribeirão Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?



IMPORTANTE:

a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.


b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)

c) Explique como chegou no resultado.
Será necessário calcular a distância percorrida por cada um deles até o ponto de encontro.
Distância percorrida pelo carro: d = 100km
Distância percorrida pelo caminhão: d = 100km - 2 * 5min * 80km/h = 99,33 km
Distância total percorrida pelos dois até o ponto de encontro: 100km + 99,33km = 199,33km
Tempo que o carro leva para percorrer a distância: t = d/v = 100km/110km/h = 0,91h
Tempo que o caminhão leva para percorrer a distância: t = d/v = 99,33km/80km/h = 1,24h
 */