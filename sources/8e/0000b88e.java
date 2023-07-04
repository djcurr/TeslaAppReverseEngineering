package v2;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.s;
import wz.x;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f53879a = new b();

    private b() {
    }

    public final Object a(t2.f localeList) {
        int t11;
        s.g(localeList, "localeList");
        t11 = x.t(localeList, 10);
        ArrayList arrayList = new ArrayList(t11);
        Iterator<t2.e> it2 = localeList.iterator();
        while (it2.hasNext()) {
            arrayList.add(a.a(it2.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Locale[] localeArr = (Locale[]) array;
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(u2.g textPaint, t2.f localeList) {
        int t11;
        s.g(textPaint, "textPaint");
        s.g(localeList, "localeList");
        t11 = x.t(localeList, 10);
        ArrayList arrayList = new ArrayList(t11);
        Iterator<t2.e> it2 = localeList.iterator();
        while (it2.hasNext()) {
            arrayList.add(a.a(it2.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Locale[] localeArr = (Locale[]) array;
        textPaint.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}