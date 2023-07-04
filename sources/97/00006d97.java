package f70;

import f70.g;
import f70.i;
import f70.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public final class a implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private transient k f25916a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25917b;

    /* renamed from: c  reason: collision with root package name */
    private final List<c> f25918c;

    /* renamed from: d  reason: collision with root package name */
    private int f25919d;

    /* renamed from: e  reason: collision with root package name */
    private u f25920e;

    /* renamed from: f  reason: collision with root package name */
    private List<u> f25921f;

    /* renamed from: g  reason: collision with root package name */
    private Map<Integer, LinkedList<u>> f25922g;

    /* renamed from: h  reason: collision with root package name */
    private Stack<u> f25923h;

    /* renamed from: i  reason: collision with root package name */
    private Map<Integer, u> f25924i;

    /* renamed from: j  reason: collision with root package name */
    private int f25925j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f25926k;

    /* renamed from: l  reason: collision with root package name */
    private transient int f25927l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(a aVar) {
        this.f25916a = new k(aVar.f25916a.d());
        this.f25917b = aVar.f25917b;
        this.f25919d = aVar.f25919d;
        this.f25920e = aVar.f25920e;
        ArrayList arrayList = new ArrayList();
        this.f25921f = arrayList;
        arrayList.addAll(aVar.f25921f);
        this.f25922g = new TreeMap();
        for (Integer num : aVar.f25922g.keySet()) {
            this.f25922g.put(num, (LinkedList) aVar.f25922g.get(num).clone());
        }
        Stack<u> stack = new Stack<>();
        this.f25923h = stack;
        stack.addAll(aVar.f25923h);
        this.f25918c = new ArrayList();
        for (c cVar : aVar.f25918c) {
            this.f25918c.add(cVar.clone());
        }
        this.f25924i = new TreeMap(aVar.f25924i);
        this.f25925j = aVar.f25925j;
        this.f25927l = aVar.f25927l;
        this.f25926k = aVar.f25926k;
    }

    private a(a aVar, org.bouncycastle.asn1.k kVar) {
        this.f25916a = new k(new m(kVar));
        this.f25917b = aVar.f25917b;
        this.f25919d = aVar.f25919d;
        this.f25920e = aVar.f25920e;
        ArrayList arrayList = new ArrayList();
        this.f25921f = arrayList;
        arrayList.addAll(aVar.f25921f);
        this.f25922g = new TreeMap();
        for (Integer num : aVar.f25922g.keySet()) {
            this.f25922g.put(num, (LinkedList) aVar.f25922g.get(num).clone());
        }
        Stack<u> stack = new Stack<>();
        this.f25923h = stack;
        stack.addAll(aVar.f25923h);
        this.f25918c = new ArrayList();
        for (c cVar : aVar.f25918c) {
            this.f25918c.add(cVar.clone());
        }
        this.f25924i = new TreeMap(aVar.f25924i);
        this.f25925j = aVar.f25925j;
        this.f25927l = aVar.f25927l;
        this.f25926k = aVar.f25926k;
        g();
    }

    private a(a aVar, byte[] bArr, byte[] bArr2, j jVar) {
        this.f25916a = new k(aVar.f25916a.d());
        this.f25917b = aVar.f25917b;
        this.f25919d = aVar.f25919d;
        this.f25920e = aVar.f25920e;
        ArrayList arrayList = new ArrayList();
        this.f25921f = arrayList;
        arrayList.addAll(aVar.f25921f);
        this.f25922g = new TreeMap();
        for (Integer num : aVar.f25922g.keySet()) {
            this.f25922g.put(num, (LinkedList) aVar.f25922g.get(num).clone());
        }
        Stack<u> stack = new Stack<>();
        this.f25923h = stack;
        stack.addAll(aVar.f25923h);
        this.f25918c = new ArrayList();
        for (c cVar : aVar.f25918c) {
            this.f25918c.add(cVar.clone());
        }
        this.f25924i = new TreeMap(aVar.f25924i);
        this.f25925j = aVar.f25925j;
        this.f25927l = aVar.f25927l;
        this.f25926k = false;
        f(bArr, bArr2, jVar);
    }

    private a(k kVar, int i11, int i12, int i13) {
        this.f25916a = kVar;
        this.f25917b = i11;
        this.f25927l = i13;
        this.f25919d = i12;
        if (i12 <= i11 && i12 >= 2) {
            int i14 = i11 - i12;
            if (i14 % 2 == 0) {
                this.f25921f = new ArrayList();
                this.f25922g = new TreeMap();
                this.f25923h = new Stack<>();
                this.f25918c = new ArrayList();
                for (int i15 = 0; i15 < i14; i15++) {
                    this.f25918c.add(new c(i15));
                }
                this.f25924i = new TreeMap();
                this.f25925j = 0;
                this.f25926k = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(x xVar, int i11, int i12) {
        this(xVar.i(), xVar.b(), xVar.c(), i12);
        this.f25927l = i11;
        this.f25925j = i12;
        this.f25926k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(x xVar, byte[] bArr, byte[] bArr2, j jVar) {
        this(xVar.i(), xVar.b(), xVar.c(), (1 << xVar.b()) - 1);
        e(bArr, bArr2, jVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(x xVar, byte[] bArr, byte[] bArr2, j jVar, int i11) {
        this(xVar.i(), xVar.b(), xVar.c(), (1 << xVar.b()) - 1);
        e(bArr, bArr2, jVar);
        while (this.f25925j < i11) {
            f(bArr, bArr2, jVar);
            this.f25926k = false;
        }
    }

    private c a() {
        c cVar = null;
        for (c cVar2 : this.f25918c) {
            if (!cVar2.f() && cVar2.g() && (cVar == null || cVar2.b() < cVar.b() || (cVar2.b() == cVar.b() && cVar2.c() < cVar.c()))) {
                cVar = cVar2;
            }
        }
        return cVar;
    }

    private void e(byte[] bArr, byte[] bArr2, j jVar) {
        Objects.requireNonNull(jVar, "otsHashAddress == null");
        i iVar = (i) new i.b().g(jVar.b()).h(jVar.c()).l();
        g gVar = (g) new g.b().g(jVar.b()).h(jVar.c()).k();
        for (int i11 = 0; i11 < (1 << this.f25917b); i11++) {
            jVar = (j) new j.b().g(jVar.b()).h(jVar.c()).p(i11).n(jVar.e()).o(jVar.f()).f(jVar.a()).l();
            k kVar = this.f25916a;
            kVar.h(kVar.g(bArr2, jVar), bArr);
            n e11 = this.f25916a.e(jVar);
            iVar = (i) new i.b().g(iVar.b()).h(iVar.c()).n(i11).o(iVar.f()).p(iVar.g()).f(iVar.a()).l();
            u a11 = v.a(this.f25916a, e11, iVar);
            gVar = (g) new g.b().g(gVar.b()).h(gVar.c()).n(i11).f(gVar.a()).k();
            while (!this.f25923h.isEmpty() && this.f25923h.peek().a() == a11.a()) {
                int a12 = i11 / (1 << a11.a());
                if (a12 == 1) {
                    this.f25921f.add(a11);
                }
                if (a12 == 3 && a11.a() < this.f25917b - this.f25919d) {
                    this.f25918c.get(a11.a()).h(a11);
                }
                if (a12 >= 3 && (a12 & 1) == 1 && a11.a() >= this.f25917b - this.f25919d && a11.a() <= this.f25917b - 2) {
                    if (this.f25922g.get(Integer.valueOf(a11.a())) == null) {
                        LinkedList<u> linkedList = new LinkedList<>();
                        linkedList.add(a11);
                        this.f25922g.put(Integer.valueOf(a11.a()), linkedList);
                    } else {
                        this.f25922g.get(Integer.valueOf(a11.a())).add(a11);
                    }
                }
                g gVar2 = (g) new g.b().g(gVar.b()).h(gVar.c()).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a()).k();
                u b11 = v.b(this.f25916a, this.f25923h.pop(), a11, gVar2);
                u uVar = new u(b11.a() + 1, b11.b());
                gVar = (g) new g.b().g(gVar2.b()).h(gVar2.c()).m(gVar2.e() + 1).n(gVar2.f()).f(gVar2.a()).k();
                a11 = uVar;
            }
            this.f25923h.push(a11);
        }
        this.f25920e = this.f25923h.pop();
    }

    private void f(byte[] bArr, byte[] bArr2, j jVar) {
        List<u> list;
        u removeFirst;
        Objects.requireNonNull(jVar, "otsHashAddress == null");
        if (this.f25926k) {
            throw new IllegalStateException("index already used");
        }
        int i11 = this.f25925j;
        if (i11 > this.f25927l - 1) {
            throw new IllegalStateException("index out of bounds");
        }
        int b11 = a0.b(i11, this.f25917b);
        if (((this.f25925j >> (b11 + 1)) & 1) == 0 && b11 < this.f25917b - 1) {
            this.f25924i.put(Integer.valueOf(b11), this.f25921f.get(b11));
        }
        i iVar = (i) new i.b().g(jVar.b()).h(jVar.c()).l();
        g gVar = (g) new g.b().g(jVar.b()).h(jVar.c()).k();
        if (b11 == 0) {
            jVar = (j) new j.b().g(jVar.b()).h(jVar.c()).p(this.f25925j).n(jVar.e()).o(jVar.f()).f(jVar.a()).l();
            k kVar = this.f25916a;
            kVar.h(kVar.g(bArr2, jVar), bArr);
            this.f25921f.set(0, v.a(this.f25916a, this.f25916a.e(jVar), (i) new i.b().g(iVar.b()).h(iVar.c()).n(this.f25925j).o(iVar.f()).p(iVar.g()).f(iVar.a()).l()));
        } else {
            int i12 = b11 - 1;
            k kVar2 = this.f25916a;
            kVar2.h(kVar2.g(bArr2, jVar), bArr);
            u b12 = v.b(this.f25916a, this.f25921f.get(i12), this.f25924i.get(Integer.valueOf(i12)), (g) new g.b().g(gVar.b()).h(gVar.c()).m(i12).n(this.f25925j >> b11).f(gVar.a()).k());
            this.f25921f.set(b11, new u(b12.a() + 1, b12.b()));
            this.f25924i.remove(Integer.valueOf(i12));
            for (int i13 = 0; i13 < b11; i13++) {
                if (i13 < this.f25917b - this.f25919d) {
                    list = this.f25921f;
                    removeFirst = this.f25918c.get(i13).d();
                } else {
                    list = this.f25921f;
                    removeFirst = this.f25922g.get(Integer.valueOf(i13)).removeFirst();
                }
                list.set(i13, removeFirst);
            }
            int min = Math.min(b11, this.f25917b - this.f25919d);
            for (int i14 = 0; i14 < min; i14++) {
                int i15 = this.f25925j + 1 + ((1 << i14) * 3);
                if (i15 < (1 << this.f25917b)) {
                    this.f25918c.get(i14).e(i15);
                }
            }
        }
        for (int i16 = 0; i16 < ((this.f25917b - this.f25919d) >> 1); i16++) {
            c a11 = a();
            if (a11 != null) {
                a11.i(this.f25923h, this.f25916a, bArr, bArr2, jVar);
            }
        }
        this.f25925j++;
    }

    private void g() {
        if (this.f25921f == null) {
            throw new IllegalStateException("authenticationPath == null");
        }
        if (this.f25922g == null) {
            throw new IllegalStateException("retain == null");
        }
        if (this.f25923h == null) {
            throw new IllegalStateException("stack == null");
        }
        if (this.f25918c == null) {
            throw new IllegalStateException("treeHashInstances == null");
        }
        if (this.f25924i == null) {
            throw new IllegalStateException("keep == null");
        }
        if (!a0.l(this.f25917b, this.f25925j)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b() {
        return this.f25925j;
    }

    public int c() {
        return this.f25927l;
    }

    public a d(byte[] bArr, byte[] bArr2, j jVar) {
        return new a(this, bArr, bArr2, jVar);
    }

    public a h(org.bouncycastle.asn1.k kVar) {
        return new a(this, kVar);
    }
}