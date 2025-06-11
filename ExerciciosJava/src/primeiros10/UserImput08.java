package primeiros10;

public class UserImput08 {
    public static void main(String[] args) {
        // Read a Name From The user greet them
        java.util.Scanner scanner = new java.util.Scanner(System.in);// é necessario a utilização de uma lib/class para ler o input do usuário
        System.out.print("Enter your name: ");// sem o ln para está na mesma linha do imput.
        String name = scanner.nextLine();// lê a linha inteira do input do usuário.
        System.out.println("Hello, " + name + "!");// imprime o nome do usuário com uma saudação.


        /*Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        while (true) {
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            if (option == 1) {
                System.out.print("Digite a tarefa: ");
                String task = scanner.nextLine();
                tasks.add(task);
            } else if (option == 2) {
                System.out.println("Tarefas:");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
            } else if (option == 3) {
                System.out.print("Digite o número da tarefa para remover: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                if (index > 0 && index <= tasks.size()) {
                    tasks.remove(index - 1);
                } else {
                    System.out.println("Número inválido.");
                }
            } else if (option == 4) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }*/

    }
}
