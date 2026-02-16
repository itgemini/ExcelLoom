/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.enums;


/**
 * The CurrencyFormat class provides a collection of predefined string
 * constants that represent various currency formats. These formats
 * include different currency symbols and number formatting patterns
 * specific to various regions and currencies around the world.
 *
 * This class is intended to offer a standardized way to represent
 * currency values in applications and facilitate formatting.
 *
 * The class is non-instantiable and serves as a utility container for
 * these constants.
 */
public class CurrencyFormat {
    private CurrencyFormat() {}
    public static final String US_DOLLAR = "$#,##0.00";
    public static final String EURO = "€#,##0.00";
    public static final String BRITISH_POUND = "£#,##0.00";
    public static final String JAPANESE_YEN = "¥#,##0.00";
    public static final String INDIAN_RUPEE = "₹#,##0.00";
    public static final String AUSTRALIAN_DOLLAR = "A$#,##0.00";
    public static final String CANADIAN_DOLLAR = "C$#,##0.00";
    public static final String SWISS_FRANC = "CHF#,##0.00";
    public static final String CHINESE_YUAN = "¥#,##0.00";
    public static final String SWEDISH_KRONA = "kr#,##0.00";
    public static final String NEW_ZEALAND_DOLLAR = "NZ$#,##0.00";
    public static final String MEXICAN_PESO = "$#,##0.00";
    public static final String SINGAPORE_DOLLAR = "S$#,##0.00";
    public static final String HONG_KONG_DOLLAR = "HK$#,##0.00";
    public static final String NORWEGIAN_KRONE = "kr#,##0.00";
    public static final String SOUTH_KOREAN_WON = "₩#,##0.00";
    public static final String TURKISH_LIRA = "₺#,##0.00";
    public static final String RUSSIAN_RUBLE = "₽#,##0.00";
    public static final String BRAZILIAN_REAL = "R$#,##0.00";
    public static final String SOUTH_AFRICAN_RAND = "R#,##0.00";
    public static final String PHILIPPINE_PESO = "₱#,##0.00";
    public static final String MOROCCAN_DIRHAM = "MAD#,##0.00";
    public static final String SAUDI_RIYAL = "SR#,##0.00";
    public static final String UAE_DIRHAM = "AED#,##0.00";
}