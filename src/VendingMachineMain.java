public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String beverage = vm1.inputMoney(1000);
        System.out.println(beverage);

    }
}
