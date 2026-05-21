public class Carro {
    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro(){
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }
    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        if (marcha == 0 && velocidade == 0){
            ligado = false;
            System.out.println("Carro desligado com sucesso.");

        } else {
            System.out.println("Atenção! Carro não pode ser desligado!");
        }
    }
    public void acelerar(){
        if (!ligado) {
            System.out.println("O carro está desligado! Não é possivel acelerar.");
            return;
        }
        if (marcha == 0) {
            System.out.println("O carro está em ponto morto! Engate uma marcha para acelerar.");
            return;
        }

        int limiteDaMarcha = marcha * 20;

        if (velocidade < limiteDaMarcha && velocidade < 120) {
            velocidade = velocidade + 1;
            System.out.println("Em aceleração... Velocidade atual:" + velocidade + "Km/h");
        } else {
            System.out.println("Atenção ("+ limiteDaMarcha + "Km/h para " + marcha + "ª marcha alcançada. Troque de Marcha!") ;
        }
    }
    public void diminuir(){
        if (!ligado) {
            System.out.println("O carro esta desligado. Não é possível desacelerar!");
            return;
        }

        int minimoDaMarcha = 0;

        if (marcha > 1) {
            minimoDaMarcha = (marcha -1) * 20 + 1;
        }
        if (velocidade > minimoDaMarcha && velocidade > 0) {
            velocidade = velocidade - 1;
            System.out.println("Desacelerando.... Velocidade atual: " + velocidade +"Km/h");
        } else if (velocidade == 0) {
            System.out.println("O carro já está parado (0 Km/h).");
        } else {
            System.out.println("Atenção reduza a marcha para continuar diminuindo a velocidade!");
        }
    }
    public void direitaesquerda(String direcao){
        if (!ligado) {
            System.out.println("O carro esta desligado. Não é possível fazer curvas!");
            return;
        }

        if (velocidade >=1 && velocidade <=40) {
            System.out.println("O carro virou para a " + direcao + " com sucesso.");
        } else if (velocidade == 0) {
            System.out.println("Erro: O carro está parado! Não é possível fazer curvas.");
        } else {
            System.out.println("Erro: Velocidade altar(" + velocidade + "Km/h. Perigo! Reduza para menos de 40 Km/h.");
        }

    }
    public void verificarVelocidade(){
        System.out.println("Velocidade Atual = " + this.velocidade +"Km/h (Marcha:" + this.marcha +")");
    }

    public void trocarMarcha(int novaMarcha){
        if (!ligado){
            System.out.println("O carro esta desligado não pode trocar marchas");
            return;
        }
        int diferenca = Math.abs(novaMarcha - marcha);
        if (diferenca == 1){
            this.marcha = novaMarcha;
            System.out.println("Marchar alterada para " + this.marcha);

        }else {
            System.out.println("Atenção: Você não pode pular marchas! Dese seguir a sequencia!");
        }

    }

    /// O carro desligado não pode realizar nenhuma função;
    /// Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);
    /// Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no minimo a 0km);
    /// o carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
    /// A velocidade do carro deve respeitar os seguintes limites para cada velocidade
    /// se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
    /// se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
    /// se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
    /// se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
    /// se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
    /// se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
    /// se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
    /// O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
    /// O carro só pode virar para esquerda/direita se sua velocidade for de no mínimi 1km e no máximo 40km;
}
