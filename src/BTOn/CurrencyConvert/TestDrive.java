package BTOn.CurrencyConvert;

public class TestDrive {
    public static void main(String[] args) {
        CurrencyMeasure usd = new CurrencyMeasure(1000, new USDCurrencyUnit());
        CurrencyMeasure vnd = new CurrencyMeasure(40000, new VNDCurrencyUnit());

        CurrencyConvert converter = new USDConvertAdapter();
        CurrencyMeasure jpy = converter.convert(vnd, new JPYCurrencyUnit());
        System.out.println(jpy.getValue());

    }
}
