package code._3_in_class.car;

public class Main {
    static class Human {
        Car car;
        public Human(Car car) {
            this.car = car;
        }
        void increaseSpeed() {
            car.increaseSpeed();
        }
    }
    static interface Car {
        void increaseSpeed();
    }
    static class GenericCar implements Car {
        Engine engine;
        public GenericCar(Engine engine) {
            this.engine = engine;
        }
        public void increaseSpeed() {
            engine.increaseSpeed();
        }
    }
    static interface Engine {
        void increaseSpeed();
    }
    static class GasCar implements Car {
        Engine engine = new TurboGasEngine();
        public void increaseSpeed() {
            engine.increaseSpeed();
        }
    }
    static class ElectricCar implements Car {
        Engine engine;
        public ElectricCar(Engine engine) {
            this.engine=engine;
        }
        public void increaseSpeed() {
            engine.increaseSpeed();
        }
    }

    static class ElectricEngine implements Engine {
        @Override
        public void increaseSpeed() {
            System.out.println("increase speed implementation for ElectricEngine");
        }
    }

    static class GasEngine implements Engine {
        @Override
        public void increaseSpeed() {
            System.out.println("increase speed implementation for GasEngine");
        }
    }
    static class TurboGasEngine implements Engine {
        @Override
        public void increaseSpeed() {
            System.out.println("increase speed implementation for TurboGasEngine");
        }
    }
    public static void main(String[]  args) {
        Human human01 = new Human(new GenericCar(new ElectricEngine()));//aici avem compozitie: obiectul parinte contine un alt obiect
        Human human02 = new Human(new GenericCar(new GasEngine()));
        Human human03 = new Human(new GenericCar(new TurboGasEngine()));
        human01.increaseSpeed();//aici avem delegare pentru ca metoda parinte apeleaza metoda cu acelasi nume dintr-un obiect cu care este compus
        human02.increaseSpeed();
        human03.increaseSpeed();
    }

}
