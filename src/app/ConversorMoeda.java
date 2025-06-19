package app;

public class ConversorMoeda {
    private final ApiService apiService = new ApiService();

    public void converter(int opcao, double valor) {
        String de = "", para = "";
        switch (opcao) {
            case 1: de = "USD"; para = "Euro"; break;
            case 2: de = "Euro"; para = "USD"; break;
            case 3: de = "USD"; para = "BRL"; break;
            case 4: de = "BRL"; para = "USD"; break;
            case 5: de = "USD"; para = "AOA"; break;
            case 6: de = "AOA"; para = "USD"; break;
            case 7: de = "BRL"; para = "AOA"; break;
        }
        double resultado = apiService.obterConversao(de, para, valor);
        if (resultado >= 0) {
            System.out.printf("Resultado: %.2f %s = %.2f %s\n", valor, de, resultado, para);
        } else {
            System.out.println("Erro ao realizar conversão.");
        }
    }
}
