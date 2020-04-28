package task2_1;

public class Department {
    public int processTime;
    public Department[] departments;

    public Department(int processTime, Department[] departments) {
        this.processTime = processTime;
        this.departments = departments;
    }

    public int totalProcessTime(){
        int minProcessTime = 0;

        for(Department department : this.departments){
            int childProcessTime = department.totalProcessTime();
            if(minProcessTime < childProcessTime){
                minProcessTime = childProcessTime;
            }
        }
        return this.processTime + minProcessTime;
    }
}
