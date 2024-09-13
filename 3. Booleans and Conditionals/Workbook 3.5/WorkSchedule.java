public class WorkSchedule {
    public static void main(String[] args) {
        int day = 6;   
        boolean holiday = true;
         
        if(holiday){
            System.out.println("woohoo, no work schedule");
        }
        else if (day==6 || day ==7) {
            System.out.println("it's the weekend, no work");
        }
        else{
            System.out.println("wake up at 7:00 !! start work");
        }
        
        
        }

    }
