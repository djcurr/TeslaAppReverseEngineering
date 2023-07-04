package p2;

import java.util.Locale;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f45892a;

    public a(Locale locale, CharSequence text) {
        s.g(locale, "locale");
        s.g(text, "text");
        this.f45892a = new b(text, 0, text.length(), locale);
    }

    public final int a(int i11) {
        int d11;
        if (this.f45892a.i(this.f45892a.n(i11))) {
            d11 = this.f45892a.g(i11);
        } else {
            d11 = this.f45892a.d(i11);
        }
        return d11 == -1 ? i11 : d11;
    }

    public final int b(int i11) {
        int e11;
        if (this.f45892a.k(this.f45892a.o(i11))) {
            e11 = this.f45892a.f(i11);
        } else {
            e11 = this.f45892a.e(i11);
        }
        return e11 == -1 ? i11 : e11;
    }
}