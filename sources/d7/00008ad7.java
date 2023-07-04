package net.time4j.calendar;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class n implements Comparable<n>, Serializable {

    /* renamed from: a */
    private static final String[] f40904a = {"jia", "yi", "bing", "ding", "wu", "ji", "geng", "xin", "ren", "gui"};

    /* renamed from: b */
    private static final String[] f40905b = {"jiǎ", "yǐ", "bǐng", "dīng", "wù", "jǐ", "gēng", "xīn", "rén", "guǐ"};

    /* renamed from: c */
    private static final String[] f40906c = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};

    /* renamed from: d */
    private static final String[] f40907d = {"갑", "을", "병", "정", "무", "기", "경", "신", "임", "계"};

    /* renamed from: e */
    private static final String[] f40908e = {"giáp", "ất", "bính", "đinh", "mậu", "kỷ", "canh", "tân", "nhâm", "quý"};

    /* renamed from: f */
    private static final String[] f40909f = {"Цзя", "И", "Бин", "Дин", "У", "Цзи", "Гэн", "Синь", "Жэнь", "Гуй"};

    /* renamed from: g */
    private static final String[] f40910g = {"zi", "chou", "yin", "mao", "chen", "si", "wu", "wei", "shen", "you", "xu", "hai"};

    /* renamed from: h */
    private static final String[] f40911h = {"zǐ", "chǒu", "yín", "mǎo", "chén", "sì", "wǔ", "wèi", "shēn", "yǒu", "xū", "hài"};

    /* renamed from: i */
    private static final String[] f40912i = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};

    /* renamed from: j */
    private static final String[] f40913j = {"자", "축", "인", "묘", "진", "사", "오", "미", "신", "유", "술", "해"};

    /* renamed from: k */
    private static final String[] f40914k = {"tí", "sửu", "dần", "mão", "thìn", "tị", "ngọ", "mùi", "thân", "dậu", "tuất", "hợi"};

    /* renamed from: l */
    private static final String[] f40915l = {"Цзы", "Чоу", "Инь", "Мао", "Чэнь", "Сы", "У", "Вэй", "Шэнь", "Ю", "Сюй", "Хай"};

    /* renamed from: m */
    private static final n[] f40916m;

    /* renamed from: n */
    private static final Map<String, String[]> f40917n;

    /* renamed from: o */
    private static final Map<String, String[]> f40918o;

    /* renamed from: p */
    private static final Set<String> f40919p;
    private static final long serialVersionUID = -4556668597489844917L;
    private final int number;

    /* loaded from: classes5.dex */
    public enum a {
        ZI_1_RAT,
        CHOU_2_OX,
        YIN_3_TIGER,
        MAO_4_HARE,
        CHEN_5_DRAGON,
        SI_6_SNAKE,
        WU_7_HORSE,
        WEI_8_SHEEP,
        SHEN_9_MONKEY,
        YOU_10_FOWL,
        XU_11_DOG,
        HAI_12_PIG;

        public String getDisplayName(Locale locale) {
            String language = locale.getLanguage();
            Map map = n.f40918o;
            if (language.isEmpty()) {
                language = "root";
            }
            String[] strArr = (String[]) map.get(language);
            if (strArr == null) {
                strArr = n.f40911h;
            }
            return strArr[ordinal()];
        }

        public String getZodiac(Locale locale) {
            return net.time4j.format.b.c("chinese", locale).m().get("zodiac-" + String.valueOf(ordinal() + 1));
        }
    }

    /* loaded from: classes5.dex */
    public enum b {
        JIA_1_WOOD_YANG,
        YI_2_WOOD_YIN,
        BING_3_FIRE_YANG,
        DING_4_FIRE_YIN,
        WU_5_EARTH_YANG,
        JI_6_EARTH_YIN,
        GENG_7_METAL_YANG,
        XIN_8_METAL_YIN,
        REN_9_WATER_YANG,
        GUI_10_WATER_YIN;

        public String getDisplayName(Locale locale) {
            String language = locale.getLanguage();
            Map map = n.f40917n;
            if (language.isEmpty()) {
                language = "root";
            }
            String[] strArr = (String[]) map.get(language);
            if (strArr == null) {
                strArr = n.f40905b;
            }
            return strArr[ordinal()];
        }
    }

    static {
        n[] nVarArr = new n[60];
        int i11 = 0;
        while (i11 < 60) {
            int i12 = i11 + 1;
            nVarArr[i11] = new n(i12);
            i11 = i12;
        }
        f40916m = nVarArr;
        HashMap hashMap = new HashMap();
        hashMap.put("root", f40904a);
        String[] strArr = f40906c;
        hashMap.put("zh", strArr);
        hashMap.put("ja", strArr);
        hashMap.put("ko", f40907d);
        hashMap.put("vi", f40908e);
        hashMap.put("ru", f40909f);
        f40917n = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("root", f40910g);
        String[] strArr2 = f40912i;
        hashMap2.put("zh", strArr2);
        hashMap2.put("ja", strArr2);
        hashMap2.put("ko", f40913j);
        hashMap2.put("vi", f40914k);
        hashMap2.put("ru", f40915l);
        f40918o = Collections.unmodifiableMap(hashMap2);
        HashSet hashSet = new HashSet();
        hashSet.add("zh");
        hashSet.add("ja");
        hashSet.add("ko");
        f40919p = Collections.unmodifiableSet(hashSet);
    }

    public n(int i11) {
        this.number = i11;
    }

    public static n i(int i11) {
        if (i11 >= 1 && i11 <= 60) {
            return f40916m[i11 - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i11);
    }

    public static n k(b bVar, a aVar) {
        int ordinal = bVar.ordinal();
        n i11 = i(ordinal + 1 + net.time4j.base.c.c((aVar.ordinal() - ordinal) * 25, 60));
        if (i11.h() == bVar && i11.f() == aVar) {
            return i11;
        }
        throw new IllegalArgumentException("Invalid combination of stem and branch.");
    }

    public static n l(CharSequence charSequence, ParsePosition parsePosition, Locale locale, boolean z11) {
        b bVar;
        a aVar;
        int i11;
        b[] bVarArr;
        Locale locale2 = locale;
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        boolean isEmpty = locale.getLanguage().isEmpty();
        int i12 = index + 1;
        if (i12 < length && index >= 0) {
            if (f40919p.contains(locale.getLanguage())) {
                b[] values = b.values();
                int length2 = values.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        bVar = null;
                        break;
                    }
                    bVar = values[i13];
                    if (bVar.getDisplayName(locale2).charAt(0) == charSequence.charAt(index)) {
                        break;
                    }
                    i13++;
                }
                if (bVar != null) {
                    a[] values2 = a.values();
                    int length3 = values2.length;
                    for (int i14 = 0; i14 < length3; i14++) {
                        aVar = values2[i14];
                        if (aVar.getDisplayName(locale2).charAt(0) == charSequence.charAt(i12)) {
                            index += 2;
                            break;
                        }
                    }
                }
                aVar = null;
            } else {
                while (true) {
                    if (i12 >= length) {
                        i12 = -1;
                        break;
                    } else if (charSequence.charAt(i12) == '-') {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 == -1) {
                    parsePosition.setErrorIndex(index);
                    return null;
                }
                b[] values3 = b.values();
                int length4 = values3.length;
                bVar = null;
                int i15 = 0;
                while (i15 < length4) {
                    b bVar2 = values3[i15];
                    String displayName = bVar2.getDisplayName(locale2);
                    int i16 = index;
                    while (true) {
                        if (i16 >= i12) {
                            bVarArr = values3;
                            break;
                        }
                        int i17 = i16 - index;
                        char charAt = charSequence.charAt(i16);
                        if (isEmpty) {
                            charAt = n(charAt);
                        }
                        char c11 = charAt;
                        bVarArr = values3;
                        if (i17 < displayName.length() && displayName.charAt(i17) == c11) {
                            if (i17 + 1 == displayName.length()) {
                                bVar = bVar2;
                                break;
                            }
                            i16++;
                            values3 = bVarArr;
                        }
                    }
                    i15++;
                    values3 = bVarArr;
                }
                if (bVar == null) {
                    if (z11 && !isEmpty && i12 + 1 < length) {
                        return l(charSequence, parsePosition, Locale.ROOT, true);
                    }
                    parsePosition.setErrorIndex(index);
                    return null;
                }
                a[] values4 = a.values();
                int length5 = values4.length;
                int i18 = 0;
                aVar = null;
                while (i18 < length5) {
                    a aVar2 = values4[i18];
                    String displayName2 = aVar2.getDisplayName(locale2);
                    int i19 = i12 + 1;
                    while (true) {
                        if (i19 >= length) {
                            i11 = index;
                            break;
                        }
                        int i21 = (i19 - i12) - 1;
                        char charAt2 = charSequence.charAt(i19);
                        if (isEmpty) {
                            charAt2 = n(charAt2);
                        }
                        char c12 = charAt2;
                        i11 = index;
                        if (i21 >= displayName2.length() || displayName2.charAt(i21) != c12) {
                            break;
                        } else if (i21 + 1 == displayName2.length()) {
                            index = i19 + 1;
                            aVar = aVar2;
                            break;
                        } else {
                            i19++;
                            index = i11;
                        }
                    }
                    index = i11;
                    i18++;
                    locale2 = locale;
                }
            }
            if (bVar != null && aVar != null) {
                parsePosition.setIndex(index);
                return k(bVar, aVar);
            } else if (z11 && !isEmpty) {
                return l(charSequence, parsePosition, Locale.ROOT, true);
            } else {
                parsePosition.setErrorIndex(index);
                return null;
            }
        }
        parsePosition.setErrorIndex(index);
        return null;
    }

    private static char n(char c11) {
        if (c11 != 224) {
            if (c11 != 249) {
                if (c11 != 275) {
                    if (c11 != 299) {
                        if (c11 != 363) {
                            if (c11 != 462) {
                                if (c11 != 464) {
                                    if (c11 != 466) {
                                        if (c11 == 232 || c11 == 233) {
                                            return 'e';
                                        }
                                        if (c11 == 236 || c11 == 237) {
                                            return 'i';
                                        }
                                        return c11;
                                    }
                                    return 'o';
                                }
                                return 'i';
                            }
                            return 'a';
                        }
                        return 'u';
                    }
                    return 'i';
                }
                return 'e';
            }
            return 'u';
        }
        return 'a';
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(n nVar) {
        if (getClass().equals(nVar.getClass())) {
            return this.number - ((n) n.class.cast(nVar)).number;
        }
        throw new ClassCastException("Cannot compare different types.");
    }

    public boolean equals(Object obj) {
        return getClass().equals(obj.getClass()) && this.number == ((n) obj).number;
    }

    public a f() {
        int i11 = this.number % 12;
        return a.values()[(i11 != 0 ? i11 : 12) - 1];
    }

    public String g(Locale locale) {
        b h11 = h();
        a f11 = f();
        String str = f40919p.contains(locale.getLanguage()) ? "" : "-";
        return h11.getDisplayName(locale) + str + f11.getDisplayName(locale);
    }

    public int getNumber() {
        return this.number;
    }

    public b h() {
        int i11 = this.number % 10;
        return b.values()[(i11 != 0 ? i11 : 10) - 1];
    }

    public int hashCode() {
        return this.number;
    }

    Object readResolve() {
        return i(this.number);
    }

    public String toString() {
        return g(Locale.ROOT) + "(" + String.valueOf(this.number) + ")";
    }
}