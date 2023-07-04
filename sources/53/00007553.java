package p001if;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import lf.b;
import p001if.c;
import vf.a;

/* renamed from: if.c */
/* loaded from: classes3.dex */
public class c<T extends c> {

    /* renamed from: a */
    private int f30373a = 100;

    /* renamed from: b */
    private int f30374b = Integer.MAX_VALUE;

    /* renamed from: c */
    private boolean f30375c;

    /* renamed from: d */
    private boolean f30376d;

    /* renamed from: e */
    private boolean f30377e;

    /* renamed from: f */
    private boolean f30378f;

    /* renamed from: g */
    private Bitmap.Config f30379g;

    /* renamed from: h */
    private Bitmap.Config f30380h;

    /* renamed from: i */
    private b f30381i;

    /* renamed from: j */
    private a f30382j;

    /* renamed from: k */
    private ColorSpace f30383k;

    /* renamed from: l */
    private boolean f30384l;

    public c() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f30379g = config;
        this.f30380h = config;
    }

    public b a() {
        return new b(this);
    }

    public Bitmap.Config b() {
        return this.f30380h;
    }

    public Bitmap.Config c() {
        return this.f30379g;
    }

    public a d() {
        return this.f30382j;
    }

    public ColorSpace e() {
        return this.f30383k;
    }

    public b f() {
        return this.f30381i;
    }

    public boolean g() {
        return this.f30377e;
    }

    public boolean h() {
        return this.f30375c;
    }

    public boolean i() {
        return this.f30384l;
    }

    public boolean j() {
        return this.f30378f;
    }

    public int k() {
        return this.f30374b;
    }

    public int l() {
        return this.f30373a;
    }

    public boolean m() {
        return this.f30376d;
    }
}