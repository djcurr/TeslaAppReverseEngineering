package tk;

import android.graphics.Typeface;

/* loaded from: classes3.dex */
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Typeface f52321a;

    /* renamed from: b  reason: collision with root package name */
    private final InterfaceC1155a f52322b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f52323c;

    /* renamed from: tk.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC1155a {
        void a(Typeface typeface);
    }

    public a(InterfaceC1155a interfaceC1155a, Typeface typeface) {
        this.f52321a = typeface;
        this.f52322b = interfaceC1155a;
    }

    private void d(Typeface typeface) {
        if (this.f52323c) {
            return;
        }
        this.f52322b.a(typeface);
    }

    @Override // tk.f
    public void a(int i11) {
        d(this.f52321a);
    }

    @Override // tk.f
    public void b(Typeface typeface, boolean z11) {
        d(typeface);
    }

    public void c() {
        this.f52323c = true;
    }
}