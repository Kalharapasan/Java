class One{

    void print_geek(){

        System.out.println("Geeks");

    }
}

class Two extends One{
    void print_for(){ 
         System.out.println("For");

    }

}

class Driver extends Two{

    
    public static void main(String [] args){

        Driver g = new Driver();
        g.print_geek();
        g.print_for();
        g.print_geek();

    }
}