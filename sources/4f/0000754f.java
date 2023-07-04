package ie;

import android.graphics.drawable.Animatable;
import ge.c;

/* loaded from: classes3.dex */
public class a extends c {

    /* renamed from: b  reason: collision with root package name */
    private long f30354b = -1;

    /* renamed from: c  reason: collision with root package name */
    private long f30355c = -1;

    /* renamed from: d  reason: collision with root package name */
    private b f30356d;

    public a(b bVar) {
        this.f30356d = bVar;
    }

    @Override // ge.c, ge.d
    public void l(String str, Object obj, Animatable animatable) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f30355c = currentTimeMillis;
        b bVar = this.f30356d;
        if (bVar != null) {
            bVar.a(currentTimeMillis - this.f30354b);
        }
    }

    @Override // ge.c, ge.d
    public void p(String str, Object obj) {
        this.f30354b = System.currentTimeMillis();
    }
}