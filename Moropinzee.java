package Game;
import java.io.Console;
import java.util.Scanner;

public class Moropinzee
{
    
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        
        String foolNames[]={"Monkey", "Robot","Pirate", "Ninja","Zombie"};
        String playAgain="";
        boolean player=true;
        boolean preselectionPlayer=false;
        int validChoice=0;
        String assigned=null;
        String preSelection="";
        int numberToEnter=0;
        boolean running=true;
        boolean invalidChoice=false;
        
        while(running)
        {
            try
            {
                if(player==true)
                {
                    if(validChoice>0||invalidChoice==false)
                    {
                        System.out.println("Player 1 enter a number 1-5 for Monkey, Robot, Pirate, Ninja, or Zombie:");
                    }
                    numberToEnter=input.nextInt();
                    player=false;
                }
                else
                {
                    if(invalidChoice==false)
                    {
                        System.out.println("Player 2 enter a number 1-5 for Monkey, Robot, Pirate, Ninja, or Zombie:");
                    }
                    
                    numberToEnter=input.nextInt();
                    player=true;
                    
                }
                
                
            }
            catch(Exception e)
            {
                //System.out.println("Please donot enter anything other than numbers from 1-5");
                invalidChoice=true;
                numberToEnter=0;
                player=(player?false:true);
                input= new Scanner(System.in);
            }
            
            
            switch(numberToEnter)
            {
                case 1:
                    assigned=foolNames[0];
                    invalidChoice=false;
                    break;
                case 2:
                    assigned=foolNames[1];
                    invalidChoice=false;
                    break;
                case 3:
                    assigned=foolNames[2];
                    invalidChoice=false;
                    break;
                case 4:
                    assigned=foolNames[3];
                    invalidChoice=false;
                    break;
                    
                case 5:
                    assigned=foolNames[4];
                    invalidChoice=false;
                    
                    break;
                default	:
                    player=(player?false:true);
                    System.out.println("Invalid choice,"+(player?"Player1":"Player2")+". Enter a number 1-5:");
                    invalidChoice=true;
            }
            
            if(!invalidChoice)
            {
                validChoice++;
            }
            
            if(validChoice==1)
            {
                preSelection=assigned;
                preselectionPlayer=player;
            }
            
            if(validChoice==2)
            {
                //Monkey fools Ninja
                if(preSelection.trim().equals(foolNames[0])&&assigned.trim().equals(foolNames[3]))
                {
                    System.out.println(preSelection+" fools "+assigned+":"+(!preselectionPlayer?"Player 1":"Player 2")+" wins!");
                }
                //Monkey unplusgs Robot
                else if(preSelection.trim().equals(foolNames[0])&&assigned.trim().equals(foolNames[1]))
                {
                    System.out.println(preSelection+" uplugs "+assigned+":"+(!preselectionPlayer?"Player 1":"Player 2")+" wins!");
                }
                //Robot chokes Ninja
                else if(preSelection.trim().equals(foolNames[1])&&assigned.trim().equals(foolNames[3]))
                {
                    System.out.println(preSelection+" chokes "+assigned+":"+(!preselectionPlayer?"Player 1":"Player 2")+" wins!");
                }
                //Robot crushes Zombie
                else if(preSelection.trim().equals(foolNames[1])&&assigned.trim().equals(foolNames[4]))
                {
                    System.out.println(preSelection+" crushes "+assigned+":"+(!preselectionPlayer?"Player 1":"Player 2")+" wins!");
                }
                //Pirate drowns robot
                else if(preSelection.trim().equals(foolNames[2])&&assigned.trim().equals(foolNames[1]))
                {
                    System.out.println(preSelection+" drowns "+assigned+":"+(!preselectionPlayer?"Player 1":"Player 2")+" wins!");
                }
                //Pirate skewers Monkey
                else if(preSelection.trim().equals(foolNames[2])&&assigned.trim().equals(foolNames[0]))
                {
                    System.out.println(preSelection+" skewers "+assigned+":"+(!preselectionPlayer?"Player 1":"Player 2")+" wins!");
                }
                //Ninja karate chops Pirate
                else if(preSelection.trim().equals(foolNames[3])&&assigned.trim().equals(foolNames[2]))
                {
                    System.out.println(preSelection+" karate chops "+assigned+":"+(!preselectionPlayer?"Player 1":"Player 2")+" wins!");
                }
                //Ninja decapitates Zombie
                else if(preSelection.trim().equals(foolNames[3])&&assigned.trim().equals(foolNames[4]))
                {
                    System.out.println(preSelection+" decapitates "+assigned+":"+(!preselectionPlayer?"Player 1":"Player 2")+" wins!");
                }
                //Zombie eats Pirate
                else if(preSelection.trim().equals(foolNames[4])&&assigned.trim().equals(foolNames[2]))
                {
                    System.out.println(preSelection+" eats "+assigned+":"+(!preselectionPlayer?"Player 1":"Player 2")+" wins!");
                }
                //Zombie savages Monkey
                else if(preSelection.trim().equals(foolNames[4])&&assigned.trim().equals(foolNames[0]))
                {
                    System.out.println(preSelection+" savages "+assigned+":"+(!preselectionPlayer?"Player 1":"Player 2")+" wins!");
                }
                else if(preSelection.trim().equals(foolNames[2])&&assigned.trim().equals(foolNames[0]))
                {
                    System.out.println("Nobody wins");
                }
                
                
                
                
                validChoice=0;
                player=true;
                assigned=null;
                
                System.out.println("Do you want to play the game again YES/yes/y/Y or NO/no/n/N");
                
                playAgain=input.next();
                
                if(playAgain.trim().toLowerCase().equals("yes")||playAgain.trim().toLowerCase().equals("y"))
                {
                    
                }
                else if(playAgain.trim().toLowerCase().equals("no")||playAgain.trim().toLowerCase().equals("n"))
                {
                    running=false;
                }
                else
                {
                    running=false;
                }
                
                
            }
            
            
            
        }
        
    }
    
}
