package BasicOperations.List.ToDoList;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    //Attribute
    private List<Task> toDoList;

    //Constructor
    public ToDoList() {
        this.toDoList = new ArrayList<>();
    }

    //Add a new task into the list with the description provided by user
    public void addTask(String description){
        toDoList.add(new Task(description));
    }

    //Remove all the tasks into the list that the original description is equal of the description provided by user
    public void delTask(String description){
        List<Task> removeTasks = new ArrayList<>();
        for(Task t : toDoList){
            if(t.getDescription().equalsIgnoreCase(description)){
                removeTasks.add(t);
            }
        }
        toDoList.removeAll(removeTasks);
    }

    //Return quantity os tasks in the list
    public int getTasksQuantity(){
       return toDoList.size();
    }

    //Print the description of all the tasks in the list
    public void printTasksDescription(){
        System.out.println(toDoList);
    }

}
