package y60;

import q70.h;
import q70.i;
import q70.k;

/* loaded from: classes5.dex */
public class b extends a {

    /* renamed from: c  reason: collision with root package name */
    private int f59239c;

    /* renamed from: d  reason: collision with root package name */
    private int f59240d;

    /* renamed from: e  reason: collision with root package name */
    private q70.b f59241e;

    /* renamed from: f  reason: collision with root package name */
    private i f59242f;

    /* renamed from: g  reason: collision with root package name */
    private h f59243g;

    /* renamed from: h  reason: collision with root package name */
    private q70.a f59244h;

    public b(int i11, int i12, q70.b bVar, i iVar, q70.a aVar, h hVar, String str) {
        super(true, str);
        this.f59239c = i11;
        this.f59240d = i12;
        this.f59241e = bVar;
        this.f59242f = iVar;
        this.f59244h = aVar;
        this.f59243g = hVar;
        new k(bVar, iVar).c();
    }

    public b(int i11, int i12, q70.b bVar, i iVar, h hVar, String str) {
        this(i11, i12, bVar, iVar, q70.c.a(bVar, iVar), hVar, str);
    }

    public q70.b c() {
        return this.f59241e;
    }

    public i d() {
        return this.f59242f;
    }

    public q70.a e() {
        return this.f59244h;
    }

    public int f() {
        return this.f59240d;
    }

    public int g() {
        return this.f59239c;
    }

    public h h() {
        return this.f59243g;
    }
}