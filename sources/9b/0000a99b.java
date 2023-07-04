package p2;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f45893e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f45894a;

    /* renamed from: b  reason: collision with root package name */
    private final int f45895b;

    /* renamed from: c  reason: collision with root package name */
    private final int f45896c;

    /* renamed from: d  reason: collision with root package name */
    private final BreakIterator f45897d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(int i11) {
            int type = Character.getType(i11);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public b(CharSequence charSequence, int i11, int i12, Locale locale) {
        s.g(charSequence, "charSequence");
        this.f45894a = charSequence;
        boolean z11 = true;
        if (i11 >= 0 && i11 <= charSequence.length()) {
            if ((i12 < 0 || i12 > charSequence.length()) ? false : z11) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                s.f(wordInstance, "getWordInstance(locale)");
                this.f45897d = wordInstance;
                this.f45895b = Math.max(0, i11 - 50);
                this.f45896c = Math.min(charSequence.length(), i12 + 50);
                wordInstance.setText(new o2.b(charSequence, i11, i12));
                return;
            }
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
    }

    private final void a(int i11) {
        int i12 = this.f45895b;
        boolean z11 = false;
        if (i11 <= this.f45896c && i12 <= i11) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        throw new IllegalArgumentException(("Invalid offset: " + i11 + ". Valid range is [" + this.f45895b + " , " + this.f45896c + ']').toString());
    }

    private final int b(int i11, boolean z11) {
        a(i11);
        if (j(i11)) {
            return (!this.f45897d.isBoundary(i11) || (h(i11) && z11)) ? this.f45897d.preceding(i11) : i11;
        } else if (h(i11)) {
            return this.f45897d.preceding(i11);
        } else {
            return -1;
        }
    }

    private final int c(int i11, boolean z11) {
        a(i11);
        if (h(i11)) {
            return (!this.f45897d.isBoundary(i11) || (j(i11) && z11)) ? this.f45897d.following(i11) : i11;
        } else if (j(i11)) {
            return this.f45897d.following(i11);
        } else {
            return -1;
        }
    }

    private final boolean h(int i11) {
        return (i11 <= this.f45896c && this.f45895b + 1 <= i11) && Character.isLetterOrDigit(Character.codePointBefore(this.f45894a, i11));
    }

    private final boolean j(int i11) {
        return (i11 < this.f45896c && this.f45895b <= i11) && Character.isLetterOrDigit(Character.codePointAt(this.f45894a, i11));
    }

    private final boolean l(int i11) {
        return !k(i11) && i(i11);
    }

    private final boolean m(int i11) {
        return k(i11) && !i(i11);
    }

    public final int d(int i11) {
        return c(i11, true);
    }

    public final int e(int i11) {
        return b(i11, true);
    }

    public final int f(int i11) {
        a(i11);
        while (i11 != -1 && !m(i11)) {
            i11 = o(i11);
        }
        return i11;
    }

    public final int g(int i11) {
        a(i11);
        while (i11 != -1 && !l(i11)) {
            i11 = n(i11);
        }
        return i11;
    }

    public final boolean i(int i11) {
        boolean z11 = true;
        int i12 = this.f45895b + 1;
        if (i11 > this.f45896c || i12 > i11) {
            z11 = false;
        }
        if (z11) {
            return f45893e.a(Character.codePointBefore(this.f45894a, i11));
        }
        return false;
    }

    public final boolean k(int i11) {
        if (i11 < this.f45896c && this.f45895b <= i11) {
            return f45893e.a(Character.codePointAt(this.f45894a, i11));
        }
        return false;
    }

    public final int n(int i11) {
        a(i11);
        return this.f45897d.following(i11);
    }

    public final int o(int i11) {
        a(i11);
        return this.f45897d.preceding(i11);
    }
}