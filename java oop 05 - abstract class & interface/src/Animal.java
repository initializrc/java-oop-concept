abstract class Animal {
    public void eat (String food){
        System.out.println("Eat " + food);
    }

    public void sleep(int hours){
        System.out.println("Sleep for " + hours + " hours");
    }

    abstract public void makeNoise();
}
