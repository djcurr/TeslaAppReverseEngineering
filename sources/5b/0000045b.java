package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f2852d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static c f2853e;

    /* renamed from: c  reason: collision with root package name */
    private BreakIterator f2854c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(Locale locale) {
            kotlin.jvm.internal.s.g(locale, "locale");
            if (c.f2853e == null) {
                c.f2853e = new c(locale, null);
            }
            c cVar = c.f2853e;
            Objects.requireNonNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return cVar;
        }
    }

    private c(Locale locale) {
        i(locale);
    }

    public /* synthetic */ c(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private final void i(Locale locale) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        kotlin.jvm.internal.s.f(characterInstance, "getCharacterInstance(locale)");
        this.f2854c = characterInstance;
    }

    @Override // androidx.compose.ui.platform.g
    public int[] a(int i11) {
        int length = d().length();
        if (length > 0 && i11 < length) {
            if (i11 < 0) {
                i11 = 0;
            }
            do {
                BreakIterator breakIterator = this.f2854c;
                if (breakIterator == null) {
                    kotlin.jvm.internal.s.x("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i11)) {
                    BreakIterator breakIterator2 = this.f2854c;
                    if (breakIterator2 == null) {
                        kotlin.jvm.internal.s.x("impl");
                        breakIterator2 = null;
                    }
                    i11 = breakIterator2.following(i11);
                } else {
                    BreakIterator breakIterator3 = this.f2854c;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.s.x("impl");
                        breakIterator3 = null;
                    }
                    int following = breakIterator3.following(i11);
                    if (following == -1) {
                        return null;
                    }
                    return c(i11, following);
                }
            } while (i11 != -1);
            return null;
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
            do {
                BreakIterator breakIterator = this.f2854c;
                if (breakIterator == null) {
                    kotlin.jvm.internal.s.x("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i11)) {
                    BreakIterator breakIterator2 = this.f2854c;
                    if (breakIterator2 == null) {
                        kotlin.jvm.internal.s.x("impl");
                        breakIterator2 = null;
                    }
                    i11 = breakIterator2.preceding(i11);
                } else {
                    BreakIterator breakIterator3 = this.f2854c;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.s.x("impl");
                        breakIterator3 = null;
                    }
                    int preceding = breakIterator3.preceding(i11);
                    if (preceding == -1) {
                        return null;
                    }
                    return c(preceding, i11);
                }
            } while (i11 != -1);
            return null;
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.b
    public void e(String text) {
        kotlin.jvm.internal.s.g(text, "text");
        super.e(text);
        BreakIterator breakIterator = this.f2854c;
        if (breakIterator == null) {
            kotlin.jvm.internal.s.x("impl");
            breakIterator = null;
        }
        breakIterator.setText(text);
    }
}