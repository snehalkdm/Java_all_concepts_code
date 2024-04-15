public class EncapsulationEx {
    public static void main(String args[]) {

        EncapsulationGetterSetterEx encapsulationGetterSetterEx = new EncapsulationGetterSetterEx();
        encapsulationGetterSetterEx.setRoll_no(5);
        encapsulationGetterSetterEx.setName("Snehal");
        encapsulationGetterSetterEx.setEmail("snehal.kadam@snehal.com");

        System.out.println("My Roll Number is: " + encapsulationGetterSetterEx.getRoll_no() + ", Name is " + encapsulationGetterSetterEx.getName() + " & email is: " + encapsulationGetterSetterEx.getEmail());
    }
}