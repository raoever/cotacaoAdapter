public class Principal {
    public static void main(String[] args) {
        YahooAdapter yahoo = new YahooAdapter();
        Alvo yahoo1 = yahoo;
        double cotacao1 = yahoo1.cotacao("MGLU3.SA");

        AlphaVantageAdapter alpha = new AlphaVantageAdapter();
        Alvo alpha1 = alpha;
        double cotacao2 = alpha1.cotacao("INTL");

        QuandlAdapter quandl = new QuandlAdapter();
        Alvo quandl1 = quandl;
        double cotacao3 = quandl1.cotacao("WIKI/AAPL");

        System.out.println("Só pra checar que está retornando corretamente:"+"\n"+
                           "Cotacao Yahoo 1: "+cotacao1+"\n"+
                           "Cotacao Alpha 2: "+cotacao2+"\n"+
                           "Cotacao Quand 3: "+cotacao3+"\n");

    }

}
