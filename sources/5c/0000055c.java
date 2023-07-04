package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: f  reason: collision with root package name */
    public static int f3361f = -1;

    /* renamed from: a  reason: collision with root package name */
    int f3362a;

    /* renamed from: b  reason: collision with root package name */
    int f3363b;

    /* renamed from: c  reason: collision with root package name */
    String f3364c;

    /* renamed from: d  reason: collision with root package name */
    protected int f3365d;

    /* renamed from: e  reason: collision with root package name */
    HashMap<String, androidx.constraintlayout.widget.a> f3366e;

    public d() {
        int i11 = f3361f;
        this.f3362a = i11;
        this.f3363b = i11;
        this.f3364c = null;
    }

    public abstract void a(HashMap<String, h3.d> hashMap);

    @Override // 
    /* renamed from: b */
    public abstract d clone();

    public d c(d dVar) {
        this.f3362a = dVar.f3362a;
        this.f3363b = dVar.f3363b;
        this.f3364c = dVar.f3364c;
        this.f3365d = dVar.f3365d;
        this.f3366e = dVar.f3366e;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d(HashSet<String> hashSet);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap<String, Integer> hashMap) {
    }

    public d g(int i11) {
        this.f3363b = i11;
        return this;
    }
}