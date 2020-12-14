public class Task {
    private String description;
    private String dueDate;
    private boolean done;
    private int priority;

    public Task() {
        this.description = "Untitled Task";
        this.dueDate = "1/1/99";
        this.done = false;
        this.priority = 3;
    }

    public Task(String description, String dueDate, boolean done, int priority) {
        this.description = description;
        this.dueDate = dueDate;
        this.done = done;
        this.priority = priority;
    }

    public String toString(){
        return "[Task Description: " + description + "\nDue Date: " + dueDate + "\nDone? " + done + "\nPriority: " + priority + "]\n";
    }
}


