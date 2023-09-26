package BasicOperations.List;

public class Task {

    //attribute
    private String description;

    //constructor
    public Task(String description){
        this.description = description;
    }

    //getter and setter
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description){
        this.description=description;
    }

    @Override
    public String toString() {
        return description;
    }
}
