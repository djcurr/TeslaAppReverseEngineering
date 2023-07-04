package kotlin.coroutines.jvm.internal;

/* loaded from: classes5.dex */
public final class c implements zz.d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f34887a = new c();

    private c() {
    }

    @Override // zz.d
    public zz.g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // zz.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}