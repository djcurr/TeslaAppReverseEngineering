package zj;

import ak.k0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class e implements com.google.android.exoplayer2.upstream.a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f60432a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<n> f60433b = new ArrayList<>(1);

    /* renamed from: c  reason: collision with root package name */
    private int f60434c;

    /* renamed from: d  reason: collision with root package name */
    private com.google.android.exoplayer2.upstream.b f60435d;

    /* JADX INFO: Access modifiers changed from: protected */
    public e(boolean z11) {
        this.f60432a = z11;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public final void b(n nVar) {
        ak.a.e(nVar);
        if (this.f60433b.contains(nVar)) {
            return;
        }
        this.f60433b.add(nVar);
        this.f60434c++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(int i11) {
        com.google.android.exoplayer2.upstream.b bVar = (com.google.android.exoplayer2.upstream.b) k0.j(this.f60435d);
        for (int i12 = 0; i12 < this.f60434c; i12++) {
            this.f60433b.get(i12).f(this, bVar, this.f60432a, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p() {
        com.google.android.exoplayer2.upstream.b bVar = (com.google.android.exoplayer2.upstream.b) k0.j(this.f60435d);
        for (int i11 = 0; i11 < this.f60434c; i11++) {
            this.f60433b.get(i11).b(this, bVar, this.f60432a);
        }
        this.f60435d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q(com.google.android.exoplayer2.upstream.b bVar) {
        for (int i11 = 0; i11 < this.f60434c; i11++) {
            this.f60433b.get(i11).h(this, bVar, this.f60432a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(com.google.android.exoplayer2.upstream.b bVar) {
        this.f60435d = bVar;
        for (int i11 = 0; i11 < this.f60434c; i11++) {
            this.f60433b.get(i11).g(this, bVar, this.f60432a);
        }
    }
}