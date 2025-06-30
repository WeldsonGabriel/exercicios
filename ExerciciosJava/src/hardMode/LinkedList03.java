package hardMode;

public class LinkedList03 {
    public static void main(String[] args) {
        //  Objective: Use LinkedList to simulate queue behavior.
        //  Task:
        //	Enqueue (addLast) five customers to a queue
        //	Serve (removeFirst) them one by one
        //	Print the queue at each step

        java.util.LinkedList<String> queue = new java.util.LinkedList<>();//cria uma fila
        // Enqueue five customers
        queue.addLast("Customer 1");// adiciona o cliente na fila
        queue.addLast("Customer 2");
        queue.addLast("Customer 3");
        queue.addLast("Customer 4");
        queue.addLast("Customer 5");
        System.out.println("Queue after enqueuing: " + queue); // Exibe a fila após adicionar os clientes
        while (!queue.isEmpty()) {// Enquanto a fila não estiver vazia
            String servedCustomer = queue.removeFirst();// Remove o primeiro cliente da fila
            System.out.println("Served: " + servedCustomer);// Exibe o cliente que foi atendido
            System.out.println("Queue after serving: " + queue);// Exibe a fila após atender o cliente
        }
        System.out.println("Final state of the queue: " + queue);// Exibe o estado final da fila
        if (queue.isEmpty()) {
            System.out.println("The queue is now empty.");// Verifica se a fila está vazia
        } else {
            System.out.println("There are still customers in the queue: " + queue);// Exibe os clientes restantes na fila, se houver
        }
        System.out.println("End of the program."); // Exibe o fim do programa
    }
}
//LinkedList é eficiente para operações de inserção e remoção nas extremidades, ideal para simular filas.
//O uso de addLast e removeFirst garante a ordem correta de atendimento (FIFO).
//O loop permite visualizar o processo de atendimento passo a passo.

//Cria uma LinkedList de String chamada queue.
//Adiciona cinco clientes ao final da fila (addLast), simulando pessoas entrando na fila.
//Exibe o estado da fila após a entrada dos clientes.
//Enquanto a fila não estiver vazia, remove o primeiro cliente (removeFirst), imprime quem foi atendido e mostra o estado atual da fila.
//Ao final, verifica se a fila está vazia e imprime uma mensagem apropriada.