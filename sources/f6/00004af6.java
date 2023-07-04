package com.squareup.wire;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f20857b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final okio.g f20858a;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int g(int i11, b bVar) {
            return (i11 << 3) | bVar.getValue$wire_runtime();
        }

        public final int b(int i11) {
            return (-(i11 & 1)) ^ (i11 >>> 1);
        }

        public final long c(long j11) {
            return (-(j11 & 1)) ^ (j11 >>> 1);
        }

        public final int d(int i11) {
            return (i11 >> 31) ^ (i11 << 1);
        }

        public final long e(long j11) {
            return (j11 >> 63) ^ (j11 << 1);
        }

        public final int f(int i11) {
            if (i11 >= 0) {
                return i(i11);
            }
            return 10;
        }

        public final int h(int i11) {
            return i(g(i11, b.VARINT));
        }

        public final int i(int i11) {
            if ((i11 & (-128)) == 0) {
                return 1;
            }
            if ((i11 & (-16384)) == 0) {
                return 2;
            }
            if (((-2097152) & i11) == 0) {
                return 3;
            }
            return (i11 & (-268435456)) == 0 ? 4 : 5;
        }

        public final int j(long j11) {
            if (((-128) & j11) == 0) {
                return 1;
            }
            if (((-16384) & j11) == 0) {
                return 2;
            }
            if (((-2097152) & j11) == 0) {
                return 3;
            }
            if (((-268435456) & j11) == 0) {
                return 4;
            }
            if (((-34359738368L) & j11) == 0) {
                return 5;
            }
            if (((-4398046511104L) & j11) == 0) {
                return 6;
            }
            if (((-562949953421312L) & j11) == 0) {
                return 7;
            }
            if (((-72057594037927936L) & j11) == 0) {
                return 8;
            }
            return (j11 & Long.MIN_VALUE) == 0 ? 9 : 10;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public l(okio.g sink) {
        s.g(sink, "sink");
        this.f20858a = sink;
    }

    public final void a(okio.i value) {
        s.g(value, "value");
        this.f20858a.w1(value);
    }

    public final void b(int i11) {
        this.f20858a.L0(i11);
    }

    public final void c(long j11) {
        this.f20858a.z(j11);
    }

    public final void d(int i11) {
        if (i11 >= 0) {
            g(i11);
        } else {
            h(i11);
        }
    }

    public final void e(String value) {
        s.g(value, "value");
        this.f20858a.T(value);
    }

    public final void f(int i11, b fieldEncoding) {
        s.g(fieldEncoding, "fieldEncoding");
        g(f20857b.g(i11, fieldEncoding));
    }

    public final void g(int i11) {
        while ((i11 & (-128)) != 0) {
            this.f20858a.O0((i11 & 127) | 128);
            i11 >>>= 7;
        }
        this.f20858a.O0(i11);
    }

    public final void h(long j11) {
        while (((-128) & j11) != 0) {
            this.f20858a.O0((((int) j11) & 127) | 128);
            j11 >>>= 7;
        }
        this.f20858a.O0((int) j11);
    }
}