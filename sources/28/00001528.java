package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import java.io.File;
import java.util.List;
import na.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c implements f, d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final List<ha.b> f10553a;

    /* renamed from: b  reason: collision with root package name */
    private final g<?> f10554b;

    /* renamed from: c  reason: collision with root package name */
    private final f.a f10555c;

    /* renamed from: d  reason: collision with root package name */
    private int f10556d;

    /* renamed from: e  reason: collision with root package name */
    private ha.b f10557e;

    /* renamed from: f  reason: collision with root package name */
    private List<na.n<File, ?>> f10558f;

    /* renamed from: g  reason: collision with root package name */
    private int f10559g;

    /* renamed from: h  reason: collision with root package name */
    private volatile n.a<?> f10560h;

    /* renamed from: i  reason: collision with root package name */
    private File f10561i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean a() {
        return this.f10559g < this.f10558f.size();
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void b(Exception exc) {
        this.f10555c.a(this.f10557e, exc, this.f10560h.f40735c, com.bumptech.glide.load.a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean c() {
        while (true) {
            boolean z11 = false;
            if (this.f10558f != null && a()) {
                this.f10560h = null;
                while (!z11 && a()) {
                    List<na.n<File, ?>> list = this.f10558f;
                    int i11 = this.f10559g;
                    this.f10559g = i11 + 1;
                    this.f10560h = list.get(i11).b(this.f10561i, this.f10554b.s(), this.f10554b.f(), this.f10554b.k());
                    if (this.f10560h != null && this.f10554b.t(this.f10560h.f40735c.a())) {
                        this.f10560h.f40735c.d(this.f10554b.l(), this);
                        z11 = true;
                    }
                }
                return z11;
            }
            int i12 = this.f10556d + 1;
            this.f10556d = i12;
            if (i12 >= this.f10553a.size()) {
                return false;
            }
            ha.b bVar = this.f10553a.get(this.f10556d);
            File a11 = this.f10554b.d().a(new d(bVar, this.f10554b.o()));
            this.f10561i = a11;
            if (a11 != null) {
                this.f10557e = bVar;
                this.f10558f = this.f10554b.j(a11);
                this.f10559g = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a<?> aVar = this.f10560h;
        if (aVar != null) {
            aVar.f40735c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void e(Object obj) {
        this.f10555c.e(this.f10557e, obj, this.f10560h.f40735c, com.bumptech.glide.load.a.DATA_DISK_CACHE, this.f10557e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(List<ha.b> list, g<?> gVar, f.a aVar) {
        this.f10556d = -1;
        this.f10553a = list;
        this.f10554b = gVar;
        this.f10555c = aVar;
    }
}