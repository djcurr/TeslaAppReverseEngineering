package g2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final h00.a<T> f27351a;

    /* JADX WARN: Multi-variable type inference failed */
    private a(h00.a<? extends T> aVar) {
        this.f27351a = aVar;
    }

    public /* synthetic */ a(h00.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final h00.a<T> a() {
        return this.f27351a;
    }
}