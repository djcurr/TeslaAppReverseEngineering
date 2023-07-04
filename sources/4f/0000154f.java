package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import java.io.File;
import java.util.List;
import na.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s implements f, d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final f.a f10704a;

    /* renamed from: b  reason: collision with root package name */
    private final g<?> f10705b;

    /* renamed from: c  reason: collision with root package name */
    private int f10706c;

    /* renamed from: d  reason: collision with root package name */
    private int f10707d = -1;

    /* renamed from: e  reason: collision with root package name */
    private ha.b f10708e;

    /* renamed from: f  reason: collision with root package name */
    private List<na.n<File, ?>> f10709f;

    /* renamed from: g  reason: collision with root package name */
    private int f10710g;

    /* renamed from: h  reason: collision with root package name */
    private volatile n.a<?> f10711h;

    /* renamed from: i  reason: collision with root package name */
    private File f10712i;

    /* renamed from: j  reason: collision with root package name */
    private t f10713j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(g<?> gVar, f.a aVar) {
        this.f10705b = gVar;
        this.f10704a = aVar;
    }

    private boolean a() {
        return this.f10710g < this.f10709f.size();
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void b(Exception exc) {
        this.f10704a.a(this.f10713j, exc, this.f10711h.f40735c, com.bumptech.glide.load.a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean c() {
        List<ha.b> c11 = this.f10705b.c();
        boolean z11 = false;
        if (c11.isEmpty()) {
            return false;
        }
        List<Class<?>> m11 = this.f10705b.m();
        if (m11.isEmpty()) {
            if (File.class.equals(this.f10705b.q())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f10705b.i() + " to " + this.f10705b.q());
        }
        while (true) {
            if (this.f10709f != null && a()) {
                this.f10711h = null;
                while (!z11 && a()) {
                    List<na.n<File, ?>> list = this.f10709f;
                    int i11 = this.f10710g;
                    this.f10710g = i11 + 1;
                    this.f10711h = list.get(i11).b(this.f10712i, this.f10705b.s(), this.f10705b.f(), this.f10705b.k());
                    if (this.f10711h != null && this.f10705b.t(this.f10711h.f40735c.a())) {
                        this.f10711h.f40735c.d(this.f10705b.l(), this);
                        z11 = true;
                    }
                }
                return z11;
            }
            int i12 = this.f10707d + 1;
            this.f10707d = i12;
            if (i12 >= m11.size()) {
                int i13 = this.f10706c + 1;
                this.f10706c = i13;
                if (i13 >= c11.size()) {
                    return false;
                }
                this.f10707d = 0;
            }
            ha.b bVar = c11.get(this.f10706c);
            Class<?> cls = m11.get(this.f10707d);
            this.f10713j = new t(this.f10705b.b(), bVar, this.f10705b.o(), this.f10705b.s(), this.f10705b.f(), this.f10705b.r(cls), cls, this.f10705b.k());
            File a11 = this.f10705b.d().a(this.f10713j);
            this.f10712i = a11;
            if (a11 != null) {
                this.f10708e = bVar;
                this.f10709f = this.f10705b.j(a11);
                this.f10710g = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a<?> aVar = this.f10711h;
        if (aVar != null) {
            aVar.f40735c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void e(Object obj) {
        this.f10704a.e(this.f10708e, obj, this.f10711h.f40735c, com.bumptech.glide.load.a.RESOURCE_DISK_CACHE, this.f10713j);
    }
}