package yz;

import java.util.Comparator;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
final class f implements Comparator<Comparable<? super Object>> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f59932a = new f();

    private f() {
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(Comparable<Object> a11, Comparable<Object> b11) {
        s.g(a11, "a");
        s.g(b11, "b");
        return b11.compareTo(a11);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return e.f59931a;
    }
}