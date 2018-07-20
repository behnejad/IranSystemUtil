public final class IranSystemUtil {
    private static final byte la = (byte) 0xF2;
    private static final char[] table = {
            /*  0 */ '۰', '۱', '۲', '۳', '۴', '۵', '۶', '۷', '۸', '۹', '،', 'ـ', '؟', 'آ', 'ئ', 'ء',
            /* 16 */ 'ا', 'ا', 'ب', 'ب', 'پ', 'پ', 'ت', 'ت', 'ث', 'ث', 'ج', 'ج', 'چ', 'چ', 'ح', 'ح',
            /* 32 */ 'خ', 'خ', 'د', 'ذ', 'ر', 'ز', 'ژ', 'س', 'س', 'ش', 'ش', 'ص', 'ص', 'ض', 'ض', 'ط',
            /* 48 */ 'ظ', 'ع', 'ع', 'ع', 'ع', 'غ', 'غ', 'غ', 'غ', 'ف', 'ف', 'ق', 'ق', 'ک', 'ک', 'گ',
            /* 64 */ 'گ', 'ل', 'ل', 'ل', 'م', 'م', 'ن', 'ن', 'و', 'ه', 'ه', 'ه', 'ی', 'ی', 'ی', ' ',
            /* 80 */
    };

    private IranSystemUtil() {
        // since this class is a utility class so it must be singleton due to memory consumption.
    }

    public static String toUtf8(byte[] data, int offset, int length) {
        if (length == 0 || data.length < offset + length) {
            return "";
        }

        int j = length;
        for (int i = offset; i < offset + length; ++i) {
            if (data[i] == la) {
                j += 1;
            }
        }

        char[] temp = new char[j];
        byte t;
        j = 0;
        for (int i = offset; i < offset + length; ++i) {
            if (data[i] == 0x20) {
                temp[temp.length - j++ - 1] = table[79];
                continue;
            }

            t = (byte) ((data[i] < 0) ? (128 + data[i]) : data[i]);

            if (t < 96 && t >= 48) {
                temp[temp.length - j++ - 1] = table[79];
                continue;
            }

            if (t > 96) {
                t -= 48;
            }

            if (t == 48) {
                temp[temp.length - j++ - 1] = table[16];
            }

            temp[temp.length - j++ - 1] = table[t];
        }

        return new String(temp);
    }
}
