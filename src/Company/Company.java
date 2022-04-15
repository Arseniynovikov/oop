package Company;

import Money.Bank_Account;
import Money.Contribution;
import Money.Credit;
import Money.Installment_Plan;
import User.Client;

import java.util.ArrayList;

public class Company {
    private String type;
    private String name;
    private String unp;
    private String adres;
    private String password;
    private String bik;
    private ArrayList<Bank_Account> accounts;
    private ArrayList<Credit> credits;
    private ArrayList<Installment_Plan> installment_plans;
    private ArrayList<Client> workers;
    private ArrayList<Contribution> contributions;
    private ArrayList<Salary_project> salary_projects;

    public Company(String type, String name, String unp, String bik,  String adres, String password) {
        this.type = type;
        this.name = name;
        this.unp = unp;
        this.adres = adres;
        this.password = password;

        this.bik = bik;
        accounts = new ArrayList<Bank_Account>();
        credits = new ArrayList<>();
        installment_plans = new ArrayList<>();
        workers = new ArrayList<>();
        contributions = new ArrayList<>();
        salary_projects = new ArrayList<>();
    }

    public Company() {
        accounts = new ArrayList<Bank_Account>();
        credits = new ArrayList<>();
        installment_plans = new ArrayList<>();
        workers = new ArrayList<>();
        contributions = new ArrayList<>();
        salary_projects = new ArrayList<>();
    }

    public String getType() { return type; }
    public String getName() { return name; }
    public String getUnp() { return unp; }
    public String getAdres() { return adres; }
    public void setType(String type) { this.type = type; }
    public void setName(String name) { this.name = name; }
    public void setUnp(String unp) { this.unp = unp; }
    public void setAdres(String adres) { this.adres = adres; }
    public void setPassword(String password){ this.password = password; }
    public String getPassword() {return password; }
    public String getBik() { return bik; }
    public void setBik(String bik) { this.bik = bik; }


    public ArrayList<Bank_Account> getAccounts() { return accounts; }
    public void setAccounts(ArrayList<Bank_Account> accounts) { this.accounts = accounts; }

    public void setCredits(ArrayList<Credit> credits) { this.credits = credits; }
    public ArrayList<Credit> getCredits() { return credits; }

    public void setInstallment_plans(ArrayList<Installment_Plan> installment_plans) { this.installment_plans = installment_plans; }
    public ArrayList<Installment_Plan> getInstallment_plans() { return installment_plans; }

    public void setWorkers(ArrayList<Client> workers) { this.workers = workers; }
    public ArrayList<Client> getWorkers() { return workers; }

    public ArrayList<Contribution> getContributions() {
        return contributions;
    }

    public ArrayList<Salary_project> getSalary_projects() {
        return salary_projects;
    }
}
