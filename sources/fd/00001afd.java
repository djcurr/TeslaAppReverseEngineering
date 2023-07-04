package com.facebook.yoga;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    public final float f12954a;

    /* renamed from: b  reason: collision with root package name */
    public final u f12955b;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12956a;

        static {
            int[] iArr = new int[u.values().length];
            f12956a = iArr;
            try {
                iArr[u.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12956a[u.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12956a[u.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12956a[u.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        new v(Float.NaN, u.UNDEFINED);
        new v((float) BitmapDescriptorFactory.HUE_RED, u.POINT);
        new v(Float.NaN, u.AUTO);
    }

    public v(float f11, u uVar) {
        this.f12954a = f11;
        this.f12955b = uVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f12955b;
            if (uVar == vVar.f12955b) {
                return uVar == u.UNDEFINED || uVar == u.AUTO || Float.compare(this.f12954a, vVar.f12954a) == 0;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f12954a) + this.f12955b.intValue();
    }

    public String toString() {
        int i11 = a.f12956a[this.f12955b.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return "auto";
                    }
                    throw new IllegalStateException();
                }
                return this.f12954a + "%";
            }
            return Float.toString(this.f12954a);
        }
        return "undefined";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(float f11, int i11) {
        this(f11, u.fromInt(i11));
    }
}