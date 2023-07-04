package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
class i extends s {

    /* renamed from: t  reason: collision with root package name */
    private static final Pattern f11743t = Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?");

    /* renamed from: i  reason: collision with root package name */
    private final double[] f11744i;

    /* renamed from: j  reason: collision with root package name */
    private final double[] f11745j;

    /* renamed from: k  reason: collision with root package name */
    private String f11746k;

    /* renamed from: l  reason: collision with root package name */
    private double[][] f11747l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f11748m;

    /* renamed from: n  reason: collision with root package name */
    private final Matcher f11749n;

    /* renamed from: o  reason: collision with root package name */
    private final String f11750o;

    /* renamed from: p  reason: collision with root package name */
    private final String f11751p;

    /* renamed from: q  reason: collision with root package name */
    private s f11752q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f11753r;

    /* renamed from: s  reason: collision with root package name */
    private int f11754s;

    public i(ReadableMap readableMap) {
        this.f11744i = o(readableMap.getArray("inputRange"));
        ReadableArray array = readableMap.getArray("outputRange");
        boolean z11 = array.getType(0) == ReadableType.String;
        this.f11748m = z11;
        if (z11) {
            int size = array.size();
            this.f11745j = new double[size];
            String string = array.getString(0);
            this.f11746k = string;
            this.f11753r = string.startsWith("rgb");
            this.f11749n = f11743t.matcher(this.f11746k);
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < size; i11++) {
                Matcher matcher = f11743t.matcher(array.getString(i11));
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(arrayList2);
                while (matcher.find()) {
                    arrayList2.add(Double.valueOf(Double.parseDouble(matcher.group())));
                }
                this.f11745j[i11] = ((Double) arrayList2.get(0)).doubleValue();
            }
            int size2 = ((ArrayList) arrayList.get(0)).size();
            this.f11754s = size2;
            this.f11747l = new double[size2];
            for (int i12 = 0; i12 < this.f11754s; i12++) {
                double[] dArr = new double[size];
                this.f11747l[i12] = dArr;
                for (int i13 = 0; i13 < size; i13++) {
                    dArr[i13] = ((Double) ((ArrayList) arrayList.get(i13)).get(i12)).doubleValue();
                }
            }
        } else {
            this.f11745j = o(array);
            this.f11749n = null;
        }
        this.f11750o = readableMap.getString("extrapolateLeft");
        this.f11751p = readableMap.getString("extrapolateRight");
    }

    private static int n(double d11, double[] dArr) {
        int i11 = 1;
        while (i11 < dArr.length - 1 && dArr[i11] < d11) {
            i11++;
        }
        return i11 - 1;
    }

    private static double[] o(ReadableArray readableArray) {
        int size = readableArray.size();
        double[] dArr = new double[size];
        for (int i11 = 0; i11 < size; i11++) {
            dArr[i11] = readableArray.getDouble(i11);
        }
        return dArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
        if (r24.equals("clamp") == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static double p(double r13, double r15, double r17, double r19, double r21, java.lang.String r23, java.lang.String r24) {
        /*
            r0 = r23
            r1 = r24
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            java.lang.String r3 = "Invalid extrapolation type "
            r4 = 2
            java.lang.String r5 = "clamp"
            r6 = 1
            java.lang.String r7 = "identity"
            r8 = 0
            java.lang.String r9 = "extend"
            r10 = -1
            if (r2 >= 0) goto L5a
            r23.hashCode()
            int r11 = r23.hashCode()
            switch(r11) {
                case -1289044198: goto L32;
                case -135761730: goto L29;
                case 94742715: goto L20;
                default: goto L1e;
            }
        L1e:
            r11 = r10
            goto L3a
        L20:
            boolean r11 = r0.equals(r5)
            if (r11 != 0) goto L27
            goto L1e
        L27:
            r11 = r4
            goto L3a
        L29:
            boolean r11 = r0.equals(r7)
            if (r11 != 0) goto L30
            goto L1e
        L30:
            r11 = r6
            goto L3a
        L32:
            boolean r11 = r0.equals(r9)
            if (r11 != 0) goto L39
            goto L1e
        L39:
            r11 = r8
        L3a:
            switch(r11) {
                case 0: goto L5a;
                case 1: goto L59;
                case 2: goto L57;
                default: goto L3d;
            }
        L3d:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r1 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "for left extrapolation"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L57:
            r11 = r15
            goto L5b
        L59:
            return r13
        L5a:
            r11 = r13
        L5b:
            int r0 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r0 <= 0) goto La4
            r24.hashCode()
            int r0 = r24.hashCode()
            switch(r0) {
                case -1289044198: goto L7b;
                case -135761730: goto L72;
                case 94742715: goto L6b;
                default: goto L69;
            }
        L69:
            r4 = r10
            goto L83
        L6b:
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L83
            goto L69
        L72:
            boolean r0 = r1.equals(r7)
            if (r0 != 0) goto L79
            goto L69
        L79:
            r4 = r6
            goto L83
        L7b:
            boolean r0 = r1.equals(r9)
            if (r0 != 0) goto L82
            goto L69
        L82:
            r4 = r8
        L83:
            switch(r4) {
                case 0: goto La4;
                case 1: goto La3;
                case 2: goto La0;
                default: goto L86;
            }
        L86:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r0 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "for right extrapolation"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        La0:
            r11 = r17
            goto La4
        La3:
            return r11
        La4:
            int r0 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r0 != 0) goto La9
            return r19
        La9:
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 != 0) goto Lb1
            if (r2 > 0) goto Lb0
            return r19
        Lb0:
            return r21
        Lb1:
            double r0 = r21 - r19
            double r11 = r11 - r15
            double r0 = r0 * r11
            double r2 = r17 - r15
            double r0 = r0 / r2
            double r0 = r19 + r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.i.p(double, double, double, double, double, java.lang.String, java.lang.String):double");
    }

    static double q(double d11, double[] dArr, double[] dArr2, String str, String str2) {
        int n11 = n(d11, dArr);
        int i11 = n11 + 1;
        return p(d11, dArr[n11], dArr[i11], dArr2[n11], dArr2[i11], str, str2);
    }

    @Override // com.facebook.react.animated.b
    public void b(b bVar) {
        if (this.f11752q == null) {
            if (bVar instanceof s) {
                this.f11752q = (s) bVar;
                return;
            }
            throw new IllegalArgumentException("Parent is of an invalid type");
        }
        throw new IllegalStateException("Parent already attached");
    }

    @Override // com.facebook.react.animated.b
    public void c(b bVar) {
        if (bVar == this.f11752q) {
            this.f11752q = null;
            return;
        }
        throw new IllegalArgumentException("Invalid parent node provided");
    }

    @Override // com.facebook.react.animated.s, com.facebook.react.animated.b
    public String d() {
        return "InterpolationAnimatedNode[" + this.f11718d + "] super: " + super.d();
    }

    @Override // com.facebook.react.animated.b
    public void g() {
        s sVar = this.f11752q;
        if (sVar == null) {
            return;
        }
        double k11 = sVar.k();
        double q11 = q(k11, this.f11744i, this.f11745j, this.f11750o, this.f11751p);
        this.f11813f = q11;
        if (this.f11748m) {
            if (this.f11754s > 1) {
                StringBuffer stringBuffer = new StringBuffer(this.f11746k.length());
                this.f11749n.reset();
                int i11 = 0;
                while (this.f11749n.find()) {
                    int i12 = i11 + 1;
                    double q12 = q(k11, this.f11744i, this.f11747l[i11], this.f11750o, this.f11751p);
                    if (this.f11753r) {
                        boolean z11 = i12 == 4;
                        if (z11) {
                            q12 *= 1000.0d;
                        }
                        int round = (int) Math.round(q12);
                        this.f11749n.appendReplacement(stringBuffer, z11 ? Double.toString(round / 1000.0d) : Integer.toString(round));
                    } else {
                        int i13 = (int) q12;
                        this.f11749n.appendReplacement(stringBuffer, ((double) i13) != q12 ? Double.toString(q12) : Integer.toString(i13));
                    }
                    i11 = i12;
                }
                this.f11749n.appendTail(stringBuffer);
                this.f11812e = stringBuffer.toString();
                return;
            }
            this.f11812e = this.f11749n.replaceFirst(String.valueOf(q11));
        }
    }
}