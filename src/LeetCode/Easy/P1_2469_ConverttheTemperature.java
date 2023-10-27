                                              /* 2469. Convert the Temperature */
/*You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].
Return the array ans. Answers within 10-5 of the actual answer will be accepted.

Note that:
Kelvin = Celsius + 273.15
Fahrenheit = Celsius * 1.80 + 32.00 */

package LeetCode.Easy;

public class P1_2469_ConverttheTemperature {
    public static double[] convertTemperature(double celsius) {
            //Convert Celsius to Kelvin
            double kelvin = celsius + 273.15;
            //Convert Celsius to Fahrenheit
            double fahrenheit = celsius * 1.80 + 32.00;

            //Create and populate the ans array
            double[] ans = {kelvin, fahrenheit};

            //Return the ans array
            return ans;
        }

        public static void main(String[] args) {
            double celsius = 25.0;
            double[] result = convertTemperature(celsius);

            // Print the result
            System.out.println("Temperature in Kelvin: " + result[0]);
            System.out.println("Temperature in Fahrenheit: " + result[1]);
    }
}
