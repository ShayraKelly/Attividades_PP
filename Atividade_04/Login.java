package Atividade_04;

import java.util.Random;

class Login {
    private static Login instancia;
    private String usuarioCorreto = "admin";
    private String senhaCorreta = "12345";

    private Login() {}

    public static Login getInstancia() {
        if (instancia == null) {
            instancia = new Login();
        }
        return instancia;
    }

    public boolean autenticar(String usuario, String senha, String captchaDigitado, String captchaGerado) {
        if (!captchaDigitado.equals(captchaGerado)) {
            System.out.println("Falha na verificação anti-bot. Código incorreto.");
            return false;
        }

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Login realizado com sucesso!");
            return true;
        } else {
            System.out.println("Usuário ou senha incorretos.");
            return false;
        }
    }

    public String gerarCaptcha() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*";
        StringBuilder captcha = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            captcha.append(caracteres.charAt(rand.nextInt(caracteres.length())));
        }
        return captcha.toString();
    }
}