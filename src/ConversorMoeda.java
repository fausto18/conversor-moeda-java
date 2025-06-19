public class ConversorMoeda {
    private final ApiService apiService = new ApiService();

    public void converter(int opcao, double valor) {
        String de = "", para = "";

        switch (opcao) {
            case 1: de = "USD"; para = "ARS"; break;
            case 2: de = "ARS"; para = "USD"; break;
            case 3: de = "AOA"; para = "BRL"; break;
            case 4: de = "BRL"; para = "AOA"; break;
            case 5: de = "USD"; para = "EURO"; break;
            case 6: de = "EURO"; para = "USD"; break;
        }

        double resultado = apiService.obterConversao(de, para, valor);
        if (resultado >= 0) {
            System.out.printf("Resultado: %.2f %s = %.2f %s\n", valor, de, resultado, para);
        } else {
            System.out.println("Erro ao realizar conversão.");
        }
    }
}
