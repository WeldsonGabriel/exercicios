package hardMode;
import java.util.*;

public class HashMapStudentGrades07 {
    public static void main(String[] args) {
        // Objective: Store and retrieve values from a map.
        //	Create a HashMap<String, Double> for student names and their grades
        //	Add 5 students
        //	Print all entries
        Map<String, Double> studentGrades = new HashMap<>(); // Cria um HashMap para armazenar nomes de alunos e suas notas
        // Adiciona 5 alunos com suas respectivas notas
        studentGrades.put("Alice", 85.5); // Adiciona Alice com nota 85.5
        studentGrades.put("Bob", 92.0); // Adiciona Bob com nota 92.0
        studentGrades.put("Charlie", 78.0); // Adiciona Charlie com nota 78.0
        studentGrades.put("Diana", 88.5); // Adiciona Diana com nota 88.5
        studentGrades.put("Ethan", 95.0); // Adiciona Ethan com nota 95.0
        System.out.println("Student Grades:"); // Exibe o título da tabela de notas dos alunos
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) { // Itera sobre as entradas do HashMap
            System.out.println(entry.getKey() + ": " + entry.getValue()); // Imprime o nome do aluno e sua nota
        }
        // Exemplo de como acessar a nota de um aluno específico
        String studentName = "Charlie"; // Nome do aluno a ser consultado
        if (studentGrades.containsKey(studentName)) { // Verifica se o aluno existe no HashMap
            Double grade = studentGrades.get(studentName); // Obtém a nota do aluno
            System.out.println("Grade of " + studentName + ": " + grade); // Imprime a nota do aluno
        } else {
            System.out.println(studentName + " not found in the records."); // Mensagem caso o aluno não seja encontrado
        }
        System.out.println("End of the program."); // Mensagem de fim de programa
    }
}
