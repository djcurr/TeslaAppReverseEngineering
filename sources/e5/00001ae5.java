package com.facebook.yoga;

import com.facebook.yoga.p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

@xf.a
/* loaded from: classes3.dex */
public abstract class YogaNodeJNIBase extends p implements Cloneable {

    /* renamed from: a */
    private YogaNodeJNIBase f12945a;
    @xf.a
    private float[] arr;

    /* renamed from: b */
    private List<YogaNodeJNIBase> f12946b;

    /* renamed from: c */
    private m f12947c;

    /* renamed from: d */
    private b f12948d;

    /* renamed from: e */
    protected long f12949e;

    /* renamed from: f */
    private Object f12950f;

    /* renamed from: g */
    private boolean f12951g;
    @xf.a
    private int mLayoutDirection;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12952a;

        static {
            int[] iArr = new int[j.values().length];
            f12952a = iArr;
            try {
                iArr[j.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12952a[j.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12952a[j.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12952a[j.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12952a[j.START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12952a[j.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private YogaNodeJNIBase(long j11) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f12951g = true;
        if (j11 != 0) {
            this.f12949e = j11;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    private void k0(p pVar) {
        Object l02 = l0();
        if (l02 instanceof p.a) {
            ((p.a) l02).a(this, pVar);
        }
    }

    private static v n0(long j11) {
        return new v(Float.intBitsToFloat((int) j11), (int) (j11 >> 32));
    }

    @xf.a
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i11) {
        List<YogaNodeJNIBase> list = this.f12946b;
        if (list != null) {
            list.remove(i11);
            this.f12946b.add(i11, yogaNodeJNIBase);
            yogaNodeJNIBase.f12945a = this;
            return yogaNodeJNIBase.f12949e;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    @Override // com.facebook.yoga.p
    public void A(float f11) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f12949e, f11);
    }

    @Override // com.facebook.yoga.p
    public void B(float f11) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f12949e, f11);
    }

    @Override // com.facebook.yoga.p
    public void C() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f12949e);
    }

    @Override // com.facebook.yoga.p
    public void E(float f11) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f12949e, f11);
    }

    @Override // com.facebook.yoga.p
    public void F(k kVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f12949e, kVar.intValue());
    }

    @Override // com.facebook.yoga.p
    public void G(float f11) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f12949e, f11);
    }

    @Override // com.facebook.yoga.p
    public void H(float f11) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f12949e, f11);
    }

    @Override // com.facebook.yoga.p
    public void I(float f11) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f12949e, f11);
    }

    @Override // com.facebook.yoga.p
    public void J() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f12949e);
    }

    @Override // com.facebook.yoga.p
    public void K(float f11) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f12949e, f11);
    }

    @Override // com.facebook.yoga.p
    public void L(l lVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f12949e, lVar.intValue());
    }

    @Override // com.facebook.yoga.p
    public void M(j jVar, float f11) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f12949e, jVar.intValue(), f11);
    }

    @Override // com.facebook.yoga.p
    public void N(j jVar) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f12949e, jVar.intValue());
    }

    @Override // com.facebook.yoga.p
    public void O(j jVar, float f11) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f12949e, jVar.intValue(), f11);
    }

    @Override // com.facebook.yoga.p
    public void P(float f11) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f12949e, f11);
    }

    @Override // com.facebook.yoga.p
    public void Q(float f11) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f12949e, f11);
    }

    @Override // com.facebook.yoga.p
    public void R(float f11) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f12949e, f11);
    }

    @Override // com.facebook.yoga.p
    public void S(float f11) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f12949e, f11);
    }

    @Override // com.facebook.yoga.p
    public void T(m mVar) {
        this.f12947c = mVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.f12949e, mVar != null);
    }

    @Override // com.facebook.yoga.p
    public void U(float f11) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f12949e, f11);
    }

    @Override // com.facebook.yoga.p
    public void V(float f11) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f12949e, f11);
    }

    @Override // com.facebook.yoga.p
    public void W(float f11) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f12949e, f11);
    }

    @Override // com.facebook.yoga.p
    public void X(float f11) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f12949e, f11);
    }

    @Override // com.facebook.yoga.p
    public void Y(s sVar) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.f12949e, sVar.intValue());
    }

    @Override // com.facebook.yoga.p
    public void Z(j jVar, float f11) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f12949e, jVar.intValue(), f11);
    }

    @Override // com.facebook.yoga.p
    public void a(p pVar, int i11) {
        if (pVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) pVar;
            if (yogaNodeJNIBase.f12945a == null) {
                if (this.f12946b == null) {
                    this.f12946b = new ArrayList(4);
                }
                this.f12946b.add(i11, yogaNodeJNIBase);
                yogaNodeJNIBase.f12945a = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.f12949e, yogaNodeJNIBase.f12949e, i11);
                return;
            }
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
    }

    @Override // com.facebook.yoga.p
    public void b(float f11, float f12) {
        k0(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i11);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.f12946b;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.k0(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i12 = 0; i12 < yogaNodeJNIBaseArr.length; i12++) {
            jArr[i12] = yogaNodeJNIBaseArr[i12].f12949e;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f12949e, f11, f12, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.p
    public void b0(j jVar, float f11) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f12949e, jVar.intValue(), f11);
    }

    @xf.a
    public final float baseline(float f11, float f12) {
        return this.f12948d.a(this, f11, f12);
    }

    @Override // com.facebook.yoga.p
    public void c() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.f12949e);
    }

    @Override // com.facebook.yoga.p
    public void c0(j jVar, float f11) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f12949e, jVar.intValue(), f11);
    }

    @Override // com.facebook.yoga.p
    public v d() {
        return n0(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f12949e));
    }

    @Override // com.facebook.yoga.p
    public void d0(j jVar, float f11) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f12949e, jVar.intValue(), f11);
    }

    @Override // com.facebook.yoga.p
    public h e() {
        float[] fArr = this.arr;
        return h.fromInt(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.p
    public float f() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[2] : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.facebook.yoga.p
    public void f0(t tVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f12949e, tVar.intValue());
    }

    @Override // com.facebook.yoga.p
    public float g(j jVar) {
        float[] fArr = this.arr;
        if (fArr != null) {
            if ((((int) fArr[0]) & 2) == 2) {
                int i11 = 10 - ((((int) fArr[0]) & 1) != 1 ? 4 : 0);
                switch (a.f12952a[jVar.ordinal()]) {
                    case 1:
                        return this.arr[i11];
                    case 2:
                        return this.arr[i11 + 1];
                    case 3:
                        return this.arr[i11 + 2];
                    case 4:
                        return this.arr[i11 + 3];
                    case 5:
                        if (e() == h.RTL) {
                            return this.arr[i11 + 2];
                        }
                        return this.arr[i11];
                    case 6:
                        if (e() == h.RTL) {
                            return this.arr[i11];
                        }
                        return this.arr[i11 + 2];
                    default:
                        throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
                }
            }
            return BitmapDescriptorFactory.HUE_RED;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.facebook.yoga.p
    public void g0(float f11) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f12949e, f11);
    }

    @Override // com.facebook.yoga.p
    public float h() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[1] : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.facebook.yoga.p
    public void h0() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f12949e);
    }

    @Override // com.facebook.yoga.p
    public float i() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[3] : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.facebook.yoga.p
    public void i0(float f11) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f12949e, f11);
    }

    @Override // com.facebook.yoga.p
    public float j() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[4] : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.facebook.yoga.p
    public void j0(w wVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f12949e, wVar.intValue());
    }

    @Override // com.facebook.yoga.p
    public v k() {
        return n0(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f12949e));
    }

    @Override // com.facebook.yoga.p
    public boolean l() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return (((int) fArr[0]) & 16) == 16;
        }
        return this.f12951g;
    }

    public Object l0() {
        return this.f12950f;
    }

    @Override // com.facebook.yoga.p
    public boolean m() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.f12949e);
    }

    @Override // com.facebook.yoga.p
    /* renamed from: m0 */
    public YogaNodeJNIBase p(int i11) {
        List<YogaNodeJNIBase> list = this.f12946b;
        if (list != null) {
            YogaNodeJNIBase remove = list.remove(i11);
            remove.f12945a = null;
            YogaNative.jni_YGNodeRemoveChildJNI(this.f12949e, remove.f12949e);
            return remove;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    @xf.a
    public final long measure(float f11, int i11, float f12, int i12) {
        if (n()) {
            return this.f12947c.B(this, f11, n.fromInt(i11), f12, n.fromInt(i12));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.facebook.yoga.p
    public boolean n() {
        return this.f12947c != null;
    }

    @Override // com.facebook.yoga.p
    public void o() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f12951g = false;
    }

    @Override // com.facebook.yoga.p
    public void q() {
        this.f12947c = null;
        this.f12948d = null;
        this.f12950f = null;
        this.arr = null;
        this.f12951g = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f12949e);
    }

    @Override // com.facebook.yoga.p
    public void r(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f12949e, aVar.intValue());
    }

    @Override // com.facebook.yoga.p
    public void s(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f12949e, aVar.intValue());
    }

    @Override // com.facebook.yoga.p
    public void t(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f12949e, aVar.intValue());
    }

    @Override // com.facebook.yoga.p
    public void u(float f11) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f12949e, f11);
    }

    @Override // com.facebook.yoga.p
    public void v(b bVar) {
        this.f12948d = bVar;
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(this.f12949e, bVar != null);
    }

    @Override // com.facebook.yoga.p
    public void w(j jVar, float f11) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f12949e, jVar.intValue(), f11);
    }

    @Override // com.facebook.yoga.p
    public void x(Object obj) {
        this.f12950f = obj;
    }

    @Override // com.facebook.yoga.p
    public void y(h hVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f12949e, hVar.intValue());
    }

    @Override // com.facebook.yoga.p
    public void z(i iVar) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.f12949e, iVar.intValue());
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    public YogaNodeJNIBase(c cVar) {
        this(YogaNative.jni_YGNodeNewWithConfigJNI(((e) cVar).f12953a));
    }
}