package Management;

import com.sun.xml.internal.ws.wsdl.writer.document.Part;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Management {
    Scanner sc = new Scanner(System.in);
    int choice, check, idx;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    public Parttime[] parttimes = new Parttime[2];
    public Fulltime[] fulltimes = new Fulltime[2];

    {
        try {
            parttimes[0] = new Parttime("Cường", "01231", formatter.parse("25/06/1998"), 20);
            parttimes[1] = new Parttime("Long", "01231", formatter.parse("29/01/1996"), 20);

            fulltimes[0] = new Fulltime("Tùng", "132515", formatter.parse("12/11/1993"), 1.5);
            fulltimes[1] = new Fulltime("Thoại", "4214231", formatter.parse("05/04/1992"), 1.7);
        } catch (Exception e) {
        }

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
            System.out.print("Birthday: ");
            String birthday = sc.nextLine();
            System.out.print("Hour worked: ");
            int hourWorked = Integer.parseInt(sc.nextLine());

            try {
                Parttime newParttime = new Parttime(name, phone, formatter.parse(birthday), hourWorked);
                Parttime[] parttimes2 = new Parttime[parttimes.length + 1];
                parttimes2[parttimes2.length - 1] = newParttime;
                for (int i = 0; i < parttimes.length; i++) {
                    parttimes2[i] = parttimes[i];
                }
                parttimes = parttimes2;
            } catch (Exception e) {
            }

        } else {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Phone: ");
            String phone = sc.nextLine();
            System.out.print("Birthday: ");
            String birthday = sc.nextLine();
            System.out.print("Factor Salary: ");
            double factorSalary = Float.parseFloat(sc.nextLine());

            try {
                Fulltime newFulltime = new Fulltime(name, phone, formatter.parse(birthday), factorSalary);
                Fulltime[] fulltimes2 = new Fulltime[fulltimes.length + 1];
                fulltimes2[fulltimes2.length - 1] = newFulltime;
                for (int i = 0; i < fulltimes.length; i++) {
                    fulltimes2[i] = fulltimes[i];
                }

                fulltimes = fulltimes2;
            } catch (Exception e) {
            }
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

    public void edit() {
        choice();
        if (check == 1) {
            System.out.print("New name: ");
            parttimes[idx].setName(sc.nextLine());
            System.out.print("New phone: ");
            parttimes[idx].setPhone(sc.nextLine());
            System.out.print("New birthday: ");
            try {
                parttimes[idx].setBirthday(formatter.parse(sc.nextLine()));
            } catch (Exception e) {
                parttimes[idx].setBirthday(new Date());
            }
            System.out.print("Hour worked: ");
            parttimes[idx].setHourWorked(Integer.parseInt(sc.nextLine()));
        } else if (check == 2) {
            fulltimes[idx].setName(sc.nextLine());
            System.out.print("New phone: ");
            fulltimes[idx].setPhone(sc.nextLine());
            System.out.print("New birthday: ");
            try {
                fulltimes[idx].setBirthday(formatter.parse(sc.nextLine()));
            } catch (Exception e) {
                fulltimes[idx].setBirthday(new Date());
            }
            System.out.print("Hour worked: ");
            fulltimes[idx].setFactorSalary(Integer.parseInt(sc.nextLine()));
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

    public void search() {
        System.out.print("Search Name: ");
        String name = sc.nextLine();
        boolean chk = false;
        for (Parttime p :
                parttimes) {
            if (p.getName().equals(name)) {
                System.out.println(p);
                chk = true;
            }
        }

        for (Fulltime p :
                fulltimes) {
            if (p.getName().equals(name)) {
                System.out.println(p);
                chk = true;
            }
        }

        if (!chk)
            System.out.println("Not found");
    }

    public void sort() {
        // parttime
        for (int i = 0; i < parttimes.length - 1; i++) {
            for (int j = i + 1; j < parttimes.length; j++) {
                if (parttimes[i].getBirthday().compareTo(parttimes[j].getBirthday()) == 1) {
                    Parttime p = parttimes[i];
                    parttimes[i] = parttimes[j];
                    parttimes[j] = p;
                }
            }
        }

        // fulltime
        for (int i = 0; i < fulltimes.length - 1; i++) {
            for (int j = i + 1; j < fulltimes.length; j++) {
                if (fulltimes[i].getBirthday().compareTo(fulltimes[j].getBirthday()) == 1) {
                    Fulltime p = fulltimes[i];
                    fulltimes[i] = fulltimes[j];
                    fulltimes[j] = p;
                }
            }
        }
    }
}
