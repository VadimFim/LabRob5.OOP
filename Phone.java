abstract class Phone {
    protected int weight;
    protected String color;
    protected String name;
    protected double diagonal;
    protected double worktime;

    protected Phone(String name, int weight, String color, double diagonal, double worktime) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.diagonal = diagonal;
        this.worktime = worktime;
    }

    public Phone() {

    }

    protected abstract void info();

    protected abstract void recursiveMethod();

    protected void worktimeInfo(double usageTime) {
        System.out.println("Час використання смартфону: " + usageTime);
    }
    protected void processAnotherInstance(Phone anotherPhone) {
        // Логіка обробки іншого екземпляра
    }

    protected Phone createCopy(int newWeight, String newColor, double newDiagonal, double newWorktime, double v) {
        return new Phone(name, newWeight, newColor, newDiagonal, newWorktime) {
            @Override
            protected void info() {
                System.out.println("Назва моделі: " + name + "; Вага моделі: " + weight + "г" + "; Колір моделі: " + color + "; Діагональ екрану: " + diagonal + " дюймів" + "; Час використання: " + worktime + " годин" + ";");
            }

            @Override
            protected void specialMethod(int value) {
                System.out.println("Час на вітрині: " + value + "год.");
            }

            @Override
            protected void recursiveMethod() {

            }
        };
    }

    protected double recursiveMethod(int iterations) {
        if (iterations > 0) {
            System.out.println("Кількість проданих моделей: " + iterations);
            recursiveMethod(iterations - 1);
        }
        return 0;
    }

    protected void executeInfo() {
        info();
    }

    protected void executeWorktimeInfo(double usageTime) {
        worktimeInfo(usageTime);
    }

    protected void executeSpecialMethod(int value) {
    }

    protected void executeProcessAnotherInstance(Phone anotherPhone) {
        processAnotherInstance(anotherPhone);
    }

    protected Phone executeCreateCopy(int newWeight, String newColor, double newDiagonal, double newWorktime) {
        return createCopy(newWeight, newColor, newDiagonal, newWorktime, 6.5);
    }

    protected double executeRecursiveMethod(int iterations) {
        return recursiveMethod(iterations);
    }

    protected int getWeight() {
        return weight;
    }

    protected void setWeight(int weight) {
        this.weight = weight;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected double getDiagonal() {
        return diagonal;
    }

    protected void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    protected double getWorktime() {
        return worktime;
    }

    protected void setWorktime(double worktime) {
        this.worktime = worktime;
    }

    protected abstract void specialMethod(int value);
}
