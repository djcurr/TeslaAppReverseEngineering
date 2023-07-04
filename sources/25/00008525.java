package m0;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final float f37900a;

    /* renamed from: b  reason: collision with root package name */
    private final t1.s f37901b;

    private e(float f11, t1.s sVar) {
        this.f37900a = f11;
        this.f37901b = sVar;
    }

    public /* synthetic */ e(float f11, t1.s sVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, sVar);
    }

    public final t1.s a() {
        return this.f37901b;
    }

    public final float b() {
        return this.f37900a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return x2.g.h(b(), eVar.b()) && kotlin.jvm.internal.s.c(this.f37901b, eVar.f37901b);
        }
        return false;
    }

    public int hashCode() {
        return (x2.g.i(b()) * 31) + this.f37901b.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) x2.g.k(b())) + ", brush=" + this.f37901b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}