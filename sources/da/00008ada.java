package net.time4j.calendar;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.time4j.b0;
import net.time4j.engine.u;
import net.time4j.g0;

/* loaded from: classes5.dex */
public enum o {
    MINOR_01_LICHUN_315,
    MAJOR_01_YUSHUI_330,
    MINOR_02_JINGZHE_345,
    MAJOR_02_CHUNFEN_000,
    MINOR_03_QINGMING_015,
    MAJOR_03_GUYU_030,
    MINOR_04_LIXIA_045,
    MAJOR_04_XIAOMAN_060,
    MINOR_05_MANGZHONG_075,
    MAJOR_05_XIAZHI_090,
    MINOR_06_XIAOSHU_105,
    MAJOR_06_DASHU_120,
    MINOR_07_LIQIU_135,
    MAJOR_07_CHUSHU_150,
    MINOR_08_BAILU_165,
    MAJOR_08_QIUFEN_180,
    MINOR_09_HANLU_195,
    MAJOR_09_SHUANGJIANG_210,
    MINOR_10_LIDONG_225,
    MAJOR_10_XIAOXUE_240,
    MINOR_11_DAXUE_255,
    MAJOR_11_DONGZHI_270,
    MINOR_12_XIAOHAN_285,
    MAJOR_12_DAHAN_300;
    
    private static final double MEAN_TROPICAL_YEAR = 365.242189d;
    private static final o[] ENUMS = values();
    private static final String[] SIMPLE = {"lichun", "yushui", "jingzhe", "chunfen", "qingming", "guyu", "lixia", "xiaoman", "mangzhong", "xiazhi", "xiaoshu", "dashu", "liqiu", "chushu", "bailu", "qiufen", "hanlu", "shuangjiang", "lidong", "xiaoxue", "daxue", "dongzhi", "xiaohan", "dahan"};
    private static final String[] TRANSSCRIPTION = {"lìchūn", "yǔshuǐ", "jīngzhé", "chūnfēn", "qīngmíng", "gǔyǔ", "lìxià", "xiǎomǎn", "mángzhòng", "xiàzhì", "xiǎoshǔ", "dàshǔ", "lìqiū", "chǔshǔ", "báilù", "qiūfēn", "hánlù", "shuāngjiàng", "lìdōng", "xiǎoxuě", "dàxuě", "dōngzhì", "xiǎohán", "dàhán"};
    private static final String[] CHINESE_SIMPLIFIED = {"立春", "雨水", "惊蛰", "春分", "清明", "谷雨", "立夏", "小满", "芒种", "夏至", "小暑", "大暑", "立秋", "处暑", "白露", "秋分", "寒露", "霜降", "立冬", "小雪", "大雪", "冬至", "小寒", "大寒"};
    private static final String[] CHINESE_TRADITIONAL = {"立春", "雨水", "驚蟄", "春分", "清明", "穀雨", "立夏", "小滿", "芒種", "夏至", "小暑", "大暑", "立秋", "處暑", "白露", "秋分", "寒露", "霜降", "立冬", "小雪", "大雪", "冬至", "小寒", "大寒"};
    private static final String[] KOREAN = {"입춘", "우수", "경칩", "춘분", "청명", "곡우", "입하", "소만", "망종", "하지", "소서", "대서", "입추", "처서", "백로", "추분", "한로", "상강", "입동", "소설", "대설", "동지", "소한", "대한"};
    private static final String[] VIETNAMESE = {"Lập xuân", "Vũ thủy", "Kinh trập", "Xuân phân", "Thanh minh", "Cốc vũ", "Lập hạ", "Tiểu mãn", "Mang chủng", "Hạ chí", "Tiểu thử", "Đại thử", "Lập thu", "Xử thử", "Bạch lộ", "Thu phân", "Hàn lộ", "Sương giáng", "Lập đông", "Tiểu tuyết", "Đại tuyết", "Đông chí", "Tiểu hàn", "Đại hàn"};
    private static final String[] JAPANESE = {"立春", "雨水", "啓蟄", "春分", "清明", "穀雨", "立夏", "小満", "芒種", "夏至", "小暑", "大暑", "立秋", "処暑", "白露", "秋分", "寒露", "霜降", "立冬", "小雪", "大雪", "冬至", "小寒", "大寒"};

    /* JADX INFO: Add missing generic type declarations: [D] */
    /* loaded from: classes5.dex */
    class a<D> implements u<D> {
        a() {
        }

