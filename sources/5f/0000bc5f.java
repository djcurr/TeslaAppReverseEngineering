package w5;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class m extends f {

    /* renamed from: a  reason: collision with root package name */
    private final okio.h f55630a;

    /* renamed from: b  reason: collision with root package name */
    private final String f55631b;

    /* renamed from: c  reason: collision with root package name */
    private final v5.b f55632c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(okio.h source, String str, v5.b dataSource) {
        super(null);
        s.g(source, "source");
        s.g(dataSource, "dataSource");
        this.f55630a = source;
        this.f55631b = str;
        this.f55632c = dataSource;
    }

    public final v5.b a() {
        return this.f55632c;
    }

    public final String b() {
        return this.f55631b;
    }

    public final okio.h c() {
        return this.f55630a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m) {
                m mVar = (m) obj;
                return s.c(this.f55630a, mVar.f55630a) && s.c(this.f55631b, mVar.f55631b) && s.c(this.f55632c, mVar.f55632c);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        okio.h hVar = this.f55630a;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        String str = this.f55631b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        v5.b bVar = this.f55632c;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "SourceResult(source=" + this.f55630a + ", mimeType=" + this.f55631b + ", dataSource=" + this.f55632c + ")";
    }
}