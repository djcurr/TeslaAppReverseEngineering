package d2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f23297a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f23298b;

    public d(boolean z11, boolean z12) {
        this.f23297a = z11;
        this.f23298b = z12;
    }

    public final boolean a() {
        return this.f23298b;
    }

    public final boolean b() {
        return this.f23297a;
    }

    public final void c(boolean z11) {
        this.f23298b = z11;
    }

    public final void d(boolean z11) {
        this.f23297a = z11;
    }

    public /* synthetic */ d(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12);
    }
}