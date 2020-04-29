package test5.sanzhar;

import java.util.ArrayList;

public class Project {
    String name;
    ProjectStatusType status = ProjectStatusType.DRAFT;
    int duration;
    int budget;
    ArrayList<Task> listOfTasks = new ArrayList();

    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }

    void setStatus(ProjectStatusType s) {
        status = s;
    }

    ProjectStatusType getStatus() {
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

    String getInfo() {
        String tasksList = "";
        for (Task t: listOfTasks) {
            tasksList = tasksList + "\n" + "Task name: " + t.getName() +  ";" + " " + "Task status: " + t.getStatus() + "; " +
                    "Description: " + t.getDescription() + ";";
        }
        return "Project name: " + name +  "; number of tasks: " + listOfTasks.size()
                + tasksList;

}

    void addTask(Task o) {
        listOfTasks.add(o);

        if (o.getBudget()>0) {
            o.setStatus(TaskStatusType.IN_PROCESS);
        } else {
            o.setStatus(TaskStatusType.WAITING_FOR_BUDGET);
        }

    }
}