        /* JADX WARN: Incorrect return type in method signature: (TD;)TD; */
        @Override // net.time4j.engine.u
        /* renamed from: a */
        public f apply(f fVar) {
            return o.this.onOrAfter(o.MINOR_01_LICHUN_315.onOrAfter(fVar.T().b(g0.N0(((g0) fVar.S(g0.class)).getYear(), 1, 1).b())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [D] */
    /* loaded from: classes5.dex */
    public class b<D> implements u<D> {
        b() {
        }

        /* JADX WARN: Incorrect return type in method signature: (TD;)TD; */
        @Override // net.time4j.engine.u
        /* renamed from: a */
        public f apply(f fVar) {
            return o.this.onOrAfter(fVar.T().b(o.newYear(fVar)));
        }
    }

    private b0 atOrAfter(b0 b0Var) {
        double solarLongitude = getSolarLongitude();
        double d11 = net.time4j.calendar.astro.c.h(b0Var).d();
        double modulo360 = ((modulo360(solarLongitude - solarLongitude(d11)) * MEAN_TROPICAL_YEAR) / 360.0d) + d11;
        double max = Math.max(d11, modulo360 - 5.0d);
        double d12 = modulo360 + 5.0d;
        while (true) {
            double d13 = (max + d12) / 2.0d;
            if (d12 - max < 1.0E-5d) {
                return net.time4j.calendar.astro.c.g(d13).i();
            }
            if (modulo360(solarLongitude(d13) - solarLongitude) < 180.0d) {
                d12 = d13;
            } else {
                max = d13;
            }
        }
    }

    private static String[] getTextForms(Locale locale) {
        if (locale.getLanguage().equals("zh")) {
            return locale.getCountry().equals("TW") ? CHINESE_TRADITIONAL : CHINESE_SIMPLIFIED;
        } else if (locale.getLanguage().equals("ko")) {
            return KOREAN;
        } else {
            if (locale.getLanguage().equals("vi")) {
                return VIETNAMESE;
            }
            if (locale.getLanguage().equals("ja")) {
                return JAPANESE;
            }
            return locale.getLanguage().isEmpty() ? SIMPLE : TRANSSCRIPTION;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <D extends f<?, D>> List<D> list(int i11, Class<D> cls) {
        ArrayList arrayList = new ArrayList(24);
        f onOrAfter = MINOR_01_LICHUN_315.onOrAfter((f) g0.N0(i11, 1, 1).S(cls));
        arrayList.add(onOrAfter);
        o[] values = values();
        for (int i12 = 1; i12 < 24; i12++) {
            onOrAfter = values[i12].onOrAfter(onOrAfter);
            arrayList.add(onOrAfter);
        }
        return arrayList;
    }

    private static double modulo360(double d11) {
        return d11 - (Math.floor(d11 / 360.0d) * 360.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <D extends f<?, ?>> long newYear(D d11) {
        return d11.T().p(d11.U(), d11.e0().getNumber());
    }

    public static o of(b0 b0Var) {
        return ENUMS[(((int) Math.floor(solarLongitude(net.time4j.calendar.astro.c.h(b0Var).d()) / 15.0d)) + 3) % 24];
    }

    public static o ofMajor(int i11) {
        if (i11 >= 1 && i11 <= 12) {
            return ENUMS[(i11 * 2) - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i11);
    }

    public static o ofMinor(int i11) {
        if (i11 >= 1 && i11 <= 12) {
            return ENUMS[(i11 - 1) * 2];
        }
        throw new IllegalArgumentException("Out of range: " + i11);
    }

    public static o parse(CharSequence charSequence, Locale locale) {
        o parse = parse(charSequence, locale, new ParsePosition(0));
        if (parse != null) {
            return parse;
        }
        throw new ParseException("Cannot parse: " + ((Object) charSequence), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double solarLongitude(double d11) {
        return net.time4j.calendar.astro.h.TIME4J.getFeature(d11, "solar-longitude");
    }

    public String getDisplayName(Locale locale) {
        return getTextForms(locale)[ordinal()];
    }

    public int getIndex() {
        return (ordinal() / 2) + 1;
    }

    public int getSolarLongitude() {
        return ((ordinal() + 21) % 24) * 15;
    }

    public boolean isMajor() {
        return ordinal() % 2 == 1;
    }

    public boolean isMinor() {
        return ordinal() % 2 == 0;
    }

    public <D extends f<?, D>> D onOrAfter(D d11) {
        d T = d11.T();
        long b11 = d11.b();
        return (D) T.b(atOrAfter(T.m(b11)).v0(T.h(b11)).d0().b());
    }

    public o roll(int i11) {
        return ENUMS[net.time4j.base.c.c(ordinal() + i11, 24)];
    }

    public <D extends f<?, D>> u<D> sinceLichun() {
        return new a();
    }

    public <D extends f<?, D>> u<D> sinceNewYear() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o parse(CharSequence charSequence, Locale locale, ParsePosition parsePosition) {
        String[] textForms = getTextForms(locale);
        boolean isEmpty = locale.getLanguage().isEmpty();
        int index = parsePosition.getIndex();
        for (int i11 = 0; i11 < textForms.length; i11++) {
            String str = textForms[i11];
            String charSequence2 = charSequence.subSequence(index, Math.min(charSequence.length(), str.length() + index)).toString();
            if ((isEmpty && charSequence2.equalsIgnoreCase(str)) || charSequence2.equals(str)) {
                parsePosition.setIndex(parsePosition.getIndex() + str.length());
                return ENUMS[i11];
            }
        }
        if (!locale.getLanguage().isEmpty() && textForms == TRANSSCRIPTION) {
            return parse(charSequence, Locale.ROOT, parsePosition);
        }
        parsePosition.setErrorIndex(parsePosition.getIndex());
        return null;
    }
}