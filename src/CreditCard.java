public class CreditCard {
    //private fields from UML
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newMorrisClient, Money limit) {
        owner = newMorrisClient;
        balance = new Money(0);
        creditLimit = new Money(limit);
    }

    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        Money tempGuap = new Money(balance.add(amount));
        if (tempGuap.compareTo(creditLimit) > 0) {
            System.out.println("Exceeds credit limit");
        } else {
            balance = tempGuap;
            System.out.println("Charge: " + amount);
        }
    }

    public void $payment$(Money amount) {
        Money tempMoney = new Money(balance.subtract(amount));
    }
}


