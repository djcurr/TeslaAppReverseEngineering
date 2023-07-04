package e10;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public interface o {
    Set<String> a(u10.c cVar);

    l10.u b(u10.c cVar);

    l10.g c(a aVar);

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final u10.b f24474a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f24475b;

        /* renamed from: c  reason: collision with root package name */
        private final l10.g f24476c;

        public a(u10.b classId, byte[] bArr, l10.g gVar) {
            kotlin.jvm.internal.s.g(classId, "classId");
            this.f24474a = classId;
            this.f24475b = bArr;
            this.f24476c = gVar;
        }

        public final u10.b a() {
            return this.f24474a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return kotlin.jvm.internal.s.c(this.f24474a, aVar.f24474a) && kotlin.jvm.internal.s.c(this.f24475b, aVar.f24475b) && kotlin.jvm.internal.s.c(this.f24476c, aVar.f24476c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f24474a.hashCode() * 31;
            byte[] bArr = this.f24475b;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            l10.g gVar = this.f24476c;
            return hashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.f24474a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f24475b) + ", outerClass=" + this.f24476c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ a(u10.b bVar, byte[] bArr, l10.g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i11 & 2) != 0 ? null : bArr, (i11 & 4) != 0 ? null : gVar);
        }
    }
}