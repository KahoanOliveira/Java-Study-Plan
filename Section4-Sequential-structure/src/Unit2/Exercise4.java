package Unit2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Coloque o horário de inicio da partida: ");
        int horaioInicio = scan.nextInt();

        System.out.print("Coloque o horário final da partida: ");
        int horaioFim = scan.nextInt();

        int duracao;
        if (horaioInicio < horaioFim){
            duracao = horaioFim - horaioInicio;
        }else{
            duracao = 24 - horaioInicio - horaioFim;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");

        scan.close();
    }
}
