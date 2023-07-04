package kotlinx.coroutines.internal;

/* loaded from: classes5.dex */
final class e extends h {

    /* renamed from: a  reason: collision with root package name */
    public static final e f35454a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final a f35455b = new a();

    /* loaded from: classes5.dex */
    public static final class a extends ClassValue<h00.l<? super Throwable, ? extends Throwable>> {
        a() {
        }
    }

    private e() {
    }

    @Override // kotlinx.coroutines.internal.h
    public h00.l<Throwable, Throwable> a(Class<? extends Throwable> cls) {
        return (h00.l) f35455b.get(cls);
    }
}