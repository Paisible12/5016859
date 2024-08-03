class SinglyLinkedList {
    private Node head;

    // Add task 
    public void addTask(Task task) {
        Node newNode = new Node(task);
        newNode.next = head;
        head = newNode;
    }

    // Search 
    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.taskId == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null; 
    }

    // Traverse 
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete a task 
    public void deleteTask(int taskId) {
        Node current = head;
        Node previous = null;

        while (current != null && current.task.taskId != taskId) {
            previous = current;
            current = current.next;
        }

        if (current != null) { 
            if (previous != null) { 
                previous.next = current.next;
            } else { 
                head = current.next;
            }
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList taskList = new SinglyLinkedList();

        Task task1 = new Task(1, "Task 1", "Pending");
        Task task2 = new Task(2, "Task 2", "In Progress");
        Task task3 = new Task(3, "Task 3", "Completed");

        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);

        System.out.println("All tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearch for task with ID 2:");
        System.out.println(taskList.searchTask(2));

        System.out.println("\nDeleting task with ID 1:");
        taskList.deleteTask(1);
        taskList.traverseTasks();
    }
}

    
