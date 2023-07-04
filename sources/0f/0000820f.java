package l2;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final h00.a<Float> f36416a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.a<Float> f36417b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f36418c;

    public i(h00.a<Float> value, h00.a<Float> maxValue, boolean z11) {
        kotlin.jvm.internal.s.g(value, "value");
        kotlin.jvm.internal.s.g(maxValue, "maxValue");
        this.f36416a = value;
        this.f36417b = maxValue;
        this.f36418c = z11;
    }

    public final h00.a<Float> a() {
        return this.f36417b;
    }

    public final boolean b() {
        return this.f36418c;
    }

    public final h00.a<Float> c() {
        return this.f36416a;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + this.f36416a.invoke().floatValue() + ", maxValue=" + this.f36417b.invoke().floatValue() + ", reverseScrolling=" + this.f36418c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}