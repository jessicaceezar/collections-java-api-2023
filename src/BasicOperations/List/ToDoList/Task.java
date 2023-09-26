package BasicOperations.List.ToDoList;

public class Task {

    //Attribute
    private String description;

    //Constructor
    public Task(String description){
        this.description = description;
    }

    //Getter and Setter
    public String getDescription() {
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }

    //Overwriting toString() method
    @Override
    public String toString() {
        return description;
    }

}
