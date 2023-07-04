package com.squareup.moshi;

import ch.qos.logback.core.joran.action.ActionConst;
import com.adyen.checkout.components.model.payments.request.Address;
import com.squareup.moshi.h;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j extends h {

    /* renamed from: m  reason: collision with root package name */
    private static final okio.i f20520m = okio.i.f("'\\");

    /* renamed from: n  reason: collision with root package name */
    private static final okio.i f20521n = okio.i.f("\"\\");

    /* renamed from: o  reason: collision with root package name */
    private static final okio.i f20522o = okio.i.f("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: p  reason: collision with root package name */
    private static final okio.i f20523p = okio.i.f("\n\r");

    /* renamed from: q  reason: collision with root package name */
    private static final okio.i f20524q = okio.i.f("*/");

    /* renamed from: g  reason: collision with root package name */
    private final okio.h f20525g;

    /* renamed from: h  reason: collision with root package name */
    private final okio.f f20526h;

    /* renamed from: i  reason: collision with root package name */
    private int f20527i;

    /* renamed from: j  reason: collision with root package name */
    private long f20528j;

    /* renamed from: k  reason: collision with root package name */
    private int f20529k;

    /* renamed from: l  reason: collision with root package name */
    private String f20530l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(okio.h hVar) {
        this.f20527i = 0;
        Objects.requireNonNull(hVar, "source == null");
        this.f20525g = hVar;
        this.f20526h = hVar.b();
        D0(6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
        if (p1(r11) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0084, code lost:
        if (r6 != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0086, code lost:
        if (r7 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008c, code lost:
        if (r8 != Long.MIN_VALUE) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
        if (r10 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0092, code lost:
        if (r8 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
        if (r10 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0096, code lost:
        if (r10 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009a, code lost:
        r16.f20528j = r8;
        r16.f20526h.skip(r5);
        r16.f20527i = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a7, code lost:
        if (r6 == 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00aa, code lost:
        if (r6 == 4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ad, code lost:
        if (r6 != 7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b0, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b2, code lost:
        r16.f20529k = r5;
        r16.f20527i = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b8, code lost:
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b9, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int D1() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.j.D1():int");
    }

    private char F1() {
        int i11;
        int i12;
        if (this.f20525g.request(1L)) {
            byte readByte = this.f20526h.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte != 98) {
                if (readByte != 102) {
                    if (readByte != 110) {
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    if (this.f20515e) {
                                        return (char) readByte;
                                    }
                                    throw S0("Invalid escape sequence: \\" + ((char) readByte));
                                } else if (this.f20525g.request(4L)) {
                                    char c11 = 0;
                                    for (int i13 = 0; i13 < 4; i13++) {
                                        byte J = this.f20526h.J(i13);
                                        char c12 = (char) (c11 << 4);
                                        if (J < 48 || J > 57) {
                                            if (J >= 97 && J <= 102) {
                                                i11 = J - 97;
                                            } else if (J < 65 || J > 70) {
                                                throw S0("\\u" + this.f20526h.w0(4L));
                                            } else {
                                                i11 = J - 65;
                                            }
                                            i12 = i11 + 10;
                                        } else {
                                            i12 = J - 48;
                                        }
                                        c11 = (char) (c12 + i12);
                                    }
                                    this.f20526h.skip(4L);
                                    return c11;
                                } else {
                                    throw new EOFException("Unterminated escape sequence at path " + getPath());
                                }
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\n';
                }
                return '\f';
            }
            return '\b';
        }
        throw S0("Unterminated escape sequence");
    }

    private void K1(okio.i iVar) {
        while (true) {
            long H = this.f20525g.H(iVar);
            if (H != -1) {
                if (this.f20526h.J(H) == 92) {
                    this.f20526h.skip(H + 1);
                    F1();
                } else {
                    this.f20526h.skip(H + 1);
                    return;
                }
            } else {
                throw S0("Unterminated string");
            }
        }
    }

    private boolean L1() {
        okio.h hVar = this.f20525g;
        okio.i iVar = f20524q;
        long B = hVar.B(iVar);
        boolean z11 = B != -1;
        okio.f fVar = this.f20526h;
        fVar.skip(z11 ? B + iVar.z() : fVar.P0());
        return z11;
    }

    private void M1() {
        long H = this.f20525g.H(f20523p);
        okio.f fVar = this.f20526h;
        fVar.skip(H != -1 ? H + 1 : fVar.P0());
    }

    private void N1() {
        long H = this.f20525g.H(f20522o);
        okio.f fVar = this.f20526h;
        if (H == -1) {
            H = fVar.P0();
        }
        fVar.skip(H);
    }

    private void X0() {
        if (!this.f20515e) {
            throw S0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int Z0() {
        int[] iArr = this.f20512b;
        int i11 = this.f20511a;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else if (i12 == 2) {
            int t12 = t1(true);
            this.f20526h.readByte();
            if (t12 != 44) {
                if (t12 != 59) {
                    if (t12 == 93) {
                        this.f20527i = 4;
                        return 4;
                    }
                    throw S0("Unterminated array");
                }
                X0();
            }
        } else if (i12 == 3 || i12 == 5) {
            iArr[i11 - 1] = 4;
            if (i12 == 5) {
                int t13 = t1(true);
                this.f20526h.readByte();
                if (t13 != 44) {
                    if (t13 != 59) {
                        if (t13 == 125) {
                            this.f20527i = 2;
                            return 2;
                        }
                        throw S0("Unterminated object");
                    }
                    X0();
                }
            }
            int t14 = t1(true);
            if (t14 == 34) {
                this.f20526h.readByte();
                this.f20527i = 13;
                return 13;
            } else if (t14 == 39) {
                this.f20526h.readByte();
                X0();
                this.f20527i = 12;
                return 12;
            } else if (t14 != 125) {
                X0();
                if (p1((char) t14)) {
                    this.f20527i = 14;
                    return 14;
                }
                throw S0("Expected name");
            } else if (i12 != 5) {
                this.f20526h.readByte();
                this.f20527i = 2;
                return 2;
            } else {
                throw S0("Expected name");
            }
        } else if (i12 == 4) {
            iArr[i11 - 1] = 5;
            int t15 = t1(true);
            this.f20526h.readByte();
            if (t15 != 58) {
                if (t15 == 61) {
                    X0();
                    if (this.f20525g.request(1L) && this.f20526h.J(0L) == 62) {
                        this.f20526h.readByte();
                    }
                } else {
                    throw S0("Expected ':'");
                }
            }
        } else if (i12 == 6) {
            iArr[i11 - 1] = 7;
        } else if (i12 == 7) {
            if (t1(false) == -1) {
                this.f20527i = 18;
                return 18;
            }
            X0();
        } else if (i12 == 9) {
            throw null;
        } else {
            if (i12 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int t16 = t1(true);
        if (t16 == 34) {
            this.f20526h.readByte();
            this.f20527i = 9;
            return 9;
        } else if (t16 == 39) {
            X0();
            this.f20526h.readByte();
            this.f20527i = 8;
            return 8;
        } else {
            if (t16 != 44 && t16 != 59) {
                if (t16 == 91) {
                    this.f20526h.readByte();
                    this.f20527i = 3;
                    return 3;
                } else if (t16 != 93) {
                    if (t16 != 123) {
                        int z12 = z1();
                        if (z12 != 0) {
                            return z12;
                        }
                        int D1 = D1();
                        if (D1 != 0) {
                            return D1;
                        }
                        if (p1(this.f20526h.J(0L))) {
                            X0();
                            this.f20527i = 10;
                            return 10;
                        }
                        throw S0("Expected value");
                    }
                    this.f20526h.readByte();
                    this.f20527i = 1;
                    return 1;
                } else if (i12 == 1) {
                    this.f20526h.readByte();
                    this.f20527i = 4;
                    return 4;
                }
            }
            if (i12 != 1 && i12 != 2) {
                throw S0("Unexpected value");
            }
            X0();
            this.f20527i = 7;
            return 7;
        }
    }

    private int b1(String str, h.b bVar) {
        int length = bVar.f20518a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(bVar.f20518a[i11])) {
                this.f20527i = 0;
                this.f20513c[this.f20511a - 1] = str;
                return i11;
            }
        }
        return -1;
    }

    private int h1(String str, h.b bVar) {
        int length = bVar.f20518a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(bVar.f20518a[i11])) {
                this.f20527i = 0;
                int[] iArr = this.f20514d;
                int i12 = this.f20511a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
        }
        return -1;
    }

    private boolean p1(int i11) {
        if (i11 == 9 || i11 == 10 || i11 == 12 || i11 == 13 || i11 == 32) {
            return false;
        }
        if (i11 != 35) {
            if (i11 == 44) {
                return false;
            }
            if (i11 != 47 && i11 != 61) {
                if (i11 == 123 || i11 == 125 || i11 == 58) {
                    return false;
                }
                if (i11 != 59) {
                    switch (i11) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        X0();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        r6.f20526h.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 != 47) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r6.f20525g.request(2) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        X0();
        r3 = r6.f20526h.J(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r3 == 42) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r3 == 47) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        r6.f20526h.readByte();
        r6.f20526h.readByte();
        M1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        r6.f20526h.readByte();
        r6.f20526h.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (L1() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
        throw S0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r1 != 35) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
        X0();
        M1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int t1(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            okio.h r2 = r6.f20525g
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L82
            okio.f r2 = r6.f20526h
            long r4 = (long) r1
            byte r1 = r2.J(r4)
            r2 = 10
            if (r1 == r2) goto L80
            r2 = 32
            if (r1 == r2) goto L80
            r2 = 13
            if (r1 == r2) goto L80
            r2 = 9
            if (r1 != r2) goto L25
            goto L80
        L25:
            okio.f r2 = r6.f20526h
            int r3 = r3 + (-1)
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L74
            okio.h r3 = r6.f20525g
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3c
            return r1
        L3c:
            r6.X0()
            okio.f r3 = r6.f20526h
            r4 = 1
            byte r3 = r3.J(r4)
            r4 = 42
            if (r3 == r4) goto L5c
            if (r3 == r2) goto L4e
            return r1
        L4e:
            okio.f r1 = r6.f20526h
            r1.readByte()
            okio.f r1 = r6.f20526h
            r1.readByte()
            r6.M1()
            goto L1
        L5c:
            okio.f r1 = r6.f20526h
            r1.readByte()
            okio.f r1 = r6.f20526h
            r1.readByte()
            boolean r1 = r6.L1()
            if (r1 == 0) goto L6d
            goto L1
        L6d:
            java.lang.String r7 = "Unterminated comment"
            com.squareup.moshi.JsonEncodingException r7 = r6.S0(r7)
            throw r7
        L74:
            r2 = 35
            if (r1 != r2) goto L7f
            r6.X0()
            r6.M1()
            goto L1
        L7f:
            return r1
        L80:
            r1 = r3
            goto L2
        L82:
            if (r7 != 0) goto L86
            r7 = -1
            return r7
        L86:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.j.t1(boolean):int");
    }

    private String v1(okio.i iVar) {
        StringBuilder sb2 = null;
        while (true) {
            long H = this.f20525g.H(iVar);
            if (H != -1) {
                if (this.f20526h.J(H) != 92) {
                    if (sb2 == null) {
                        String w02 = this.f20526h.w0(H);
                        this.f20526h.readByte();
                        return w02;
                    }
                    sb2.append(this.f20526h.w0(H));
                    this.f20526h.readByte();
                    return sb2.toString();
                }
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.f20526h.w0(H));
                this.f20526h.readByte();
                sb2.append(F1());
            } else {
                throw S0("Unterminated string");
            }
        }
    }

    private String y1() {
        long H = this.f20525g.H(f20522o);
        return H != -1 ? this.f20526h.w0(H) : this.f20526h.G0();
    }

    private int z1() {
        int i11;
        String str;
        String str2;
        byte J = this.f20526h.J(0L);
        if (J == 116 || J == 84) {
            i11 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (J == 102 || J == 70) {
            i11 = 6;
            str = "false";
            str2 = "FALSE";
        } else if (J != 110 && J != 78) {
            return 0;
        } else {
            i11 = 7;
            str = Address.ADDRESS_NULL_PLACEHOLDER;
            str2 = ActionConst.NULL;
        }
        int length = str.length();
        int i12 = 1;
        while (i12 < length) {
            int i13 = i12 + 1;
            if (!this.f20525g.request(i13)) {
                return 0;
            }
            byte J2 = this.f20526h.J(i12);
            if (J2 != str.charAt(i12) && J2 != str2.charAt(i12)) {
                return 0;
            }
            i12 = i13;
        }
        if (this.f20525g.request(length + 1) && p1(this.f20526h.J(length))) {
            return 0;
        }
        this.f20526h.skip(length);
        this.f20527i = i11;
        return i11;
    }

    @Override // com.squareup.moshi.h
    public void C0() {
        if (p()) {
            this.f20530l = a0();
            this.f20527i = 11;
        }
    }

    @Override // com.squareup.moshi.h
    public boolean D() {
        int i11 = this.f20527i;
        if (i11 == 0) {
            i11 = Z0();
        }
        if (i11 == 5) {
            this.f20527i = 0;
            int[] iArr = this.f20514d;
            int i12 = this.f20511a - 1;
            iArr[i12] = iArr[i12] + 1;
            return true;
        } else if (i11 == 6) {
            this.f20527i = 0;
            int[] iArr2 = this.f20514d;
            int i13 = this.f20511a - 1;
            iArr2[i13] = iArr2[i13] + 1;
            return false;
        } else {
            throw new JsonDataException("Expected a boolean but was " + t0() + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.h
    public int G0(h.b bVar) {
        int i11 = this.f20527i;
        if (i11 == 0) {
            i11 = Z0();
        }
        if (i11 < 12 || i11 > 15) {
            return -1;
        }
        if (i11 == 15) {
            return b1(this.f20530l, bVar);
        }
        int J1 = this.f20525g.J1(bVar.f20519b);
        if (J1 != -1) {
            this.f20527i = 0;
            this.f20513c[this.f20511a - 1] = bVar.f20518a[J1];
            return J1;
        }
        String str = this.f20513c[this.f20511a - 1];
        String a02 = a0();
        int b12 = b1(a02, bVar);
        if (b12 == -1) {
            this.f20527i = 15;
            this.f20530l = a02;
            this.f20513c[this.f20511a - 1] = str;
        }
        return b12;
    }

    @Override // com.squareup.moshi.h
    public int I0(h.b bVar) {
        int[] iArr;
        int i11;
        int i12 = this.f20527i;
        if (i12 == 0) {
            i12 = Z0();
        }
        if (i12 < 8 || i12 > 11) {
            return -1;
        }
        if (i12 == 11) {
            return h1(this.f20530l, bVar);
        }
        int J1 = this.f20525g.J1(bVar.f20519b);
        if (J1 != -1) {
            this.f20527i = 0;
            int[] iArr2 = this.f20514d;
            int i13 = this.f20511a - 1;
            iArr2[i13] = iArr2[i13] + 1;
            return J1;
        }
        String n02 = n0();
        int h12 = h1(n02, bVar);
        if (h12 == -1) {
            this.f20527i = 11;
            this.f20530l = n02;
            this.f20514d[this.f20511a - 1] = iArr[i11] - 1;
        }
        return h12;
    }

    @Override // com.squareup.moshi.h
    public double J() {
        int i11 = this.f20527i;
        if (i11 == 0) {
            i11 = Z0();
        }
        if (i11 == 16) {
            this.f20527i = 0;
            int[] iArr = this.f20514d;
            int i12 = this.f20511a - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f20528j;
        }
        if (i11 == 17) {
            this.f20530l = this.f20526h.w0(this.f20529k);
        } else if (i11 == 9) {
            this.f20530l = v1(f20521n);
        } else if (i11 == 8) {
            this.f20530l = v1(f20520m);
        } else if (i11 == 10) {
            this.f20530l = y1();
        } else if (i11 != 11) {
            throw new JsonDataException("Expected a double but was " + t0() + " at path " + getPath());
        }
        this.f20527i = 11;
        try {
            double parseDouble = Double.parseDouble(this.f20530l);
            if (!this.f20515e && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
            }
            this.f20530l = null;
            this.f20527i = 0;
            int[] iArr2 = this.f20514d;
            int i13 = this.f20511a - 1;
            iArr2[i13] = iArr2[i13] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f20530l + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.h
    public int L() {
        String v12;
        int i11 = this.f20527i;
        if (i11 == 0) {
            i11 = Z0();
        }
        if (i11 == 16) {
            long j11 = this.f20528j;
            int i12 = (int) j11;
            if (j11 == i12) {
                this.f20527i = 0;
                int[] iArr = this.f20514d;
                int i13 = this.f20511a - 1;
                iArr[i13] = iArr[i13] + 1;
                return i12;
            }
            throw new JsonDataException("Expected an int but was " + this.f20528j + " at path " + getPath());
        }
        if (i11 == 17) {
            this.f20530l = this.f20526h.w0(this.f20529k);
        } else if (i11 == 9 || i11 == 8) {
            if (i11 == 9) {
                v12 = v1(f20521n);
            } else {
                v12 = v1(f20520m);
            }
            this.f20530l = v12;
            try {
                int parseInt = Integer.parseInt(v12);
                this.f20527i = 0;
                int[] iArr2 = this.f20514d;
                int i14 = this.f20511a - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i11 != 11) {
            throw new JsonDataException("Expected an int but was " + t0() + " at path " + getPath());
        }
        this.f20527i = 11;
        try {
            double parseDouble = Double.parseDouble(this.f20530l);
            int i15 = (int) parseDouble;
            if (i15 == parseDouble) {
                this.f20530l = null;
                this.f20527i = 0;
                int[] iArr3 = this.f20514d;
                int i16 = this.f20511a - 1;
                iArr3[i16] = iArr3[i16] + 1;
                return i15;
            }
            throw new JsonDataException("Expected an int but was " + this.f20530l + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f20530l + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.h
    public void Q0() {
        if (!this.f20516f) {
            int i11 = this.f20527i;
            if (i11 == 0) {
                i11 = Z0();
            }
            if (i11 == 14) {
                N1();
            } else if (i11 == 13) {
                K1(f20521n);
            } else if (i11 == 12) {
                K1(f20520m);
            } else if (i11 != 15) {
                throw new JsonDataException("Expected a name but was " + t0() + " at path " + getPath());
            }
            this.f20527i = 0;
            this.f20513c[this.f20511a - 1] = Address.ADDRESS_NULL_PLACEHOLDER;
            return;
        }
        h.c t02 = t0();
        a0();
        throw new JsonDataException("Cannot skip unexpected " + t02 + " at " + getPath());
    }

    @Override // com.squareup.moshi.h
    public long R() {
        String v12;
        int i11 = this.f20527i;
        if (i11 == 0) {
            i11 = Z0();
        }
        if (i11 == 16) {
            this.f20527i = 0;
            int[] iArr = this.f20514d;
            int i12 = this.f20511a - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f20528j;
        }
        if (i11 == 17) {
            this.f20530l = this.f20526h.w0(this.f20529k);
        } else if (i11 == 9 || i11 == 8) {
            if (i11 == 9) {
                v12 = v1(f20521n);
            } else {
                v12 = v1(f20520m);
            }
            this.f20530l = v12;
            try {
                long parseLong = Long.parseLong(v12);
                this.f20527i = 0;
                int[] iArr2 = this.f20514d;
                int i13 = this.f20511a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i11 != 11) {
            throw new JsonDataException("Expected a long but was " + t0() + " at path " + getPath());
        }
        this.f20527i = 11;
        try {
            long longValueExact = new BigDecimal(this.f20530l).longValueExact();
            this.f20530l = null;
            this.f20527i = 0;
            int[] iArr3 = this.f20514d;
            int i14 = this.f20511a - 1;
            iArr3[i14] = iArr3[i14] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.f20530l + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.h
    public void R0() {
        if (!this.f20516f) {
            int i11 = 0;
            do {
                int i12 = this.f20527i;
                if (i12 == 0) {
                    i12 = Z0();
                }
                if (i12 == 3) {
                    D0(1);
                } else if (i12 == 1) {
                    D0(3);
                } else {
                    if (i12 == 4) {
                        i11--;
                        if (i11 >= 0) {
                            this.f20511a--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + t0() + " at path " + getPath());
                        }
                    } else if (i12 == 2) {
                        i11--;
                        if (i11 >= 0) {
                            this.f20511a--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + t0() + " at path " + getPath());
                        }
                    } else if (i12 == 14 || i12 == 10) {
                        N1();
                    } else if (i12 == 9 || i12 == 13) {
                        K1(f20521n);
                    } else if (i12 == 8 || i12 == 12) {
                        K1(f20520m);
                    } else if (i12 == 17) {
                        this.f20526h.skip(this.f20529k);
                    } else if (i12 == 18) {
                        throw new JsonDataException("Expected a value but was " + t0() + " at path " + getPath());
                    }
                    this.f20527i = 0;
                }
                i11++;
                this.f20527i = 0;
            } while (i11 != 0);
            int[] iArr = this.f20514d;
            int i13 = this.f20511a;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
            this.f20513c[i13 - 1] = Address.ADDRESS_NULL_PLACEHOLDER;
            return;
        }
        throw new JsonDataException("Cannot skip unexpected " + t0() + " at " + getPath());
    }

    @Override // com.squareup.moshi.h
    public void a() {
        int i11 = this.f20527i;
        if (i11 == 0) {
            i11 = Z0();
        }
        if (i11 == 3) {
            D0(1);
            this.f20514d[this.f20511a - 1] = 0;
            this.f20527i = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + t0() + " at path " + getPath());
    }

    @Override // com.squareup.moshi.h
    public String a0() {
        String str;
        int i11 = this.f20527i;
        if (i11 == 0) {
            i11 = Z0();
        }
        if (i11 == 14) {
            str = y1();
        } else if (i11 == 13) {
            str = v1(f20521n);
        } else if (i11 == 12) {
            str = v1(f20520m);
        } else if (i11 == 15) {
            str = this.f20530l;
            this.f20530l = null;
        } else {
            throw new JsonDataException("Expected a name but was " + t0() + " at path " + getPath());
        }
        this.f20527i = 0;
        this.f20513c[this.f20511a - 1] = str;
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20527i = 0;
        this.f20512b[0] = 8;
        this.f20511a = 1;
        this.f20526h.a();
        this.f20525g.close();
    }

    @Override // com.squareup.moshi.h
    public <T> T e0() {
        int i11 = this.f20527i;
        if (i11 == 0) {
            i11 = Z0();
        }
        if (i11 == 7) {
            this.f20527i = 0;
            int[] iArr = this.f20514d;
            int i12 = this.f20511a - 1;
            iArr[i12] = iArr[i12] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + t0() + " at path " + getPath());
    }

    @Override // com.squareup.moshi.h
    public void g() {
        int i11 = this.f20527i;
        if (i11 == 0) {
            i11 = Z0();
        }
        if (i11 == 1) {
            D0(3);
            this.f20527i = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + t0() + " at path " + getPath());
    }

    @Override // com.squareup.moshi.h
    public void j() {
        int i11 = this.f20527i;
        if (i11 == 0) {
            i11 = Z0();
        }
        if (i11 == 4) {
            int i12 = this.f20511a - 1;
            this.f20511a = i12;
            int[] iArr = this.f20514d;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
            this.f20527i = 0;
            return;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + t0() + " at path " + getPath());
    }

    @Override // com.squareup.moshi.h
    public void l() {
        int i11 = this.f20527i;
        if (i11 == 0) {
            i11 = Z0();
        }
        if (i11 == 2) {
            int i12 = this.f20511a - 1;
            this.f20511a = i12;
            this.f20513c[i12] = null;
            int[] iArr = this.f20514d;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
            this.f20527i = 0;
            return;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + t0() + " at path " + getPath());
    }

    @Override // com.squareup.moshi.h
    public String n0() {
        String w02;
        int i11 = this.f20527i;
        if (i11 == 0) {
            i11 = Z0();
        }
        if (i11 == 10) {
            w02 = y1();
        } else if (i11 == 9) {
            w02 = v1(f20521n);
        } else if (i11 == 8) {
            w02 = v1(f20520m);
        } else if (i11 == 11) {
            w02 = this.f20530l;
            this.f20530l = null;
        } else if (i11 == 16) {
            w02 = Long.toString(this.f20528j);
        } else if (i11 == 17) {
            w02 = this.f20526h.w0(this.f20529k);
        } else {
            throw new JsonDataException("Expected a string but was " + t0() + " at path " + getPath());
        }
        this.f20527i = 0;
        int[] iArr = this.f20514d;
        int i12 = this.f20511a - 1;
        iArr[i12] = iArr[i12] + 1;
        return w02;
    }

    @Override // com.squareup.moshi.h
    public boolean p() {
        int i11 = this.f20527i;
        if (i11 == 0) {
            i11 = Z0();
        }
        return (i11 == 2 || i11 == 4 || i11 == 18) ? false : true;
    }

    @Override // com.squareup.moshi.h
    public h.c t0() {
        int i11 = this.f20527i;
        if (i11 == 0) {
            i11 = Z0();
        }
        switch (i11) {
            case 1:
                return h.c.BEGIN_OBJECT;
            case 2:
                return h.c.END_OBJECT;
            case 3:
                return h.c.BEGIN_ARRAY;
            case 4:
                return h.c.END_ARRAY;
            case 5:
            case 6:
                return h.c.BOOLEAN;
            case 7:
                return h.c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return h.c.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return h.c.NAME;
            case 16:
            case 17:
                return h.c.NUMBER;
            case 18:
                return h.c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonReader(" + this.f20525g + ")";
    }

    @Override // com.squareup.moshi.h
    public h u0() {
        return new j(this);
    }

    j(j jVar) {
        super(jVar);
        this.f20527i = 0;
        okio.h peek = jVar.f20525g.peek();
        this.f20525g = peek;
        this.f20526h = peek.b();
        this.f20527i = jVar.f20527i;
        this.f20528j = jVar.f20528j;
        this.f20529k = jVar.f20529k;
        this.f20530l = jVar.f20530l;
        try {
            peek.m0(jVar.f20526h.P0());
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}