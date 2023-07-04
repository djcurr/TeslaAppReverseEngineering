package s7;

import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final a f50307a;

    /* loaded from: classes.dex */
    public enum a {
        RESOLVER_ACTIVITY,
        DEFAULT_BROWSER,
        APPLICATION,
        UNKNOWN
    }

    public d(a type, ResolveInfo resolveInfo) {
        s.g(type, "type");
        this.f50307a = type;
    }

    public final a a() {
        return this.f50307a;
    }
}