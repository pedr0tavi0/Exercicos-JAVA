 
/**
 * Escreva uma descrição da classe Casa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Casa
{
    
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int sala, quarto, cozinha, banheiro;

    /**
     * Construtor para objetos da classe Casa
     */
    public Casa(int sala, int quarto, int cozinha, int banheiro)
    {
        // inicializa variáveis de instância
        this. sala= sala;
        this.quarto= quarto;
        this.cozinha=cozinha;
        this.banheiro=banheiro;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void exibeInformacoes()
    {
        // escreva seu código aqui
        System.out.println("Essa casa possui");
        System.out.println("Quarto(s)  :" +quarto);
        System.out.println("Sala(s)    :"+ sala);
        System.out.println("Cozinha(s) :"+ cozinha);
        System.out.println("Banheiro(s):"+ banheiro);
    }
}
