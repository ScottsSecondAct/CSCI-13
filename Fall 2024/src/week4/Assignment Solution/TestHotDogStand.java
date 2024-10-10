/**
 * MIT License
 *
 * Copyright (c) 2024 Scott Davis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
 
class TestHotDogStand {
  public static void main(String[] args) {
    HotDogStand stand1 = new HotDogStand(4915734, "Folsom");
    HotDogStand stand2 = new HotDogStand(19419194, "Rocklin");
    HotDogStand stand3 = new HotDogStand(63633236, "Auburn");

    // ordering hot dogs at different stand
    stand1.order(100);
    stand2.order(150);
    stand3.order(175);

    // getting the total number of the hotdogs ordered at all the stations
    int total = stand1.getCountSold() + stand2.getCountSold() +
        stand3.getCountSold();
    double totalIncome = stand1.netIncome() + stand2.netIncome() + stand3.netIncome();
    // displaying the info
    System.out.println(stand1);
    System.out.println("_______________________________________________");
    System.out.println(stand2);
    System.out.println("_______________________________________________");
    System.out.println(stand3);
    System.out.println("________________________________________________");
    System.out.println("Total hotdogs sold at all the stations: " + total);
    System.out.println("________________________________________________");
    System.out.println("Total income: " + totalIncome);
  }
}