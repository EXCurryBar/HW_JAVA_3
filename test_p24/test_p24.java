package test_p24;

class test_p24 {
    public static void main(String[] args) {
        try {
            int[] test = new int[5];
            System.out.println("將值指定給test[10]");

            test[10] = 80;
            System.out.println("將80指定給test[10]");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("超過陣列的範圍了");
        } finally {
            System.out.println("最後一定會執行這裡");
        }
        System.out.println("順利執行完畢");
    }
}