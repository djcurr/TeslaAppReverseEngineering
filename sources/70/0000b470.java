package t3;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public class d implements Spannable {

    /* renamed from: a  reason: collision with root package name */
    private final Spannable f51604a;

    /* renamed from: b  reason: collision with root package name */
    private final a f51605b;

    /* renamed from: c  reason: collision with root package name */
    private final PrecomputedText f51606c;

    public a a() {
        return this.f51605b;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f51604a;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i11) {
        return this.f51604a.charAt(i11);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f51604a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f51604a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f51604a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i11, int i12, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (T[]) this.f51606c.getSpans(i11, i12, cls);
        }
        return (T[]) this.f51604a.getSpans(i11, i12, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f51604a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i11, int i12, Class cls) {
        return this.f51604a.nextSpanTransition(i11, i12, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f51606c.removeSpan(obj);
                return;
            } else {
                this.f51604a.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i11, int i12, int i13) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f51606c.setSpan(obj, i11, i12, i13);
                return;
            } else {
                this.f51604a.setSpan(obj, i11, i12, i13);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i11, int i12) {
        return this.f51604a.subSequence(i11, i12);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f51604a.toString();
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f51607a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f51608b;

        /* renamed from: c  reason: collision with root package name */
        private final int f51609c;

        /* renamed from: d  reason: collision with root package name */
        private final int f51610d;

        /* renamed from: t3.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C1143a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f51611a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f51612b;

            /* renamed from: c  reason: collision with root package name */
            private int f51613c;

            /* renamed from: d  reason: collision with root package name */
            private int f51614d;

            public C1143a(TextPaint textPaint) {
                this.f51611a = textPaint;
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 23) {
                    this.f51613c = 1;
                    this.f51614d = 1;
                } else {
                    this.f51614d = 0;
                    this.f51613c = 0;
                }
                if (i11 >= 18) {
                    this.f51612b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f51612b = null;
                }
            }

            public a a() {
                return new a(this.f51611a, this.f51612b, this.f51613c, this.f51614d);
            }

            public C1143a b(int i11) {
                this.f51613c = i11;
                return this;
            }

            public C1143a c(int i11) {
                this.f51614d = i11;
                return this;
            }

            public C1143a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f51612b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i11, int i12) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i11).setHyphenationFrequency(i12).setTextDirection(textDirectionHeuristic).build();
            }
            this.f51607a = textPaint;
            this.f51608b = textDirectionHeuristic;
            this.f51609c = i11;
            this.f51610d = i12;
        }

        public boolean a(a aVar) {
            int i11 = Build.VERSION.SDK_INT;
            if ((i11 < 23 || (this.f51609c == aVar.b() && this.f51610d == aVar.c())) && this.f51607a.getTextSize() == aVar.e().getTextSize() && this.f51607a.getTextScaleX() == aVar.e().getTextScaleX() && this.f51607a.getTextSkewX() == aVar.e().getTextSkewX()) {
                if ((i11 < 21 || (this.f51607a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f51607a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) && this.f51607a.getFlags() == aVar.e().getFlags()) {
                    if (i11 >= 24) {
                        if (!this.f51607a.getTextLocales().equals(aVar.e().getTextLocales())) {
                            return false;
                        }
                    } else if (i11 >= 17 && !this.f51607a.getTextLocale().equals(aVar.e().getTextLocale())) {
                        return false;
                    }
                    return this.f51607a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f51607a.getTypeface().equals(aVar.e().getTypeface());
                }
                return false;
            }
            return false;
        }

        public int b() {
            return this.f51609c;
        }

        public int c() {
            return this.f51610d;
        }

        public TextDirectionHeuristic d() {
            return this.f51608b;
        }

        public TextPaint e() {
            return this.f51607a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (a(aVar)) {
                    return Build.VERSION.SDK_INT < 18 || this.f51608b == aVar.d();
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 24) {
                return v3.c.b(Float.valueOf(this.f51607a.getTextSize()), Float.valueOf(this.f51607a.getTextScaleX()), Float.valueOf(this.f51607a.getTextSkewX()), Float.valueOf(this.f51607a.getLetterSpacing()), Integer.valueOf(this.f51607a.getFlags()), this.f51607a.getTextLocales(), this.f51607a.getTypeface(), Boolean.valueOf(this.f51607a.isElegantTextHeight()), this.f51608b, Integer.valueOf(this.f51609c), Integer.valueOf(this.f51610d));
            }
            if (i11 >= 21) {
                return v3.c.b(Float.valueOf(this.f51607a.getTextSize()), Float.valueOf(this.f51607a.getTextScaleX()), Float.valueOf(this.f51607a.getTextSkewX()), Float.valueOf(this.f51607a.getLetterSpacing()), Integer.valueOf(this.f51607a.getFlags()), this.f51607a.getTextLocale(), this.f51607a.getTypeface(), Boolean.valueOf(this.f51607a.isElegantTextHeight()), this.f51608b, Integer.valueOf(this.f51609c), Integer.valueOf(this.f51610d));
            }
            if (i11 >= 18) {
                return v3.c.b(Float.valueOf(this.f51607a.getTextSize()), Float.valueOf(this.f51607a.getTextScaleX()), Float.valueOf(this.f51607a.getTextSkewX()), Integer.valueOf(this.f51607a.getFlags()), this.f51607a.getTextLocale(), this.f51607a.getTypeface(), this.f51608b, Integer.valueOf(this.f51609c), Integer.valueOf(this.f51610d));
            }
            if (i11 >= 17) {
                return v3.c.b(Float.valueOf(this.f51607a.getTextSize()), Float.valueOf(this.f51607a.getTextScaleX()), Float.valueOf(this.f51607a.getTextSkewX()), Integer.valueOf(this.f51607a.getFlags()), this.f51607a.getTextLocale(), this.f51607a.getTypeface(), this.f51608b, Integer.valueOf(this.f51609c), Integer.valueOf(this.f51610d));
            }
            return v3.c.b(Float.valueOf(this.f51607a.getTextSize()), Float.valueOf(this.f51607a.getTextScaleX()), Float.valueOf(this.f51607a.getTextSkewX()), Integer.valueOf(this.f51607a.getFlags()), this.f51607a.getTypeface(), this.f51608b, Integer.valueOf(this.f51609c), Integer.valueOf(this.f51610d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f51607a.getTextSize());
            sb2.append(", textScaleX=" + this.f51607a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f51607a.getTextSkewX());
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 21) {
                sb2.append(", letterSpacing=" + this.f51607a.getLetterSpacing());
                sb2.append(", elegantTextHeight=" + this.f51607a.isElegantTextHeight());
            }
            if (i11 >= 24) {
                sb2.append(", textLocale=" + this.f51607a.getTextLocales());
            } else if (i11 >= 17) {
                sb2.append(", textLocale=" + this.f51607a.getTextLocale());
            }
            sb2.append(", typeface=" + this.f51607a.getTypeface());
            if (i11 >= 26) {
                sb2.append(", variationSettings=" + this.f51607a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f51608b);
            sb2.append(", breakStrategy=" + this.f51609c);
            sb2.append(", hyphenationFrequency=" + this.f51610d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f51607a = params.getTextPaint();
            this.f51608b = params.getTextDirection();
            this.f51609c = params.getBreakStrategy();
            this.f51610d = params.getHyphenationFrequency();
        }
    }
}