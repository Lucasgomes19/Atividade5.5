public class atv5 {

    public static void main(String[] args) {

        double preço;

        preço = 20.00;

        System.out.println("Os " + preço + " reais somados com o imposto fica " + somaImposto(preço, preço) + " reais");
        
    }
    static double somaImposto(double taxaImposto, double imposto){
        imposto = 0.012;
        taxaImposto = (20.00 * imposto) + 20.00; 

        return taxaImposto;
    }
}