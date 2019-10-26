public final class IranSystemUtil {
    private static final int HAMZE = 0;
    private static final int AA = 1;
    private static final int ALEF = 2;
    private static final int BE = 3;
    private static final int PE = 4;
    private static final int TE = 5;
    private static final int SE = 6;
    private static final int JIM = 7;
    private static final int CHE = 8;
    private static final int HE = 9;
    private static final int KHE = 10;
    private static final int DAL = 11;
    private static final int ZAL = 12;
    private static final int RE = 13;
    private static final int ZE = 14;
    private static final int JE = 15;
    private static final int SIN = 16;
    private static final int SHIN = 17;
    private static final int SAD = 18;
    private static final int ZAD = 19;
    private static final int TA = 20;
    private static final int ZA = 21;
    private static final int EIN = 22;
    private static final int GHEIN = 23;
    private static final int FA = 24;
    private static final int GHAF = 25;
    private static final int KAF = 26;
    private static final int GAF = 27;
    private static final int LAM = 28;
    private static final int MIM = 29;
    private static final int NOON = 30;
    private static final int VAV = 31;
    private static final int H = 32;
    private static final int YE = 33;
    private static final int ZERO = 34;
    private static final int ONE = 35;
    private static final int TWO = 36;
    private static final int THREE = 37;
    private static final int FOUR = 38;
    private static final int FIVE = 39;
    private static final int SIX = 40;
    private static final int SEVEN = 41;
    private static final int EIGHT = 42;
    private static final int NINE = 43;
    private static final int QM = 44;
    private static final int SPACE = 45;
    private static final int LA = 46;
    private static final int VIRGOOL = 47;

    private static final int JLA = 0;
    private static final int JLR = 1;
    private static final int JLM = 2;
    private static final int JLL = 3;

    //  Join bytes:  {ALONE, RIGHT, MID, LEFT}
    private static final byte[][] join_map = {
            {(byte) 0x8f, (byte) 0x8f, (byte) 0x8e, (byte) 0x8e}, // HAMZE
            {(byte) 0x8d, (byte) 0x8d, (byte) 0x8d, (byte) 0x8d}, // AA
            {(byte) 0x90, (byte) 0x91, (byte) 0x90, (byte) 0x90}, // ALEF
            {(byte) 0x92, (byte) 0x92, (byte) 0x93, (byte) 0x93}, // BE
            {(byte) 0x94, (byte) 0x94, (byte) 0x95, (byte) 0x95}, // PE
            {(byte) 0x96, (byte) 0x96, (byte) 0x97, (byte) 0x97}, // TE
            {(byte) 0x98, (byte) 0x98, (byte) 0x99, (byte) 0x99}, // SE
            {(byte) 0x9a, (byte) 0x9a, (byte) 0x9b, (byte) 0x9b}, // JIM
            {(byte) 0x9c, (byte) 0x9c, (byte) 0x9d, (byte) 0x9d}, // CHE
            {(byte) 0x9e, (byte) 0x9e, (byte) 0x9f, (byte) 0x9f}, // HE
            {(byte) 0xa0, (byte) 0xa0, (byte) 0xa1, (byte) 0xa1}, // KHE
            {(byte) 0xa2, (byte) 0xa2, (byte) 0xa2, (byte) 0xa2}, // DAL
            {(byte) 0xa3, (byte) 0xa3, (byte) 0xa3, (byte) 0xa3}, // ZAL
            {(byte) 0xa4, (byte) 0xa4, (byte) 0xa4, (byte) 0xa4}, // RE
            {(byte) 0xa5, (byte) 0xa5, (byte) 0xa5, (byte) 0xa5}, // ZE
            {(byte) 0xa6, (byte) 0xa6, (byte) 0xa6, (byte) 0xa6}, // JE
            {(byte) 0xa7, (byte) 0xa7, (byte) 0xa8, (byte) 0xa8}, // SIN
            {(byte) 0xa9, (byte) 0xa9, (byte) 0xaa, (byte) 0xaa}, // SHIN
            {(byte) 0xab, (byte) 0xab, (byte) 0xac, (byte) 0xac}, // SAD
            {(byte) 0xad, (byte) 0xad, (byte) 0xae, (byte) 0xae}, // ZAD
            {(byte) 0xaf, (byte) 0xaf, (byte) 0xaf, (byte) 0xaf}, // TA
            {(byte) 0xe0, (byte) 0xe0, (byte) 0xe0, (byte) 0xe0}, // ZA
            {(byte) 0xe1, (byte) 0xe2, (byte) 0xe3, (byte) 0xe4}, // EIN
            {(byte) 0xe5, (byte) 0xe6, (byte) 0xe7, (byte) 0xe8}, // GHEIN
            {(byte) 0xe9, (byte) 0xe9, (byte) 0xea, (byte) 0xea}, // FA
            {(byte) 0xeb, (byte) 0xeb, (byte) 0xec, (byte) 0xec}, // GHAF
            {(byte) 0xed, (byte) 0xed, (byte) 0xee, (byte) 0xee}, // KAF
            {(byte) 0xef, (byte) 0xef, (byte) 0xf0, (byte) 0xf0}, // GAF
            {(byte) 0xf1, (byte) 0xf1, (byte) 0xf3, (byte) 0xf3}, // LAM
            {(byte) 0xf4, (byte) 0xf4, (byte) 0xf5, (byte) 0xf5}, // MIM
            {(byte) 0xf6, (byte) 0xf6, (byte) 0xf7, (byte) 0xf7}, // NOON
            {(byte) 0xf8, (byte) 0xf8, (byte) 0xf8, (byte) 0xf8}, // VAV
            {(byte) 0xf9, (byte) 0xf9, (byte) 0xfa, (byte) 0xfb}, // H
            {(byte) 0xfd, (byte) 0xfc, (byte) 0xfe, (byte) 0xfe}, // YE
            {(byte) 0x80, (byte) 0x80, (byte) 0x80, (byte) 0x80}, // ZERO
            {(byte) 0x81, (byte) 0x81, (byte) 0x81, (byte) 0x81}, // ONE
            {(byte) 0x82, (byte) 0x82, (byte) 0x82, (byte) 0x82}, // TWO
            {(byte) 0x83, (byte) 0x83, (byte) 0x83, (byte) 0x83}, // THREE
            {(byte) 0x84, (byte) 0x84, (byte) 0x84, (byte) 0x84}, // FOUR
            {(byte) 0x85, (byte) 0x85, (byte) 0x85, (byte) 0x85}, // FIVE
            {(byte) 0x86, (byte) 0x86, (byte) 0x86, (byte) 0x86}, // SIX
            {(byte) 0x87, (byte) 0x87, (byte) 0x87, (byte) 0x87}, // SEVEN
            {(byte) 0x88, (byte) 0x88, (byte) 0x88, (byte) 0x88}, // EIGHT
            {(byte) 0x89, (byte) 0x89, (byte) 0x89, (byte) 0x89}, // NINE
            {(byte) 0x8c, (byte) 0x8c, (byte) 0x8c, (byte) 0x8c}, // QM
            {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff}, // SPACE
            {(byte) 0xf2, (byte) 0xf2, (byte) 0xf2, (byte) 0xf2}, // LA
            {(byte) 0x8a, (byte) 0x8a, (byte) 0x8a, (byte) 0x8a}, // VIRGOOL
    };

    private static final int JMR = 0;
    private static final int JMML = 1;

    //  Join modes:  {RIGHT, MID_LEFT}
    private static final boolean[][] join_modes = {
            {false, true}, // HAMZE
            {false, false}, // AA
            {true, false}, // ALEF
            {true, true}, // BE
            {true, true}, // PE
            {true, true}, // TE
            {true, true}, // SE
            {true, true}, // JIM
            {true, true}, // CHE
            {true, true}, // HE
            {true, true}, // KHE
            {true, false}, // DAL
            {true, false}, // ZAL
            {true, false}, // RE
            {true, false}, // ZE
            {true, false}, // JE
            {true, true}, // SIN
            {true, true}, // SHIN
            {true, true}, // SAD
            {true, true}, // ZAD
            {true, true}, // TA
            {true, true}, // ZA
            {true, true}, // EIN
            {true, true}, // GHEIN
            {true, true}, // FA
            {true, true}, // GHAF
            {true, true}, // KAF
            {true, true}, // GAF
            {true, true}, // LAM
            {true, true}, // MIM
            {true, true}, // NOON
            {true, false}, // VAV
            {true, true}, // H
            {true, true}, // YE
            {false, false}, // ZERO
            {false, false}, // ONE
            {false, false}, // TWO
            {false, false}, // THREE
            {false, false}, // FOUR
            {false, false}, // FIVE
            {false, false}, // SIX
            {false, false}, // SEVEN
            {false, false}, // EIGHT
            {false, false}, // NINE
            {false, false}, // QM
            {false, false}, // SPACE
            {true, false}, // LA
            {false, false}, // VIRGOOL
    };

    private static final char[] table = {
            /*  0 */ '۰', '۱', '۲', '۳', '۴', '۵', '۶', '۷', '۸', '۹', '،', 'ـ', '؟', 'آ', 'ئ', 'ء',
            /* 16 */ 'ا', 'ا', 'ب', 'ب', 'پ', 'پ', 'ت', 'ت', 'ث', 'ث', 'ج', 'ج', 'چ', 'چ', 'ح', 'ح',
            /* 32 */ 'خ', 'خ', 'د', 'ذ', 'ر', 'ز', 'ژ', 'س', 'س', 'ش', 'ش', 'ص', 'ص', 'ض', 'ض', 'ط',
            /* 48 */ 'ظ', 'ع', 'ع', 'ع', 'ع', 'غ', 'غ', 'غ', 'غ', 'ف', 'ف', 'ق', 'ق', 'ک', 'ک', 'گ',
            /* 64 */ 'گ', 'ل', 'ل', 'ل', 'م', 'م', 'ن', 'ن', 'و', 'ه', 'ه', 'ه', 'ی', 'ی', 'ی', ' ',
            /* 80 */
            /*  0 */ '۰', '۱', '۲', '۳', '۴', '۵', '۶', '۷', '۸', '۹', '،', 'ـ', '؟', 'آ', 'ﺋ', 'ء',
            /* 16 */ 'ﺍ', 'ﺎ', 'ب', 'ﺑ', 'پ', 'ﭘ', 'ت', 'ﺗ', 'ث', 'ﺛ', 'ج', 'ﺟ', 'چ', 'ﭼ', 'ح', 'ﺣ',
            /* 32 */ 'خ', 'ﺧ', 'د', 'ذ', 'ر', 'ز', 'ژ', 'س', 'ﺳ', 'ش', 'ﺷ', 'ص', 'ﺻ', 'ض', 'ﺿ', 'ط',
            /* 48 */ 'ظ', 'ع', 'ﻊ', 'ﻌ', 'ﻋ', 'غ', 'ﻎ', 'ﻐ', 'ﻏ', 'ف', 'ﻓ', 'ق', 'ﻗ', 'ک', 'ﮐ', 'گ',
            /* 64 */ 'ﮔ', 'ل', 'ﻟ', 'ﻟ', 'م', 'ﻣ', 'ن', 'ﻧ', 'و', 'ه', 'ﻬ', 'ﻫ', 'ﯽ', 'ی', 'ﯾ', ' ',
            /* 80 */
    };

    private IranSystemUtil() {
        // since this class is a utility class so it must be singleton due to memory consumption.
    }

    //    https://www.utf8-chartable.de/unicode-utf8-table.pl?start=1536&number=1024&utf8=-
    private static int internal_index(int i) {
        if (i >= 0x660 && i <= 0x669)
            return ZERO + i - 0x660;

        if (i >= 0x6F0 && i <= 0x6F9)
            return ZERO + i - 0x6F0;

        if (i >= 0x30 && i <= 0x39)
            return ZERO + i - 0x30;

        switch (i) {
            case 0x2c:
            case 0x60C:
            case 0x7F8:
                return VIRGOOL;
            case 0x20:
                return SPACE;
            case 0x61f:
            case 0x3f:
                return QM;
            case 0x620:
            case 0x626:
            case 0x63d:
            case 0x63e:
            case 0x63f:
            case 0x649:
            case 0x64a:
            case 0x678:
            case 0x6cc:
            case 0x6cd:
            case 0x6ce:
            case 0x6d0:
            case 0x6d1:
            case 0x6d2:
            case 0x6d3:
            case 0x775:
            case 0x776:
            case 0x777:
            case 0x77A:
            case 0x77B:
            case 0x8A8:
            case 0x8A9:
            case 0x8BA:
                return YE;
            case 0x621:
            case 0x6FD:
                return HAMZE;
            case 0x622:
                return AA;
            case 0x623:
            case 0x625:
            case 0x627:
            case 0x773:
            case 0x774:
                return ALEF;
            case 0x624:
            case 0x648:
            case 0x676:
            case 0x677:
            case 0x6c4:
            case 0x6c5:
            case 0x6c6:
            case 0x6c7:
            case 0x6c8:
            case 0x6c9:
            case 0x6ca:
            case 0x6cb:
            case 0x6cf:
            case 0x778:
            case 0x779:
                return VAV;
            case 0x628:
            case 0x67b:
            case 0x680:
            case 0x750:
            case 0x751:
            case 0x752:
            case 0x753:
            case 0x754:
            case 0x755:
            case 0x756:
            case 0x8A0:
            case 0x8A1:
            case 0x8B6:
                return BE;
            case 0x629:
            case 0x647:
            case 0x6be:
            case 0x6d5:
            case 0x6FF:
                return H;
            case 0x62a:
            case 0x679:
            case 0x67a:
            case 0x67c:
            case 0x67d:
            case 0x67F:
            case 0x8B8:
                return TE;
            case 0x62b:
                return SE;
            case 0x62c:
            case 0x8A2:
                return JIM;
            case 0x6bf:
            case 0x686:
            case 0x687:
                return CHE;
            case 0x62d:
            case 0x681:
            case 0x682:
            case 0x683:
            case 0x684:
            case 0x685:
            case 0x6c0:
            case 0x6c1:
            case 0x6c2:
            case 0x6c3:
            case 0x757:
            case 0x758:
            case 0x76E:
            case 0x76F:
            case 0x772:
            case 0x77C:
                return HE;
            case 0x62e:
                return KHE;
            case 0x62f:
            case 0x688:
            case 0x689:
            case 0x68a:
            case 0x68b:
            case 0x68c:
            case 0x68d:
            case 0x68e:
            case 0x68f:
            case 0x690:
            case 0x6ee:
            case 0x759:
            case 0x75a:
            case 0x8AE:
                return DAL;
            case 0x630:
                return ZAL;
            case 0x631:
            case 0x691:
            case 0x692:
            case 0x693:
            case 0x694:
            case 0x695:
            case 0x696:
            case 0x697:
            case 0x699:
            case 0x6EF:
            case 0x75B:
            case 0x76B:
            case 0x76c:
            case 0x771:
            case 0x8B9:
                return RE;
            case 0x698:
                return JE;
            case 0x632:
            case 0x8B2:
                return ZE;
            case 0x633:
            case 0x69a:
            case 0x69b:
            case 0x69c:
            case 0x75C:
            case 0x76D:
            case 0x770:
            case 0x77D:
            case 0x77E:
                return SIN;
            case 0x634:
            case 0x6FA:
                return SHIN;
            case 0x635:
            case 0x69d:
            case 0x69e:
            case 0x8AF:
                return SAD;
            case 0x636:
            case 0x6FB:
                return ZAD;
            case 0x637:
            case 0x69f:
            case 0x8A3:
                return TA;
            case 0x638:
                return ZA;
            case 0x639:
            case 0x6a0:
            case 0x75D:
            case 0x75e:
            case 0x75f:
            case 0x8B3:
                return EIN;
            case 0x63a:
            case 0x6FC:
                return GHEIN;
            case 0x63b:
            case 0x63c:
            case 0x643:
            case 0x6a9:
            case 0x6aa:
            case 0x6ab:
            case 0x6ac:
            case 0x6ad:
            case 0x6ae:
            case 0x762:
            case 0x763:
            case 0x764:
            case 0x77F:
            case 0x8B4:
                return KAF;
            case 0x641:
            case 0x6A1:
            case 0x6A2:
            case 0x6A3:
            case 0x6A4:
            case 0x6A5:
            case 0x6A6:
            case 0x6A7:
            case 0x760:
            case 0x761:
            case 0x8A4:
            case 0x8BB:
                return FA;
            case 0x642:
            case 0x6A8:
            case 0x8A5:
            case 0x8BC:
                return GHAF;
            case 0x8b0:
            case 0x6b0:
            case 0x6b1:
            case 0x6b2:
            case 0x6b3:
            case 0x6b4:
            case 0x6af:
                return GAF;
            case 0x644:
            case 0x6b5:
            case 0x6b6:
            case 0x6b7:
            case 0x6b8:
            case 0x76A:
            case 0x8A6:
                return LAM;
            case 0x645:
            case 0x765:
            case 0x766:
            case 0x8A7:
                return MIM;
            case 0x646:
            case 0x6b9:
            case 0x6ba:
            case 0x6bb:
            case 0x6bc:
            case 0x6bd:
            case 0x767:
            case 0x768:
            case 0x769:
            case 0x8BD:
                return NOON;
            case 0x67e:
            case 0x8B7:
                return PE;
            default:
                return -1;
        }
    }

    private static byte[] process_buffer(int[] letters, int length) {
        byte[] res = new byte[length];

        if (length == 1) {
            res[0] = join_map[letters[0]][JLA];
            return res;
        }

        int previousLetter = letters[length - 1];
        int currentLetter = -1;
        int nextLetter = letters[0];
        boolean start = true;

        for (int i = length - 2; i >= 1; --i) {
            currentLetter = letters[i];
            nextLetter = letters[i - 1];

            if (start) {
                if (join_modes[currentLetter][JMML] || join_modes[currentLetter][JMR]) {
                    res[i + 1] = join_map[previousLetter][JLL];
                } else {
                    res[i + 1] = join_map[previousLetter][JLA];
                }

                start = false;
            }

            if (join_modes[previousLetter][JMML]) {
                if (join_modes[nextLetter][JMR] || join_modes[nextLetter][JMML]) { // <-> ? <-
                    if (join_modes[currentLetter][JMML]) {
                        res[i] = join_map[currentLetter][JLM];
                    } else if (join_modes[currentLetter][JMR]) {
                        res[i] = join_map[currentLetter][JLR];
                    } else {
                        res[i] = join_map[currentLetter][JLA];
                    }
                } else { // - ? <-
                    if (join_modes[currentLetter][JMR]) {
                        res[i] = join_map[currentLetter][JLR];
                    } else {
                        res[i] = join_map[currentLetter][JLA];
                    }
                }
            } else if (join_modes[nextLetter][JMML]) {
                res[i] = join_map[currentLetter][JLL];
            } else if (join_modes[nextLetter][JMR] && join_modes[currentLetter][JMML]) {
                res[i] = join_map[currentLetter][JLL];
            } else {
                res[i] = join_map[currentLetter][JLA];
            }

            previousLetter = currentLetter;
        }

        if (start) { // two letters length
            currentLetter = letters[1];

            if (join_modes[currentLetter][JMML] || join_modes[currentLetter][JMR]) {
                res[1] = join_map[previousLetter][JLL];
            } else {
                res[1] = join_map[previousLetter][JLA];
            }
        }

        currentLetter = letters[0];

        if (join_modes[currentLetter][JMR]) {
            if (join_modes[nextLetter][JMML]) {
                res[0] = join_map[currentLetter][JLR];
            } else {
                res[0] = join_map[currentLetter][JLA];
            }
        } else {
            res[0] = join_map[currentLetter][JLA];
        }

        return res;
    }

    public static String toString(byte[] data, int offset, int length) {
        if (length == 0 || data.length < offset + length) {
            return "";
        }

        int j = length;
        for (int i = offset; i < offset + length; ++i) {
            if (data[i] == (byte) 0xF2) {
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

            if (t == 66) {
                temp[temp.length - j++ - 1] = table[16];
            }

            temp[temp.length - j++ - 1] = table[t];
        }

        return new String(temp);
    }

    public static byte[] fromString(String data) {
        int[] letters = new int[data.length()];
        int letters_length = 0;

        int letter = -1;
        boolean is_last_space = false;

        for (int i = 0; i < data.length(); ++i) {
            letter = internal_index(data.charAt(i));

            if (letter == -1) {
                continue;
            }

            if (letter == SPACE) {
                if (is_last_space) {
                    continue;
                } else {
                    is_last_space = true;
                    if (letters_length != 0) {
                        letters[letters_length++] = letter;
                    }
                    continue;
                }
            } else {
                is_last_space = false;
            }

            if ((letter == ALEF || letter == AA) && letters_length > 0 && letters[letters_length - 1] == LAM) {
                letters[letters_length - 1] = LA;
            } else {
                letters[letters_length++] = letter;
            }
        }

        if (letter == SPACE) {
            --letters_length;
        }

        for (int i = 0, t, k = letters_length / 2; i < k; i++) {
            t = letters[i];
            letters[i] = letters[letters_length - i - 1];
            letters[letters_length - i - 1] = t;
        }

        return (letters_length > 0) ? process_buffer(letters, letters_length) : null;
    }

    public static void main(String[] args) {
//        byte[] s = Converter.asciiHexToByte("F2A6FFA695F8FF9CF0F8FF91F0FEF3F2");
//        System.out.println(toString(s, 0, s.length));
        String sample = "هومن لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد. کتابهای زیادی در شصت و سه درصد گذشته، حال و آینده شناخت فراوان جامعه و متخصصان را می طلبد تا با نرم افزارها شناخت بیشتری را برای طراحان رایانه ای علی الخصوص طراحان خلاقی و فرهنگ پیشرو در زبان فارسی ایجاد کرد. در این صورت می توان امید داشت که تمام و دشواری موجود در ارائه راهکارها و شرایط سخت تایپ به پایان رسد وزمان مورد نیاز شامل حروفچینی دستاوردهای اصلی و جوابگوی سوالات پیوسته اهل دنیای موجود طراحی اساسا مورد استفاده قرار گیرد";
        byte[] res = fromString(sample);
        System.out.println(toString(res, 0, res.length));
    }
}
