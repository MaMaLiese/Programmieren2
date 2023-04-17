public class TodoListenVerwaltung {
    private Task[] tasks;
    private int belegt = 0;

    public TodoListenVerwaltung(int anzahl) {
        this.tasks = new Task[anzahl];
    }
    public void addTask(String title) {
        // tasks[belegt]=new Task(new Random().nextInt(), title, )
        tasks[belegt] = new Task(belegt, title);
        belegt++;
    }
    public Task getTask(int id){

    }

    public void markTaskComplete(int id){
        for (int i = 0; i < tasks.length; i++) {

        }
        public void deleteTask(int id){
            for (int i = 0; i < tasks.length; i++) {
                if (tasks[i] != null) {
                    if (tasks)

                        break;
                }
            }
            }
        }
        public void displayTasks(){
            System.out.println("ID\tTitle\t\tStatus");
            for (int i = 0; i < tasks.length; i++) {
                if(tasks[i])

            }
    }
}
