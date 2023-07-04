package a7;

import ch.qos.logback.core.CoreConstants;
import k7.c;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: b  reason: collision with root package name */
    private final String f312b;

    /* renamed from: c  reason: collision with root package name */
    private final String f313c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String name, String code, boolean z11) {
        super(name);
        s.g(name, "name");
        s.g(code, "code");
        this.f312b = name;
        this.f313c = code;
        this.f314d = z11;
    }

    public static /* synthetic */ a c(a aVar, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aVar.f312b;
        }
        if ((i11 & 2) != 0) {
            str2 = aVar.f313c;
        }
        if ((i11 & 4) != 0) {
            z11 = aVar.f314d;
        }
        return aVar.b(str, str2, z11);
    }

    public final a b(String name, String code, boolean z11) {
        s.g(name, "name");
        s.g(code, "code");
        return new a(name, code, z11);
    }

    public final String d() {
        return this.f313c;
    }

    public final String e() {
        return this.f312b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return s.c(this.f312b, aVar.f312b) && s.c(this.f313c, aVar.f313c) && this.f314d == aVar.f314d;
        }
        return false;
    }

    public final boolean f() {
        return this.f314d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f312b.hashCode() * 31) + this.f313c.hashCode()) * 31;
        boolean z11 = this.f314d;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public String toString() {
        return "AddressListItem(name=" + this.f312b + ", code=" + this.f313c + ", selected=" + this.f314d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}