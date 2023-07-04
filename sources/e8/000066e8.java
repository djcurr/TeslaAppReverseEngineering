package e2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d2.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class g {
    public static final void a(f fVar, u event) {
        s.g(fVar, "<this>");
        s.g(event, "event");
        List<d2.e> f11 = event.f();
        int size = f11.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            d2.e eVar = f11.get(i11);
            fVar.a(eVar.b(), eVar.a());
            i11 = i12;
        }
        fVar.a(event.n(), event.h());
    }

    public static final c b(List<Float> x11, List<Float> y11, int i11) {
        s.g(x11, "x");
        s.g(y11, "y");
        if (i11 >= 1) {
            if (x11.size() == y11.size()) {
                if (!x11.isEmpty()) {
                    int size = i11 >= x11.size() ? x11.size() - 1 : i11;
                    int i12 = i11 + 1;
                    ArrayList arrayList = new ArrayList(i12);
                    int i13 = 0;
                    int i14 = 0;
                    while (i14 < i12) {
                        i14++;
                        arrayList.add(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
                    }
                    int size2 = x11.size();
                    int i15 = size + 1;
                    a aVar = new a(i15, size2);
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size2) {
                            break;
                        }
                        int i17 = i16 + 1;
                        aVar.c(0, i16, 1.0f);
                        for (int i18 = 1; i18 < i15; i18++) {
                            aVar.c(i18, i16, aVar.a(i18 - 1, i16) * x11.get(i16).floatValue());
                        }
                        i16 = i17;
                    }
                    a aVar2 = new a(i15, size2);
                    a aVar3 = new a(i15, i15);
                    int i19 = 0;
                    while (i19 < i15) {
                        int i21 = i19 + 1;
                        for (int i22 = i13; i22 < size2; i22++) {
                            aVar2.c(i19, i22, aVar.a(i19, i22));
                        }
                        int i23 = i13;
                        while (i23 < i19) {
                            int i24 = i23 + 1;
                            float d11 = aVar2.b(i19).d(aVar2.b(i23));
                            int i25 = i13;
                            while (i25 < size2) {
                                aVar2.c(i19, i25, aVar2.a(i19, i25) - (aVar2.a(i23, i25) * d11));
                                i25++;
                                i13 = 0;
                            }
                            i23 = i24;
                        }
                        float b11 = aVar2.b(i19).b();
                        if (b11 < 1.0E-6d) {
                            throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                        }
                        float f11 = 1.0f / b11;
                        for (int i26 = 0; i26 < size2; i26++) {
                            aVar2.c(i19, i26, aVar2.a(i19, i26) * f11);
                        }
                        int i27 = 0;
                        while (i27 < i15) {
                            int i28 = i27 + 1;
                            aVar3.c(i19, i27, i27 < i19 ? BitmapDescriptorFactory.HUE_RED : aVar2.b(i19).d(aVar.b(i27)));
                            i27 = i28;
                        }
                        i19 = i21;
                        i13 = 0;
                    }
                    d dVar = new d(size2);
                    for (int i29 = 0; i29 < size2; i29++) {
                        dVar.c(i29, y11.get(i29).floatValue() * 1.0f);
                    }
                    int i31 = i15 - 1;
                    if (i31 >= 0) {
                        int i32 = i31;
                        while (true) {
                            int i33 = i32 - 1;
                            arrayList.set(i32, Float.valueOf(aVar2.b(i32).d(dVar)));
                            int i34 = i32 + 1;
                            if (i34 <= i31) {
                                int i35 = i31;
                                while (true) {
                                    int i36 = i35 - 1;
                                    arrayList.set(i32, Float.valueOf(((Number) arrayList.get(i32)).floatValue() - (aVar3.a(i32, i35) * ((Number) arrayList.get(i35)).floatValue())));
                                    if (i35 == i34) {
                                        break;
                                    }
                                    i35 = i36;
                                }
                            }
                            arrayList.set(i32, Float.valueOf(((Number) arrayList.get(i32)).floatValue() / aVar3.a(i32, i32)));
                            if (i33 < 0) {
                                break;
                            }
                            i32 = i33;
                        }
                    }
                    float f12 = BitmapDescriptorFactory.HUE_RED;
                    for (int i37 = 0; i37 < size2; i37++) {
                        f12 += y11.get(i37).floatValue();
                    }
                    float f13 = f12 / size2;
                    float f14 = BitmapDescriptorFactory.HUE_RED;
                    int i38 = 0;
                    float f15 = BitmapDescriptorFactory.HUE_RED;
                    while (i38 < size2) {
                        int i39 = i38 + 1;
                        float floatValue = y11.get(i38).floatValue() - ((Number) arrayList.get(0)).floatValue();
                        float f16 = 1.0f;
                        for (int i41 = 1; i41 < i15; i41++) {
                            f16 *= x11.get(i38).floatValue();
                            floatValue -= ((Number) arrayList.get(i41)).floatValue() * f16;
                        }
                        f14 += floatValue * 1.0f * floatValue;
                        float floatValue2 = y11.get(i38).floatValue() - f13;
                        f15 += floatValue2 * 1.0f * floatValue2;
                        i38 = i39;
                    }
                    return new c(arrayList, f15 > 1.0E-6f ? 1.0f - (f14 / f15) : 1.0f);
                }
                throw new IllegalArgumentException("At least one point must be provided");
            }
            throw new IllegalArgumentException("x and y must be the same length");
        }
        throw new IllegalArgumentException("The degree must be at positive integer");
    }
}