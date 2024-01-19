package ca.quickheaven.designpattern.behavioral.template;

public class Chess extends Game {

    @Override
    void initialize() {
        System.out.println("Chess Game Initialized! Start Playing");
    }

    @Override
    void start() {
        System.out.println("Game Started. Welcome to in the Chess game!");
    }

    @Override
    void end() {
        System.out.println("Game Finished");
    }
}
