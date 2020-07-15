package by.home.zoo.models.utils;

public class SafeMoney {
    public long money;

    public SafeMoney(long money) {
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

