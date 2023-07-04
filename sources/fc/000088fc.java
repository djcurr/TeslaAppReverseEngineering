package n00;

import ch.qos.logback.classic.spi.CallerData;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class x implements WildcardType, Type {

    /* renamed from: c  reason: collision with root package name */
    public static final a f40149c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final x f40150d = new x(null, null);

    /* renamed from: a  reason: collision with root package name */
    private final Type f40151a;

    /* renamed from: b  reason: collision with root package name */
    private final Type f40152b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a() {
            return x.f40150d;
        }
    }

    public x(Type type, Type type2) {
        this.f40151a = type;
        this.f40152b = type2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.f40152b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        String h11;
        String h12;
        if (this.f40152b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("? super ");
            h12 = w.h(this.f40152b);
            sb2.append(h12);
            return sb2.toString();
        }
        Type type = this.f40151a;
        if (type == null || kotlin.jvm.internal.s.c(type, Object.class)) {
            return CallerData.NA;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("? extends ");
        h11 = w.h(this.f40151a);
        sb3.append(h11);
        return sb3.toString();
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f40151a;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}