class hierarchy{
    public static void main(String args[]) {
        client client= new client();
        client.price(); // calls method of super class
        client.discount(); // calls method of sub class
    }
}class shopp{
    void price() {
        System.out.println("price= 20000");
    }
}

class client extends shopp {
    void discount() {
        System.out.println("discount=2500");
    }
}

