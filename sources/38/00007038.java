package g8;

import ch.qos.logback.core.joran.action.ActionConst;
import com.adyen.checkout.components.model.payments.request.Address;
import g8.c;
import java.io.EOFException;
import java.util.Objects;
import okio.f;
import okio.h;
import okio.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: n  reason: collision with root package name */
    private static final i f27831n = i.f("'\\");

    /* renamed from: o  reason: collision with root package name */
    private static final i f27832o = i.f("\"\\");

    /* renamed from: p  reason: collision with root package name */
    private static final i f27833p = i.f("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: q  reason: collision with root package name */
    private static final i f27834q = i.f("\n\r");

    /* renamed from: t  reason: collision with root package name */
    private static final i f27835t = i.f("*/");

    /* renamed from: h  reason: collision with root package name */
    private final h f27836h;

    /* renamed from: i  reason: collision with root package name */
    private final f f27837i;

    /* renamed from: j  reason: collision with root package name */
    private int f27838j = 0;

    /* renamed from: k  reason: collision with root package name */
    private long f27839k;

    /* renamed from: l  reason: collision with root package name */
    private int f27840l;

    /* renamed from: m  reason: collision with root package name */
    private String f27841m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(h hVar) {
        Objects.requireNonNull(hVar, "source == null");
        this.f27836h = hVar;
        this.f27837i = hVar.t();
        n0(6);
    }

    private void F0() {
        if (!this.f27827e) {
            throw D0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int G0() {
        int[] iArr = this.f27824b;
        int i11 = this.f27823a;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else if (i12 == 2) {
            int P0 = P0(true);
            this.f27837i.readByte();
            if (P0 != 44) {
                if (P0 != 59) {
                    if (P0 == 93) {
                        this.f27838j = 4;
                        return 4;
                    }
                    throw D0("Unterminated array");
                }
                F0();
            }
        } else if (i12 == 3 || i12 == 5) {
            iArr[i11 - 1] = 4;
            if (i12 == 5) {
                int P02 = P0(true);
                this.f27837i.readByte();
                if (P02 != 44) {
                    if (P02 != 59) {
                        if (P02 == 125) {
                            this.f27838j = 2;
                            return 2;
                        }
                        throw D0("Unterminated object");
                    }
                    F0();
                }
            }
            int P03 = P0(true);
            if (P03 == 34) {
                this.f27837i.readByte();
                this.f27838j = 13;
                return 13;
            } else if (P03 == 39) {
                this.f27837i.readByte();
                F0();
                this.f27838j = 12;
                return 12;
            } else if (P03 != 125) {
                F0();
                if (J0((char) P03)) {
                    this.f27838j = 14;
                    return 14;
                }
                throw D0("Expected name");
            } else if (i12 != 5) {
                this.f27837i.readByte();
                this.f27838j = 2;
                return 2;
            } else {
                throw D0("Expected name");
            }
        } else if (i12 == 4) {
            iArr[i11 - 1] = 5;
            int P04 = P0(true);
            this.f27837i.readByte();
            if (P04 != 58) {
                if (P04 == 61) {
                    F0();
                    if (this.f27836h.request(1L) && this.f27837i.J(0L) == 62) {
                        this.f27837i.readByte();
                    }
                } else {
                    throw D0("Expected ':'");
                }
            }
        } else if (i12 == 6) {
            iArr[i11 - 1] = 7;
        } else if (i12 == 7) {
            if (P0(false) == -1) {
                this.f27838j = 18;
                return 18;
            }
            F0();
        } else if (i12 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int P05 = P0(true);
        if (P05 == 34) {
            this.f27837i.readByte();
            this.f27838j = 9;
            return 9;
        } else if (P05 == 39) {
            F0();
            this.f27837i.readByte();
            this.f27838j = 8;
            return 8;
        } else {
            if (P05 != 44 && P05 != 59) {
                if (P05 == 91) {
                    this.f27837i.readByte();
                    this.f27838j = 3;
                    return 3;
                } else if (P05 != 93) {
                    if (P05 != 123) {
                        int S0 = S0();
                        if (S0 != 0) {
                            return S0;
                        }
                        int X0 = X0();
                        if (X0 != 0) {
                            return X0;
                        }
                        if (J0(this.f27837i.J(0L))) {
                            F0();
                            this.f27838j = 10;
                            return 10;
                        }
                        throw D0("Expected value");
                    }
                    this.f27837i.readByte();
                    this.f27838j = 1;
                    return 1;
                } else if (i12 == 1) {
                    this.f27837i.readByte();
                    this.f27838j = 4;
                    return 4;
                }
            }
            if (i12 != 1 && i12 != 2) {
                throw D0("Unexpected value");
            }
            F0();
            this.f27838j = 7;
            return 7;
        }
    }

    private int I0(String str, c.a aVar) {
        int length = aVar.f27829a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(aVar.f27829a[i11])) {
                this.f27838j = 0;
                this.f27825c[this.f27823a - 1] = str;
                return i11;
            }
        }
        return -1;
    }

    private boolean J0(int i11) {
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
        F0();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        r6.f27837i.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 != 47) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r6.f27836h.request(2) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        F0();
        r3 = r6.f27837i.J(1);
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
        r6.f27837i.readByte();
        r6.f27837i.readByte();
        p1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        r6.f27837i.readByte();
        r6.f27837i.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (h1() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
        throw D0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r1 != 35) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
        F0();
        p1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int P0(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            okio.h r2 = r6.f27836h
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L82
            okio.f r2 = r6.f27837i
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
            okio.f r2 = r6.f27837i
            int r3 = r3 + (-1)
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L74
            okio.h r3 = r6.f27836h
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3c
            return r1
        L3c:
            r6.F0()
            okio.f r3 = r6.f27837i
            r4 = 1
            byte r3 = r3.J(r4)
            r4 = 42
            if (r3 == r4) goto L5c
            if (r3 == r2) goto L4e
            return r1
        L4e:
            okio.f r1 = r6.f27837i
            r1.readByte()
            okio.f r1 = r6.f27837i
            r1.readByte()
            r6.p1()
            goto L1
        L5c:
            okio.f r1 = r6.f27837i
            r1.readByte()
            okio.f r1 = r6.f27837i
            r1.readByte()
            boolean r1 = r6.h1()
            if (r1 == 0) goto L6d
            goto L1
        L6d:
            java.lang.String r7 = "Unterminated comment"
            g8.b r7 = r6.D0(r7)
            throw r7
        L74:
            r2 = 35
            if (r1 != r2) goto L7f
            r6.F0()
            r6.p1()
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
        throw new UnsupportedOperationException("Method not decompiled: g8.e.P0(boolean):int");
    }

    private String Q0(i iVar) {
        StringBuilder sb2 = null;
        while (true) {
            long H = this.f27836h.H(iVar);
            if (H != -1) {
                if (this.f27837i.J(H) != 92) {
                    if (sb2 == null) {
                        String w02 = this.f27837i.w0(H);
                        this.f27837i.readByte();
                        return w02;
                    }
                    sb2.append(this.f27837i.w0(H));
                    this.f27837i.readByte();
                    return sb2.toString();
                }
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.f27837i.w0(H));
                this.f27837i.readByte();
                sb2.append(Z0());
            } else {
                throw D0("Unterminated string");
            }
        }
    }

    private String R0() {
        long H = this.f27836h.H(f27833p);
        return H != -1 ? this.f27837i.w0(H) : this.f27837i.G0();
    }

    private int S0() {
        int i11;
        String str;
        String str2;
        byte J = this.f27837i.J(0L);
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
            if (!this.f27836h.request(i13)) {
                return 0;
            }
            byte J2 = this.f27837i.J(i12);
            if (J2 != str.charAt(i12) && J2 != str2.charAt(i12)) {
                return 0;
            }
            i12 = i13;
        }
        if (this.f27836h.request(length + 1) && J0(this.f27837i.J(length))) {
            return 0;
        }
        this.f27837i.skip(length);
        this.f27838j = i11;
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
        if (J0(r11) != false) goto L70;
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
        r16.f27839k = r8;
        r16.f27837i.skip(r5);
        r16.f27838j = 16;
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
        r16.f27840l = r5;
        r16.f27838j = 17;
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
    private int X0() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.e.X0():int");
    }

    private char Z0() {
        int i11;
        int i12;
        if (this.f27836h.request(1L)) {
            byte readByte = this.f27837i.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte != 98) {
                if (readByte != 102) {
                    if (readByte != 110) {
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    if (this.f27827e) {
                                        return (char) readByte;
                                    }
                                    throw D0("Invalid escape sequence: \\" + ((char) readByte));
                                } else if (this.f27836h.request(4L)) {
                                    char c11 = 0;
                                    for (int i13 = 0; i13 < 4; i13++) {
                                        byte J = this.f27837i.J(i13);
                                        char c12 = (char) (c11 << 4);
                                        if (J < 48 || J > 57) {
                                            if (J >= 97 && J <= 102) {
                                                i11 = J - 97;
                                            } else if (J < 65 || J > 70) {
                                                throw D0("\\u" + this.f27837i.w0(4L));
                                            } else {
                                                i11 = J - 65;
                                            }
                                            i12 = i11 + 10;
                                        } else {
                                            i12 = J - 48;
                                        }
                                        c11 = (char) (c12 + i12);
                                    }
                                    this.f27837i.skip(4L);
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
        throw D0("Unterminated escape sequence");
    }

    private void b1(i iVar) {
        while (true) {
            long H = this.f27836h.H(iVar);
            if (H != -1) {
                if (this.f27837i.J(H) == 92) {
                    this.f27837i.skip(H + 1);
                    Z0();
                } else {
                    this.f27837i.skip(H + 1);
                    return;
                }
            } else {
                throw D0("Unterminated string");
            }
        }
    }

    private boolean h1() {
        h hVar = this.f27836h;
        i iVar = f27835t;
        long B = hVar.B(iVar);
        boolean z11 = B != -1;
        f fVar = this.f27837i;
        fVar.skip(z11 ? B + iVar.z() : fVar.P0());
        return z11;
    }

    private void p1() {
        long H = this.f27836h.H(f27834q);
        f fVar = this.f27837i;
        fVar.skip(H != -1 ? H + 1 : fVar.P0());
    }

    private void t1() {
        long H = this.f27836h.H(f27833p);
        f fVar = this.f27837i;
        if (H == -1) {
            H = fVar.P0();
        }
        fVar.skip(H);
    }

    @Override // g8.c
    public boolean C() {
        int i11 = this.f27838j;
        if (i11 == 0) {
            i11 = G0();
        }
        if (i11 == 5) {
            this.f27838j = 0;
            int[] iArr = this.f27826d;
            int i12 = this.f27823a - 1;
            iArr[i12] = iArr[i12] + 1;
            return true;
        } else if (i11 == 6) {
            this.f27838j = 0;
            int[] iArr2 = this.f27826d;
            int i13 = this.f27823a - 1;
            iArr2[i13] = iArr2[i13] + 1;
            return false;
        } else {
            throw new a("Expected a boolean but was " + e0() + " at path " + getPath());
        }
    }

    @Override // g8.c
    public double D() {
        int i11 = this.f27838j;
        if (i11 == 0) {
            i11 = G0();
        }
        if (i11 == 16) {
            this.f27838j = 0;
            int[] iArr = this.f27826d;
            int i12 = this.f27823a - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f27839k;
        }
        if (i11 == 17) {
            this.f27841m = this.f27837i.w0(this.f27840l);
        } else if (i11 == 9) {
            this.f27841m = Q0(f27832o);
        } else if (i11 == 8) {
            this.f27841m = Q0(f27831n);
        } else if (i11 == 10) {
            this.f27841m = R0();
        } else if (i11 != 11) {
            throw new a("Expected a double but was " + e0() + " at path " + getPath());
        }
        this.f27838j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f27841m);
            if (!this.f27827e && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
            }
            this.f27841m = null;
            this.f27838j = 0;
            int[] iArr2 = this.f27826d;
            int i13 = this.f27823a - 1;
            iArr2[i13] = iArr2[i13] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f27841m + " at path " + getPath());
        }
    }

    @Override // g8.c
    public int J() {
        String Q0;
        int i11 = this.f27838j;
        if (i11 == 0) {
            i11 = G0();
        }
        if (i11 == 16) {
            long j11 = this.f27839k;
            int i12 = (int) j11;
            if (j11 == i12) {
                this.f27838j = 0;
                int[] iArr = this.f27826d;
                int i13 = this.f27823a - 1;
                iArr[i13] = iArr[i13] + 1;
                return i12;
            }
            throw new a("Expected an int but was " + this.f27839k + " at path " + getPath());
        }
        if (i11 == 17) {
            this.f27841m = this.f27837i.w0(this.f27840l);
        } else if (i11 == 9 || i11 == 8) {
            if (i11 == 9) {
                Q0 = Q0(f27832o);
            } else {
                Q0 = Q0(f27831n);
            }
            this.f27841m = Q0;
            try {
                int parseInt = Integer.parseInt(Q0);
                this.f27838j = 0;
                int[] iArr2 = this.f27826d;
                int i14 = this.f27823a - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i11 != 11) {
            throw new a("Expected an int but was " + e0() + " at path " + getPath());
        }
        this.f27838j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f27841m);
            int i15 = (int) parseDouble;
            if (i15 == parseDouble) {
                this.f27841m = null;
                this.f27838j = 0;
                int[] iArr3 = this.f27826d;
                int i16 = this.f27823a - 1;
                iArr3[i16] = iArr3[i16] + 1;
                return i15;
            }
            throw new a("Expected an int but was " + this.f27841m + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f27841m + " at path " + getPath());
        }
    }

    @Override // g8.c
    public String L() {
        String str;
        int i11 = this.f27838j;
        if (i11 == 0) {
            i11 = G0();
        }
        if (i11 == 14) {
            str = R0();
        } else if (i11 == 13) {
            str = Q0(f27832o);
        } else if (i11 == 12) {
            str = Q0(f27831n);
        } else if (i11 == 15) {
            str = this.f27841m;
        } else {
            throw new a("Expected a name but was " + e0() + " at path " + getPath());
        }
        this.f27838j = 0;
        this.f27825c[this.f27823a - 1] = str;
        return str;
    }

    @Override // g8.c
    public String R() {
        String w02;
        int i11 = this.f27838j;
        if (i11 == 0) {
            i11 = G0();
        }
        if (i11 == 10) {
            w02 = R0();
        } else if (i11 == 9) {
            w02 = Q0(f27832o);
        } else if (i11 == 8) {
            w02 = Q0(f27831n);
        } else if (i11 == 11) {
            w02 = this.f27841m;
            this.f27841m = null;
        } else if (i11 == 16) {
            w02 = Long.toString(this.f27839k);
        } else if (i11 == 17) {
            w02 = this.f27837i.w0(this.f27840l);
        } else {
            throw new a("Expected a string but was " + e0() + " at path " + getPath());
        }
        this.f27838j = 0;
        int[] iArr = this.f27826d;
        int i12 = this.f27823a - 1;
        iArr[i12] = iArr[i12] + 1;
        return w02;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f27838j = 0;
        this.f27824b[0] = 8;
        this.f27823a = 1;
        this.f27837i.a();
        this.f27836h.close();
    }

    @Override // g8.c
    public c.b e0() {
        int i11 = this.f27838j;
        if (i11 == 0) {
            i11 = G0();
        }
        switch (i11) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // g8.c
    public void g() {
        int i11 = this.f27838j;
        if (i11 == 0) {
            i11 = G0();
        }
        if (i11 == 3) {
            n0(1);
            this.f27826d[this.f27823a - 1] = 0;
            this.f27838j = 0;
            return;
        }
        throw new a("Expected BEGIN_ARRAY but was " + e0() + " at path " + getPath());
    }

    @Override // g8.c
    public void j() {
        int i11 = this.f27838j;
        if (i11 == 0) {
            i11 = G0();
        }
        if (i11 == 1) {
            n0(3);
            this.f27838j = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + e0() + " at path " + getPath());
    }

    @Override // g8.c
    public void l() {
        int i11 = this.f27838j;
        if (i11 == 0) {
            i11 = G0();
        }
        if (i11 == 4) {
            int i12 = this.f27823a - 1;
            this.f27823a = i12;
            int[] iArr = this.f27826d;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
            this.f27838j = 0;
            return;
        }
        throw new a("Expected END_ARRAY but was " + e0() + " at path " + getPath());
    }

    @Override // g8.c
    public void m() {
        int i11 = this.f27838j;
        if (i11 == 0) {
            i11 = G0();
        }
        if (i11 == 2) {
            int i12 = this.f27823a - 1;
            this.f27823a = i12;
            this.f27825c[i12] = null;
            int[] iArr = this.f27826d;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
            this.f27838j = 0;
            return;
        }
        throw new a("Expected END_OBJECT but was " + e0() + " at path " + getPath());
    }

    @Override // g8.c
    public boolean p() {
        int i11 = this.f27838j;
        if (i11 == 0) {
            i11 = G0();
        }
        return (i11 == 2 || i11 == 4 || i11 == 18) ? false : true;
    }

    @Override // g8.c
    public int p0(c.a aVar) {
        int i11 = this.f27838j;
        if (i11 == 0) {
            i11 = G0();
        }
        if (i11 < 12 || i11 > 15) {
            return -1;
        }
        if (i11 == 15) {
            return I0(this.f27841m, aVar);
        }
        int J1 = this.f27836h.J1(aVar.f27830b);
        if (J1 != -1) {
            this.f27838j = 0;
            this.f27825c[this.f27823a - 1] = aVar.f27829a[J1];
            return J1;
        }
        String str = this.f27825c[this.f27823a - 1];
        String L = L();
        int I0 = I0(L, aVar);
        if (I0 == -1) {
            this.f27838j = 15;
            this.f27841m = L;
            this.f27825c[this.f27823a - 1] = str;
        }
        return I0;
    }

    @Override // g8.c
    public void t0() {
        if (!this.f27828f) {
            int i11 = this.f27838j;
            if (i11 == 0) {
                i11 = G0();
            }
            if (i11 == 14) {
                t1();
            } else if (i11 == 13) {
                b1(f27832o);
            } else if (i11 == 12) {
                b1(f27831n);
            } else if (i11 != 15) {
                throw new a("Expected a name but was " + e0() + " at path " + getPath());
            }
            this.f27838j = 0;
            this.f27825c[this.f27823a - 1] = Address.ADDRESS_NULL_PLACEHOLDER;
            return;
        }
        throw new a("Cannot skip unexpected " + e0() + " at " + getPath());
    }

    public String toString() {
        return "JsonReader(" + this.f27836h + ")";
    }

    @Override // g8.c
    public void u0() {
        if (!this.f27828f) {
            int i11 = 0;
            do {
                int i12 = this.f27838j;
                if (i12 == 0) {
                    i12 = G0();
                }
                if (i12 == 3) {
                    n0(1);
                } else if (i12 == 1) {
                    n0(3);
                } else {
                    if (i12 == 4) {
                        i11--;
                        if (i11 >= 0) {
                            this.f27823a--;
                        } else {
                            throw new a("Expected a value but was " + e0() + " at path " + getPath());
                        }
                    } else if (i12 == 2) {
                        i11--;
                        if (i11 >= 0) {
                            this.f27823a--;
                        } else {
                            throw new a("Expected a value but was " + e0() + " at path " + getPath());
                        }
                    } else if (i12 == 14 || i12 == 10) {
                        t1();
                    } else if (i12 == 9 || i12 == 13) {
                        b1(f27832o);
                    } else if (i12 == 8 || i12 == 12) {
                        b1(f27831n);
                    } else if (i12 == 17) {
                        this.f27837i.skip(this.f27840l);
                    } else if (i12 == 18) {
                        throw new a("Expected a value but was " + e0() + " at path " + getPath());
                    }
                    this.f27838j = 0;
                }
                i11++;
                this.f27838j = 0;
            } while (i11 != 0);
            int[] iArr = this.f27826d;
            int i13 = this.f27823a;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
            this.f27825c[i13 - 1] = Address.ADDRESS_NULL_PLACEHOLDER;
            return;
        }
        throw new a("Cannot skip unexpected " + e0() + " at " + getPath());
    }
}