package com.squareup.wire;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private long f20848a;

    /* renamed from: b  reason: collision with root package name */
    private long f20849b;

    /* renamed from: c  reason: collision with root package name */
    private int f20850c;

    /* renamed from: d  reason: collision with root package name */
    private int f20851d;

    /* renamed from: e  reason: collision with root package name */
    private int f20852e;

    /* renamed from: f  reason: collision with root package name */
    private long f20853f;

    /* renamed from: g  reason: collision with root package name */
    private b f20854g;

    /* renamed from: h  reason: collision with root package name */
    private final List<okio.f> f20855h;

    /* renamed from: i  reason: collision with root package name */
    private final okio.h f20856i;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public k(okio.h source) {
        s.g(source, "source");
        this.f20856i = source;
        this.f20849b = Long.MAX_VALUE;
        this.f20851d = 2;
        this.f20852e = -1;
        this.f20853f = -1L;
        this.f20855h = new ArrayList();
    }

    private final void b(int i11) {
        if (this.f20851d == i11) {
            this.f20851d = 6;
            return;
        }
        long j11 = this.f20848a;
        long j12 = this.f20849b;
        if (j11 > j12) {
            throw new IOException("Expected to end at " + this.f20849b + " but was " + this.f20848a);
        } else if (j11 == j12) {
            this.f20849b = this.f20853f;
            this.f20853f = -1L;
            this.f20851d = 6;
        } else {
            this.f20851d = 7;
        }
    }

    private final long c() {
        if (this.f20851d == 2) {
            long j11 = this.f20849b - this.f20848a;
            this.f20856i.m0(j11);
            this.f20851d = 6;
            this.f20848a = this.f20849b;
            this.f20849b = this.f20853f;
            this.f20853f = -1L;
            return j11;
        }
        throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.f20851d);
    }

    private final int f() {
        int i11;
        this.f20856i.m0(1L);
        this.f20848a++;
        byte readByte = this.f20856i.readByte();
        if (readByte >= 0) {
            return readByte;
        }
        int i12 = readByte & Byte.MAX_VALUE;
        this.f20856i.m0(1L);
        this.f20848a++;
        byte readByte2 = this.f20856i.readByte();
        if (readByte2 >= 0) {
            i11 = readByte2 << 7;
        } else {
            i12 |= (readByte2 & Byte.MAX_VALUE) << 7;
            this.f20856i.m0(1L);
            this.f20848a++;
            byte readByte3 = this.f20856i.readByte();
            if (readByte3 >= 0) {
                i11 = readByte3 << 14;
            } else {
                i12 |= (readByte3 & Byte.MAX_VALUE) << 14;
                this.f20856i.m0(1L);
                this.f20848a++;
                byte readByte4 = this.f20856i.readByte();
                if (readByte4 < 0) {
                    int i13 = i12 | ((readByte4 & Byte.MAX_VALUE) << 21);
                    this.f20856i.m0(1L);
                    this.f20848a++;
                    byte readByte5 = this.f20856i.readByte();
                    int i14 = i13 | (readByte5 << 28);
                    if (readByte5 < 0) {
                        for (int i15 = 0; i15 <= 4; i15++) {
                            this.f20856i.m0(1L);
                            this.f20848a++;
                            if (this.f20856i.readByte() >= 0) {
                                return i14;
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i14;
                }
                i11 = readByte4 << 21;
            }
        }
        return i12 | i11;
    }

    private final void q(int i11) {
        while (this.f20848a < this.f20849b && !this.f20856i.N0()) {
            int f11 = f();
            if (f11 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i12 = f11 >> 3;
            int i13 = f11 & 7;
            if (i13 == 0) {
                this.f20851d = 0;
                o();
            } else if (i13 == 1) {
                this.f20851d = 1;
                k();
            } else if (i13 == 2) {
                long f12 = f();
                this.f20848a += f12;
                this.f20856i.skip(f12);
            } else if (i13 == 3) {
                q(i12);
            } else if (i13 == 4) {
                if (i12 != i11) {
                    throw new ProtocolException("Unexpected end group");
                }
                return;
            } else if (i13 == 5) {
                this.f20851d = 5;
                j();
            } else {
                throw new ProtocolException("Unexpected field encoding: " + i13);
            }
        }
        throw new EOFException();
    }

    public final void a(int i11, b fieldEncoding, Object obj) {
        s.g(fieldEncoding, "fieldEncoding");
        l lVar = new l(this.f20855h.get(this.f20850c - 1));
        ProtoAdapter<?> rawProtoAdapter = fieldEncoding.rawProtoAdapter();
        Objects.requireNonNull(rawProtoAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        rawProtoAdapter.encodeWithTag(lVar, i11, obj);
    }

    public final long d() {
        if (this.f20851d == 2) {
            int i11 = this.f20850c + 1;
            this.f20850c = i11;
            if (i11 <= 65) {
                if (i11 > this.f20855h.size()) {
                    this.f20855h.add(new okio.f());
                }
                long j11 = this.f20853f;
                this.f20853f = -1L;
                this.f20851d = 6;
                return j11;
            }
            throw new IOException("Wire recursion limit exceeded");
        }
        throw new IllegalStateException("Unexpected call to beginMessage()".toString());
    }

    public final okio.i e(long j11) {
        boolean z11 = true;
        if (this.f20851d == 6) {
            int i11 = this.f20850c - 1;
            this.f20850c = i11;
            if (i11 < 0 || this.f20853f != -1) {
                z11 = false;
            }
            if (z11) {
                if (this.f20848a != this.f20849b && i11 != 0) {
                    throw new IOException("Expected to end at " + this.f20849b + " but was " + this.f20848a);
                }
                this.f20849b = j11;
                okio.f fVar = this.f20855h.get(i11);
                if (fVar.P0() > 0) {
                    return fVar.j1();
                }
                return okio.i.f42656d;
            }
            throw new IllegalStateException("No corresponding call to beginMessage()".toString());
        }
        throw new IllegalStateException("Unexpected call to endMessage()".toString());
    }

    public final int g() {
        int i11 = this.f20851d;
        if (i11 == 7) {
            this.f20851d = 2;
            return this.f20852e;
        } else if (i11 == 6) {
            while (this.f20848a < this.f20849b && !this.f20856i.N0()) {
                int f11 = f();
                if (f11 != 0) {
                    int i12 = f11 >> 3;
                    this.f20852e = i12;
                    int i13 = f11 & 7;
                    if (i13 == 0) {
                        this.f20854g = b.VARINT;
                        this.f20851d = 0;
                        return i12;
                    } else if (i13 == 1) {
                        this.f20854g = b.FIXED64;
                        this.f20851d = 1;
                        return i12;
                    } else if (i13 == 2) {
                        this.f20854g = b.LENGTH_DELIMITED;
                        this.f20851d = 2;
                        int f12 = f();
                        if (f12 >= 0) {
                            if (this.f20853f == -1) {
                                long j11 = this.f20849b;
                                this.f20853f = j11;
                                long j12 = this.f20848a + f12;
                                this.f20849b = j12;
                                if (j12 <= j11) {
                                    return this.f20852e;
                                }
                                throw new EOFException();
                            }
                            throw new IllegalStateException();
                        }
                        throw new ProtocolException("Negative length: " + f12);
                    } else if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 == 5) {
                                this.f20854g = b.FIXED32;
                                this.f20851d = 5;
                                return i12;
                            }
                            throw new ProtocolException("Unexpected field encoding: " + i13);
                        }
                        throw new ProtocolException("Unexpected end group");
                    } else {
                        q(i12);
                    }
                } else {
                    throw new ProtocolException("Unexpected tag 0");
                }
            }
            return -1;
        } else {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
    }

    public final b h() {
        return this.f20854g;
    }

    public final okio.i i() {
        long c11 = c();
        this.f20856i.m0(c11);
        return this.f20856i.z0(c11);
    }

    public final int j() {
        int i11 = this.f20851d;
        if (i11 != 5 && i11 != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.f20851d);
        }
        this.f20856i.m0(4L);
        this.f20848a += 4;
        int r12 = this.f20856i.r1();
        b(5);
        return r12;
    }

    public final long k() {
        int i11 = this.f20851d;
        if (i11 != 1 && i11 != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.f20851d);
        }
        this.f20856i.m0(8L);
        this.f20848a += 8;
        long k02 = this.f20856i.k0();
        b(1);
        return k02;
    }

    public final String l() {
        long c11 = c();
        this.f20856i.m0(c11);
        return this.f20856i.w0(c11);
    }

    public final void m(int i11) {
        b h11 = h();
        s.e(h11);
        a(i11, h11, h11.rawProtoAdapter().decode(this));
    }

    public final int n() {
        int i11 = this.f20851d;
        if (i11 != 0 && i11 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f20851d);
        }
        int f11 = f();
        b(0);
        return f11;
    }

    public final long o() {
        byte readByte;
        int i11 = this.f20851d;
        if (i11 != 0 && i11 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f20851d);
        }
        long j11 = 0;
        for (int i12 = 0; i12 < 64; i12 += 7) {
            this.f20856i.m0(1L);
            this.f20848a++;
            j11 |= (readByte & Byte.MAX_VALUE) << i12;
            if ((this.f20856i.readByte() & 128) == 0) {
                b(0);
                return j11;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final void p() {
        int i11 = this.f20851d;
        if (i11 == 0) {
            o();
        } else if (i11 == 1) {
            k();
        } else if (i11 == 2) {
            this.f20856i.skip(c());
        } else if (i11 == 5) {
            j();
        } else {
            throw new IllegalStateException("Unexpected call to skip()");
        }
    }
}