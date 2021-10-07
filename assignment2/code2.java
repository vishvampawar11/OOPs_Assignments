import java.util.Scanner;

class Employee {
    Scanner sc = new Scanner(System.in);
    public String name;
    public String id;
    public String address;
    public String email;
    public String phoneNo;
    public float basicPay;
    public float grossSalary;
    public float netSalary;

    public void setData() {
        System.out.println("Enter employee name");
        name = sc.nextLine();
        System.out.println("Enter employee id");
        id = sc.nextLine();
        System.out.println("Enter employee address");
        address = sc.nextLine();
        System.out.println("Enter employee email");
        email = sc.nextLine();
        System.out.println("Enter employee phone no");
        phoneNo = sc.nextLine();
        System.out.println("Enter basic pay");
        basicPay = sc.nextFloat();
    }

    public void getData() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Phone No: " + phoneNo);
    }
}

class SalariedEmployee extends Employee {
    public void calcSalary() {
        float da = basicPay * 0.97f;
        float hra = basicPay * 0.1f;
        float pf = basicPay * 0.12f;
        float scf = basicPay * 0.01f;
        grossSalary = basicPay + da + hra;
        netSalary = grossSalary - pf - scf;
    }

    public void salarySlip() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.printf("Gross Salary: Rs. %.2f\n", grossSalary);
        System.out.printf("Net Salary: Rs. %.2f\n", netSalary);
        System.out.println("------------------------------------");
    }
}

class DailyWageEmployee extends Employee {
    public void salarySlip() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Daily wage: Rs. " + basicPay);
        System.out.println("------------------------------------");
    }
}

class Programmer extends SalariedEmployee {
}

class TeamLead extends SalariedEmployee {
}

class AssistantProjectManager extends SalariedEmployee {
}

class ProjectManager extends SalariedEmployee {
}

class Cleaner extends DailyWageEmployee {
}

public class inheritanceEx {

    public static void main(String[] args) {
        int np, ntl, napm, npm, nc;
        np = ntl = napm = npm = nc = 0;

        Programmer[] p = new Programmer[10];
        TeamLead[] t = new TeamLead[2];
        AssistantProjectManager[] apm = new AssistantProjectManager[3];
        ProjectManager[] pm = new ProjectManager[3];
        Cleaner[] c = new Cleaner[20];

        System.out.println("Press 1 to hire a Programmer");
        System.out.println("Press 2 to hire a Team Lead");
        System.out.println("Press 3 to hire a Assistant Project Manager");
        System.out.println("Press 4 to hire a Project Manager");
        System.out.println("Press 5 to view all progeammers");
        System.out.println("Press 6 to view all team leads");
        System.out.println("Press 7 to view all assistant project managers");
        System.out.println("Press 8 to view all projrct managers");
        System.out.println("Press 9 to hire a cleaner");
        System.out.println("Press 10 to view all cleaners");
        System.out.println("Press 0 to exit");

        int ch;

        Scanner s = new Scanner(System.in);
        while (true && s.hasNextInt()) {
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    p[np] = new Programmer();
                    p[np].setData();
                    p[np].calcSalary();
                    System.out.println("------------------------------------");
                    System.out.println("Salary Slip of Programmer no. " + (np + 1));
                    p[np].salarySlip();
                    np++;
                    break;

                case 2:
                    t[ntl] = new TeamLead();
                    t[ntl].setData();
                    t[ntl].calcSalary();
                    System.out.println("------------------------------------");
                    System.out.println("Salary Slip of Team Lead no. " + (ntl + 1));
                    t[ntl].salarySlip();
                    ntl++;
                    break;

                case 3:
                    apm[napm] = new AssistantProjectManager();
                    apm[napm].setData();
                    apm[napm].calcSalary();
                    System.out.println("------------------------------------");
                    System.out.println("Salary Slip of Assistant Project Manager no. " + (napm + 1));
                    apm[napm].salarySlip();
                    napm++;
                    break;

                case 4:
                    pm[npm] = new ProjectManager();
                    pm[npm].setData();
                    pm[npm].calcSalary();
                    System.out.println("------------------------------------");
                    System.out.println("Salary Slip of Project Manager no. " + (npm + 1));
                    pm[npm].salarySlip();
                    npm++;
                    break;

                case 5:
                    if (np == 0) {
                        System.out.println("No programmers hired");
                    } else {
                        System.out.println("PROGRAMMERS");
                        for (int i = 0; i < np; i++) {
                            p[i].getData();
                            System.out.println("***");
                        }
                    }
                    break;

                case 6:
                    if (ntl == 0) {
                        System.out.println("No team leads hired");
                    } else {
                        System.out.println("TEAM LEADS");
                        for (int i = 0; i < ntl; i++) {
                            t[i].getData();
                            System.out.println("***");
                        }
                    }
                    break;

                case 7:
                    if (napm == 0) {
                        System.out.println("No assistant project managers hired");
                    } else {
                        System.out.println("ASSISTANT PROJECT MANAGERS");
                        for (int i = 0; i < napm; i++) {
                            apm[i].getData();
                            System.out.println("***");
                        }
                    }
                    break;

                case 8:
                    if (npm == 0) {
                        System.out.println("No project managers hired");
                    } else {
                        System.out.println("PROJECT MANAGERS");
                        for (int i = 0; i < npm; i++) {
                            pm[i].getData();
                            System.out.println("***");
                        }
                    }
                    break;

                case 9:
                    c[nc] = new Cleaner();
                    c[nc].setData();
                    System.out.println("------------------------------------");
                    System.out.println("Salary Slip of Cleaner no. " + (nc + 1));
                    c[nc].salarySlip();
                    nc++;
                    break;

                case 10:
                    if (nc == 0) {
                        System.out.println("No cleaners hired");
                    } else {
                        System.out.println("Cleaners");
                        for (int i = 0; i < nc; i++) {
                            c[i].getData();
                            System.out.println("***");
                        }
                    }
                    break;

                case 0:
                    System.exit(0);

                default:
                    break;
            }
        }
        s.close();
    }
}
