package t1;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f51469a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bitmap a(int i11, int i12, int i13, boolean z11, u1.c colorSpace) {
            kotlin.jvm.internal.s.g(colorSpace, "colorSpace");
            Bitmap createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i11, i12, f.d(i13), z11, b(colorSpace));
            kotlin.jvm.internal.s.f(createBitmap, "createBitmap(\n          …olorSpace()\n            )");
            return createBitmap;
        }

        public final ColorSpace b(u1.c cVar) {
            ColorSpace.Named named;
            kotlin.jvm.internal.s.g(cVar, "<this>");
            u1.e eVar = u1.e.f52899a;
            if (kotlin.jvm.internal.s.c(cVar, eVar.s())) {
                named = ColorSpace.Named.SRGB;
            } else if (kotlin.jvm.internal.s.c(cVar, eVar.a())) {
                named = ColorSpace.Named.ACES;
            } else if (kotlin.jvm.internal.s.c(cVar, eVar.b())) {
                named = ColorSpace.Named.ACESCG;
            } else if (kotlin.jvm.internal.s.c(cVar, eVar.c())) {
                named = ColorSpace.Named.ADOBE_RGB;
            } else if (kotlin.jvm.internal.s.c(cVar, eVar.d())) {
                named = ColorSpace.Named.BT2020;
            } else if (kotlin.jvm.internal.s.c(cVar, eVar.e())) {
                named = ColorSpace.Named.BT709;
            } else if (kotlin.jvm.internal.s.c(cVar, eVar.f())) {
                named = ColorSpace.Named.CIE_LAB;
            } else if (kotlin.jvm.internal.s.c(cVar, eVar.g())) {
                named = ColorSpace.Named.CIE_XYZ;
            } else if (kotlin.jvm.internal.s.c(cVar, eVar.i())) {
                named = ColorSpace.Named.DCI_P3;
            } else if (kotlin.jvm.internal.s.c(cVar, eVar.j())) {
                named = ColorSpace.Named.DISPLAY_P3;
            } else if (kotlin.jvm.internal.s.c(cVar, eVar.k())) {
                named = ColorSpace.Named.EXTENDED_SRGB;
            } else if (kotlin.jvm.internal.s.c(cVar, eVar.l())) {
                named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            } else if (kotlin.jvm.internal.s.c(cVar, eVar.m())) {
                named = ColorSpace.Named.LINEAR_SRGB;
            } else if (kotlin.jvm.internal.s.c(cVar, eVar.n())) {
                named = ColorSpace.Named.NTSC_1953;
            } else if (kotlin.jvm.internal.s.c(cVar, eVar.q())) {
                named = ColorSpace.Named.PRO_PHOTO_RGB;
            } else {
                named = kotlin.jvm.internal.s.c(cVar, eVar.r()) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB;
            }
            ColorSpace colorSpace = ColorSpace.get(named);
            kotlin.jvm.internal.s.f(colorSpace, "get(frameworkNamedSpace)");
            return colorSpace;
        }
    }
}