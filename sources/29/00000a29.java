package at;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class j implements e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f6730b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final ct.i f6731a;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(Context context) {
            s.g(context, "context");
            ct.i i11 = ct.i.i();
            s.f(i11, "getDB()");
            return new j(i11, null);
        }
    }

    private j(ct.i iVar) {
        this.f6731a = iVar;
    }

    public /* synthetic */ j(ct.i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar);
    }

    @Override // at.e
    public void a(String key, String value) {
        s.g(key, "key");
        s.g(value, "value");
        this.f6731a.t(key, value);
    }

    @Override // at.e
    public void b(String key) {
        s.g(key, "key");
        this.f6731a.q(key);
    }

    @Override // at.e
    public String getString(String key) {
        s.g(key, "key");
        return this.f6731a.g(key);
    }
}