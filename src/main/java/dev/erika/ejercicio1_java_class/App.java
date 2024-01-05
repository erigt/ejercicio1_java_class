package dev.erika.ejercicio1_java_class;

public final class App {
    private App() {
    }


    public static void main(String[] args) {
        
        Person mari = new Person("Mari", "Limones", "01234567R", 1960, "Spain", 'M');
        Person yoli = new Person("Yoli", "Naranjas", "89012345Y", 1980, "Norway", 'M');
        

        mari.printAll();
        yoli.printAll();
    }
}

