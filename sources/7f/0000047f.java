package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f2956d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static h f2957e;

    /* renamed from: c  reason: collision with root package name */
    private BreakIterator f2958c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(Locale locale) {
            kotlin.jvm.internal.s.g(locale, "locale");
            if (h.f2957e == null) {
                h.f2957e = new h(locale, null);
            }
            h hVar = h.f2957e;
            Objects.requireNonNull(hVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return hVar;
        }
    }

    private h(Locale locale) {
        l(locale);
    }

    public /* synthetic */ h(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private final boolean i(int i11) {
        return i11 > 0 && j(i11 + (-1)) && (i11 == d().length() || !j(i11));
    }

    private final boolean j(int i11) {
        if (i11 < 0 || i11 >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i11));
    }

    private final boolean k(int i11) {
        return j(i11) && (i11 == 0 || !j(i11 - 1));
    }

    private final void l(Locale locale) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        kotlin.jvm.internal.s.f(wordInstance, "getWordInstance(locale)");
        this.f2958c = wordInstance;
    }

    @Override // androidx.compose.ui.platform.g
    public int[] a(int i11) {
        if (d().length() > 0 && i11 < d().length()) {
            if (i11 < 0) {
                i11 = 0;
            }
            while (!j(i11) && !k(i11)) {
                BreakIterator breakIterator = this.f2958c;
                if (breakIterator == null) {
                    kotlin.jvm.internal.s.x("impl");
                    breakIterator = null;
                }
                i11 = breakIterator.following(i11);
                if (i11 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.f2958c;
            if (breakIterator2 == null) {
                kotlin.jvm.internal.s.x("impl");
                breakIterator2 = null;
            }
            int following = breakIterator2.following(i11);
            if (following == -1 || !i(following)) {
                return null;
            }
            return c(i11, following);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.g
    public int[] b(int i11) {
        int length = d().length();
        if (length > 0 && i11 > 0) {
            if (i11 > length) {
                i11 = length;
            }
            while (i11 > 0 && !j(i11 - 1) && !i(i11)) {
                BreakIterator breakIterator = this.f2958c;
                if (breakIterator == null) {
                    kotlin.jvm.internal.s.x("impl");
                    breakIterator = null;
                }
                i11 = breakIterator.preceding(i11);
                if (i11 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.f2958c;
            if (breakIterator2 == null) {
                kotlin.jvm.internal.s.x("impl");
                breakIterator2 = null;
            }
            int preceding = breakIterator2.preceding(i11);
            if (preceding == -1 || !k(preceding)) {
                return null;
            }
            return c(preceding, i11);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.b
    public void e(String text) {
        kotlin.jvm.internal.s.g(text, "text");
        super.e(text);
        BreakIterator breakIterator = this.f2958c;
        if (breakIterator == null) {
            kotlin.jvm.internal.s.x("impl");
            breakIterator = null;
        }
        breakIterator.setText(text);
    }
}