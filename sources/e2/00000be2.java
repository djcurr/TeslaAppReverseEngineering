package b10;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l10.x;

/* loaded from: classes5.dex */
public abstract class w implements l10.x {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7324a = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w a(Type type) {
            w iVar;
            kotlin.jvm.internal.s.g(type, "type");
            boolean z11 = type instanceof Class;
            if (z11) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new v(cls);
                }
            }
            if (!(type instanceof GenericArrayType) && (!z11 || !((Class) type).isArray())) {
                iVar = type instanceof WildcardType ? new z((WildcardType) type) : new l(type);
            } else {
                iVar = new i(type);
            }
            return iVar;
        }
    }

    protected abstract Type P();

    public boolean equals(Object obj) {
        return (obj instanceof w) && kotlin.jvm.internal.s.c(P(), ((w) obj).P());
    }

    public int hashCode() {
        return P().hashCode();
    }

    @Override // l10.d
    public l10.a l(u10.c cVar) {
        return x.a.a(this, cVar);
    }

    public String toString() {
        return getClass().getName() + ": " + P();
    }
}