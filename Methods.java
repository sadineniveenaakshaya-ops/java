class Methods {

    static double calculateTotalWaste(double point1Waste, double point2Waste) {

        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {

        double point1Waste = 25.5;
        double point2Waste = 30.5;

        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);

        System.out.println("Total waste collected: " + totalWaste);
    }
}
