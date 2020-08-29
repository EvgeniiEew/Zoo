package by.home.zoo.entity;

public class BankAccount {
    public long money;

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

