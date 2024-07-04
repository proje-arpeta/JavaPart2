public class ClassMethods {
        // Public yöntem
        public int add(int a, int b) {
            return a + b;
        }
        // Static yöntem
        public static int multiply(int a, int b) {
            return a * b;
        }

        public static void main(String[] args) {
            ClassMethods calc = new ClassMethods();
            int result = calc.add(5, 3);
            int result2 = ClassMethods.multiply(5, 3);
            System.out.println("Toplam: " + result); // Çıktı: Toplam: 8
    }
}
