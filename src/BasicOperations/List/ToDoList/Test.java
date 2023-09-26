package BasicOperations.List.ToDoList;

public class Test {
    public static void main(String[]args){
        //initializing the list (calling the constructor)
        ToDoList todayTasks = new ToDoList();

        //testing if the list was initialized
        System.out.println("The quantity of tasks in the list is: " + todayTasks.getTasksQuantity());

        //adding tasks into the list
        todayTasks.addTask("Drink three cups of water during the morning");

        //testing if the task was added into the list
        System.out.println("The quantity of tasks in the list is: " + todayTasks.getTasksQuantity());

        //adding more tasks
        todayTasks.addTask("Eat Lunch at 12:00PM");
        todayTasks.addTask("Go to School");
        todayTasks.addTask("Study for the math exam");
        todayTasks.addTask("Take a shower before bed");
        todayTasks.addTask("Go to bed until 09:30PM");

        //testing if the tasks were added into the list
        System.out.println("The quantity of tasks in the list is: " + todayTasks.getTasksQuantity());

        //removing a task from the list
        todayTasks.delTask("Take a shower before bed");

        //testing if the task was removed from the list
        System.out.println("The quantity of tasks in the list is: " + todayTasks.getTasksQuantity());

        //printing the current To Do List
        todayTasks.printTasksDescription();

    }
}
