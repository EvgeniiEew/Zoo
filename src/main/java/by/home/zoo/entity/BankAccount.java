package by.home.zoo.entity;

import javax.persistence.*;

@Entity
@Table(name = "bank_account")
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "money")
    public long money;

    public BankAccount() {
    }

    public BankAccount(long money) {
        this.money = money;
    }

    public long getMoney(long get) {
        if (this.money >= get) {
            this.money = this.money - get;
            return get;
        } else {
            long a = this.money;
            this.money = 0;
            return a;
        }
    }

    public void addMoney(long add) {
        this.money = this.money + add;
    }
}

