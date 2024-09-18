import java.io.*;

public class Main {

    static float getPrice(String prompt) throws IOException {
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader bs = new BufferedReader(sr);

        try {
            System.out.print(prompt);
            return Float.parseFloat(bs.readLine());
        } catch (Exception e) {
            return getPrice(prompt);
        }

    }

    static float[] getSeasonsPrices() throws IOException{
        String[] seasons = {"spring", "summer", "fall", "winter"};
        float[] prices = new float[4];
        for (int i = 0; i < 4; i++) {
            prices[i] = getPrice("Enter cost for " + seasons[i] + ": ");
        }

        return prices;
    }

    public static void main(String[] args) throws IOException {
        float[] costs = getSeasonsPrices();
        float total = 0;

        for (int i = 0; i < costs.length; i++) {
            total += costs[i];
        }

        System.out.println("Yearly cost " + "$" + total);

    }
}
