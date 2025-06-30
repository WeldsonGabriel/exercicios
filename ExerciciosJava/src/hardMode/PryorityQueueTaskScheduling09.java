package hardMode;

public class PryorityQueueTaskScheduling09 {
    //Create a PriorityQueue <integer> to represent a task priorities.
    //Add tasks with varying priorities(lower value = higher priority).
    //Process task by removing and printing them in priority order.
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> taskPriorities = new java.util.PriorityQueue<>();

        // Add tasks with varying priorities
        taskPriorities.add(4);  // Valor menor = maior prioridade
        taskPriorities.add(1);
        taskPriorities.add(2);
        taskPriorities.add(3);
        taskPriorities.add(5);

        // Process tasks in priority order
        System.out.println("Processing tasks in priority order:");
        while (!taskPriorities.isEmpty()) {// !taskPriorities.isEmpty() verifica se a fila está vazia.
            System.out.println("Processing task with priority: " + taskPriorities.poll());// poll() remove e retorna o elemento de maior prioridade (menor valor) da fila.
        }
    }
}
//A lógica é a seguinte:
//As tarefas são adicionadas à PriorityQueue, que organiza automaticamente os elementos em ordem crescente (menor valor = maior prioridade).
//O laço while verifica se ainda há tarefas na fila.
//O método poll() remove e retorna o elemento de maior prioridade (menor valor) da fila.
//Cada tarefa removida é processada (impressa).
//O loop termina quando a fila está vazia.
//Assim, todas as tarefas são processadas em ordem de prioridade, e nenhuma é processada duas vezes, pois poll() remove da fila.