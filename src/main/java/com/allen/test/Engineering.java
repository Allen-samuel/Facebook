package com.allen.test;

public class Engineering {
  public int sum(int x, int y) {
    return (x + y);

  }

  public void age_calculator(int current_date, int current_month,
      int current_year, int birth_date,
      int birth_month, int birth_year) {
    int month[] = { 31, 28, 31, 30, 31, 30, 31,
        31, 30, 31, 30, 31 };
    if (birth_date > current_date) {
      current_month = current_month - 1;
      current_date = current_date + month[birth_month - 1];

      if (birth_month > current_month) {
        current_year = current_year - 1;
        current_month = current_month + 12;

        int calculated_date = current_date - birth_date;
        int calculated_month = current_month - birth_month;
        int calculated_year = current_year - birth_year;

        System.out.println("Present Age");
        System.out.println("Years: " + calculated_year +
            " Months: " + calculated_month + " Days: " +
            calculated_date);
      }
    }
  }

  public static void main(String[] args) {
    Engineering e = new Engineering();
    // System.out.println(e.sum(5, 2));
    int current_date = 17;
    int current_month = 04;
    int current_year = 2022;

    int birth_date = 12;
    int birth_month = 03;
    int birth_year = 1988;

    e.age_calculator(current_date, current_month, current_year, birth_date, birth_month, birth_year);

  }

}
