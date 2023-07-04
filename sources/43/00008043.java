package kotlinx.coroutines.selects;

import kotlinx.coroutines.internal.f0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f35586a = new f0("NOT_SELECTED");

    /* renamed from: b  reason: collision with root package name */
    private static final Object f35587b = new f0("ALREADY_SELECTED");

    /* renamed from: c  reason: collision with root package name */
    private static final Object f35588c = new f0("UNDECIDED");

    /* renamed from: d  reason: collision with root package name */
    private static final Object f35589d = new f0("RESUMED");

    /* renamed from: e  reason: collision with root package name */
    private static final f f35590e = new f();

    public static final Object d() {
        return f35587b;
    }

    public static final Object e() {
        return f35586a;
    }
}