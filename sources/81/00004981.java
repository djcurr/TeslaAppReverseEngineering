package com.reactnativecommunity.slider;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.t;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URL;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class a extends t {

    /* renamed from: i  reason: collision with root package name */
    private static int f20134i = 128;

    /* renamed from: b  reason: collision with root package name */
    private double f20135b;

    /* renamed from: c  reason: collision with root package name */
    private double f20136c;

    /* renamed from: d  reason: collision with root package name */
    private double f20137d;

    /* renamed from: e  reason: collision with root package name */
    private double f20138e;

    /* renamed from: f  reason: collision with root package name */
    private double f20139f;

    /* renamed from: g  reason: collision with root package name */
    private String f20140g;

    /* renamed from: h  reason: collision with root package name */
    private List<String> f20141h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.reactnativecommunity.slider.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0354a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f20142a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccessibilityEvent f20143b;

        C0354a(a aVar, AccessibilityManager accessibilityManager, AccessibilityEvent accessibilityEvent) {
            this.f20142a = accessibilityManager;
            this.f20143b = accessibilityEvent;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f20142a.sendAccessibilityEvent(this.f20143b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Callable<BitmapDrawable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f20144a;

        b(String str) {
            this.f20144a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public BitmapDrawable call() {
            Bitmap decodeStream;
            try {
                if (!this.f20144a.startsWith("http://") && !this.f20144a.startsWith("https://") && !this.f20144a.startsWith("file://") && !this.f20144a.startsWith("asset://") && !this.f20144a.startsWith("data:")) {
                    decodeStream = BitmapFactory.decodeResource(a.this.getResources(), a.this.getResources().getIdentifier(this.f20144a, "drawable", a.this.getContext().getPackageName()));
                    return new BitmapDrawable(a.this.getResources(), decodeStream);
                }
                decodeStream = BitmapFactory.decodeStream(FirebasePerfUrlConnection.openStream(new URL(this.f20144a)));
                return new BitmapDrawable(a.this.getResources(), decodeStream);
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
    }

    public a(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f20135b = 0.0d;
        this.f20136c = 0.0d;
        this.f20137d = 0.0d;
        this.f20138e = 0.0d;
        this.f20139f = 0.0d;
        a();
    }

    private void a() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23 || i11 >= 26) {
            return;
        }
        super.setStateListAnimator(null);
    }

    private BitmapDrawable b(String str) {
        try {
            return (BitmapDrawable) Executors.newSingleThreadExecutor().submit(new b(str)).get();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    private void c() {
        List<String> list;
        if (this.f20140g == null || (list = this.f20141h) == null || list.size() - 1 != ((int) this.f20136c)) {
            return;
        }
        String str = this.f20141h.get((int) this.f20137d);
        int length = this.f20140g.length();
        String str2 = this.f20140g;
        if (str != null && Integer.parseInt(str) == 1) {
            str2 = str2.substring(0, length - 1);
        }
        announceForAccessibility(String.format("%s %s", str, str2));
    }

    private void e() {
        if (this.f20138e == 0.0d) {
            this.f20139f = (this.f20136c - this.f20135b) / f20134i;
        }
        setMax(getTotalSteps());
        f();
    }

    private void f() {
        double d11 = this.f20137d;
        double d12 = this.f20135b;
        setProgress((int) Math.round(((d11 - d12) / (this.f20136c - d12)) * getTotalSteps()));
    }

    private double getStepValue() {
        double d11 = this.f20138e;
        return d11 > 0.0d ? d11 : this.f20139f;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.f20136c - this.f20135b) / getStepValue());
    }

    @Override // android.view.View
    public void announceForAccessibility(CharSequence charSequence) {
        Context context = getContext();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.setClassName(a.class.getName());
            obtain.setPackageName(context.getPackageName());
            obtain.getText().add(charSequence);
            new Timer().schedule(new C0354a(this, accessibilityManager, obtain), 1000L);
        }
    }

    public double d(int i11) {
        if (i11 == getMax()) {
            return this.f20136c;
        }
        return (i11 * getStepValue()) + this.f20135b;
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32768 || (accessibilityEvent.getEventType() == 4 && isAccessibilityFocused())) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAccessibilityIncrements(List<String> list) {
        this.f20141h = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAccessibilityUnits(String str) {
        this.f20140g = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMaxValue(double d11) {
        this.f20136c = d11;
        e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMinValue(double d11) {
        this.f20135b = d11;
        e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStep(double d11) {
        this.f20138e = d11;
        e();
    }

    public void setThumbImage(String str) {
        if (str != null) {
            setThumb(b(str));
            if (Build.VERSION.SDK_INT >= 21) {
                setSplitTrack(false);
                return;
            }
            return;
        }
        setThumb(getThumb());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValue(double d11) {
        this.f20137d = d11;
        f();
    }
}