package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.j0;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class k implements e1 {

    /* renamed from: a  reason: collision with root package name */
    private final j f16331a;

    /* renamed from: b  reason: collision with root package name */
    private int f16332b;

    /* renamed from: c  reason: collision with root package name */
    private int f16333c;

    /* renamed from: d  reason: collision with root package name */
    private int f16334d = 0;

    private k(j jVar) {
        j jVar2 = (j) a0.b(jVar, "input");
        this.f16331a = jVar2;
        jVar2.f16315c = this;
    }

    public static k h(j jVar) {
        k kVar = jVar.f16315c;
        return kVar != null ? kVar : new k(jVar);
    }

    private <T> T i(f1<T> f1Var, p pVar) {
        int i11 = this.f16333c;
        this.f16333c = r1.c(r1.a(this.f16332b), 4);
        try {
            T newInstance = f1Var.newInstance();
            f1Var.b(newInstance, this, pVar);
            f1Var.makeImmutable(newInstance);
            if (this.f16332b == this.f16333c) {
                return newInstance;
            }
            throw InvalidProtocolBufferException.g();
        } finally {
            this.f16333c = i11;
        }
    }

    private <T> T j(f1<T> f1Var, p pVar) {
        j jVar;
        int A = this.f16331a.A();
        j jVar2 = this.f16331a;
        if (jVar2.f16313a < jVar2.f16314b) {
            int j11 = jVar2.j(A);
            T newInstance = f1Var.newInstance();
            this.f16331a.f16313a++;
            f1Var.b(newInstance, this, pVar);
            f1Var.makeImmutable(newInstance);
            this.f16331a.a(0);
            jVar.f16313a--;
            this.f16331a.i(j11);
            return newInstance;
        }
        throw InvalidProtocolBufferException.h();
    }

    private void l(int i11) {
        if (this.f16331a.d() != i11) {
            throw InvalidProtocolBufferException.j();
        }
    }

    private void m(int i11) {
        if (r1.b(this.f16332b) != i11) {
            throw InvalidProtocolBufferException.d();
        }
    }

    private void n(int i11) {
        if ((i11 & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    private void o(int i11) {
        if ((i11 & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public <T> T a(f1<T> f1Var, p pVar) {
        m(3);
        return (T) i(f1Var, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public <T> T b(Class<T> cls, p pVar) {
        m(3);
        return (T) i(b1.a().d(cls), pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public <K, V> void c(Map<K, V> map, j0.a<K, V> aVar, p pVar) {
        m(2);
        this.f16331a.j(this.f16331a.A());
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public <T> void d(List<T> list, f1<T> f1Var, p pVar) {
        int z11;
        if (r1.b(this.f16332b) == 2) {
            int i11 = this.f16332b;
            do {
                list.add(j(f1Var, pVar));
                if (this.f16331a.e() || this.f16334d != 0) {
                    return;
                }
                z11 = this.f16331a.z();
            } while (z11 == i11);
            this.f16334d = z11;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public <T> T e(f1<T> f1Var, p pVar) {
        m(2);
        return (T) j(f1Var, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public <T> T f(Class<T> cls, p pVar) {
        m(2);
        return (T) j(b1.a().d(cls), pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public <T> void g(List<T> list, f1<T> f1Var, p pVar) {
        int z11;
        if (r1.b(this.f16332b) == 3) {
            int i11 = this.f16332b;
            do {
                list.add(i(f1Var, pVar));
                if (this.f16331a.e() || this.f16334d != 0) {
                    return;
                }
                z11 = this.f16331a.z();
            } while (z11 == i11);
            this.f16334d = z11;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public int getFieldNumber() {
        int i11 = this.f16334d;
        if (i11 != 0) {
            this.f16332b = i11;
            this.f16334d = 0;
        } else {
            this.f16332b = this.f16331a.z();
        }
        int i12 = this.f16332b;
        if (i12 == 0 || i12 == this.f16333c) {
            return Integer.MAX_VALUE;
        }
        return r1.a(i12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public int getTag() {
        return this.f16332b;
    }

    public void k(List<String> list, boolean z11) {
        int z12;
        int z13;
        if (r1.b(this.f16332b) == 2) {
            if ((list instanceof f0) && !z11) {
                f0 f0Var = (f0) list;
                do {
                    f0Var.t1(readBytes());
                    if (this.f16331a.e()) {
                        return;
                    }
                    z13 = this.f16331a.z();
                } while (z13 == this.f16332b);
                this.f16334d = z13;
                return;
            }
            do {
                list.add(z11 ? readStringRequireUtf8() : readString());
                if (this.f16331a.e()) {
                    return;
                }
                z12 = this.f16331a.z();
            } while (z12 == this.f16332b);
            this.f16334d = z12;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public boolean readBool() {
        m(0);
        return this.f16331a.k();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public void readBoolList(List<Boolean> list) {
        int z11;
        int z12;
        if (list instanceof g) {
            g gVar = (g) list;
            int b11 = r1.b(this.f16332b);
            if (b11 == 0) {
                do {
                    gVar.addBoolean(this.f16331a.k());
                    if (this.f16331a.e()) {
                        return;
                    }
                    z12 = this.f16331a.z();
                } while (z12 == this.f16332b);
                this.f16334d = z12;
                return;
            } else if (b11 == 2) {
                int d11 = this.f16331a.d() + this.f16331a.A();
                do {
                    gVar.addBoolean(this.f16331a.k());
                } while (this.f16331a.d() < d11);
                l(d11);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b12 = r1.b(this.f16332b);
        if (b12 == 0) {
            do {
                list.add(Boolean.valueOf(this.f16331a.k()));
                if (this.f16331a.e()) {
                    return;
                }
                z11 = this.f16331a.z();
            } while (z11 == this.f16332b);
            this.f16334d = z11;
        } else if (b12 == 2) {
            int d12 = this.f16331a.d() + this.f16331a.A();
            do {
                list.add(Boolean.valueOf(this.f16331a.k()));
            } while (this.f16331a.d() < d12);
            l(d12);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public i readBytes() {
        m(2);
        return this.f16331a.l();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public void readBytesList(List<i> list) {
        int z11;
        if (r1.b(this.f16332b) == 2) {
            do {
                list.add(readBytes());
                if (this.f16331a.e()) {
                    return;
                }
                z11 = this.f16331a.z();
            } while (z11 == this.f16332b);
            this.f16334d = z11;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public double readDouble() {
        m(1);
        return this.f16331a.m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public void readDoubleList(List<Double> list) {
        int z11;
        int z12;
        if (list instanceof m) {
            m mVar = (m) list;
            int b11 = r1.b(this.f16332b);
            if (b11 == 1) {
                do {
                    mVar.addDouble(this.f16331a.m());
                    if (this.f16331a.e()) {
                        return;
                    }
                    z12 = this.f16331a.z();
                } while (z12 == this.f16332b);
                this.f16334d = z12;
                return;
            } else if (b11 == 2) {
                int A = this.f16331a.A();
                o(A);
                int d11 = this.f16331a.d() + A;
                do {
                    mVar.addDouble(this.f16331a.m());
                } while (this.f16331a.d() < d11);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b12 = r1.b(this.f16332b);
        if (b12 == 1) {
            do {
                list.add(Double.valueOf(this.f16331a.m()));
                if (this.f16331a.e()) {
                    return;
                }
                z11 = this.f16331a.z();
            } while (z11 == this.f16332b);
            this.f16334d = z11;
        } else if (b12 == 2) {
            int A2 = this.f16331a.A();
            o(A2);
            int d12 = this.f16331a.d() + A2;
            do {
                list.add(Double.valueOf(this.f16331a.m()));
            } while (this.f16331a.d() < d12);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public int readEnum() {
        m(0);
        return this.f16331a.n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public void readEnumList(List<Integer> list) {
        int z11;
        int z12;
        if (list instanceof z) {
            z zVar = (z) list;
            int b11 = r1.b(this.f16332b);
            if (b11 == 0) {
                do {
                    zVar.addInt(this.f16331a.n());
                    if (this.f16331a.e()) {
                        return;
                    }
                    z12 = this.f16331a.z();
                } while (z12 == this.f16332b);
                this.f16334d = z12;
                return;
            } else if (b11 == 2) {
                int d11 = this.f16331a.d() + this.f16331a.A();
                do {
                    zVar.addInt(this.f16331a.n());
                } while (this.f16331a.d() < d11);
                l(d11);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b12 = r1.b(this.f16332b);
        if (b12 == 0) {
            do {
                list.add(Integer.valueOf(this.f16331a.n()));
                if (this.f16331a.e()) {
                    return;
                }
                z11 = this.f16331a.z();
            } while (z11 == this.f16332b);
            this.f16334d = z11;
        } else if (b12 == 2) {
            int d12 = this.f16331a.d() + this.f16331a.A();
            do {
                list.add(Integer.valueOf(this.f16331a.n()));
            } while (this.f16331a.d() < d12);
            l(d12);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public int readFixed32() {
        m(5);
        return this.f16331a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public void readFixed32List(List<Integer> list) {
        int z11;
        int z12;
        if (list instanceof z) {
            z zVar = (z) list;
            int b11 = r1.b(this.f16332b);
            if (b11 == 2) {
                int A = this.f16331a.A();
                n(A);
                int d11 = this.f16331a.d() + A;
                do {
                    zVar.addInt(this.f16331a.o());
                } while (this.f16331a.d() < d11);
                return;
            } else if (b11 == 5) {
                do {
                    zVar.addInt(this.f16331a.o());
                    if (this.f16331a.e()) {
                        return;
                    }
                    z12 = this.f16331a.z();
                } while (z12 == this.f16332b);
                this.f16334d = z12;
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b12 = r1.b(this.f16332b);
        if (b12 == 2) {
            int A2 = this.f16331a.A();
            n(A2);
            int d12 = this.f16331a.d() + A2;
            do {
                list.add(Integer.valueOf(this.f16331a.o()));
            } while (this.f16331a.d() < d12);
        } else if (b12 == 5) {
            do {
                list.add(Integer.valueOf(this.f16331a.o()));
                if (this.f16331a.e()) {
                    return;
                }
                z11 = this.f16331a.z();
            } while (z11 == this.f16332b);
            this.f16334d = z11;
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public long readFixed64() {
        m(1);
        return this.f16331a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public void readFixed64List(List<Long> list) {
        int z11;
        int z12;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int b11 = r1.b(this.f16332b);
            if (b11 == 1) {
                do {
                    h0Var.addLong(this.f16331a.p());
                    if (this.f16331a.e()) {
                        return;
                    }
                    z12 = this.f16331a.z();
                } while (z12 == this.f16332b);
                this.f16334d = z12;
                return;
            } else if (b11 == 2) {
                int A = this.f16331a.A();
                o(A);
                int d11 = this.f16331a.d() + A;
                do {
                    h0Var.addLong(this.f16331a.p());
                } while (this.f16331a.d() < d11);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b12 = r1.b(this.f16332b);
        if (b12 == 1) {
            do {
                list.add(Long.valueOf(this.f16331a.p()));
                if (this.f16331a.e()) {
                    return;
                }
                z11 = this.f16331a.z();
            } while (z11 == this.f16332b);
            this.f16334d = z11;
        } else if (b12 == 2) {
            int A2 = this.f16331a.A();
            o(A2);
            int d12 = this.f16331a.d() + A2;
            do {
                list.add(Long.valueOf(this.f16331a.p()));
            } while (this.f16331a.d() < d12);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public float readFloat() {
        m(5);
        return this.f16331a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public void readFloatList(List<Float> list) {
        int z11;
        int z12;
        if (list instanceof w) {
            w wVar = (w) list;
            int b11 = r1.b(this.f16332b);
            if (b11 == 2) {
                int A = this.f16331a.A();
                n(A);
                int d11 = this.f16331a.d() + A;
                do {
                    wVar.addFloat(this.f16331a.q());
                } while (this.f16331a.d() < d11);
                return;
            } else if (b11 == 5) {
                do {
                    wVar.addFloat(this.f16331a.q());
                    if (this.f16331a.e()) {
                        return;
                    }
                    z12 = this.f16331a.z();
                } while (z12 == this.f16332b);
                this.f16334d = z12;
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b12 = r1.b(this.f16332b);
        if (b12 == 2) {
            int A2 = this.f16331a.A();
            n(A2);
            int d12 = this.f16331a.d() + A2;
            do {
                list.add(Float.valueOf(this.f16331a.q()));
            } while (this.f16331a.d() < d12);
        } else if (b12 == 5) {
            do {
                list.add(Float.valueOf(this.f16331a.q()));
                if (this.f16331a.e()) {
                    return;
                }
                z11 = this.f16331a.z();
            } while (z11 == this.f16332b);
            this.f16334d = z11;
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public int readInt32() {
        m(0);
        return this.f16331a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public void readInt32List(List<Integer> list) {
        int z11;
        int z12;
        if (list instanceof z) {
            z zVar = (z) list;
            int b11 = r1.b(this.f16332b);
            if (b11 == 0) {
                do {
                    zVar.addInt(this.f16331a.r());
                    if (this.f16331a.e()) {
                        return;
                    }
                    z12 = this.f16331a.z();
                } while (z12 == this.f16332b);
                this.f16334d = z12;
                return;
            } else if (b11 == 2) {
                int d11 = this.f16331a.d() + this.f16331a.A();
                do {
                    zVar.addInt(this.f16331a.r());
                } while (this.f16331a.d() < d11);
                l(d11);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b12 = r1.b(this.f16332b);
        if (b12 == 0) {
            do {
                list.add(Integer.valueOf(this.f16331a.r()));
                if (this.f16331a.e()) {
                    return;
                }
                z11 = this.f16331a.z();
            } while (z11 == this.f16332b);
            this.f16334d = z11;
        } else if (b12 == 2) {
            int d12 = this.f16331a.d() + this.f16331a.A();
            do {
                list.add(Integer.valueOf(this.f16331a.r()));
            } while (this.f16331a.d() < d12);
            l(d12);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public long readInt64() {
        m(0);
        return this.f16331a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public void readInt64List(List<Long> list) {
        int z11;
        int z12;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int b11 = r1.b(this.f16332b);
            if (b11 == 0) {
                do {
                    h0Var.addLong(this.f16331a.s());
                    if (this.f16331a.e()) {
                        return;
                    }
                    z12 = this.f16331a.z();
                } while (z12 == this.f16332b);
                this.f16334d = z12;
                return;
            } else if (b11 == 2) {
                int d11 = this.f16331a.d() + this.f16331a.A();
                do {
                    h0Var.addLong(this.f16331a.s());
                } while (this.f16331a.d() < d11);
                l(d11);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b12 = r1.b(this.f16332b);
        if (b12 == 0) {
            do {
                list.add(Long.valueOf(this.f16331a.s()));
                if (this.f16331a.e()) {
                    return;
                }
                z11 = this.f16331a.z();
            } while (z11 == this.f16332b);
            this.f16334d = z11;
        } else if (b12 == 2) {
            int d12 = this.f16331a.d() + this.f16331a.A();
            do {
                list.add(Long.valueOf(this.f16331a.s()));
            } while (this.f16331a.d() < d12);
            l(d12);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public int readSFixed32() {
        m(5);
        return this.f16331a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public void readSFixed32List(List<Integer> list) {
        int z11;
        int z12;
        if (list instanceof z) {
            z zVar = (z) list;
            int b11 = r1.b(this.f16332b);
            if (b11 == 2) {
                int A = this.f16331a.A();
                n(A);
                int d11 = this.f16331a.d() + A;
                do {
                    zVar.addInt(this.f16331a.t());
                } while (this.f16331a.d() < d11);
                return;
            } else if (b11 == 5) {
                do {
                    zVar.addInt(this.f16331a.t());
                    if (this.f16331a.e()) {
                        return;
                    }
                    z12 = this.f16331a.z();
                } while (z12 == this.f16332b);
                this.f16334d = z12;
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b12 = r1.b(this.f16332b);
        if (b12 == 2) {
            int A2 = this.f16331a.A();
            n(A2);
            int d12 = this.f16331a.d() + A2;
            do {
                list.add(Integer.valueOf(this.f16331a.t()));
            } while (this.f16331a.d() < d12);
        } else if (b12 == 5) {
            do {
                list.add(Integer.valueOf(this.f16331a.t()));
                if (this.f16331a.e()) {
                    return;
                }
                z11 = this.f16331a.z();
            } while (z11 == this.f16332b);
            this.f16334d = z11;
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public long readSFixed64() {
        m(1);
        return this.f16331a.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public void readSFixed64List(List<Long> list) {
        int z11;
        int z12;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int b11 = r1.b(this.f16332b);
            if (b11 == 1) {
                do {
                    h0Var.addLong(this.f16331a.u());
                    if (this.f16331a.e()) {
                        return;
                    }
                    z12 = this.f16331a.z();
                } while (z12 == this.f16332b);
                this.f16334d = z12;
                return;
            } else if (b11 == 2) {
                int A = this.f16331a.A();
                o(A);
                int d11 = this.f16331a.d() + A;
                do {
                    h0Var.addLong(this.f16331a.u());
                } while (this.f16331a.d() < d11);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b12 = r1.b(this.f16332b);
        if (b12 == 1) {
            do {
                list.add(Long.valueOf(this.f16331a.u()));
                if (this.f16331a.e()) {
                    return;
                }
                z11 = this.f16331a.z();
            } while (z11 == this.f16332b);
            this.f16334d = z11;
        } else if (b12 == 2) {
            int A2 = this.f16331a.A();
            o(A2);
            int d12 = this.f16331a.d() + A2;
            do {
                list.add(Long.valueOf(this.f16331a.u()));
            } while (this.f16331a.d() < d12);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public int readSInt32() {
        m(0);
        return this.f16331a.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public void readSInt32List(List<Integer> list) {
        int z11;
        int z12;
        if (list instanceof z) {
            z zVar = (z) list;
            int b11 = r1.b(this.f16332b);
            if (b11 == 0) {
                do {
                    zVar.addInt(this.f16331a.v());
                    if (this.f16331a.e()) {
                        return;
                    }
                    z12 = this.f16331a.z();
                } while (z12 == this.f16332b);
                this.f16334d = z12;
                return;
            } else if (b11 == 2) {
                int d11 = this.f16331a.d() + this.f16331a.A();
                do {
                    zVar.addInt(this.f16331a.v());
                } while (this.f16331a.d() < d11);
                l(d11);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b12 = r1.b(this.f16332b);
        if (b12 == 0) {
            do {
                list.add(Integer.valueOf(this.f16331a.v()));
                if (this.f16331a.e()) {
                    return;
                }
                z11 = this.f16331a.z();
            } while (z11 == this.f16332b);
            this.f16334d = z11;
        } else if (b12 == 2) {
            int d12 = this.f16331a.d() + this.f16331a.A();
            do {
                list.add(Integer.valueOf(this.f16331a.v()));
            } while (this.f16331a.d() < d12);
            l(d12);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public long readSInt64() {
        m(0);
        return this.f16331a.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public void readSInt64List(List<Long> list) {
        int z11;
        int z12;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int b11 = r1.b(this.f16332b);
            if (b11 == 0) {
                do {
                    h0Var.addLong(this.f16331a.w());
                    if (this.f16331a.e()) {
                        return;
                    }
                    z12 = this.f16331a.z();
                } while (z12 == this.f16332b);
                this.f16334d = z12;
                return;
            } else if (b11 == 2) {
                int d11 = this.f16331a.d() + this.f16331a.A();
                do {
                    h0Var.addLong(this.f16331a.w());
                } while (this.f16331a.d() < d11);
                l(d11);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b12 = r1.b(this.f16332b);
        if (b12 == 0) {
            do {
                list.add(Long.valueOf(this.f16331a.w()));
                if (this.f16331a.e()) {
                    return;
                }
                z11 = this.f16331a.z();
            } while (z11 == this.f16332b);
            this.f16334d = z11;
        } else if (b12 == 2) {
            int d12 = this.f16331a.d() + this.f16331a.A();
            do {
                list.add(Long.valueOf(this.f16331a.w()));
            } while (this.f16331a.d() < d12);
            l(d12);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public String readString() {
        m(2);
        return this.f16331a.x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public void readStringList(List<String> list) {
        k(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public void readStringListRequireUtf8(List<String> list) {
        k(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public String readStringRequireUtf8() {
        m(2);
        return this.f16331a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public int readUInt32() {
        m(0);
        return this.f16331a.A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public void readUInt32List(List<Integer> list) {
        int z11;
        int z12;
        if (list instanceof z) {
            z zVar = (z) list;
            int b11 = r1.b(this.f16332b);
            if (b11 == 0) {
                do {
                    zVar.addInt(this.f16331a.A());
                    if (this.f16331a.e()) {
                        return;
                    }
                    z12 = this.f16331a.z();
                } while (z12 == this.f16332b);
                this.f16334d = z12;
                return;
            } else if (b11 == 2) {
                int d11 = this.f16331a.d() + this.f16331a.A();
                do {
                    zVar.addInt(this.f16331a.A());
                } while (this.f16331a.d() < d11);
                l(d11);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b12 = r1.b(this.f16332b);
        if (b12 == 0) {
            do {
                list.add(Integer.valueOf(this.f16331a.A()));
                if (this.f16331a.e()) {
                    return;
                }
                z11 = this.f16331a.z();
            } while (z11 == this.f16332b);
            this.f16334d = z11;
        } else if (b12 == 2) {
            int d12 = this.f16331a.d() + this.f16331a.A();
            do {
                list.add(Integer.valueOf(this.f16331a.A()));
            } while (this.f16331a.d() < d12);
            l(d12);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public long readUInt64() {
        m(0);
        return this.f16331a.B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public void readUInt64List(List<Long> list) {
        int z11;
        int z12;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int b11 = r1.b(this.f16332b);
            if (b11 == 0) {
                do {
                    h0Var.addLong(this.f16331a.B());
                    if (this.f16331a.e()) {
                        return;
                    }
                    z12 = this.f16331a.z();
                } while (z12 == this.f16332b);
                this.f16334d = z12;
                return;
            } else if (b11 == 2) {
                int d11 = this.f16331a.d() + this.f16331a.A();
                do {
                    h0Var.addLong(this.f16331a.B());
                } while (this.f16331a.d() < d11);
                l(d11);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b12 = r1.b(this.f16332b);
        if (b12 == 0) {
            do {
                list.add(Long.valueOf(this.f16331a.B()));
                if (this.f16331a.e()) {
                    return;
                }
                z11 = this.f16331a.z();
            } while (z11 == this.f16332b);
            this.f16334d = z11;
        } else if (b12 == 2) {
            int d12 = this.f16331a.d() + this.f16331a.A();
            do {
                list.add(Long.valueOf(this.f16331a.B()));
            } while (this.f16331a.d() < d12);
            l(d12);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public boolean skipField() {
        int i11;
        if (this.f16331a.e() || (i11 = this.f16332b) == this.f16333c) {
            return false;
        }
        return this.f16331a.C(i11);
    }
}