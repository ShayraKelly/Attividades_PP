package Atividade_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = Login.getInstancia();

        System.out.print("Digite o usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        String captchaGerado = login.gerarCaptcha();
        System.out.println("Digite o código de verificação: " + captchaGerado);
        System.out.print("Código: ");
        String captchaDigitado = scanner.nextLine();

        login.autenticar(usuario, senha, captchaDigitado, captchaGerado);
        scanner.close();
    }
}