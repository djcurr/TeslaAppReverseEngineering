package b10;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class d implements l10.b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f7295b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final u10.f f7296a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(Object value, u10.f fVar) {
            kotlin.jvm.internal.s.g(value, "value");
            return b.h(value.getClass()) ? new o(fVar, (Enum) value) : value instanceof Annotation ? new e(fVar, (Annotation) value) : value instanceof Object[] ? new h(fVar, (Object[]) value) : value instanceof Class ? new k(fVar, (Class) value) : new q(fVar, value);
        }
    }

    private d(u10.f fVar) {
        this.f7296a = fVar;
    }

    public /* synthetic */ d(u10.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    @Override // l10.b
    public u10.f getName() {
        return this.f7296a;
    }
}