public class TestaTrabalhador {
    public static void main(String[] args){
        Trabalhador trabalhador1 = new Trabalhador("teste", "um", 5.00);
        double salario1 = trabalhador1.getSalario();
        System.out.println(salario1);
        trabalhador1.setSalario((salario1 + (salario1 * 10 / 100)));
        System.out.println(trabalhador1.getSalario());
        System.out.println(trabalhador1.getSalrioAnual());

        Trabalhador trabalhador2 = new Trabalhador("teste", "dois", 200.00);
        double salario2 = trabalhador2.getSalario();

        System.out.println(salario2);
        trabalhador2.setSalario((salario2 + (salario2 * 10 / 100)));
        System.out.println(trabalhador2.getSalario());
        System.out.println(trabalhador2.getSalrioAnual());
    }
}
