class Wolf extends Animal {

    // jika kita tidak override method yang abstract, maka error
    // karena method ini merupakan method abstract di parent class
    @Override
    public void makeNoise() {
        System.out.println("Awooooo");
    }
}
