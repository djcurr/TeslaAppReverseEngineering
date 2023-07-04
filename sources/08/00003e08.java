package com.google.zxing;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final float f17436a;

    /* renamed from: b  reason: collision with root package name */
    private final float f17437b;

    public l(float f11, float f12) {
        this.f17436a = f11;
        this.f17437b = f12;
    }

    private static float a(l lVar, l lVar2, l lVar3) {
        float f11 = lVar2.f17436a;
        float f12 = lVar2.f17437b;
        return ((lVar3.f17436a - f11) * (lVar.f17437b - f12)) - ((lVar3.f17437b - f12) * (lVar.f17436a - f11));
    }

    public static float b(l lVar, l lVar2) {
        return vo.a.a(lVar.f17436a, lVar.f17437b, lVar2.f17436a, lVar2.f17437b);
    }

    public static void e(l[] lVarArr) {
        l lVar;
        l lVar2;
        l lVar3;
        float b11 = b(lVarArr[0], lVarArr[1]);
        float b12 = b(lVarArr[1], lVarArr[2]);
        float b13 = b(lVarArr[0], lVarArr[2]);
        if (b12 >= b11 && b12 >= b13) {
            lVar = lVarArr[0];
            lVar2 = lVarArr[1];
            lVar3 = lVarArr[2];
        } else if (b13 >= b12 && b13 >= b11) {
            lVar = lVarArr[1];
            lVar2 = lVarArr[0];
            lVar3 = lVarArr[2];
        } else {
            lVar = lVarArr[2];
            lVar2 = lVarArr[0];
            lVar3 = lVarArr[1];
        }
        if (a(lVar2, lVar, lVar3) < BitmapDescriptorFactory.HUE_RED) {
            l lVar4 = lVar3;
            lVar3 = lVar2;
            lVar2 = lVar4;
        }
        lVarArr[0] = lVar2;
        lVarArr[1] = lVar;
        lVarArr[2] = lVar3;
    }

    public final float c() {
        return this.f17436a;
    }

    public final float d() {
        return this.f17437b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f17436a == lVar.f17436a && this.f17437b == lVar.f17437b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f17436a) * 31) + Float.floatToIntBits(this.f17437b);
    }

    public final String toString() {
        return "(" + this.f17436a + CoreConstants.COMMA_CHAR + this.f17437b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}