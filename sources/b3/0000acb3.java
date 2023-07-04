package q2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class f extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    private final float f47347a;

    /* renamed from: b  reason: collision with root package name */
    private final int f47348b;

    /* renamed from: c  reason: collision with root package name */
    private final float f47349c;

    /* renamed from: d  reason: collision with root package name */
    private final int f47350d;

    /* renamed from: e  reason: collision with root package name */
    private final float f47351e;

    /* renamed from: f  reason: collision with root package name */
    private final int f47352f;

    /* renamed from: g  reason: collision with root package name */
    private Paint.FontMetricsInt f47353g;

    /* renamed from: h  reason: collision with root package name */
    private int f47354h;

    /* renamed from: i  reason: collision with root package name */
    private int f47355i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f47356j;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public f(float f11, int i11, float f12, int i12, float f13, int i13) {
        this.f47347a = f11;
        this.f47348b = i11;
        this.f47349c = f12;
        this.f47350d = i12;
        this.f47351e = f13;
        this.f47352f = i13;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f47353g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        s.x("fontMetrics");
        return null;
    }

    public final int b() {
        if (this.f47356j) {
            return this.f47355i;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public final int c() {
        return this.f47352f;
    }

    public final int d() {
        if (this.f47356j) {
            return this.f47354h;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, Paint paint) {
        s.g(canvas, "canvas");
        s.g(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        float f11;
        int a11;
        s.g(paint, "paint");
        this.f47356j = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        s.f(fontMetricsInt2, "paint.fontMetricsInt");
        this.f47353g = fontMetricsInt2;
        if (a().descent > a().ascent) {
            int i13 = this.f47348b;
            if (i13 == 0) {
                f11 = this.f47347a * this.f47351e;
            } else if (i13 == 1) {
                f11 = this.f47347a * textSize;
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.f47354h = g.a(f11);
            int i14 = this.f47350d;
            if (i14 == 0) {
                a11 = g.a(this.f47349c * this.f47351e);
            } else if (i14 == 1) {
                a11 = g.a(this.f47349c * textSize);
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.f47355i = a11;
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = a().ascent;
                fontMetricsInt.descent = a().descent;
                fontMetricsInt.leading = a().leading;
                switch (c()) {
                    case 0:
                        if (fontMetricsInt.ascent > (-b())) {
                            fontMetricsInt.ascent = -b();
                            break;
                        }
                        break;
                    case 1:
                    case 4:
                        if (fontMetricsInt.ascent + b() > fontMetricsInt.descent) {
                            fontMetricsInt.descent = fontMetricsInt.ascent + b();
                            break;
                        }
                        break;
                    case 2:
                    case 5:
                        if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                            fontMetricsInt.ascent = fontMetricsInt.descent - b();
                            break;
                        }
                        break;
                    case 3:
                    case 6:
                        if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                            int b11 = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                            fontMetricsInt.ascent = b11;
                            fontMetricsInt.descent = b11 + b();
                            break;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown verticalAlign.");
                }
                fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
            }
            return d();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }
}