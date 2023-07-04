package o2;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final vz.k f42138a;

    /* renamed from: b  reason: collision with root package name */
    private final vz.k f42139b;

    /* renamed from: c  reason: collision with root package name */
    private final vz.k f42140c;

    /* loaded from: classes.dex */
    static final class a extends u implements h00.a<BoringLayout.Metrics> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f42141a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CharSequence f42142b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextPaint f42143c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, CharSequence charSequence, TextPaint textPaint) {
            super(0);
            this.f42141a = i11;
            this.f42142b = charSequence;
            this.f42143c = textPaint;
        }

        @Override // h00.a
        /* renamed from: a */
        public final BoringLayout.Metrics invoke() {
            return o2.a.f42130a.b(this.f42142b, this.f42143c, q.a(this.f42141a));
        }
    }

    /* loaded from: classes.dex */
    static final class b extends u implements h00.a<Float> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CharSequence f42145b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextPaint f42146c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence, TextPaint textPaint) {
            super(0);
            this.f42145b = charSequence;
            this.f42146c = textPaint;
        }

        @Override // h00.a
        /* renamed from: a */
        public final Float invoke() {
            float floatValue;
            boolean e11;
            BoringLayout.Metrics a11 = d.this.a();
            Float valueOf = a11 == null ? null : Float.valueOf(a11.width);
            if (valueOf == null) {
                CharSequence charSequence = this.f42145b;
                floatValue = Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.f42146c);
            } else {
                floatValue = valueOf.floatValue();
            }
            e11 = f.e(floatValue, this.f42145b, this.f42146c);
            if (e11) {
                floatValue += 0.5f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* loaded from: classes.dex */
    static final class c extends u implements h00.a<Float> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CharSequence f42147a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextPaint f42148b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence, TextPaint textPaint) {
            super(0);
            this.f42147a = charSequence;
            this.f42148b = textPaint;
        }

        @Override // h00.a
        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf(f.c(this.f42147a, this.f42148b));
        }
    }

    public d(CharSequence charSequence, TextPaint textPaint, int i11) {
        vz.k b11;
        vz.k b12;
        vz.k b13;
        s.g(charSequence, "charSequence");
        s.g(textPaint, "textPaint");
        kotlin.b bVar = kotlin.b.NONE;
        b11 = vz.m.b(bVar, new a(i11, charSequence, textPaint));
        this.f42138a = b11;
        b12 = vz.m.b(bVar, new c(charSequence, textPaint));
        this.f42139b = b12;
        b13 = vz.m.b(bVar, new b(charSequence, textPaint));
        this.f42140c = b13;
    }

    public final BoringLayout.Metrics a() {
        return (BoringLayout.Metrics) this.f42138a.getValue();
    }

    public final float b() {
        return ((Number) this.f42140c.getValue()).floatValue();
    }

    public final float c() {
        return ((Number) this.f42139b.getValue()).floatValue();
    }
}