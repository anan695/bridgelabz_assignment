//Smart device control interface

// interface SmartDevice {
//     void turnOn();
//     void turnOff();
// }
// class Light implements SmartDevice {
//     public void turnOn() {
//         System.out.println("Light is ON");
//     }
//     public void turnOff() {
//         System.out.println("Light is OFF");
//     }
// }



// //Multi vehiche rental system
// class AirConditioner implements SmartDevice {
//     public void turnOn() {
//         System.out.println("AC is ON");
//     }
//     public void turnOff() {
//         System.out.println("AC is OFF");
//     }
// }


//Digital payment interface
// class Television implements SmartDevice {
//     public void turnOn() {
//         System.out.println("TV is ON");
//     }
//     public void turnOff() {
//         System.out.println("TV is OFF");
//     }
// }



//Tempertaute Alert System
// import java.util.function.Predicate;

// public class inerface {
//     public static void main(String[] args) {
//         double threshold = 40.0;

//         Predicate<Double> isHighTemp = temp -> temp > threshold;

//         double currentTemp = 42.5;
//         if (isHighTemp.test(currentTemp)) {
//             System.out.println(" Alert: Temperature too high!");
//         } else {
//             System.out.println("Temperature is normal.");
//         }
//     }
// }

//String length checker
// import java.util.function.Function;

// public class inerface {
//     public static void main(String[] args) {
//         int maxLength = 100;

//         Function<String, Integer> getLength = msg -> msg.length();

//         String message = "This is a sample message that might be too long depending on the limit.";
//         int length = getLength.apply(message);

//         if (length > maxLength) {
//             System.out.println("Message too long: " + length + " characters.");
//         } else {
//             System.out.println("Message length is fine: " + length + " characters.");
//         }
//     }
// }


//Background job execution
// public class inerface{
//     public static void main(String[] args) {
//         Runnable job = () -> {
//             System.out.println("Background job running...");
//             // Simulate task
//             try {
//                 Thread.sleep(2000); // 2 sec delay
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//             System.out.println("Job completed.");
//         };

//         Thread thread = new Thread(job);
//         thread.start();
//     }
// }



// password length validator
// public interface inerface {
//     static boolean isStrongPassword(String password) {
//         return password.length() >= 8 &&
//                password.matches(".*[A-Z].*") &&
//                password.matches(".*[a-z].*") &&
//                password.matches(".*\\d.*") &&
//                password.matches(".*[!@#$%^&*()].*");
//     }
// }
// public class validator{
//     public static void main(String[] args) {
//         String password = "Secure@123";
//         if (inerface.isStrongPassword(password)) {
//             System.out.println(" Strong password!");
//         } else {
//             System.out.println(" Weak password. Please follow policy.");
//         }
//     }
// }


//util conversion tool
// public interface UnitConverter {
//     static double kmToMiles(double km) {
//         return km * 0.621371;
//     }

//     static double kgToLbs(double kg) {
//         return kg * 2.20462;
//     }
// }
// public class inerface {
//     public static void main(String[] args) {
//         double distanceKm = 10.0;
//         double weightKg = 5.0;

//         System.out.println("Distance in miles: " + UnitConverter.kmToMiles(distanceKm));
//         System.out.println("Weight in lbs: " + UnitConverter.kgToLbs(weightKg));
//     }
// }


//data format utility

// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;

// public interface DateFormatter {
//     static String formatDate(LocalDate date, String pattern) {
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
//         return date.format(formatter);
//     }
// }
// public class inerface {
//     public static void main(String[] args) {
//         LocalDate today = LocalDate.now();

//         System.out.println("🧾 Format 1: " + DateFormatter.formatDate(today, "dd-MM-yyyy"));
//         System.out.println("🧾 Format 2: " + DateFormatter.formatDate(today, "MMMM dd, yyyy"));
//         System.out.println("🧾 Format 3: " + DateFormatter.formatDate(today, "yyyy/MM/dd"));
//     }
// }



//payment gateway integration
// public interface inerface {
//     void processPayment(double amount);

//     default void refund(double amount) {
//         System.out.println("Refund not supported by this provider.");
//     }
// }

//data export feature
// public interface inerface {
//     void exportToCSV(String data);
//     void exportToPDF(String data);

//     default void exportToJSON(String data) {
//         System.out.println("JSON export not supported yet.");
//     }
// }


//smart vehichle dashboard
// public interface inerface {
//     void displaySpeed();

//     default void displayBatteryStatus() {
//         System.out.println("Battery status not available.");
//     }
// }


//data serialization for backup
// import java.io.Serializable;

// public class inerface implements Serializable {
//     private String name;
//     private int age;

    
// }


//cloning prototype object
// public class inerface implements Cloneable {
//     private String name;
//     private double price;

//     public inerface(String name, double price) {
//         this.name = name;
//         this.price = price;
//     }

//     public inerface clone() throws CloneNotSupportedException {
//         return (inerface) super.clone();
//     }
// }


//Sensitive data tagging
// public class inerface {
//     public static void encryptIfSensitive(Object obj) {
//         if (obj instanceof inerface) {
//             System.out.println("Encrypting sensitive data...");
//             // encryption logic here
//         } else {
//             System.out.println(" encryption needed.");
//         }
//     }
// }







