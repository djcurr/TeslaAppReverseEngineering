package com.henninghall.date_picker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.react.bridge.Dynamic;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class g extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup.LayoutParams f17477a;

    /* renamed from: b  reason: collision with root package name */
    private sp.d f17478b;

    /* renamed from: c  reason: collision with root package name */
    private j f17479c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<String> f17480d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f17481e;

    /* loaded from: classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.measure(View.MeasureSpec.makeMeasureSpec(gVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(g.this.getHeight(), 1073741824));
            g gVar2 = g.this;
            gVar2.layout(gVar2.getLeft(), g.this.getTop(), g.this.getRight(), g.this.getBottom());
        }
    }

    public g(ViewGroup.LayoutParams layoutParams) {
        super(com.henninghall.date_picker.a.f17465a);
        this.f17479c = new j();
        this.f17480d = new ArrayList<>();
        this.f17481e = new a();
        this.f17477a = layoutParams;
    }

    private boolean a(String... strArr) {
        for (String str : strArr) {
            if (this.f17480d.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public void b(int i11, int i12) {
        this.f17478b.e(i11, i12);
    }

    public void c() {
        if (a("androidVariant")) {
            removeAllViewsInLayout();
            LinearLayout linearLayout = new LinearLayout(getContext());
            LayoutInflater.from(getContext()).inflate(this.f17479c.f17498p.d(), linearLayout);
            addView(linearLayout, this.f17477a);
            this.f17478b = new sp.d(this.f17479c, this);
        }
        if (a("fadeToColor")) {
            this.f17478b.i();
        }
        if (a("textColor")) {
            this.f17478b.l();
        }
        if (a("mode", "androidVariant", "is24hourSource")) {
            this.f17478b.o();
        }
        if (a(Snapshot.HEIGHT)) {
            this.f17478b.j();
        }
        if (a("dividerHeight")) {
            this.f17478b.h();
        }
        if (a("mode", "locale", "androidVariant", "is24hourSource")) {
            this.f17478b.m();
        }
        if (a("mode")) {
            this.f17478b.n();
        }
        if (a("date", Snapshot.HEIGHT, "locale", "maximumDate", "minimumDate", "minuteInterval", "mode", "timezoneOffsetInMinutes", "androidVariant")) {
            this.f17478b.g();
        }
        if (a("locale")) {
            sp.a.h(this.f17479c.u());
        }
        this.f17478b.f();
        this.f17480d = new ArrayList<>();
    }

    public void d(String str, Dynamic dynamic) {
        this.f17479c.G(str, dynamic);
        this.f17480d.add(str);
    }

    public String getDate() {
        return this.f17479c.f17498p.a();
    }

    @Override // android.widget.RelativeLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.f17481e);
    }
}