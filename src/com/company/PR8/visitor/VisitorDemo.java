package com.company.PR8.visitor;



public class VisitorDemo {

    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{new Wheel(20, "Bad wheel"),
                new Wheel(100, "Good wheel"), new Engine(10, 90, "Bad engine"),
                new Engine(12, 250, "Good engine")};

        int total = calculatePrice(items);
        System.out.println("Total Cost = " + total);
    }

    private static int calculatePrice(ItemElement[] items) {
        AutoPartsVisitorImpl visitor = new AutoPartsVisitorImpl();
        int sum = 0;
        for (ItemElement item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

}