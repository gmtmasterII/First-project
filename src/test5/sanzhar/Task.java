package test5.sanzhar;

public class Task {
    String name;
    TaskStatusType status = TaskStatusType.DRAFT;
    int duration;
    int budget;
    String description;

    void setName(String n) {
        name = n;
    }
    String getName() {
        return name;
    }

    void setStatus(TaskStatusType s) {
        status = s;
    }
    Enum getStatus(){
        return status;
    }

    void setDuration(int d) {
        duration = d;
    }
    int getDuration() {
        return duration;
    }

    void setBudget(int b) {
        budget = b;
    }
    int getBudget() {
        return budget;
    }

    void setDescription(String i){
        description = i;
    }

    String getDescription(){
        return description;
    }

}
