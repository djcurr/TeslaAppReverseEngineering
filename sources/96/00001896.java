package com.facebook.react.fabric.mounting.mountitems;

import cg.c;
import com.adyen.checkout.components.model.payments.request.Address;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.m0;
import dg.d;
import xf.a;

@a
/* loaded from: classes3.dex */
public class IntBufferBatchMountItem implements d {

    /* renamed from: g  reason: collision with root package name */
    static final String f11858g = "IntBufferBatchMountItem";

    /* renamed from: a  reason: collision with root package name */
    private final int f11859a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11860b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f11861c;

    /* renamed from: d  reason: collision with root package name */
    private final Object[] f11862d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11863e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11864f;

    public IntBufferBatchMountItem(int i11, int[] iArr, Object[] objArr, int i12) {
        this.f11859a = i11;
        this.f11860b = i12;
        this.f11861c = iArr;
        this.f11862d = objArr;
        this.f11863e = iArr != null ? iArr.length : 0;
        this.f11864f = objArr != null ? objArr.length : 0;
    }

    private void c(String str) {
        com.facebook.systrace.a.c(0L, "FabricUIManager::" + str + " - " + this.f11863e + " intBufSize  - " + this.f11864f + " objBufSize");
        int i11 = this.f11860b;
        if (i11 > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START, null, i11);
        }
    }

    private static EventEmitterWrapper d(Object obj) {
        if (obj != null) {
            return (EventEmitterWrapper) obj;
        }
        return null;
    }

    private static ReadableMap e(Object obj) {
        if (obj != null) {
            return (ReadableMap) obj;
        }
        return null;
    }

    private static m0 f(Object obj) {
        if (obj != null) {
            return (m0) obj;
        }
        return null;
    }

    private void g() {
        int i11 = this.f11860b;
        if (i11 > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END, null, i11);
        }
        com.facebook.systrace.a.g(0L);
    }

    @Override // dg.d
    public int a() {
        return this.f11859a;
    }

    @Override // dg.d
    public void b(c cVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        cg.d d11 = cVar.d(this.f11859a);
        if (d11 == null) {
            nd.a.l(f11858g, "Skipping batch of MountItems; no SurfaceMountingManager found for [%d].", Integer.valueOf(this.f11859a));
        } else if (d11.C()) {
            nd.a.l(f11858g, "Skipping batch of MountItems; was stopped [%d].", Integer.valueOf(this.f11859a));
        } else {
            if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                nd.a.c(f11858g, "Executing IntBufferBatchMountItem on surface [%d]", Integer.valueOf(this.f11859a));
            }
            c("mountViews");
            int i17 = 0;
            int i18 = 0;
            while (i17 < this.f11863e) {
                int[] iArr = this.f11861c;
                int i19 = i17 + 1;
                int i21 = iArr[i17];
                int i22 = i21 & (-2);
                if ((i21 & 1) != 0) {
                    int i23 = iArr[i19];
                    i19++;
                    i11 = i23;
                } else {
                    i11 = 1;
                }
                int i24 = i18;
                i17 = i19;
                for (int i25 = 0; i25 < i11; i25++) {
                    if (i22 == 2) {
                        int i26 = i24 + 1;
                        String a11 = com.facebook.react.fabric.a.a((String) this.f11862d[i24]);
                        int i27 = i17 + 1;
                        int i28 = this.f11861c[i17];
                        int i29 = i26 + 1;
                        ReadableMap e11 = e(this.f11862d[i26]);
                        int i31 = i29 + 1;
                        i24 = i31 + 1;
                        i15 = i27 + 1;
                        d11.o(a11, i28, e11, f(this.f11862d[i29]), d(this.f11862d[i31]), this.f11861c[i27] == 1);
                    } else {
                        if (i22 == 4) {
                            d11.q(this.f11861c[i17]);
                            i17++;
                        } else {
                            if (i22 == 8) {
                                int[] iArr2 = this.f11861c;
                                int i32 = i17 + 1;
                                int i33 = i32 + 1;
                                i16 = i33 + 1;
                                d11.m(iArr2[i32], iArr2[i17], iArr2[i33]);
                            } else if (i22 == 16) {
                                int[] iArr3 = this.f11861c;
                                int i34 = i17 + 1;
                                int i35 = i34 + 1;
                                i16 = i35 + 1;
                                d11.J(iArr3[i17], iArr3[i34], iArr3[i35]);
                            } else {
                                if (i22 == 32) {
                                    i12 = i17 + 1;
                                    i13 = i24 + 1;
                                    d11.R(this.f11861c[i17], e(this.f11862d[i24]));
                                } else if (i22 == 64) {
                                    i12 = i17 + 1;
                                    i13 = i24 + 1;
                                    d11.S(this.f11861c[i17], f(this.f11862d[i24]));
                                } else if (i22 == 128) {
                                    int[] iArr4 = this.f11861c;
                                    int i36 = i17 + 1;
                                    int i37 = iArr4[i17];
                                    int i38 = i36 + 1;
                                    int i39 = iArr4[i36];
                                    int i41 = i38 + 1;
                                    int i42 = iArr4[i38];
                                    int i43 = i41 + 1;
                                    int i44 = i43 + 1;
                                    i15 = i44 + 1;
                                    d11.O(i37, i39, i42, iArr4[i41], iArr4[i43], iArr4[i44]);
                                } else {
                                    if (i22 == 512) {
                                        int[] iArr5 = this.f11861c;
                                        int i45 = i17 + 1;
                                        int i46 = iArr5[i17];
                                        int i47 = i45 + 1;
                                        int i48 = iArr5[i45];
                                        int i49 = i47 + 1;
                                        int i51 = iArr5[i47];
                                        int i52 = i49 + 1;
                                        i14 = i52 + 1;
                                        d11.Q(i46, i48, i51, iArr5[i49], iArr5[i52]);
                                    } else if (i22 == 1024) {
                                        int[] iArr6 = this.f11861c;
                                        int i53 = i17 + 1;
                                        int i54 = iArr6[i17];
                                        int i55 = i53 + 1;
                                        int i56 = iArr6[i53];
                                        int i57 = i55 + 1;
                                        int i58 = iArr6[i55];
                                        int i59 = i57 + 1;
                                        i14 = i59 + 1;
                                        d11.P(i54, i56, i58, iArr6[i57], iArr6[i59]);
                                    } else if (i22 == 256) {
                                        i12 = i17 + 1;
                                        i13 = i24 + 1;
                                        d11.N(this.f11861c[i17], d(this.f11862d[i24]));
                                    } else {
                                        throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i22 + " at index: " + i17);
                                    }
                                    i17 = i14;
                                }
                                i17 = i12;
                                i24 = i13;
                            }
                            i17 = i16;
                        }
                    }
                    i17 = i15;
                }
                i18 = i24;
            }
            g();
        }
    }

    public boolean h() {
        return this.f11863e != 0;
    }

    public String toString() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format("IntBufferBatchMountItem [surface:%d]:\n", Integer.valueOf(this.f11859a)));
            int i16 = 0;
            int i17 = 0;
            while (i16 < this.f11863e) {
                int[] iArr = this.f11861c;
                int i18 = i16 + 1;
                int i19 = iArr[i16];
                int i21 = i19 & (-2);
                if ((i19 & 1) != 0) {
                    i11 = iArr[i18];
                    i18++;
                } else {
                    i11 = 1;
                }
                i16 = i18;
                for (int i22 = 0; i22 < i11; i22++) {
                    if (i21 == 2) {
                        int i23 = i16 + 1;
                        i15 = i23 + 1;
                        sb2.append(String.format("CREATE [%d] - layoutable:%d - %s\n", Integer.valueOf(this.f11861c[i16]), Integer.valueOf(this.f11861c[i23]), com.facebook.react.fabric.a.a((String) this.f11862d[i17])));
                        i17 = i17 + 1 + 3;
                    } else {
                        if (i21 == 4) {
                            i12 = i16 + 1;
                            sb2.append(String.format("DELETE [%d]\n", Integer.valueOf(this.f11861c[i16])));
                        } else if (i21 == 8) {
                            int i24 = i16 + 1;
                            int i25 = i24 + 1;
                            i15 = i25 + 1;
                            sb2.append(String.format("INSERT [%d]->[%d] @%d\n", Integer.valueOf(this.f11861c[i16]), Integer.valueOf(this.f11861c[i24]), Integer.valueOf(this.f11861c[i25])));
                        } else if (i21 == 16) {
                            int i26 = i16 + 1;
                            int i27 = i26 + 1;
                            i15 = i27 + 1;
                            sb2.append(String.format("REMOVE [%d]->[%d] @%d\n", Integer.valueOf(this.f11861c[i16]), Integer.valueOf(this.f11861c[i26]), Integer.valueOf(this.f11861c[i27])));
                        } else {
                            if (i21 == 32) {
                                i14 = i17 + 1;
                                e(this.f11862d[i17]);
                                i12 = i16 + 1;
                                sb2.append(String.format("UPDATE PROPS [%d]: %s\n", Integer.valueOf(this.f11861c[i16]), "<hidden>"));
                            } else if (i21 == 64) {
                                i14 = i17 + 1;
                                f(this.f11862d[i17]);
                                i12 = i16 + 1;
                                sb2.append(String.format("UPDATE STATE [%d]: %s\n", Integer.valueOf(this.f11861c[i16]), "<hidden>"));
                            } else {
                                if (i21 == 128) {
                                    int i28 = i16 + 1;
                                    int i29 = i28 + 1;
                                    int i31 = i29 + 1;
                                    int i32 = i31 + 1;
                                    int i33 = i32 + 1;
                                    sb2.append(String.format("UPDATE LAYOUT [%d]: x:%d y:%d w:%d h:%d displayType:%d\n", Integer.valueOf(this.f11861c[i16]), Integer.valueOf(this.f11861c[i28]), Integer.valueOf(this.f11861c[i29]), Integer.valueOf(this.f11861c[i31]), Integer.valueOf(this.f11861c[i32]), Integer.valueOf(this.f11861c[i33])));
                                    i16 = i33 + 1;
                                } else {
                                    if (i21 == 512) {
                                        int i34 = i16 + 1;
                                        int i35 = i34 + 1;
                                        int i36 = i35 + 1;
                                        int i37 = i36 + 1;
                                        i13 = i37 + 1;
                                        sb2.append(String.format("UPDATE PADDING [%d]: top:%d right:%d bottom:%d left:%d\n", Integer.valueOf(this.f11861c[i16]), Integer.valueOf(this.f11861c[i34]), Integer.valueOf(this.f11861c[i35]), Integer.valueOf(this.f11861c[i36]), Integer.valueOf(this.f11861c[i37])));
                                    } else if (i21 == 1024) {
                                        int i38 = i16 + 1;
                                        int i39 = i38 + 1;
                                        int i41 = i39 + 1;
                                        int i42 = i41 + 1;
                                        i13 = i42 + 1;
                                        sb2.append(String.format("UPDATE OVERFLOWINSET [%d]: left:%d top:%d right:%d bottom:%d\n", Integer.valueOf(this.f11861c[i16]), Integer.valueOf(this.f11861c[i38]), Integer.valueOf(this.f11861c[i39]), Integer.valueOf(this.f11861c[i41]), Integer.valueOf(this.f11861c[i42])));
                                    } else if (i21 != 256) {
                                        nd.a.j(f11858g, "String so far: " + sb2.toString());
                                        throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i21 + " at index: " + i16);
                                    } else {
                                        i17++;
                                        i12 = i16 + 1;
                                        sb2.append(String.format("UPDATE EVENTEMITTER [%d]\n", Integer.valueOf(this.f11861c[i16])));
                                    }
                                    i16 = i13;
                                }
                            }
                            i17 = i14;
                        }
                        i16 = i12;
                    }
                    i16 = i15;
                }
            }
            return sb2.toString();
        } catch (Exception e11) {
            nd.a.k(f11858g, "Caught exception trying to print", e11);
            StringBuilder sb3 = new StringBuilder();
            for (int i43 = 0; i43 < this.f11863e; i43++) {
                sb3.append(this.f11861c[i43]);
                sb3.append(", ");
            }
            nd.a.j(f11858g, sb3.toString());
            for (int i44 = 0; i44 < this.f11864f; i44++) {
                String str = f11858g;
                Object[] objArr = this.f11862d;
                nd.a.j(str, objArr[i44] != null ? objArr[i44].toString() : Address.ADDRESS_NULL_PLACEHOLDER);
            }
            return "";
        }
    }
}