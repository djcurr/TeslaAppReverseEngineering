package om;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import om.d;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private int f42747a;

    /* renamed from: b  reason: collision with root package name */
    private d.a f42748b = d.a.DEFAULT;

    /* renamed from: om.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0852a implements d {

        /* renamed from: d  reason: collision with root package name */
        private final int f42749d;

        /* renamed from: e  reason: collision with root package name */
        private final d.a f42750e;

        C0852a(int i11, d.a aVar) {
            this.f42749d = i11;
            this.f42750e = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f42749d == dVar.tag() && this.f42750e.equals(dVar.intEncoding());
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.f42749d ^ 14552422) + (this.f42750e.hashCode() ^ 2041407134);
        }

        @Override // om.d
        public d.a intEncoding() {
            return this.f42750e;
        }

        @Override // om.d
        public int tag() {
            return this.f42749d;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + CoreConstants.LEFT_PARENTHESIS_CHAR + "tag=" + this.f42749d + "intEncoding=" + this.f42750e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0852a(this.f42747a, this.f42748b);
    }

    public a c(int i11) {
        this.f42747a = i11;
        return this;
    }
}