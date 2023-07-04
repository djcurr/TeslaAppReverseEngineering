package net.time4j.format;

import com.stripe.android.model.Stripe3ds2AuthResult;
import ezvcard.property.Gender;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j ARABIC;
    public static final j ARABIC_INDIC;
    public static final j ARABIC_INDIC_EXT;
    public static final j BENGALI;
    public static final j DEVANAGARI;
    public static final j DOZENAL;
    private static final int[] D_FACTORS;
    public static final j ETHIOPIC;
    private static final char ETHIOPIC_HUNDRED = 4987;
    private static final char ETHIOPIC_ONE = 4969;
    private static final char ETHIOPIC_TEN = 4978;
    private static final char ETHIOPIC_TEN_THOUSAND = 4988;
    public static final j GUJARATI;
    public static final j JAPANESE;
    public static final j KHMER;
    private static final String[] LETTERS;
    public static final j MYANMAR;
    private static final int[] NUMBERS;
    public static final j ORYA;
    public static final j ROMAN;
    public static final j TELUGU;
    public static final j THAI;
    private final String code;

    /* loaded from: classes5.dex */
    enum g extends j {
        g(String str, int i11, String str2) {
            super(str, i11, str2, null);
        }

        @Override // net.time4j.format.j
        public boolean contains(char c11) {
            return c11 >= '0' && c11 <= '9';
        }

        @Override // net.time4j.format.j
        public String getDigits() {
            return "0123456789";
        }

        @Override // net.time4j.format.j
        public boolean isDecimal() {
            return true;
        }

        @Override // net.time4j.format.j
        public int toInteger(String str, net.time4j.format.g gVar) {
            int parseInt = Integer.parseInt(str);
            if (parseInt >= 0) {
                return parseInt;
            }
            throw new NumberFormatException("Cannot convert negative number: " + str);
        }

        @Override // net.time4j.format.j
        public String toNumeral(int i11) {
            if (i11 >= 0) {
                return Integer.toString(i11);
            }
            throw new IllegalArgumentException("Cannot convert: " + i11);
        }
    }

    static {
        g gVar = new g("ARABIC", 0, "latn");
        ARABIC = gVar;
        j jVar = new j("ARABIC_INDIC", 1, "arab") { // from class: net.time4j.format.j.h
            @Override // net.time4j.format.j
            public String getDigits() {
                return "٠١٢٣٤٥٦٧٨٩";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        ARABIC_INDIC = jVar;
        j jVar2 = new j("ARABIC_INDIC_EXT", 2, "arabext") { // from class: net.time4j.format.j.i
            @Override // net.time4j.format.j
            public String getDigits() {
                return "۰۱۲۳۴۵۶۷۸۹";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        ARABIC_INDIC_EXT = jVar2;
        j jVar3 = new j("BENGALI", 3, "beng") { // from class: net.time4j.format.j.j
            @Override // net.time4j.format.j
            public String getDigits() {
                return "০১২৩৪৫৬৭৮৯";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        BENGALI = jVar3;
        j jVar4 = new j("DEVANAGARI", 4, "deva") { // from class: net.time4j.format.j.k
            @Override // net.time4j.format.j
            public String getDigits() {
                return "०१२३४५६७८९";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        DEVANAGARI = jVar4;
        j jVar5 = new j("DOZENAL", 5, "dozenal") { // from class: net.time4j.format.j.l
            @Override // net.time4j.format.j
            public boolean contains(char c11) {
                return (c11 >= '0' && c11 <= '9') || c11 == 8586 || c11 == 8587;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return "0123456789↊↋";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return false;
            }

            @Override // net.time4j.format.j
            public int toInteger(String str, net.time4j.format.g gVar2) {
                int parseInt = Integer.parseInt(str.replace((char) 8586, 'a').replace((char) 8587, 'b'), 12);
                if (parseInt >= 0) {
                    return parseInt;
                }
                throw new NumberFormatException("Cannot convert negative number: " + str);
            }

            @Override // net.time4j.format.j
            public String toNumeral(int i11) {
                if (i11 >= 0) {
                    return Integer.toString(i11, 12).replace('a', (char) 8586).replace('b', (char) 8587);
                }
                throw new IllegalArgumentException("Cannot convert: " + i11);
            }

            @Override // net.time4j.format.j
            public int toNumeral(int i11, Appendable appendable) {
                if (i11 >= 0) {
                    int i12 = 0;
                    int i13 = 1;
                    while (true) {
                        if (i13 > 4) {
                            break;
                        } else if (i11 < j.D_FACTORS[i13]) {
                            i12 = i13;
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (i12 > 0) {
                        int i14 = i12 - 1;
                        do {
                            int i15 = i11 / j.D_FACTORS[i14];
                            appendable.append(i15 == 11 ? (char) 8587 : i15 == 10 ? (char) 8586 : (char) (i15 + 48));
                            i11 -= i15 * j.D_FACTORS[i14];
                            i14--;
                        } while (i14 >= 0);
                        return i12;
                    }
                }
                return super.toNumeral(i11, appendable);
            }
        };
        DOZENAL = jVar5;
        j jVar6 = new j("ETHIOPIC", 6, "ethiopic") { // from class: net.time4j.format.j.m
            @Override // net.time4j.format.j
            public boolean contains(char c11) {
                return c11 >= 4969 && c11 <= 4988;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return "፩፪፫፬፭፮፯፰፱፲፳፴፵፶፷፸፹፺፻፼";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return false;
            }

            @Override // net.time4j.format.j
            public int toInteger(String str, net.time4j.format.g gVar2) {
                int i11;
                int i12 = 1;
                boolean z11 = false;
                boolean z12 = false;
                int i13 = 0;
                int i14 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    if (charAt >= 4969 && charAt < 4978) {
                        i11 = (charAt + 1) - 4969;
                    } else if (charAt < 4978 || charAt >= 4987) {
                        if (charAt == 4988) {
                            if (z11 && i14 == 0) {
                                i14 = 1;
                            }
                            i13 = j.addEthiopic(i13, i14, i12);
                            i12 = z11 ? i12 * 100 : i12 * 10000;
                            z12 = true;
                            z11 = false;
                            i14 = 0;
                        } else if (charAt == 4987) {
                            i13 = j.addEthiopic(i13, i14, i12);
                            i12 *= 100;
                            z11 = true;
                            z12 = false;
                            i14 = 0;
                        }
                    } else {
                        i11 = ((charAt + 1) - 4978) * 10;
                    }
                    i14 += i11;
                }
                return j.addEthiopic(i13, ((z11 || z12) && i14 == 0) ? 1 : i14, i12);
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x007d A[SYNTHETIC] */
            @Override // net.time4j.format.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.String toNumeral(int r11) {
                /*
                    r10 = this;
                    r0 = 1
                    if (r11 < r0) goto L85
                    java.lang.String r11 = java.lang.String.valueOf(r11)
                    int r1 = r11.length()
                    int r1 = r1 - r0
                    int r2 = r1 % 2
                    if (r2 != 0) goto L23
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "0"
                    r2.append(r3)
                    r2.append(r11)
                    java.lang.String r11 = r2.toString()
                    int r1 = r1 + 1
                L23:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r3 = r1
                L29:
                    if (r3 < 0) goto L80
                    int r4 = r1 - r3
                    char r4 = r11.charAt(r4)
                    int r3 = r3 + (-1)
                    int r5 = r1 - r3
                    char r5 = r11.charAt(r5)
                    r6 = 48
                    r7 = 0
                    if (r5 == r6) goto L42
                    int r5 = r5 + 4920
                    char r5 = (char) r5
                    goto L43
                L42:
                    r5 = r7
                L43:
                    if (r4 == r6) goto L49
                    int r4 = r4 + 4929
                    char r4 = (char) r4
                    goto L4a
                L49:
                    r4 = r7
                L4a:
                    int r6 = r3 % 4
                    int r6 = r6 / 2
                    r8 = 4987(0x137b, float:6.988E-42)
                    if (r3 == 0) goto L5d
                    if (r6 == 0) goto L5a
                    if (r5 != 0) goto L58
                    if (r4 == 0) goto L5d
                L58:
                    r6 = r8
                    goto L5e
                L5a:
                    r6 = 4988(0x137c, float:6.99E-42)
                    goto L5e
                L5d:
                    r6 = r7
                L5e:
                    r9 = 4969(0x1369, float:6.963E-42)
                    if (r5 != r9) goto L6d
                    if (r4 != 0) goto L6d
                    if (r1 <= r0) goto L6d
                    if (r6 == r8) goto L6e
                    int r8 = r3 + 1
                    if (r8 != r1) goto L6d
                    goto L6e
                L6d:
                    r7 = r5
                L6e:
                    if (r4 == 0) goto L73
                    r2.append(r4)
                L73:
                    if (r7 == 0) goto L78
                    r2.append(r7)
                L78:
                    if (r6 == 0) goto L7d
                    r2.append(r6)
                L7d:
                    int r3 = r3 + (-1)
                    goto L29
                L80:
                    java.lang.String r11 = r2.toString()
                    return r11
                L85:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Can only convert positive numbers: "
                    r1.append(r2)
                    r1.append(r11)
                    java.lang.String r11 = r1.toString()
                    r0.<init>(r11)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.j.m.toNumeral(int):java.lang.String");
            }
        };
        ETHIOPIC = jVar6;
        j jVar7 = new j("GUJARATI", 7, "gujr") { // from class: net.time4j.format.j.n
            @Override // net.time4j.format.j
            public String getDigits() {
                return "૦૧૨૩૪૫૬૭૮૯";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        GUJARATI = jVar7;
        j jVar8 = new j("JAPANESE", 8, "jpan") { // from class: net.time4j.format.j.o
            @Override // net.time4j.format.j
            public String getDigits() {
                return "一二三四五六七八九十百千";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return false;
            }

            @Override // net.time4j.format.j
            public int toInteger(String str, net.time4j.format.g gVar2) {
                boolean z11;
                String digits = getDigits();
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    if (charAt != 21313) {
                        if (charAt != 21315) {
                            if (charAt != 30334) {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= 9) {
                                        z11 = false;
                                        break;
                                    } else if (digits.charAt(i15) == charAt) {
                                        int i16 = i15 + 1;
                                        if (i14 == 1) {
                                            i12 += i16 * 1000;
                                            i14 = -1;
                                        } else if (i13 == 1) {
                                            i12 += i16 * 100;
                                            i13 = -1;
                                        } else if (i11 == 1) {
                                            i12 += i16 * 10;
                                            i11 = -1;
                                        } else {
                                            i12 += i16;
                                        }
                                        z11 = true;
                                    } else {
                                        i15++;
                                    }
                                }
                                if (!z11) {
                                    throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                                }
                            } else if (i13 != 0 || i14 != 0) {
                                throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                            } else {
                                i13++;
                            }
                        } else if (i14 != 0) {
                            throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                        } else {
                            i14++;
                        }
                    } else if (i11 != 0 || i13 != 0 || i14 != 0) {
                        throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                    } else {
                        i11++;
                    }
                }
                if (i11 == 1) {
                    i12 += 10;
                }
                if (i13 == 1) {
                    i12 += 100;
                }
                return i14 == 1 ? i12 + 1000 : i12;
            }

            @Override // net.time4j.format.j
            public String toNumeral(int i11) {
                if (i11 >= 1 && i11 <= 9999) {
                    String digits = getDigits();
                    int i12 = i11 / 1000;
                    int i13 = i11 % 1000;
                    int i14 = i13 / 100;
                    int i15 = i13 % 100;
                    int i16 = i15 / 10;
                    int i17 = i15 % 10;
                    StringBuilder sb2 = new StringBuilder();
                    if (i12 >= 1) {
                        if (i12 > 1) {
                            sb2.append(digits.charAt(i12 - 1));
                        }
                        sb2.append((char) 21315);
                    }
                    if (i14 >= 1) {
                        if (i14 > 1) {
                            sb2.append(digits.charAt(i14 - 1));
                        }
                        sb2.append((char) 30334);
                    }
                    if (i16 >= 1) {
                        if (i16 > 1) {
                            sb2.append(digits.charAt(i16 - 1));
                        }
                        sb2.append((char) 21313);
                    }
                    if (i17 > 0) {
                        sb2.append(digits.charAt(i17 - 1));
                    }
                    return sb2.toString();
                }
                throw new IllegalArgumentException("Cannot convert: " + i11);
            }
        };
        JAPANESE = jVar8;
        j jVar9 = new j("KHMER", 9, "khmr") { // from class: net.time4j.format.j.a
            @Override // net.time4j.format.j
            public String getDigits() {
                return "០១២៣៤៥៦៧៨៩";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        KHMER = jVar9;
        j jVar10 = new j("MYANMAR", 10, "mymr") { // from class: net.time4j.format.j.b
            @Override // net.time4j.format.j
            public String getDigits() {
                return "၀၁၂၃၄၅၆၇၈၉";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        MYANMAR = jVar10;
        j jVar11 = new j("ORYA", 11, "orya") { // from class: net.time4j.format.j.c
            @Override // net.time4j.format.j
            public String getDigits() {
                return "୦୧୨୩୪୫୬୭୮୯";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        ORYA = jVar11;
        j jVar12 = new j("ROMAN", 12, "roman") { // from class: net.time4j.format.j.d
            @Override // net.time4j.format.j
            public boolean contains(char c11) {
                char upperCase = Character.toUpperCase(c11);
                return upperCase == 'I' || upperCase == 'V' || upperCase == 'X' || upperCase == 'L' || upperCase == 'C' || upperCase == 'D' || upperCase == 'M';
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return "IVXLCDM";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return false;
            }

            /* JADX WARN: Code restructure failed: missing block: B:71:0x0016, code lost:
                continue;
             */
            @Override // net.time4j.format.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public int toInteger(java.lang.String r11, net.time4j.format.g r12) {
                /*
                    Method dump skipped, instructions count: 222
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.j.d.toInteger(java.lang.String, net.time4j.format.g):int");
            }

            @Override // net.time4j.format.j
            public String toNumeral(int i11) {
                if (i11 >= 1 && i11 <= 3999) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i12 = 0; i12 < j.NUMBERS.length; i12++) {
                        while (i11 >= j.NUMBERS[i12]) {
                            sb2.append(j.LETTERS[i12]);
                            i11 -= j.NUMBERS[i12];
                        }
                    }
                    return sb2.toString();
                }
                throw new IllegalArgumentException("Out of range (1-3999): " + i11);
            }
        };
        ROMAN = jVar12;
        j jVar13 = new j("TELUGU", 13, "telu") { // from class: net.time4j.format.j.e
            @Override // net.time4j.format.j
            public String getDigits() {
                return "౦౧౨౩౪౫౬౭౮౯";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        TELUGU = jVar13;
        j jVar14 = new j("THAI", 14, "thai") { // from class: net.time4j.format.j.f
            @Override // net.time4j.format.j
            public String getDigits() {
                return "๐๑๒๓๔๕๖๗๘๙";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        THAI = jVar14;
        $VALUES = new j[]{gVar, jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12, jVar13, jVar14};
        NUMBERS = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        LETTERS = new String[]{Gender.MALE, "CM", "D", "CD", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        D_FACTORS = new int[]{1, 12, 144, 1728, 20736};
    }

    /* synthetic */ j(String str, int i11, String str2, g gVar) {
        this(str, i11, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int addEthiopic(int i11, int i12, int i13) {
        return net.time4j.base.c.e(i11, net.time4j.base.c.h(i12, i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getValue(char c11) {
        if (c11 != 'C') {
            if (c11 != 'D') {
                if (c11 != 'I') {
                    if (c11 != 'V') {
                        if (c11 != 'X') {
                            if (c11 != 'L') {
                                if (c11 == 'M') {
                                    return 1000;
                                }
                                throw new NumberFormatException("Invalid Roman digit: " + c11);
                            }
                            return 50;
                        }
                        return 10;
                    }
                    return 5;
                }
                return 1;
            }
            return 500;
        }
        return 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidRomanCombination(char c11, char c12) {
        if (c11 == 'C') {
            return c12 == 'M' || c12 == 'D';
        } else if (c11 == 'I') {
            return c12 == 'X' || c12 == 'V';
        } else if (c11 != 'X') {
            return false;
        } else {
            return c12 == 'C' || c12 == 'L';
        }
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public boolean contains(char c11) {
        String digits = getDigits();
        int length = digits.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (digits.charAt(i11) == c11) {
                return true;
            }
        }
        return false;
    }

    public String getCode() {
        return this.code;
    }

    public String getDigits() {
        throw new AbstractMethodError();
    }

    public boolean isDecimal() {
        throw new AbstractMethodError();
    }

    public final int toInteger(String str) {
        return toInteger(str, net.time4j.format.g.SMART);
    }

    public String toNumeral(int i11) {
        if (isDecimal() && i11 >= 0) {
            int charAt = getDigits().charAt(0) - '0';
            String num = Integer.toString(i11);
            StringBuilder sb2 = new StringBuilder();
            int length = num.length();
            for (int i12 = 0; i12 < length; i12++) {
                sb2.append((char) (num.charAt(i12) + charAt));
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Cannot convert: " + i11);
    }

    private j(String str, int i11, String str2) {
        this.code = str2;
    }

    public int toInteger(String str, net.time4j.format.g gVar) {
        if (isDecimal()) {
            int charAt = getDigits().charAt(0) - '0';
            StringBuilder sb2 = new StringBuilder();
            int length = str.length();
            for (int i11 = 0; i11 < length; i11++) {
                sb2.append((char) (str.charAt(i11) - charAt));
            }
            int parseInt = Integer.parseInt(sb2.toString());
            if (parseInt >= 0) {
                return parseInt;
            }
            throw new NumberFormatException("Cannot convert negative number: " + str);
        }
        throw new NumberFormatException("Cannot convert: " + str);
    }

    public int toNumeral(int i11, Appendable appendable) {
        String numeral = toNumeral(i11);
        appendable.append(numeral);
        return numeral.length();
    }
}