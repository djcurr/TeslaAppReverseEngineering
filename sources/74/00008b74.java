package net.time4j.format;

import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: classes5.dex */
public interface i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f41250a = new a();

    /* loaded from: classes5.dex */
    static class a implements i {
        a() {
        }

        private DecimalFormatSymbols g(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }

        @Override // net.time4j.format.i
        public Locale[] a() {
            return DecimalFormatSymbols.getAvailableLocales();
        }

        @Override // net.time4j.format.i
        public char b(Locale locale) {
            return g(locale).getDecimalSeparator();
        }

        @Override // net.time4j.format.i
        public String c(Locale locale) {
            return locale.getLanguage().equals("ar") ? "\u200f+" : String.valueOf('+');
        }

        @Override // net.time4j.format.i
        public j d(Locale locale) {
            return j.ARABIC;
        }

        @Override // net.time4j.format.i
        public String e(Locale locale) {
            return locale.getLanguage().equals("ar") ? "\u200f-" : String.valueOf(g(locale).getMinusSign());
        }

        @Override // net.time4j.format.i
        public char f(Locale locale) {
            return g(locale).getZeroDigit();
        }
    }

    Locale[] a();

    char b(Locale locale);

    String c(Locale locale);

    j d(Locale locale);

    String e(Locale locale);

    char f(Locale locale);
}