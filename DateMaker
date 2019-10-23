import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public final class DateMaker {
    //    private static final int[] g_days_in_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//    private static final int[] j_days_in_month = {31, 31, 31, 31, 31, 31, 30, 30, 30, 30, 30, 29};
    private static final short sumDayMiladiMonth[] = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
    private static final short sumDayMiladiMonthLeap[]= {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
    private static final short farvardinDayDiff = 79;

    private DateMaker() {

    }

    private static boolean MiladiIsLeap(int miladiYear) {
        return (((miladiYear % 100) != 0 && (miladiYear % 4) == 0) || ((miladiYear % 100) == 0 && (miladiYear % 400) == 0));
    }

    private static void convertToJalali(Calendar c) {
        int gy = c.get(Calendar.YEAR), gm = c.get(Calendar.MONTH), gd = c.get(Calendar.DAY_OF_MONTH);

        int dayCount = ((MiladiIsLeap(gy)) ? sumDayMiladiMonthLeap[gm] :
                sumDayMiladiMonth[gm]) + gd;

        int deyDayDiff = ((MiladiIsLeap(gy - 1))) ? 11 : 10;

        if(dayCount > farvardinDayDiff)
        {
            dayCount -= farvardinDayDiff;

            if(dayCount <= 186)
            {
                switch(dayCount % 31)
                {
                    case 0:
                        gm = dayCount / 31;
                        gd = 31;
                        break;

                    default:
                        gm = (dayCount / 31) + 1;
                        gd = (dayCount % 31);
                        break;
                }
            }
            else
            {
                dayCount -= 186;

                switch(dayCount % 30)
                {
                    case 0:
                        gm = (dayCount / 30) + 6;
                        gd = 30;
                        break;

                    default:
                        gm = (dayCount / 30) + 7;
                        gd = (dayCount % 30);
                        break;
                }
            }

            gy -= 621;
        }
        else
        {
            dayCount += deyDayDiff;

            switch(dayCount % 30)
            {
                case 0 :
                    gm = (dayCount / 30) + 9;
                    gd = 30;
                    break;

                default:
                    gm = (dayCount / 30) + 10;
                    gd = (dayCount % 30);
                    break;
            }

            gy -= 622;
        }

        c.set(gy, gm - 1, gd);
    }

    public static Calendar getCurrentMiladi() {
        return new GregorianCalendar();
    }

    public static String getCurrentMiladi(String format) {
        return new SimpleDateFormat(format).format(new Date());
    }

    public static Calendar getCurrentJalali() {
        Calendar c = getCurrentMiladi();
        convertToJalali(c);
        return c;
    }

    public static String getCurrentJalali(String format) {
        return new SimpleDateFormat(format).format(getCurrentJalali().getTime());
    }

    public static String convertDate(Calendar c, String formatOut) {
        Calendar d = (Calendar) c.clone();
        convertToJalali(d);
        return new SimpleDateFormat(formatOut).format(d.getTime());
    }

    public static String formatDate(Calendar c, String formatOut) {
        return new SimpleDateFormat(formatOut).format(c.getTime());
    }

    public static Calendar parseDate(String date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.ENGLISH);
        Calendar c = new GregorianCalendar();
        try {
            c.setTime(sdf.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return c;
    }

    public static String reformatToJalali(String date, String formatIn, String formatOut) {
        if (date == null) {
            return "";
        }

        Calendar c = parseDate(date, formatIn);
        convertToJalali(c);
        return new SimpleDateFormat(formatOut).format(c.getTime());
    }

    public static void main(String[] args) {
        System.out.println(reformatToJalali("2018/02/14 12:00:00", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm:ss"));
    }
}
