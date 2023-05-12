package Management;

import com.sun.xml.internal.ws.wsdl.writer.document.Part;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Management {
    Scanner sc = new Scanner(System.in);
    int choice, check, idx;

    public Parttime[] parttimes = new Parttime[2];
    public Fulltime[] fulltimes = new Fulltime[2];

    {
        parttimes[0] = new Parttime("Cường", "01231", new Date(15 / 10 / 1998), 20);
        parttimes[1] = new Parttime("Long", "01231", new Date(15 / 1996), 20);

        fulltimes[0] = new Fulltime("Tùng", "132515", new Date(15 / 10 / 1998), 1.5);
        fulltimes[1] = new Fulltime("Thoại", "4214231", new Date(15 / 1996), 1.7);
    }

    public void show() {
        System.out.println("Parttime:");
        for (Parttime p :
                parttimes) {
            System.out.println(p);
        }

        System.out.println("Fulltime:");
        for (Fulltime p :
                fulltimes) {
            System.out.println(p);
        }
    }

    public void add() {
        System.out.println("1. Parttime");
        System.out.println("2. Fulltime");
        choice = Integer.parseInt(sc.nextLine());
        if (choice == 1) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Phone: ");
            String phone = sc.nextLine();
            System.out.print("Hour worked: ");
            int hourWorked = Integer.parseInt(sc.nextLine());

            Parttime newParttime = new Parttime(name, phone, new Date(), hourWorked);
            Parttime[] parttimes2 = new Parttime[parttimes.length + 1];
            parttimes2[parttimes2.length - 1] = newParttime;
            for (int i = 0; i < parttimes.length; i++) {
                parttimes2[i] = parttimes[i];
            }

            parttimes = parttimes2;
        } else {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Phone: ");
            String phone = sc.nextLine();
            System.out.print("Factor Salary: ");
            double factorSalary = Float.parseFloat(sc.nextLine());

            Fulltime newFulltime = new Fulltime(name, phone, new Date(), factorSalary);
            Fulltime[] fulltimes2 = new Fulltime[fulltimes.length + 1];
            fulltimes2[fulltimes2.length - 1] = newFulltime;
            for (int i = 0; i < fulltimes.length; i++) {
                fulltimes2[i] = fulltimes[i];
            }

            fulltimes = fulltimes2;
        }
    }

    public void cal() {
        choice();
        if (check == 1) {
            System.out.println("Salary = " + parttimes[idx].salary());
        } else if (check == 2) {
            System.out.println("Salary = " + fulltimes[idx].salary());
        }

    }

    public void del() {
        choice();
        if (check == 1) {
            Parttime[] parttimes2 = new Parttime[parttimes.length - 1];
            for (int i = 0; i < parttimes2.length; i++) {
                if (i < idx)
                    parttimes2[i] = parttimes[i];
                else
                    parttimes2[i] = parttimes[i + 1];
            }
            parttimes = parttimes2;
        } else if (check == 2) {
            Fulltime[] fulltimes2 = new Fulltime[fulltimes.length - 1];
            for (int i = 0; i < fulltimes2.length; i++) {
                if (i < idx)
                    fulltimes2[i] = fulltimes[i];
                else
                    fulltimes2[i] = fulltimes[i + 1];
            }
            fulltimes = fulltimes2;
        }
    }

    public void choice() {
        System.out.print("Input ID: ");
        choice = Integer.parseInt(sc.nextLine());
        // check in parrtime=1 or fulltime=2
        check = 0;
        idx = 0;
        for (int i = 0; i < parttimes.length; i++) {
            if (parttimes[i].getId() == choice) {
                check = 1;
                idx = i;
                break;
            }
        }

        for (int i = 0; i < fulltimes.length; i++) {
            if (fulltimes[i].getId() == choice) {
                check = 2;
                idx = i;
                break;
            }
        }
    }
}
