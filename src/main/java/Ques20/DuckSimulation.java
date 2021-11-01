package Ques20;
interface QuackBehavior{
        void quack();
    }
    interface FlyBehavior{
        void fly();
    }

    // We are defining each behaviour separately
    class CantFly implements FlyBehavior{
        @Override
        public void fly() {
            System.out.println("I can't fly");
        }
    }
    class FlyFast implements FlyBehavior{
        @Override
        public void fly() {
            System.out.println("flying fastly");
        }
    }
    class FlySlow implements FlyBehavior{
        @Override
        public void fly() {
            System.out.println("flying slowly");
        }
    }
    class QuackLoud implements QuackBehavior{
        @Override
        public void quack() {
            System.out.println("quack loudly");
        }
    }
    class Squeak implements QuackBehavior{
        @Override
        public void quack() {
            System.out.println("squeaking....");
        }
    }
    class QuackMild implements QuackBehavior{
        @Override
        public void quack() {
            System.out.println("quacking mild.....");
        }
    }

    // It will represent the type of Duck
    enum DuckType{
        RUBBER, MALLARD, REDHEAD
    }

    //This is the super class of all types of duck classes
    abstract class Duck{
        FlyBehavior flyBehavior;
        QuackBehavior quackBehavior;
        Duck(){}
        void performFly() {
            this.flyBehavior.fly();
        }
        void performQuack() {
            this.quackBehavior.quack();
        }
        void showDetails(){
            System.out.println("I'm duck");
        }
    }
    class RubberDuck extends Duck{
        RubberDuck(){
            this.flyBehavior =new CantFly();
            this.quackBehavior =new Squeak();
        }

        @Override
        void showDetails() {
            System.out.println("I'm "+DuckType.RUBBER+" Duck");
        }
    }
    class MallardDuck extends Duck{
        MallardDuck()
        {
            this.flyBehavior = new FlyFast();
            this.quackBehavior = new QuackLoud();
        }
        @Override
        void showDetails() {
            System.out.println("I'm "+DuckType.MALLARD+" Duck");
        }
    }
    class ReadheadDuck extends Duck{
        ReadheadDuck()
        {
            this.flyBehavior = new FlySlow();
            this.quackBehavior =new QuackMild();
        }

        @Override
        void showDetails() {
            System.out.println("I'm "+DuckType.REDHEAD+" Duck");
        }
    }
    public class DuckSimulation {
        public static void main(String[] args) {
            Duck md=new MallardDuck();
            md.showDetails();
            md.performFly();
            md.performQuack();

            System.out.println("----------------------------");
            Duck rd=new RubberDuck();
            rd.showDetails();
            rd.performFly();
            rd.performQuack();

            System.out.println("-----------------------------");
            Duck readheadDuck=new ReadheadDuck();
            readheadDuck.showDetails();
            readheadDuck.performFly();
            readheadDuck.performQuack();
        }
    }
