class EstacaoDoAno
{
    public static void main(int mes)
    {
        String estacao;//armazenara o nomde do mes
    if(mes==12 || mes==1 || mes ==2)
    {//if dos meses do Verao
            estacao= " verao";
    }
    else if(mes==3 || mes==4 || mes==5)
    {//if dos mesese de outono
        estacao= " Outono";
    }
    else if(mes==6 || mes==7 || mes==8)
    {
    //if dos meses de inverno
    estacao= " inverno";
    }
    else if(mes==9 || mes == 10 || mes==11)
    {
    //if ds meses da primavera
    estacao= " primavera";
    }
    else //else para mes invalidado
     estacao = " Desconhecido";
    System.out.println("Mês" + mes + "-Estação"+ estacao + ".");
    //exibe estacao
}
}