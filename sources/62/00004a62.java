package com.squareup.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import okio.u;

/* loaded from: classes2.dex */
public abstract class h implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    int f20511a;

    /* renamed from: b  reason: collision with root package name */
    int[] f20512b;

    /* renamed from: c  reason: collision with root package name */
    String[] f20513c;

    /* renamed from: d  reason: collision with root package name */
    int[] f20514d;

    /* renamed from: e  reason: collision with root package name */
    boolean f20515e;

    /* renamed from: f  reason: collision with root package name */
    boolean f20516f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f20517a;

        static {
            int[] iArr = new int[c.values().length];
            f20517a = iArr;
            try {
                iArr[c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20517a[c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20517a[c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20517a[c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20517a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20517a[c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final String[] f20518a;

        /* renamed from: b  reason: collision with root package name */
        final u f20519b;

        private b(String[] strArr, u uVar) {
            this.f20518a = strArr;
            this.f20519b = uVar;
        }

        public static b a(String... strArr) {
            try {
                okio.i[] iVarArr = new okio.i[strArr.length];
                okio.f fVar = new okio.f();
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    k.Z0(fVar, strArr[i11]);
                    fVar.readByte();
                    iVarArr[i11] = fVar.j1();
                }
                return new b((String[]) strArr.clone(), u.k(iVarArr));
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum c {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h() {
        this.f20512b = new int[32];
        this.f20513c = new String[32];
        this.f20514d = new int[32];
    }

    public static h p0(okio.h hVar) {
        return new j(hVar);
    }

    public final boolean C() {
        return this.f20515e;
    }

    public abstract void C0();

    public abstract boolean D();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D0(int i11) {
        int i12 = this.f20511a;
        int[] iArr = this.f20512b;
        if (i12 == iArr.length) {
            if (i12 != 256) {
                this.f20512b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f20513c;
                this.f20513c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f20514d;
                this.f20514d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
        }
        int[] iArr3 = this.f20512b;
        int i13 = this.f20511a;
        this.f20511a = i13 + 1;
        iArr3[i13] = i11;
    }

    public final Object F0() {
        switch (a.f20517a[t0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                a();
                while (p()) {
                    arrayList.add(F0());
                }
                j();
                return arrayList;
            case 2:
                n nVar = new n();
                g();
                while (p()) {
                    String a02 = a0();
                    Object F0 = F0();
                    Object put = nVar.put(a02, F0);
                    if (put != null) {
                        throw new JsonDataException("Map key '" + a02 + "' has multiple values at path " + getPath() + ": " + put + " and " + F0);
                    }
                }
                l();
                return nVar;
            case 3:
                return n0();
            case 4:
                return Double.valueOf(J());
            case 5:
                return Boolean.valueOf(D());
            case 6:
                return e0();
            default:
                throw new IllegalStateException("Expected a value but was " + t0() + " at path " + getPath());
        }
    }

    public abstract int G0(b bVar);

    public abstract int I0(b bVar);

    public abstract double J();

    public final void J0(boolean z11) {
        this.f20516f = z11;
    }

    public abstract int L();

    public final void P0(boolean z11) {
        this.f20515e = z11;
    }

    public abstract void Q0();

    public abstract long R();

    public abstract void R0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JsonEncodingException S0(String str) {
        throw new JsonEncodingException(str + " at path " + getPath());
    }

    public abstract void a();

    public abstract String a0();

    public abstract <T> T e0();

    public abstract void g();

    public final String getPath() {
        return i.a(this.f20511a, this.f20512b, this.f20513c, this.f20514d);
    }

    public abstract void j();

    public abstract void l();

    public final boolean m() {
        return this.f20516f;
    }

    public abstract String n0();

    public abstract boolean p();

    public abstract c t0();

    public abstract h u0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(h hVar) {
        this.f20511a = hVar.f20511a;
        this.f20512b = (int[]) hVar.f20512b.clone();
        this.f20513c = (String[]) hVar.f20513c.clone();
        this.f20514d = (int[]) hVar.f20514d.clone();
        this.f20515e = hVar.f20515e;
        this.f20516f = hVar.f20516f;
    }
}