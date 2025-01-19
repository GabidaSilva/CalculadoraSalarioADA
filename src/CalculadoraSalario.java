public class CalculadoraSalario {
    public static double calcularINSS(double salarioBruto) {
        if (salarioBruto <= 1212.00) {
            return salarioBruto * 0.075;

        } else if (salarioBruto <= 2427.35) {
            return salarioBruto * 0.09;

        } else if (salarioBruto <= 3641.03) {
            return salarioBruto * 0.12;

        }else if (salarioBruto <= 7087.22){
            return salarioBruto * 0.14;

        }else{
            return 7087.23 * 0.14;
        }
    }

    public static double calcularIR (double salarioBase) {
        if (salarioBase <= 1903.98){
            return 0;

        } else if (salarioBase <= 2826.65) {
            return salarioBase * 0.075;

        } else if (salarioBase <= 3751.05) {
            return salarioBase * 0.15;

        } else if (salarioBase <= 4664.68) {
            return salarioBase * 0.225;

        }else {
            return salarioBase * 0.275;
        }
    }
}
