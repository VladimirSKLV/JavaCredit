public class Credit {
    public int calculate (int creditAmount, int years, float interestRate){
        float i = interestRate/100/12;
        // Хотя в интернете немного другая формула, но методом подбора формула ниже дает результаты согласно дз
        return (int) (creditAmount * (i + i/(Math.pow(1 + i, 12 * years)-1)));
    }
}
