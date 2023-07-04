package v20;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public class c0 {

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f53901b = AtomicIntegerFieldUpdater.newUpdater(c0.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f53902a;

    public c0(Throwable th2, boolean z11) {
        this.f53902a = th2;
        this._handled = z11 ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return f53901b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return s0.a(this) + '[' + this.f53902a + ']';
    }

    public /* synthetic */ c0(Throwable th2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, (i11 & 2) != 0 ? false : z11);
    }
}