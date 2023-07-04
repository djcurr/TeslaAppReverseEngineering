package net.time4j.calendar;

import java.text.ParsePosition;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class c extends n {

    /* renamed from: q  reason: collision with root package name */
    private static final c[] f40876q;
    private static final long serialVersionUID = 4908662352833192131L;

    /* loaded from: classes5.dex */
    class a extends j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f40877a;

        a(int i11) {
            this.f40877a = i11;
        }

        @Override // net.time4j.calendar.j
        public int d() {
            return (((this.f40877a - 1) * 60) + c.this.getNumber()) - 1;
        }
    }

    static {
        c[] cVarArr = new c[60];
        int i11 = 0;
        while (i11 < 60) {
            int i12 = i11 + 1;
            cVarArr[i11] = new c(i12);
            i11 = i12;
        }
        f40876q = cVarArr;
    }

    private c(int i11) {
        super(i11);
    }

    public static c q(int i11) {
        if (i11 >= 1 && i11 <= 60) {
            return f40876q[i11 - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c r(CharSequence charSequence, ParsePosition parsePosition, Locale locale, boolean z11) {
        n l11 = n.l(charSequence, parsePosition, locale, z11);
        if (l11 == null) {
            return null;
        }
        return q(l11.getNumber());
    }

    public j o(int i11) {
        if (i11 >= 1) {
            return new a(i11);
        }
        throw new IllegalArgumentException("Cycle number must not be smaller than 1: " + i11);
    }

    @Override // net.time4j.calendar.n
    Object readResolve() {
        return q(super.getNumber());
    }
}