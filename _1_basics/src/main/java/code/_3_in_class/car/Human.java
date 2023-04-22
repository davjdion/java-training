package code._3_in_class.car;
//compozitie:   1.declar variabila
//                2. compun prin constructor
//                3 apelez intr-o metoda specifica si deleg apelul catre metioda tinga/target

//delegare:     1.doar adaug extend Class

//CONCLUZIE: usurinta in utilizarea MOSTENIRII - usurinta in utilizarea compozitiei si delegarii

    class Human extends Main.GenericCar {
        public Human(Main.Engine engine) {
            super(engine);
        }
}
