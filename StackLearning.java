package com.blz.datastructure;

import com.blz.datastructure.service.ServiceProvider.StackServiceProvider;
import com.blz.datastructure.service.StackService;
import com.blz.datastructure.utils.Inputs;

public class StackLearning {
    public static void main(String[] args) {
        menuCardExecution();
    }

    public static void menuCardExecution() {

        StackService callMethod = new StackServiceProvider();
        int choice = 0;
        do {
            choice = menuCard();
            switch (choice) {
                case 1:
                    System.out.println("Enter Elements for Push: " + callMethod.push());
                    break;
                case 2:
                    System.out.println("Enter Elements for Pop: " + callMethod.pop());
                    break;
                case 3:
                    System.out.println("Enter Elements for Push: " + callMethod.display());
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("select from Menu Card");
                    break;
            }
        } while (choice != 4);
    }
    public static int menuCard() {
        System.out.println("1.Push\t2.Pop\t3.display\t4.exit");
        System.out.println("Enter choice from Menu Card");
        return Inputs.getIntValue();
    }
}
