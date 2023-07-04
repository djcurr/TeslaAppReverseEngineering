package f70;

import f70.g;
import f70.i;
import f70.j;
import java.io.Serializable;
import java.util.Objects;
import java.util.Stack;

/* loaded from: classes5.dex */
class c implements Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private u f25933a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25934b;

    /* renamed from: c  reason: collision with root package name */
    private int f25935c;

    /* renamed from: d  reason: collision with root package name */
    private int f25936d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f25937e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f25938f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(int i11) {
        this.f25934b = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public c clone() {
        c cVar = new c(this.f25934b);
        cVar.f25933a = this.f25933a;
        cVar.f25935c = this.f25935c;
        cVar.f25936d = this.f25936d;
        cVar.f25937e = this.f25937e;
        cVar.f25938f = this.f25938f;
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        if (!this.f25937e || this.f25938f) {
            return Integer.MAX_VALUE;
        }
        return this.f25935c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f25936d;
    }

    public u d() {
        return this.f25933a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(int i11) {
        this.f25933a = null;
        this.f25935c = this.f25934b;
        this.f25936d = i11;
        this.f25937e = true;
        this.f25938f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.f25938f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.f25937e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(u uVar) {
        this.f25933a = uVar;
        int a11 = uVar.a();
        this.f25935c = a11;
        if (a11 == this.f25934b) {
            this.f25938f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Stack<u> stack, k kVar, byte[] bArr, byte[] bArr2, j jVar) {
        Objects.requireNonNull(jVar, "otsHashAddress == null");
        if (this.f25938f || !this.f25937e) {
            throw new IllegalStateException("finished or not initialized");
        }
        j jVar2 = (j) new j.b().g(jVar.b()).h(jVar.c()).p(this.f25936d).n(jVar.e()).o(jVar.f()).f(jVar.a()).l();
        g gVar = (g) new g.b().g(jVar2.b()).h(jVar2.c()).n(this.f25936d).k();
        kVar.h(kVar.g(bArr2, jVar2), bArr);
        u a11 = v.a(kVar, kVar.e(jVar2), (i) new i.b().g(jVar2.b()).h(jVar2.c()).n(this.f25936d).l());
        while (!stack.isEmpty() && stack.peek().a() == a11.a() && stack.peek().a() != this.f25934b) {
            g gVar2 = (g) new g.b().g(gVar.b()).h(gVar.c()).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a()).k();
            u b11 = v.b(kVar, stack.pop(), a11, gVar2);
            u uVar = new u(b11.a() + 1, b11.b());
            gVar = (g) new g.b().g(gVar2.b()).h(gVar2.c()).m(gVar2.e() + 1).n(gVar2.f()).f(gVar2.a()).k();
            a11 = uVar;
        }
        u uVar2 = this.f25933a;
        if (uVar2 == null) {
            this.f25933a = a11;
        } else if (uVar2.a() == a11.a()) {
            g gVar3 = (g) new g.b().g(gVar.b()).h(gVar.c()).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a()).k();
            a11 = new u(this.f25933a.a() + 1, v.b(kVar, this.f25933a, a11, gVar3).b());
            this.f25933a = a11;
            g gVar4 = (g) new g.b().g(gVar3.b()).h(gVar3.c()).m(gVar3.e() + 1).n(gVar3.f()).f(gVar3.a()).k();
        } else {
            stack.push(a11);
        }
        if (this.f25933a.a() == this.f25934b) {
            this.f25938f = true;
            return;
        }
        this.f25935c = a11.a();
        this.f25936d++;
    }
}