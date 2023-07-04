package y60;

import q70.h;
import q70.i;
import q70.k;

/* loaded from: classes5.dex */
public class f extends d {

    /* renamed from: b  reason: collision with root package name */
    private int f59248b;

    /* renamed from: c  reason: collision with root package name */
    private int f59249c;

    /* renamed from: d  reason: collision with root package name */
    private q70.b f59250d;

    /* renamed from: e  reason: collision with root package name */
    private i f59251e;

    /* renamed from: f  reason: collision with root package name */
    private q70.a f59252f;

    /* renamed from: g  reason: collision with root package name */
    private h f59253g;

    /* renamed from: h  reason: collision with root package name */
    private h f59254h;

    public f(int i11, int i12, q70.b bVar, i iVar, h hVar, h hVar2, q70.a aVar) {
        super(true, null);
        this.f59249c = i12;
        this.f59248b = i11;
        this.f59250d = bVar;
        this.f59251e = iVar;
        this.f59252f = aVar;
        this.f59253g = hVar;
        this.f59254h = hVar2;
        q70.c.a(bVar, iVar);
        new k(bVar, iVar).c();
    }

    public q70.b b() {
        return this.f59250d;
    }

    public i c() {
        return this.f59251e;
    }

    public int d() {
        return this.f59249c;
    }

    public int e() {
        return this.f59248b;
    }

    public h f() {
        return this.f59253g;
    }

    public h g() {
        return this.f59254h;
    }

    public q70.a h() {
        return this.f59252f;
    }
}