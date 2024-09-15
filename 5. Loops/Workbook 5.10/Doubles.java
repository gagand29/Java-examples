public class Doubles {
    public static void main(String[] args) {
       
        int dice1 = rollDice();
        int dice2= rollDice();

        System.out.println("dice1: " + dice1);
        System.out.println("dice2: " + dice2);

        while(dice1 != dice2){
            dice1 = rollDice();
            dice1 = rollDice();
            System.out.println("dice1: " + dice1);
        System.out.println("dice2: " + dice2);
        }
        System.out.println("you rolled doubles");


    }

    public static int rollDice(){
        double randomNumber = Math.random()*6;
        randomNumber = randomNumber + 1;
        return (int) randomNumber;
    }

}





