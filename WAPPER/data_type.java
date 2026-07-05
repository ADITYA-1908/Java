class data_type {
    static void print(Object r)

    {
        System.out.println(r.getClass().getName());
    }

    public static void main(String arg[]) {
        Integer x = new Integer(10);

        print(x);
        print(29);
        print(2.75);
        print(2f);
        print("ADI");
        print(true);
        print('A');

    }

}