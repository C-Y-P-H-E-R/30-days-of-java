class Result {
   // class names start with capital letters and datatypes names start with smaller letters
   // roundoff function: Math.round()
  
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        
        double tip_cost = (double)tip_percent / 100;
        double tax_cost = (double)tax_percent / 100;
        long total_cost = Math.round((meal_cost + meal_cost * tax_cost + meal_cost * tip_cost));
        
        System.out.print(total_cost);
    }

}
