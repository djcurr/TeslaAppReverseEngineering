package uu;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: uu.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1205a extends a {

        /* renamed from: a  reason: collision with root package name */
        private final h f53663a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1205a(h request) {
            super(null);
            s.g(request, "request");
            this.f53663a = request;
        }

        public final h a() {
            return this.f53663a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1205a) && s.c(this.f53663a, ((C1205a) obj).f53663a);
        }

        public int hashCode() {
            return this.f53663a.hashCode();
        }

        public String toString() {
            h hVar = this.f53663a;
            return "Request(request=" + hVar + ")";
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final yt.b f53664a;

        /* renamed from: b  reason: collision with root package name */
        private final String f53665b;

        /* renamed from: c  reason: collision with root package name */
        private final ot.d f53666c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f53667d;

        /* renamed from: e  reason: collision with root package name */
        private final String f53668e;

        /* renamed from: f  reason: collision with root package name */
        private final okio.i f53669f;

        /* renamed from: g  reason: collision with root package name */
        private final String f53670g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(yt.b domain, String vehicleId, ot.d source, boolean z11, String str, okio.i iVar, String str2) {
            super(null);
            s.g(domain, "domain");
            s.g(vehicleId, "vehicleId");
            s.g(source, "source");
            this.f53664a = domain;
            this.f53665b = vehicleId;
            this.f53666c = source;
            this.f53667d = z11;
            this.f53668e = str;
            this.f53669f = iVar;
            this.f53670g = str2;
        }

        public final String a() {
            return this.f53668e;
        }

        public final String b() {
            return this.f53670g;
        }

        public final boolean c() {
            return this.f53667d;
        }

        public final okio.i d() {
            return this.f53669f;
        }

        public final ot.d e() {
            return this.f53666c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f53664a == bVar.f53664a && s.c(this.f53665b, bVar.f53665b) && this.f53666c == bVar.f53666c && this.f53667d == bVar.f53667d && s.c(this.f53668e, bVar.f53668e) && s.c(this.f53669f, bVar.f53669f) && s.c(this.f53670g, bVar.f53670g);
            }
            return false;
        }

        public final String f() {
            return this.f53665b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((this.f53664a.hashCode() * 31) + this.f53665b.hashCode()) * 31) + this.f53666c.hashCode()) * 31;
            boolean z11 = this.f53667d;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode + i11) * 31;
            String str = this.f53668e;
            int hashCode2 = (i12 + (str == null ? 0 : str.hashCode())) * 31;
            okio.i iVar = this.f53669f;
            int hashCode3 = (hashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
            String str2 = this.f53670g;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            yt.b bVar = this.f53664a;
            String str = this.f53665b;
            ot.d dVar = this.f53666c;
            boolean z11 = this.f53667d;
            String str2 = this.f53668e;
            okio.i iVar = this.f53669f;
            String str3 = this.f53670g;
            return "SessionInfoRequest(domain=" + bVar + ", vehicleId=" + str + ", source=" + dVar + ", letSleep=" + z11 + ", dependentCommand=" + str2 + ", remotePublicKey=" + iVar + ", dependentCommandVin=" + str3 + ")";
        }
    }

    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}