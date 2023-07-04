package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.g1;
import com.facebook.react.uimanager.n;
import com.facebook.react.uimanager.p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.EnumSet;

/* loaded from: classes6.dex */
public class k extends com.facebook.react.uimanager.i {
    private float[] A;
    private float[] B;
    private boolean C = false;

    /* renamed from: z  reason: collision with root package name */
    private i f22284z;

    public k() {
        int[] iArr = g1.f12310b;
        this.A = new float[iArr.length];
        this.B = new float[iArr.length];
        for (int i11 = 0; i11 < g1.f12310b.length; i11++) {
            this.A[i11] = Float.NaN;
            this.B[i11] = Float.NaN;
        }
    }

    private void p1(j jVar) {
        if (jVar == j.PADDING) {
            super.U0(1, this.A[1]);
            super.U0(2, this.A[1]);
            super.U0(3, this.A[3]);
            super.U0(0, this.A[0]);
            return;
        }
        super.P0(1, this.B[1]);
        super.P0(2, this.B[1]);
        super.P0(3, this.B[3]);
        super.P0(0, this.B[0]);
    }

    private void q1() {
        float f11;
        float f12;
        float f13;
        i iVar = this.f22284z;
        if (iVar == null) {
            return;
        }
        j c11 = iVar.c();
        j jVar = j.PADDING;
        float[] fArr = c11 == jVar ? this.A : this.B;
        float f14 = fArr[8];
        if (Float.isNaN(f14)) {
            f14 = BitmapDescriptorFactory.HUE_RED;
            f11 = BitmapDescriptorFactory.HUE_RED;
            f12 = BitmapDescriptorFactory.HUE_RED;
            f13 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f11 = f14;
            f12 = f11;
            f13 = f12;
        }
        float f15 = fArr[7];
        if (!Float.isNaN(f15)) {
            f14 = f15;
            f12 = f14;
        }
        float f16 = fArr[6];
        if (!Float.isNaN(f16)) {
            f11 = f16;
            f13 = f11;
        }
        float f17 = fArr[1];
        if (!Float.isNaN(f17)) {
            f14 = f17;
        }
        float f18 = fArr[2];
        if (!Float.isNaN(f18)) {
            f11 = f18;
        }
        float f19 = fArr[3];
        if (!Float.isNaN(f19)) {
            f12 = f19;
        }
        float f21 = fArr[0];
        if (!Float.isNaN(f21)) {
            f13 = f21;
        }
        float c12 = p.c(f14);
        float c13 = p.c(f11);
        float c14 = p.c(f12);
        float c15 = p.c(f13);
        EnumSet<h> a11 = this.f22284z.a();
        a b11 = this.f22284z.b();
        float f22 = a11.contains(h.TOP) ? b11.f22263a : BitmapDescriptorFactory.HUE_RED;
        float f23 = a11.contains(h.RIGHT) ? b11.f22264b : BitmapDescriptorFactory.HUE_RED;
        float f24 = a11.contains(h.BOTTOM) ? b11.f22265c : BitmapDescriptorFactory.HUE_RED;
        float f25 = a11.contains(h.LEFT) ? b11.f22266d : BitmapDescriptorFactory.HUE_RED;
        if (this.f22284z.c() == jVar) {
            super.U0(1, f22 + c12);
            super.U0(2, f23 + c13);
            super.U0(3, f24 + c14);
            super.U0(0, f25 + c15);
            return;
        }
        super.P0(1, f22 + c12);
        super.P0(2, f23 + c13);
        super.P0(3, f24 + c14);
        super.P0(0, f25 + c15);
    }

    @Override // com.facebook.react.uimanager.d0, com.facebook.react.uimanager.c0
    public void X(n nVar) {
        if (this.C) {
            this.C = false;
            q1();
        }
    }

    @Override // com.facebook.react.uimanager.d0, com.facebook.react.uimanager.c0
    public void s(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            i iVar2 = this.f22284z;
            if (iVar2 != null && iVar2.c() != iVar.c()) {
                p1(this.f22284z.c());
            }
            this.f22284z = iVar;
            this.C = false;
            q1();
        }
    }

    @Override // com.facebook.react.uimanager.i
    @ng.b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i11, Dynamic dynamic) {
        this.B[g1.f12310b[i11]] = dynamic.getType() == ReadableType.Number ? (float) dynamic.asDouble() : Float.NaN;
        super.setMargins(i11, dynamic);
        this.C = true;
    }

    @Override // com.facebook.react.uimanager.i
    @ng.b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i11, Dynamic dynamic) {
        this.A[g1.f12310b[i11]] = dynamic.getType() == ReadableType.Number ? (float) dynamic.asDouble() : Float.NaN;
        super.setPaddings(i11, dynamic);
        this.C = true;
    }
}