package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.j0;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class f implements e1 {

    /* loaded from: classes3.dex */
    private static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f16259a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f16260b;

        /* renamed from: c  reason: collision with root package name */
        private int f16261c;

        /* renamed from: d  reason: collision with root package name */
        private int f16262d;

        /* renamed from: e  reason: collision with root package name */
        private int f16263e;

        /* renamed from: f  reason: collision with root package name */
        private int f16264f;

        public b(ByteBuffer byteBuffer, boolean z11) {
            super();
            this.f16259a = z11;
            this.f16260b = byteBuffer.array();
            this.f16261c = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f16262d = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private void A() {
            int i11 = this.f16262d;
            int i12 = this.f16261c;
            if (i11 - i12 >= 10) {
                byte[] bArr = this.f16260b;
                int i13 = 0;
                while (i13 < 10) {
                    int i14 = i12 + 1;
                    if (bArr[i12] >= 0) {
                        this.f16261c = i14;
                        return;
                    } else {
                        i13++;
                        i12 = i14;
                    }
                }
            }
            B();
        }

        private void B() {
            for (int i11 = 0; i11 < 10; i11++) {
                if (j() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void C(int i11) {
            v(i11);
            if ((i11 & 3) != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        private void D(int i11) {
            v(i11);
            if ((i11 & 7) != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        private boolean i() {
            return this.f16261c == this.f16262d;
        }

        private byte j() {
            int i11 = this.f16261c;
            if (i11 != this.f16262d) {
                byte[] bArr = this.f16260b;
                this.f16261c = i11 + 1;
                return bArr[i11];
            }
            throw InvalidProtocolBufferException.j();
        }

        private <T> T k(f1<T> f1Var, p pVar) {
            int i11 = this.f16264f;
            this.f16264f = r1.c(r1.a(this.f16263e), 4);
            try {
                T newInstance = f1Var.newInstance();
                f1Var.b(newInstance, this, pVar);
                f1Var.makeImmutable(newInstance);
                if (this.f16263e == this.f16264f) {
                    return newInstance;
                }
                throw InvalidProtocolBufferException.g();
            } finally {
                this.f16264f = i11;
            }
        }

        private int l() {
            v(4);
            return m();
        }

        private int m() {
            int i11 = this.f16261c;
            byte[] bArr = this.f16260b;
            this.f16261c = i11 + 4;
            return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        }

        private long n() {
            v(8);
            return o();
        }

        private long o() {
            int i11 = this.f16261c;
            byte[] bArr = this.f16260b;
            this.f16261c = i11 + 8;
            return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
        }

        private <T> T p(f1<T> f1Var, p pVar) {
            int s11 = s();
            v(s11);
            int i11 = this.f16262d;
            int i12 = this.f16261c + s11;
            this.f16262d = i12;
            try {
                T newInstance = f1Var.newInstance();
                f1Var.b(newInstance, this, pVar);
                f1Var.makeImmutable(newInstance);
                if (this.f16261c == i12) {
                    return newInstance;
                }
                throw InvalidProtocolBufferException.g();
            } finally {
                this.f16262d = i11;
            }
        }

        private int s() {
            int i11;
            int i12 = this.f16261c;
            int i13 = this.f16262d;
            if (i13 != i12) {
                byte[] bArr = this.f16260b;
                int i14 = i12 + 1;
                byte b11 = bArr[i12];
                if (b11 >= 0) {
                    this.f16261c = i14;
                    return b11;
                } else if (i13 - i14 < 9) {
                    return (int) u();
                } else {
                    int i15 = i14 + 1;
                    int i16 = b11 ^ (bArr[i14] << 7);
                    if (i16 < 0) {
                        i11 = i16 ^ (-128);
                    } else {
                        int i17 = i15 + 1;
                        int i18 = i16 ^ (bArr[i15] << 14);
                        if (i18 >= 0) {
                            i11 = i18 ^ 16256;
                        } else {
                            i15 = i17 + 1;
                            int i19 = i18 ^ (bArr[i17] << 21);
                            if (i19 < 0) {
                                i11 = i19 ^ (-2080896);
                            } else {
                                i17 = i15 + 1;
                                byte b12 = bArr[i15];
                                i11 = (i19 ^ (b12 << 28)) ^ 266354560;
                                if (b12 < 0) {
                                    i15 = i17 + 1;
                                    if (bArr[i17] < 0) {
                                        i17 = i15 + 1;
                                        if (bArr[i15] < 0) {
                                            i15 = i17 + 1;
                                            if (bArr[i17] < 0) {
                                                i17 = i15 + 1;
                                                if (bArr[i15] < 0) {
                                                    i15 = i17 + 1;
                                                    if (bArr[i17] < 0) {
                                                        throw InvalidProtocolBufferException.e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i15 = i17;
                    }
                    this.f16261c = i15;
                    return i11;
                }
            }
            throw InvalidProtocolBufferException.j();
        }

        private long u() {
            long j11 = 0;
            for (int i11 = 0; i11 < 64; i11 += 7) {
                byte j12 = j();
                j11 |= (j12 & Byte.MAX_VALUE) << i11;
                if ((j12 & 128) == 0) {
                    return j11;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void v(int i11) {
            if (i11 < 0 || i11 > this.f16262d - this.f16261c) {
                throw InvalidProtocolBufferException.j();
            }
        }

        private void w(int i11) {
            if (this.f16261c != i11) {
                throw InvalidProtocolBufferException.j();
            }
        }

        private void x(int i11) {
            if (r1.b(this.f16263e) != i11) {
                throw InvalidProtocolBufferException.d();
            }
        }

        private void y(int i11) {
            v(i11);
            this.f16261c += i11;
        }

        private void z() {
            int i11 = this.f16264f;
            this.f16264f = r1.c(r1.a(this.f16263e), 4);
            while (getFieldNumber() != Integer.MAX_VALUE && skipField()) {
            }
            if (this.f16263e == this.f16264f) {
                this.f16264f = i11;
                return;
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public <T> T a(f1<T> f1Var, p pVar) {
            x(3);
            return (T) k(f1Var, pVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public <T> T b(Class<T> cls, p pVar) {
            x(3);
            return (T) k(b1.a().d(cls), pVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public <K, V> void c(Map<K, V> map, j0.a<K, V> aVar, p pVar) {
            x(2);
            int s11 = s();
            v(s11);
            int i11 = this.f16262d;
            this.f16262d = this.f16261c + s11;
            try {
                throw null;
            } catch (Throwable th2) {
                this.f16262d = i11;
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public <T> void d(List<T> list, f1<T> f1Var, p pVar) {
            int i11;
            if (r1.b(this.f16263e) == 2) {
                int i12 = this.f16263e;
                do {
                    list.add(p(f1Var, pVar));
                    if (i()) {
                        return;
                    }
                    i11 = this.f16261c;
                } while (s() == i12);
                this.f16261c = i11;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public <T> T e(f1<T> f1Var, p pVar) {
            x(2);
            return (T) p(f1Var, pVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public <T> T f(Class<T> cls, p pVar) {
            x(2);
            return (T) p(b1.a().d(cls), pVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public <T> void g(List<T> list, f1<T> f1Var, p pVar) {
            int i11;
            if (r1.b(this.f16263e) == 3) {
                int i12 = this.f16263e;
                do {
                    list.add(k(f1Var, pVar));
                    if (i()) {
                        return;
                    }
                    i11 = this.f16261c;
                } while (s() == i12);
                this.f16261c = i11;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public int getFieldNumber() {
            if (i()) {
                return Integer.MAX_VALUE;
            }
            int s11 = s();
            this.f16263e = s11;
            if (s11 == this.f16264f) {
                return Integer.MAX_VALUE;
            }
            return r1.a(s11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public int getTag() {
            return this.f16263e;
        }

        public String q(boolean z11) {
            x(2);
            int s11 = s();
            if (s11 == 0) {
                return "";
            }
            v(s11);
            if (z11) {
                byte[] bArr = this.f16260b;
                int i11 = this.f16261c;
                if (!q1.n(bArr, i11, i11 + s11)) {
                    throw InvalidProtocolBufferException.c();
                }
            }
            String str = new String(this.f16260b, this.f16261c, s11, a0.f16230a);
            this.f16261c += s11;
            return str;
        }

        public void r(List<String> list, boolean z11) {
            int i11;
            int i12;
            if (r1.b(this.f16263e) == 2) {
                if ((list instanceof f0) && !z11) {
                    f0 f0Var = (f0) list;
                    do {
                        f0Var.t1(readBytes());
                        if (i()) {
                            return;
                        }
                        i12 = this.f16261c;
                    } while (s() == this.f16263e);
                    this.f16261c = i12;
                    return;
                }
                do {
                    list.add(q(z11));
                    if (i()) {
                        return;
                    }
                    i11 = this.f16261c;
                } while (s() == this.f16263e);
                this.f16261c = i11;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public boolean readBool() {
            x(0);
            return s() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public void readBoolList(List<Boolean> list) {
            int i11;
            int i12;
            if (list instanceof g) {
                g gVar = (g) list;
                int b11 = r1.b(this.f16263e);
                if (b11 != 0) {
                    if (b11 == 2) {
                        int s11 = this.f16261c + s();
                        while (this.f16261c < s11) {
                            gVar.addBoolean(s() != 0);
                        }
                        w(s11);
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    gVar.addBoolean(readBool());
                    if (i()) {
                        return;
                    }
                    i12 = this.f16261c;
                } while (s() == this.f16263e);
                this.f16261c = i12;
                return;
            }
            int b12 = r1.b(this.f16263e);
            if (b12 != 0) {
                if (b12 == 2) {
                    int s12 = this.f16261c + s();
                    while (this.f16261c < s12) {
                        list.add(Boolean.valueOf(s() != 0));
                    }
                    w(s12);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Boolean.valueOf(readBool()));
                if (i()) {
                    return;
                }
                i11 = this.f16261c;
            } while (s() == this.f16263e);
            this.f16261c = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public i readBytes() {
            i h11;
            x(2);
            int s11 = s();
            if (s11 == 0) {
                return i.f16278b;
            }
            v(s11);
            if (this.f16259a) {
                h11 = i.A(this.f16260b, this.f16261c, s11);
            } else {
                h11 = i.h(this.f16260b, this.f16261c, s11);
            }
            this.f16261c += s11;
            return h11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public void readBytesList(List<i> list) {
            int i11;
            if (r1.b(this.f16263e) == 2) {
                do {
                    list.add(readBytes());
                    if (i()) {
                        return;
                    }
                    i11 = this.f16261c;
                } while (s() == this.f16263e);
                this.f16261c = i11;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public double readDouble() {
            x(1);
            return Double.longBitsToDouble(n());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public void readDoubleList(List<Double> list) {
            int i11;
            int i12;
            if (list instanceof m) {
                m mVar = (m) list;
                int b11 = r1.b(this.f16263e);
                if (b11 == 1) {
                    do {
                        mVar.addDouble(readDouble());
                        if (i()) {
                            return;
                        }
                        i12 = this.f16261c;
                    } while (s() == this.f16263e);
                    this.f16261c = i12;
                    return;
                } else if (b11 == 2) {
                    int s11 = s();
                    D(s11);
                    int i13 = this.f16261c + s11;
                    while (this.f16261c < i13) {
                        mVar.addDouble(Double.longBitsToDouble(o()));
                    }
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int b12 = r1.b(this.f16263e);
            if (b12 == 1) {
                do {
                    list.add(Double.valueOf(readDouble()));
                    if (i()) {
                        return;
                    }
                    i11 = this.f16261c;
                } while (s() == this.f16263e);
                this.f16261c = i11;
            } else if (b12 == 2) {
                int s12 = s();
                D(s12);
                int i14 = this.f16261c + s12;
                while (this.f16261c < i14) {
                    list.add(Double.valueOf(Double.longBitsToDouble(o())));
                }
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public int readEnum() {
            x(0);
            return s();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public void readEnumList(List<Integer> list) {
            int i11;
            int i12;
            if (list instanceof z) {
                z zVar = (z) list;
                int b11 = r1.b(this.f16263e);
                if (b11 != 0) {
                    if (b11 == 2) {
                        int s11 = this.f16261c + s();
                        while (this.f16261c < s11) {
                            zVar.addInt(s());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    zVar.addInt(readEnum());
                    if (i()) {
                        return;
                    }
                    i12 = this.f16261c;
                } while (s() == this.f16263e);
                this.f16261c = i12;
                return;
            }
            int b12 = r1.b(this.f16263e);
            if (b12 != 0) {
                if (b12 == 2) {
                    int s12 = this.f16261c + s();
                    while (this.f16261c < s12) {
                        list.add(Integer.valueOf(s()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(readEnum()));
                if (i()) {
                    return;
                }
                i11 = this.f16261c;
            } while (s() == this.f16263e);
            this.f16261c = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public int readFixed32() {
            x(5);
            return l();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public void readFixed32List(List<Integer> list) {
            int i11;
            int i12;
            if (list instanceof z) {
                z zVar = (z) list;
                int b11 = r1.b(this.f16263e);
                if (b11 == 2) {
                    int s11 = s();
                    C(s11);
                    int i13 = this.f16261c + s11;
                    while (this.f16261c < i13) {
                        zVar.addInt(m());
                    }
                    return;
                } else if (b11 == 5) {
                    do {
                        zVar.addInt(readFixed32());
                        if (i()) {
                            return;
                        }
                        i12 = this.f16261c;
                    } while (s() == this.f16263e);
                    this.f16261c = i12;
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int b12 = r1.b(this.f16263e);
            if (b12 == 2) {
                int s12 = s();
                C(s12);
                int i14 = this.f16261c + s12;
                while (this.f16261c < i14) {
                    list.add(Integer.valueOf(m()));
                }
            } else if (b12 == 5) {
                do {
                    list.add(Integer.valueOf(readFixed32()));
                    if (i()) {
                        return;
                    }
                    i11 = this.f16261c;
                } while (s() == this.f16263e);
                this.f16261c = i11;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public long readFixed64() {
            x(1);
            return n();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public void readFixed64List(List<Long> list) {
            int i11;
            int i12;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int b11 = r1.b(this.f16263e);
                if (b11 == 1) {
                    do {
                        h0Var.addLong(readFixed64());
                        if (i()) {
                            return;
                        }
                        i12 = this.f16261c;
                    } while (s() == this.f16263e);
                    this.f16261c = i12;
                    return;
                } else if (b11 == 2) {
                    int s11 = s();
                    D(s11);
                    int i13 = this.f16261c + s11;
                    while (this.f16261c < i13) {
                        h0Var.addLong(o());
                    }
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int b12 = r1.b(this.f16263e);
            if (b12 == 1) {
                do {
                    list.add(Long.valueOf(readFixed64()));
                    if (i()) {
                        return;
                    }
                    i11 = this.f16261c;
                } while (s() == this.f16263e);
                this.f16261c = i11;
            } else if (b12 == 2) {
                int s12 = s();
                D(s12);
                int i14 = this.f16261c + s12;
                while (this.f16261c < i14) {
                    list.add(Long.valueOf(o()));
                }
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public float readFloat() {
            x(5);
            return Float.intBitsToFloat(l());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public void readFloatList(List<Float> list) {
            int i11;
            int i12;
            if (list instanceof w) {
                w wVar = (w) list;
                int b11 = r1.b(this.f16263e);
                if (b11 == 2) {
                    int s11 = s();
                    C(s11);
                    int i13 = this.f16261c + s11;
                    while (this.f16261c < i13) {
                        wVar.addFloat(Float.intBitsToFloat(m()));
                    }
                    return;
                } else if (b11 == 5) {
                    do {
                        wVar.addFloat(readFloat());
                        if (i()) {
                            return;
                        }
                        i12 = this.f16261c;
                    } while (s() == this.f16263e);
                    this.f16261c = i12;
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int b12 = r1.b(this.f16263e);
            if (b12 == 2) {
                int s12 = s();
                C(s12);
                int i14 = this.f16261c + s12;
                while (this.f16261c < i14) {
                    list.add(Float.valueOf(Float.intBitsToFloat(m())));
                }
            } else if (b12 == 5) {
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (i()) {
                        return;
                    }
                    i11 = this.f16261c;
                } while (s() == this.f16263e);
                this.f16261c = i11;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public int readInt32() {
            x(0);
            return s();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public void readInt32List(List<Integer> list) {
            int i11;
            int i12;
            if (list instanceof z) {
                z zVar = (z) list;
                int b11 = r1.b(this.f16263e);
                if (b11 == 0) {
                    do {
                        zVar.addInt(readInt32());
                        if (i()) {
                            return;
                        }
                        i12 = this.f16261c;
                    } while (s() == this.f16263e);
                    this.f16261c = i12;
                    return;
                } else if (b11 == 2) {
                    int s11 = this.f16261c + s();
                    while (this.f16261c < s11) {
                        zVar.addInt(s());
                    }
                    w(s11);
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int b12 = r1.b(this.f16263e);
            if (b12 == 0) {
                do {
                    list.add(Integer.valueOf(readInt32()));
                    if (i()) {
                        return;
                    }
                    i11 = this.f16261c;
                } while (s() == this.f16263e);
                this.f16261c = i11;
            } else if (b12 == 2) {
                int s12 = this.f16261c + s();
                while (this.f16261c < s12) {
                    list.add(Integer.valueOf(s()));
                }
                w(s12);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public long readInt64() {
            x(0);
            return t();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public void readInt64List(List<Long> list) {
            int i11;
            int i12;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int b11 = r1.b(this.f16263e);
                if (b11 == 0) {
                    do {
                        h0Var.addLong(readInt64());
                        if (i()) {
                            return;
                        }
                        i12 = this.f16261c;
                    } while (s() == this.f16263e);
                    this.f16261c = i12;
                    return;
                } else if (b11 == 2) {
                    int s11 = this.f16261c + s();
                    while (this.f16261c < s11) {
                        h0Var.addLong(t());
                    }
                    w(s11);
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int b12 = r1.b(this.f16263e);
            if (b12 == 0) {
                do {
                    list.add(Long.valueOf(readInt64()));
                    if (i()) {
                        return;
                    }
                    i11 = this.f16261c;
                } while (s() == this.f16263e);
                this.f16261c = i11;
            } else if (b12 == 2) {
                int s12 = this.f16261c + s();
                while (this.f16261c < s12) {
                    list.add(Long.valueOf(t()));
                }
                w(s12);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public int readSFixed32() {
            x(5);
            return l();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public void readSFixed32List(List<Integer> list) {
            int i11;
            int i12;
            if (list instanceof z) {
                z zVar = (z) list;
                int b11 = r1.b(this.f16263e);
                if (b11 == 2) {
                    int s11 = s();
                    C(s11);
                    int i13 = this.f16261c + s11;
                    while (this.f16261c < i13) {
                        zVar.addInt(m());
                    }
                    return;
                } else if (b11 == 5) {
                    do {
                        zVar.addInt(readSFixed32());
                        if (i()) {
                            return;
                        }
                        i12 = this.f16261c;
                    } while (s() == this.f16263e);
                    this.f16261c = i12;
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int b12 = r1.b(this.f16263e);
            if (b12 == 2) {
                int s12 = s();
                C(s12);
                int i14 = this.f16261c + s12;
                while (this.f16261c < i14) {
                    list.add(Integer.valueOf(m()));
                }
            } else if (b12 == 5) {
                do {
                    list.add(Integer.valueOf(readSFixed32()));
                    if (i()) {
                        return;
                    }
                    i11 = this.f16261c;
                } while (s() == this.f16263e);
                this.f16261c = i11;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public long readSFixed64() {
            x(1);
            return n();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public void readSFixed64List(List<Long> list) {
            int i11;
            int i12;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int b11 = r1.b(this.f16263e);
                if (b11 == 1) {
                    do {
                        h0Var.addLong(readSFixed64());
                        if (i()) {
                            return;
                        }
                        i12 = this.f16261c;
                    } while (s() == this.f16263e);
                    this.f16261c = i12;
                    return;
                } else if (b11 == 2) {
                    int s11 = s();
                    D(s11);
                    int i13 = this.f16261c + s11;
                    while (this.f16261c < i13) {
                        h0Var.addLong(o());
                    }
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int b12 = r1.b(this.f16263e);
            if (b12 == 1) {
                do {
                    list.add(Long.valueOf(readSFixed64()));
                    if (i()) {
                        return;
                    }
                    i11 = this.f16261c;
                } while (s() == this.f16263e);
                this.f16261c = i11;
            } else if (b12 == 2) {
                int s12 = s();
                D(s12);
                int i14 = this.f16261c + s12;
                while (this.f16261c < i14) {
                    list.add(Long.valueOf(o()));
                }
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public int readSInt32() {
            x(0);
            return j.b(s());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public void readSInt32List(List<Integer> list) {
            int i11;
            int i12;
            if (list instanceof z) {
                z zVar = (z) list;
                int b11 = r1.b(this.f16263e);
                if (b11 != 0) {
                    if (b11 == 2) {
                        int s11 = this.f16261c + s();
                        while (this.f16261c < s11) {
                            zVar.addInt(j.b(s()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    zVar.addInt(readSInt32());
                    if (i()) {
                        return;
                    }
                    i12 = this.f16261c;
                } while (s() == this.f16263e);
                this.f16261c = i12;
                return;
            }
            int b12 = r1.b(this.f16263e);
            if (b12 != 0) {
                if (b12 == 2) {
                    int s12 = this.f16261c + s();
                    while (this.f16261c < s12) {
                        list.add(Integer.valueOf(j.b(s())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(readSInt32()));
                if (i()) {
                    return;
                }
                i11 = this.f16261c;
            } while (s() == this.f16263e);
            this.f16261c = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public long readSInt64() {
            x(0);
            return j.c(t());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public void readSInt64List(List<Long> list) {
            int i11;
            int i12;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int b11 = r1.b(this.f16263e);
                if (b11 != 0) {
                    if (b11 == 2) {
                        int s11 = this.f16261c + s();
                        while (this.f16261c < s11) {
                            h0Var.addLong(j.c(t()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    h0Var.addLong(readSInt64());
                    if (i()) {
                        return;
                    }
                    i12 = this.f16261c;
                } while (s() == this.f16263e);
                this.f16261c = i12;
                return;
            }
            int b12 = r1.b(this.f16263e);
            if (b12 != 0) {
                if (b12 == 2) {
                    int s12 = this.f16261c + s();
                    while (this.f16261c < s12) {
                        list.add(Long.valueOf(j.c(t())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Long.valueOf(readSInt64()));
                if (i()) {
                    return;
                }
                i11 = this.f16261c;
            } while (s() == this.f16263e);
            this.f16261c = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public String readString() {
            return q(false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public void readStringList(List<String> list) {
            r(list, false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public void readStringListRequireUtf8(List<String> list) {
            r(list, true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public String readStringRequireUtf8() {
            return q(true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public int readUInt32() {
            x(0);
            return s();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public void readUInt32List(List<Integer> list) {
            int i11;
            int i12;
            if (list instanceof z) {
                z zVar = (z) list;
                int b11 = r1.b(this.f16263e);
                if (b11 != 0) {
                    if (b11 == 2) {
                        int s11 = this.f16261c + s();
                        while (this.f16261c < s11) {
                            zVar.addInt(s());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    zVar.addInt(readUInt32());
                    if (i()) {
                        return;
                    }
                    i12 = this.f16261c;
                } while (s() == this.f16263e);
                this.f16261c = i12;
                return;
            }
            int b12 = r1.b(this.f16263e);
            if (b12 != 0) {
                if (b12 == 2) {
                    int s12 = this.f16261c + s();
                    while (this.f16261c < s12) {
                        list.add(Integer.valueOf(s()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(readUInt32()));
                if (i()) {
                    return;
                }
                i11 = this.f16261c;
            } while (s() == this.f16263e);
            this.f16261c = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public long readUInt64() {
            x(0);
            return t();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public void readUInt64List(List<Long> list) {
            int i11;
            int i12;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int b11 = r1.b(this.f16263e);
                if (b11 == 0) {
                    do {
                        h0Var.addLong(readUInt64());
                        if (i()) {
                            return;
                        }
                        i12 = this.f16261c;
                    } while (s() == this.f16263e);
                    this.f16261c = i12;
                    return;
                } else if (b11 == 2) {
                    int s11 = this.f16261c + s();
                    while (this.f16261c < s11) {
                        h0Var.addLong(t());
                    }
                    w(s11);
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int b12 = r1.b(this.f16263e);
            if (b12 == 0) {
                do {
                    list.add(Long.valueOf(readUInt64()));
                    if (i()) {
                        return;
                    }
                    i11 = this.f16261c;
                } while (s() == this.f16263e);
                this.f16261c = i11;
            } else if (b12 == 2) {
                int s12 = this.f16261c + s();
                while (this.f16261c < s12) {
                    list.add(Long.valueOf(t()));
                }
                w(s12);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e1
        public boolean skipField() {
            int i11;
            if (i() || (i11 = this.f16263e) == this.f16264f) {
                return false;
            }
            int b11 = r1.b(i11);
            if (b11 == 0) {
                A();
                return true;
            } else if (b11 == 1) {
                y(8);
                return true;
            } else if (b11 == 2) {
                y(s());
                return true;
            } else if (b11 == 3) {
                z();
                return true;
            } else if (b11 == 5) {
                y(4);
                return true;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        public long t() {
            long j11;
            long j12;
            long j13;
            int i11;
            int i12 = this.f16261c;
            int i13 = this.f16262d;
            if (i13 != i12) {
                byte[] bArr = this.f16260b;
                int i14 = i12 + 1;
                byte b11 = bArr[i12];
                if (b11 >= 0) {
                    this.f16261c = i14;
                    return b11;
                } else if (i13 - i14 < 9) {
                    return u();
                } else {
                    int i15 = i14 + 1;
                    int i16 = b11 ^ (bArr[i14] << 7);
                    if (i16 >= 0) {
                        int i17 = i15 + 1;
                        int i18 = i16 ^ (bArr[i15] << 14);
                        if (i18 >= 0) {
                            i15 = i17;
                            j11 = i18 ^ 16256;
                        } else {
                            i15 = i17 + 1;
                            int i19 = i18 ^ (bArr[i17] << 21);
                            if (i19 < 0) {
                                i11 = i19 ^ (-2080896);
                            } else {
                                long j14 = i19;
                                int i21 = i15 + 1;
                                long j15 = j14 ^ (bArr[i15] << 28);
                                if (j15 >= 0) {
                                    j13 = 266354560;
                                } else {
                                    i15 = i21 + 1;
                                    long j16 = j15 ^ (bArr[i21] << 35);
                                    if (j16 < 0) {
                                        j12 = -34093383808L;
                                    } else {
                                        i21 = i15 + 1;
                                        j15 = j16 ^ (bArr[i15] << 42);
                                        if (j15 >= 0) {
                                            j13 = 4363953127296L;
                                        } else {
                                            i15 = i21 + 1;
                                            j16 = j15 ^ (bArr[i21] << 49);
                                            if (j16 < 0) {
                                                j12 = -558586000294016L;
                                            } else {
                                                int i22 = i15 + 1;
                                                long j17 = (j16 ^ (bArr[i15] << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    i15 = i22 + 1;
                                                    if (bArr[i22] < 0) {
                                                        throw InvalidProtocolBufferException.e();
                                                    }
                                                } else {
                                                    i15 = i22;
                                                }
                                                j11 = j17;
                                            }
                                        }
                                    }
                                    j11 = j16 ^ j12;
                                }
                                j11 = j15 ^ j13;
                                i15 = i21;
                            }
                        }
                        this.f16261c = i15;
                        return j11;
                    }
                    i11 = i16 ^ (-128);
                    j11 = i11;
                    this.f16261c = i15;
                    return j11;
                }
            }
            throw InvalidProtocolBufferException.j();
        }
    }

    public static f h(ByteBuffer byteBuffer, boolean z11) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z11);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    private f() {
    }
}