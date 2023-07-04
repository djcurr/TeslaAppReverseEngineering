package ak;

import ak.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes3.dex */
public class a0 {

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator<b> f427h = new Comparator() { // from class: ak.y
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a0.g((a0.b) obj, (a0.b) obj2);
        }
    };

    /* renamed from: i  reason: collision with root package name */
    private static final Comparator<b> f428i = new Comparator() { // from class: ak.z
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int h11;
            h11 = a0.h((a0.b) obj, (a0.b) obj2);
            return h11;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final int f429a;

    /* renamed from: e  reason: collision with root package name */
    private int f433e;

    /* renamed from: f  reason: collision with root package name */
    private int f434f;

    /* renamed from: g  reason: collision with root package name */
    private int f435g;

    /* renamed from: c  reason: collision with root package name */
    private final b[] f431c = new b[5];

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<b> f430b = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private int f432d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f436a;

        /* renamed from: b  reason: collision with root package name */
        public int f437b;

        /* renamed from: c  reason: collision with root package name */
        public float f438c;

        private b() {
        }
    }

    public a0(int i11) {
        this.f429a = i11;
    }

    private void d() {
        if (this.f432d != 1) {
            Collections.sort(this.f430b, f427h);
            this.f432d = 1;
        }
    }

    private void e() {
        if (this.f432d != 0) {
            Collections.sort(this.f430b, f428i);
            this.f432d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f436a - bVar2.f436a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int h(b bVar, b bVar2) {
        return Float.compare(bVar.f438c, bVar2.f438c);
    }

    public void c(int i11, float f11) {
        b bVar;
        d();
        int i12 = this.f435g;
        if (i12 > 0) {
            b[] bVarArr = this.f431c;
            int i13 = i12 - 1;
            this.f435g = i13;
            bVar = bVarArr[i13];
        } else {
            bVar = new b();
        }
        int i14 = this.f433e;
        this.f433e = i14 + 1;
        bVar.f436a = i14;
        bVar.f437b = i11;
        bVar.f438c = f11;
        this.f430b.add(bVar);
        this.f434f += i11;
        while (true) {
            int i15 = this.f434f;
            int i16 = this.f429a;
            if (i15 <= i16) {
                return;
            }
            int i17 = i15 - i16;
            b bVar2 = this.f430b.get(0);
            int i18 = bVar2.f437b;
            if (i18 <= i17) {
                this.f434f -= i18;
                this.f430b.remove(0);
                int i19 = this.f435g;
                if (i19 < 5) {
                    b[] bVarArr2 = this.f431c;
                    this.f435g = i19 + 1;
                    bVarArr2[i19] = bVar2;
                }
            } else {
                bVar2.f437b = i18 - i17;
                this.f434f -= i17;
            }
        }
    }

    public float f(float f11) {
        ArrayList<b> arrayList;
        e();
        float f12 = f11 * this.f434f;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f430b.size(); i12++) {
            b bVar = this.f430b.get(i12);
            i11 += bVar.f437b;
            if (i11 >= f12) {
                return bVar.f438c;
            }
        }
        if (this.f430b.isEmpty()) {
            return Float.NaN;
        }
        return this.f430b.get(arrayList.size() - 1).f438c;
    }

    public void i() {
        this.f430b.clear();
        this.f432d = -1;
        this.f433e = 0;
        this.f434f = 0;
    }
}