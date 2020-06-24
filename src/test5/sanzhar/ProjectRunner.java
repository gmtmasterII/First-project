package test5.sanzhar;

public class ProjectRunner {
    public static void main (String[] args) {
        Project coda = new Project();
        coda.setName("Coda");
        coda.setBudget(100000);
        coda.setDuration(365);

        Task taskObj = new Task();
        taskObj.setName("Add button");
        taskObj.setBudget(10000);
        taskObj.setDuration(3);
        taskObj.setDescription("Red BUY button");

        Task taskObj1 = new Task();
        taskObj1.setName("change color of main page");
        taskObj1.setBudget(25000);
        taskObj1.setDuration(5);
        taskObj1.setDescription("White background");

        Task taskObj2 = new Task();
        taskObj2.setName("change icon");
        taskObj2.setBudget(0);
        taskObj2.setDuration(2);
        taskObj2.setDescription(".ico format is required");

        coda.addTask(taskObj);
        coda.addTask(taskObj1);
        coda.addTask(taskObj2);

        System.out.println(coda.getInfo());
     }

    }

