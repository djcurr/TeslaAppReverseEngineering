package t;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import android.view.WindowManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.impl.j1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class t1 {

    /* renamed from: n  reason: collision with root package name */
    private static final Size f51190n = new Size(1920, 1080);

    /* renamed from: o  reason: collision with root package name */
    private static final Size f51191o = new Size(640, 480);

    /* renamed from: p  reason: collision with root package name */
    private static final Size f51192p = new Size(0, 0);

    /* renamed from: q  reason: collision with root package name */
    private static final Size f51193q = new Size(3840, 2160);

    /* renamed from: r  reason: collision with root package name */
    private static final Size f51194r = new Size(1920, 1080);

    /* renamed from: s  reason: collision with root package name */
    private static final Size f51195s = new Size(1280, 720);

    /* renamed from: t  reason: collision with root package name */
    private static final Size f51196t = new Size(720, 480);

    /* renamed from: u  reason: collision with root package name */
    private static final Rational f51197u = new Rational(4, 3);

    /* renamed from: v  reason: collision with root package name */
    private static final Rational f51198v = new Rational(3, 4);

    /* renamed from: w  reason: collision with root package name */
    private static final Rational f51199w = new Rational(16, 9);

    /* renamed from: x  reason: collision with root package name */
    private static final Rational f51200x = new Rational(9, 16);

    /* renamed from: c  reason: collision with root package name */
    private final String f51203c;

    /* renamed from: d  reason: collision with root package name */
    private final t.b f51204d;

    /* renamed from: e  reason: collision with root package name */
    private final u.d f51205e;

    /* renamed from: f  reason: collision with root package name */
    private final x.c f51206f;

    /* renamed from: g  reason: collision with root package name */
    private final int f51207g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f51208h;

    /* renamed from: l  reason: collision with root package name */
    private androidx.camera.core.impl.k1 f51212l;

    /* renamed from: a  reason: collision with root package name */
    private final List<androidx.camera.core.impl.i1> f51201a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, Size> f51202b = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private final Map<Integer, List<Size>> f51209i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private boolean f51210j = false;

    /* renamed from: k  reason: collision with root package name */
    private boolean f51211k = false;

    /* renamed from: m  reason: collision with root package name */
    private Map<Integer, Size[]> f51213m = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements Comparator<Rational> {

        /* renamed from: a  reason: collision with root package name */
        private Rational f51214a;

        a(Rational rational) {
            this.f51214a = rational;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            return (int) Math.signum(Float.valueOf(Math.abs(rational.floatValue() - this.f51214a.floatValue())).floatValue() - Float.valueOf(Math.abs(rational2.floatValue() - this.f51214a.floatValue())).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t1(Context context, String str, u.j jVar, t.b bVar) {
        String str2 = (String) v3.h.f(str);
        this.f51203c = str2;
        this.f51204d = (t.b) v3.h.f(bVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f51206f = new x.c(str);
        try {
            u.d c11 = jVar.c(str2);
            this.f51205e = c11;
            Integer num = (Integer) c11.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f51207g = num != null ? num.intValue() : 2;
            this.f51208h = G();
            h();
            i(windowManager);
            a();
        } catch (CameraAccessExceptionCompat e11) {
            throw w0.a(e11);
        }
    }

    private Size A(androidx.camera.core.impl.p0 p0Var) {
        return g(p0Var.z(null), p0Var.x(0));
    }

    private List<Integer> B(List<androidx.camera.core.impl.p1<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList();
        for (androidx.camera.core.impl.p1<?> p1Var : list) {
            int v11 = p1Var.v(0);
            if (!arrayList2.contains(Integer.valueOf(v11))) {
                arrayList2.add(Integer.valueOf(v11));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        for (Integer num : arrayList2) {
            int intValue = num.intValue();
            for (androidx.camera.core.impl.p1<?> p1Var2 : list) {
                if (intValue == p1Var2.v(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(p1Var2)));
                }
            }
        }
        return arrayList;
    }

    private Map<Rational, List<Size>> C(List<Size> list) {
        HashMap hashMap = new HashMap();
        hashMap.put(f51197u, new ArrayList());
        hashMap.put(f51199w, new ArrayList());
        for (Size size : list) {
            Rational rational = null;
            for (Rational rational2 : hashMap.keySet()) {
                if (D(size, rational2)) {
                    List list2 = (List) hashMap.get(rational2);
                    if (!list2.contains(size)) {
                        list2.add(size);
                    }
                    rational = rational2;
                }
            }
            if (rational == null) {
                hashMap.put(new Rational(size.getWidth(), size.getHeight()), new ArrayList(Collections.singleton(size)));
            }
        }
        return hashMap;
    }

    static boolean D(Size size, Rational rational) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (l(size) >= l(f51191o)) {
            return E(size, rational);
        }
        return false;
    }

    private static boolean E(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i11 = width % 16;
        if (i11 == 0 && height % 16 == 0) {
            return H(Math.max(0, height + (-16)), width, rational) || H(Math.max(0, width + (-16)), height, rational2);
        } else if (i11 == 0) {
            return H(height, width, rational);
        } else {
            if (height % 16 == 0) {
                return H(width, height, rational2);
            }
            return false;
        }
    }

    private boolean F(int i11) {
        Integer num = (Integer) this.f51205e.a(CameraCharacteristics.SENSOR_ORIENTATION);
        v3.h.g(num, "Camera HAL in bad state, unable to retrieve the SENSOR_ORIENTATION");
        int b11 = a0.b.b(i11);
        Integer num2 = (Integer) this.f51205e.a(CameraCharacteristics.LENS_FACING);
        v3.h.g(num2, "Camera HAL in bad state, unable to retrieve the LENS_FACING");
        int a11 = a0.b.a(b11, num.intValue(), 1 == num2.intValue());
        return a11 == 90 || a11 == 270;
    }

    private boolean G() {
        Size size = (Size) this.f51205e.a(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        return size == null || size.getWidth() >= size.getHeight();
    }

    private static boolean H(int i11, int i12, Rational rational) {
        v3.h.a(i12 % 16 == 0);
        double numerator = (i11 * rational.getNumerator()) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i12 + (-16))) && numerator < ((double) (i12 + 16));
    }

    private void I(List<Size> list, Size size) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = -1;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        while (true) {
            int i13 = i12;
            int i14 = i11;
            i11 = i13;
            if (i11 >= list.size()) {
                break;
            }
            Size size2 = list.get(i11);
            if (size2.getWidth() < size.getWidth() || size2.getHeight() < size.getHeight()) {
                break;
            }
            if (i14 >= 0) {
                arrayList.add(list.get(i14));
            }
            i12 = i11 + 1;
        }
        list.removeAll(arrayList);
    }

    private void a() {
    }

    private Size[] c(int i11) {
        Size[] outputSizes;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f51205e.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            if (Build.VERSION.SDK_INT < 23 && i11 == 34) {
                outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            } else {
                outputSizes = streamConfigurationMap.getOutputSizes(i11);
            }
            if (outputSizes != null) {
                Size[] d11 = d(outputSizes, i11);
                Arrays.sort(d11, new b(true));
                return d11;
            }
            throw new IllegalArgumentException("Can not get supported output size for the format: " + i11);
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    private Size[] d(Size[] sizeArr, int i11) {
        List<Size> e11 = e(i11);
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        arrayList.removeAll(e11);
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    private List<Size> e(int i11) {
        List<Size> list = this.f51209i.get(Integer.valueOf(i11));
        if (list == null) {
            List<Size> a11 = this.f51206f.a(i11);
            this.f51209i.put(Integer.valueOf(i11), a11);
            return a11;
        }
        return list;
    }

    private Size f(int i11) {
        Size size = this.f51202b.get(Integer.valueOf(i11));
        if (size != null) {
            return size;
        }
        Size s11 = s(i11);
        this.f51202b.put(Integer.valueOf(i11), s11);
        return s11;
    }

    private Size g(Size size, int i11) {
        return (size == null || !F(i11)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    private void h() {
        this.f51201a.addAll(p());
        int i11 = this.f51207g;
        if (i11 == 0 || i11 == 1 || i11 == 3) {
            this.f51201a.addAll(r());
        }
        int i12 = this.f51207g;
        if (i12 == 1 || i12 == 3) {
            this.f51201a.addAll(o());
        }
        int[] iArr = (int[]) this.f51205e.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i13 : iArr) {
                if (i13 == 3) {
                    this.f51210j = true;
                } else if (i13 == 6) {
                    this.f51211k = true;
                }
            }
        }
        if (this.f51210j) {
            this.f51201a.addAll(u());
        }
        if (this.f51211k && this.f51207g == 0) {
            this.f51201a.addAll(m());
        }
        if (this.f51207g == 3) {
            this.f51201a.addAll(q());
        }
    }

    private void i(WindowManager windowManager) {
        this.f51212l = androidx.camera.core.impl.k1.a(new Size(640, 480), t(windowManager), v());
    }

    private Size[] j(int i11) {
        Size[] sizeArr = this.f51213m.get(Integer.valueOf(i11));
        if (sizeArr == null) {
            Size[] c11 = c(i11);
            this.f51213m.put(Integer.valueOf(i11), c11);
            return c11;
        }
        return sizeArr;
    }

    private List<List<Size>> k(List<List<Size>> list) {
        int i11 = 1;
        for (List<Size> list2 : list) {
            i11 *= list2.size();
        }
        if (i11 != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList.add(new ArrayList());
            }
            int size = i11 / list.get(0).size();
            int i13 = i11;
            for (int i14 = 0; i14 < list.size(); i14++) {
                List<Size> list3 = list.get(i14);
                for (int i15 = 0; i15 < i11; i15++) {
                    ((List) arrayList.get(i15)).add(list3.get((i15 % i13) / size));
                }
                if (i14 < list.size() - 1) {
                    i13 = size;
                    size /= list.get(i14 + 1).size();
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Failed to find supported resolutions.");
    }

    private static int l(Size size) {
        return size.getWidth() * size.getHeight();
    }

    private Size[] n(int i11, androidx.camera.core.impl.p0 p0Var) {
        Size[] sizeArr = null;
        List<Pair<Integer, Size[]>> k11 = p0Var.k(null);
        if (k11 != null) {
            Iterator<Pair<Integer, Size[]>> it2 = k11.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Pair<Integer, Size[]> next = it2.next();
                if (((Integer) next.first).intValue() == i11) {
                    sizeArr = (Size[]) next.second;
                    break;
                }
            }
        }
        if (sizeArr != null) {
            Size[] d11 = d(sizeArr, i11);
            Arrays.sort(d11, new b(true));
            return d11;
        }
        return sizeArr;
    }

    public static Size t(WindowManager windowManager) {
        Size size;
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        if (point.x > point.y) {
            size = new Size(point.x, point.y);
        } else {
            size = new Size(point.y, point.x);
        }
        return (Size) Collections.min(Arrays.asList(new Size(size.getWidth(), size.getHeight()), f51190n), new b());
    }

    private Size v() {
        Size size = f51196t;
        try {
            int parseInt = Integer.parseInt(this.f51203c);
            if (this.f51204d.a(parseInt, 8)) {
                size = f51193q;
            } else if (this.f51204d.a(parseInt, 6)) {
                size = f51194r;
            } else if (this.f51204d.a(parseInt, 5)) {
                size = f51195s;
            } else {
                this.f51204d.a(parseInt, 4);
            }
            return size;
        } catch (NumberFormatException unused) {
            return w();
        }
    }

    private Size w() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f51205e.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
            if (outputSizes == null) {
                return f51196t;
            }
            Arrays.sort(outputSizes, new b(true));
            for (Size size : outputSizes) {
                int width = size.getWidth();
                Size size2 = f51194r;
                if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                    return size;
                }
            }
            return f51196t;
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    private Rational z(androidx.camera.core.impl.p0 p0Var) {
        Rational rational;
        int a11 = new x.g().a(p0Var, this.f51203c, this.f51205e);
        if (a11 == 0) {
            rational = this.f51208h ? f51197u : f51198v;
        } else if (a11 == 1) {
            rational = this.f51208h ? f51199w : f51200x;
        } else if (a11 == 2) {
            Size f11 = f(256);
            return new Rational(f11.getWidth(), f11.getHeight());
        } else if (a11 != 3) {
            return null;
        } else {
            Size A = A(p0Var);
            if (!p0Var.t()) {
                if (A != null) {
                    return new Rational(A.getWidth(), A.getHeight());
                }
                return null;
            }
            int w11 = p0Var.w();
            if (w11 == 0) {
                rational = this.f51208h ? f51197u : f51198v;
            } else if (w11 != 1) {
                androidx.camera.core.n0.c("SupportedSurfaceCombination", "Undefined target aspect ratio: " + w11);
                return null;
            } else {
                rational = this.f51208h ? f51199w : f51200x;
            }
        }
        return rational;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.camera.core.impl.j1 J(int i11, Size size) {
        j1.b bVar;
        j1.a aVar = j1.a.NOT_SUPPORT;
        if (i11 == 35) {
            bVar = j1.b.YUV;
        } else if (i11 == 256) {
            bVar = j1.b.JPEG;
        } else if (i11 == 32) {
            bVar = j1.b.RAW;
        } else {
            bVar = j1.b.PRIV;
        }
        Size f11 = f(i11);
        if (size.getWidth() * size.getHeight() <= this.f51212l.b().getWidth() * this.f51212l.b().getHeight()) {
            aVar = j1.a.ANALYSIS;
        } else if (size.getWidth() * size.getHeight() <= this.f51212l.c().getWidth() * this.f51212l.c().getHeight()) {
            aVar = j1.a.PREVIEW;
        } else if (size.getWidth() * size.getHeight() <= this.f51212l.d().getWidth() * this.f51212l.d().getHeight()) {
            aVar = j1.a.RECORD;
        } else if (size.getWidth() * size.getHeight() <= f11.getWidth() * f11.getHeight()) {
            aVar = j1.a.MAXIMUM;
        }
        return androidx.camera.core.impl.j1.a(bVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(List<androidx.camera.core.impl.j1> list) {
        Iterator<androidx.camera.core.impl.i1> it2 = this.f51201a.iterator();
        boolean z11 = false;
        while (it2.hasNext() && !(z11 = it2.next().d(list))) {
        }
        return z11;
    }

    List<androidx.camera.core.impl.i1> m() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.i1 i1Var = new androidx.camera.core.impl.i1();
        j1.b bVar = j1.b.PRIV;
        j1.a aVar = j1.a.PREVIEW;
        i1Var.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        j1.a aVar2 = j1.a.MAXIMUM;
        i1Var.a(androidx.camera.core.impl.j1.a(bVar, aVar2));
        arrayList.add(i1Var);
        androidx.camera.core.impl.i1 i1Var2 = new androidx.camera.core.impl.i1();
        i1Var2.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        j1.b bVar2 = j1.b.YUV;
        i1Var2.a(androidx.camera.core.impl.j1.a(bVar2, aVar2));
        arrayList.add(i1Var2);
        androidx.camera.core.impl.i1 i1Var3 = new androidx.camera.core.impl.i1();
        i1Var3.a(androidx.camera.core.impl.j1.a(bVar2, aVar));
        i1Var3.a(androidx.camera.core.impl.j1.a(bVar2, aVar2));
        arrayList.add(i1Var3);
        return arrayList;
    }

    List<androidx.camera.core.impl.i1> o() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.i1 i1Var = new androidx.camera.core.impl.i1();
        j1.b bVar = j1.b.PRIV;
        j1.a aVar = j1.a.PREVIEW;
        i1Var.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        j1.a aVar2 = j1.a.MAXIMUM;
        i1Var.a(androidx.camera.core.impl.j1.a(bVar, aVar2));
        arrayList.add(i1Var);
        androidx.camera.core.impl.i1 i1Var2 = new androidx.camera.core.impl.i1();
        i1Var2.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        j1.b bVar2 = j1.b.YUV;
        i1Var2.a(androidx.camera.core.impl.j1.a(bVar2, aVar2));
        arrayList.add(i1Var2);
        androidx.camera.core.impl.i1 i1Var3 = new androidx.camera.core.impl.i1();
        i1Var3.a(androidx.camera.core.impl.j1.a(bVar2, aVar));
        i1Var3.a(androidx.camera.core.impl.j1.a(bVar2, aVar2));
        arrayList.add(i1Var3);
        androidx.camera.core.impl.i1 i1Var4 = new androidx.camera.core.impl.i1();
        i1Var4.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        i1Var4.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        i1Var4.a(androidx.camera.core.impl.j1.a(j1.b.JPEG, aVar2));
        arrayList.add(i1Var4);
        androidx.camera.core.impl.i1 i1Var5 = new androidx.camera.core.impl.i1();
        j1.a aVar3 = j1.a.ANALYSIS;
        i1Var5.a(androidx.camera.core.impl.j1.a(bVar2, aVar3));
        i1Var5.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        i1Var5.a(androidx.camera.core.impl.j1.a(bVar2, aVar2));
        arrayList.add(i1Var5);
        androidx.camera.core.impl.i1 i1Var6 = new androidx.camera.core.impl.i1();
        i1Var6.a(androidx.camera.core.impl.j1.a(bVar2, aVar3));
        i1Var6.a(androidx.camera.core.impl.j1.a(bVar2, aVar));
        i1Var6.a(androidx.camera.core.impl.j1.a(bVar2, aVar2));
        arrayList.add(i1Var6);
        return arrayList;
    }

    List<androidx.camera.core.impl.i1> p() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.i1 i1Var = new androidx.camera.core.impl.i1();
        j1.b bVar = j1.b.PRIV;
        j1.a aVar = j1.a.MAXIMUM;
        i1Var.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        arrayList.add(i1Var);
        androidx.camera.core.impl.i1 i1Var2 = new androidx.camera.core.impl.i1();
        j1.b bVar2 = j1.b.JPEG;
        i1Var2.a(androidx.camera.core.impl.j1.a(bVar2, aVar));
        arrayList.add(i1Var2);
        androidx.camera.core.impl.i1 i1Var3 = new androidx.camera.core.impl.i1();
        j1.b bVar3 = j1.b.YUV;
        i1Var3.a(androidx.camera.core.impl.j1.a(bVar3, aVar));
        arrayList.add(i1Var3);
        androidx.camera.core.impl.i1 i1Var4 = new androidx.camera.core.impl.i1();
        j1.a aVar2 = j1.a.PREVIEW;
        i1Var4.a(androidx.camera.core.impl.j1.a(bVar, aVar2));
        i1Var4.a(androidx.camera.core.impl.j1.a(bVar2, aVar));
        arrayList.add(i1Var4);
        androidx.camera.core.impl.i1 i1Var5 = new androidx.camera.core.impl.i1();
        i1Var5.a(androidx.camera.core.impl.j1.a(bVar3, aVar2));
        i1Var5.a(androidx.camera.core.impl.j1.a(bVar2, aVar));
        arrayList.add(i1Var5);
        androidx.camera.core.impl.i1 i1Var6 = new androidx.camera.core.impl.i1();
        i1Var6.a(androidx.camera.core.impl.j1.a(bVar, aVar2));
        i1Var6.a(androidx.camera.core.impl.j1.a(bVar, aVar2));
        arrayList.add(i1Var6);
        androidx.camera.core.impl.i1 i1Var7 = new androidx.camera.core.impl.i1();
        i1Var7.a(androidx.camera.core.impl.j1.a(bVar, aVar2));
        i1Var7.a(androidx.camera.core.impl.j1.a(bVar3, aVar2));
        arrayList.add(i1Var7);
        androidx.camera.core.impl.i1 i1Var8 = new androidx.camera.core.impl.i1();
        i1Var8.a(androidx.camera.core.impl.j1.a(bVar, aVar2));
        i1Var8.a(androidx.camera.core.impl.j1.a(bVar3, aVar2));
        i1Var8.a(androidx.camera.core.impl.j1.a(bVar2, aVar));
        arrayList.add(i1Var8);
        return arrayList;
    }

    List<androidx.camera.core.impl.i1> q() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.i1 i1Var = new androidx.camera.core.impl.i1();
        j1.b bVar = j1.b.PRIV;
        j1.a aVar = j1.a.PREVIEW;
        i1Var.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        j1.a aVar2 = j1.a.ANALYSIS;
        i1Var.a(androidx.camera.core.impl.j1.a(bVar, aVar2));
        j1.b bVar2 = j1.b.YUV;
        j1.a aVar3 = j1.a.MAXIMUM;
        i1Var.a(androidx.camera.core.impl.j1.a(bVar2, aVar3));
        j1.b bVar3 = j1.b.RAW;
        i1Var.a(androidx.camera.core.impl.j1.a(bVar3, aVar3));
        arrayList.add(i1Var);
        androidx.camera.core.impl.i1 i1Var2 = new androidx.camera.core.impl.i1();
        i1Var2.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        i1Var2.a(androidx.camera.core.impl.j1.a(bVar, aVar2));
        i1Var2.a(androidx.camera.core.impl.j1.a(j1.b.JPEG, aVar3));
        i1Var2.a(androidx.camera.core.impl.j1.a(bVar3, aVar3));
        arrayList.add(i1Var2);
        return arrayList;
    }

    List<androidx.camera.core.impl.i1> r() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.i1 i1Var = new androidx.camera.core.impl.i1();
        j1.b bVar = j1.b.PRIV;
        j1.a aVar = j1.a.PREVIEW;
        i1Var.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        j1.a aVar2 = j1.a.RECORD;
        i1Var.a(androidx.camera.core.impl.j1.a(bVar, aVar2));
        arrayList.add(i1Var);
        androidx.camera.core.impl.i1 i1Var2 = new androidx.camera.core.impl.i1();
        i1Var2.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        j1.b bVar2 = j1.b.YUV;
        i1Var2.a(androidx.camera.core.impl.j1.a(bVar2, aVar2));
        arrayList.add(i1Var2);
        androidx.camera.core.impl.i1 i1Var3 = new androidx.camera.core.impl.i1();
        i1Var3.a(androidx.camera.core.impl.j1.a(bVar2, aVar));
        i1Var3.a(androidx.camera.core.impl.j1.a(bVar2, aVar2));
        arrayList.add(i1Var3);
        androidx.camera.core.impl.i1 i1Var4 = new androidx.camera.core.impl.i1();
        i1Var4.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        i1Var4.a(androidx.camera.core.impl.j1.a(bVar, aVar2));
        j1.b bVar3 = j1.b.JPEG;
        i1Var4.a(androidx.camera.core.impl.j1.a(bVar3, aVar2));
        arrayList.add(i1Var4);
        androidx.camera.core.impl.i1 i1Var5 = new androidx.camera.core.impl.i1();
        i1Var5.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        i1Var5.a(androidx.camera.core.impl.j1.a(bVar2, aVar2));
        i1Var5.a(androidx.camera.core.impl.j1.a(bVar3, aVar2));
        arrayList.add(i1Var5);
        androidx.camera.core.impl.i1 i1Var6 = new androidx.camera.core.impl.i1();
        i1Var6.a(androidx.camera.core.impl.j1.a(bVar2, aVar));
        i1Var6.a(androidx.camera.core.impl.j1.a(bVar2, aVar));
        i1Var6.a(androidx.camera.core.impl.j1.a(bVar3, j1.a.MAXIMUM));
        arrayList.add(i1Var6);
        return arrayList;
    }

    Size s(int i11) {
        return (Size) Collections.max(Arrays.asList(j(i11)), new b());
    }

    List<androidx.camera.core.impl.i1> u() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.i1 i1Var = new androidx.camera.core.impl.i1();
        j1.b bVar = j1.b.RAW;
        j1.a aVar = j1.a.MAXIMUM;
        i1Var.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        arrayList.add(i1Var);
        androidx.camera.core.impl.i1 i1Var2 = new androidx.camera.core.impl.i1();
        j1.b bVar2 = j1.b.PRIV;
        j1.a aVar2 = j1.a.PREVIEW;
        i1Var2.a(androidx.camera.core.impl.j1.a(bVar2, aVar2));
        i1Var2.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        arrayList.add(i1Var2);
        androidx.camera.core.impl.i1 i1Var3 = new androidx.camera.core.impl.i1();
        j1.b bVar3 = j1.b.YUV;
        i1Var3.a(androidx.camera.core.impl.j1.a(bVar3, aVar2));
        i1Var3.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        arrayList.add(i1Var3);
        androidx.camera.core.impl.i1 i1Var4 = new androidx.camera.core.impl.i1();
        i1Var4.a(androidx.camera.core.impl.j1.a(bVar2, aVar2));
        i1Var4.a(androidx.camera.core.impl.j1.a(bVar2, aVar2));
        i1Var4.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        arrayList.add(i1Var4);
        androidx.camera.core.impl.i1 i1Var5 = new androidx.camera.core.impl.i1();
        i1Var5.a(androidx.camera.core.impl.j1.a(bVar2, aVar2));
        i1Var5.a(androidx.camera.core.impl.j1.a(bVar3, aVar2));
        i1Var5.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        arrayList.add(i1Var5);
        androidx.camera.core.impl.i1 i1Var6 = new androidx.camera.core.impl.i1();
        i1Var6.a(androidx.camera.core.impl.j1.a(bVar3, aVar2));
        i1Var6.a(androidx.camera.core.impl.j1.a(bVar3, aVar2));
        i1Var6.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        arrayList.add(i1Var6);
        androidx.camera.core.impl.i1 i1Var7 = new androidx.camera.core.impl.i1();
        i1Var7.a(androidx.camera.core.impl.j1.a(bVar2, aVar2));
        j1.b bVar4 = j1.b.JPEG;
        i1Var7.a(androidx.camera.core.impl.j1.a(bVar4, aVar));
        i1Var7.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        arrayList.add(i1Var7);
        androidx.camera.core.impl.i1 i1Var8 = new androidx.camera.core.impl.i1();
        i1Var8.a(androidx.camera.core.impl.j1.a(bVar3, aVar2));
        i1Var8.a(androidx.camera.core.impl.j1.a(bVar4, aVar));
        i1Var8.a(androidx.camera.core.impl.j1.a(bVar, aVar));
        arrayList.add(i1Var8);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<androidx.camera.core.impl.p1<?>, Size> x(List<androidx.camera.core.impl.j1> list, List<androidx.camera.core.impl.p1<?>> list2) {
        HashMap hashMap = new HashMap();
        List<Integer> B = B(list2);
        ArrayList arrayList = new ArrayList();
        for (Integer num : B) {
            arrayList.add(y(list2.get(num.intValue())));
        }
        Iterator<List<Size>> it2 = k(arrayList).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            List<Size> next = it2.next();
            ArrayList arrayList2 = new ArrayList(list);
            for (int i11 = 0; i11 < next.size(); i11++) {
                arrayList2.add(J(list2.get(B.get(i11).intValue()).getInputFormat(), next.get(i11)));
            }
            if (b(arrayList2)) {
                for (androidx.camera.core.impl.p1<?> p1Var : list2) {
                    hashMap.put(p1Var, next.get(B.indexOf(Integer.valueOf(list2.indexOf(p1Var)))));
                }
            }
        }
        return hashMap;
    }

    List<Size> y(androidx.camera.core.impl.p1<?> p1Var) {
        int inputFormat = p1Var.getInputFormat();
        androidx.camera.core.impl.p0 p0Var = (androidx.camera.core.impl.p0) p1Var;
        Size[] n11 = n(inputFormat, p0Var);
        if (n11 == null) {
            n11 = j(inputFormat);
        }
        ArrayList arrayList = new ArrayList();
        Size i11 = p0Var.i(null);
        Size s11 = s(inputFormat);
        if (i11 == null || l(s11) < l(i11)) {
            i11 = s11;
        }
        Arrays.sort(n11, new b(true));
        Size A = A(p0Var);
        Size size = f51191o;
        int l11 = l(size);
        if (l(i11) < l11) {
            size = f51192p;
        } else if (A != null && l(A) < l11) {
            size = A;
        }
        for (Size size2 : n11) {
            if (l(size2) <= l(i11) && l(size2) >= l(size) && !arrayList.contains(size2)) {
                arrayList.add(size2);
            }
        }
        if (!arrayList.isEmpty()) {
            Rational z11 = z(p0Var);
            if (A == null) {
                A = p0Var.y(null);
            }
            List<Size> arrayList2 = new ArrayList<>();
            new HashMap();
            if (z11 == null) {
                arrayList2.addAll(arrayList);
                if (A != null) {
                    I(arrayList2, A);
                }
            } else {
                Map<Rational, List<Size>> C = C(arrayList);
                if (A != null) {
                    for (Rational rational : C.keySet()) {
                        I(C.get(rational), A);
                    }
                }
                ArrayList<Rational> arrayList3 = new ArrayList(C.keySet());
                Collections.sort(arrayList3, new a(z11));
                for (Rational rational2 : arrayList3) {
                    for (Size size3 : C.get(rational2)) {
                        if (!arrayList2.contains(size3)) {
                            arrayList2.add(size3);
                        }
                    }
                }
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("Can not get supported output size under supported maximum for the format: " + inputFormat);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b implements Comparator<Size> {

        /* renamed from: a  reason: collision with root package name */
        private boolean f51215a;

        b() {
            this.f51215a = false;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Size size, Size size2) {
            int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
            return this.f51215a ? signum * (-1) : signum;
        }

        b(boolean z11) {
            this.f51215a = false;
            this.f51215a = z11;
        }
    }
}