public class Principal {
    public static void main(String[] args) {
        YahooAdapter yahoo = new YahooAdapter();
        Alvo yahoo1 = yahoo;
        yahoo1.cotacao("MGLU3.SA");

        AlphaVantageAdapter alpha = new AlphaVantageAdapter();
        Alvo alpha1 = alpha;
        alpha1.cotacao("INTL");

        QuandlAdapter quandl = new QuandlAdapter();
        Alvo quandl1 = quandl;
        quandl1.cotacao("WIKI/AAPL");

    }

}
