package p1;

import h00.l;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final List<j> f45458a;

    /* renamed from: b  reason: collision with root package name */
    private s1.h f45459b;

    /* renamed from: c  reason: collision with root package name */
    private final l<String, b0> f45460c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public final List<j> a() {
        return this.f45458a;
    }

    public final s1.h b() {
        return this.f45459b;
    }

    public final l<String, b0> c() {
        return this.f45460c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return s.c(this.f45458a, hVar.f45458a) && s.c(this.f45459b, hVar.f45459b) && s.c(this.f45460c, hVar.f45460c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f45458a.hashCode() * 31;
        s1.h hVar = this.f45459b;
        int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        l<String, b0> lVar = this.f45460c;
        return hashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }
}