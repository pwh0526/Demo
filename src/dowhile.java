class dowhile {
    public static void main(String[] args) {
        int x = 1;
        int count = 0;
        while (x <= 100) {
            if (x % 6 ==0)
                count++;
                x++;

        }
        System.out.println(count);
    }
}
