package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a  reason: collision with root package name */
    long f4582a;

    /* renamed from: b  reason: collision with root package name */
    boolean f4583b;

    /* renamed from: c  reason: collision with root package name */
    boolean f4584c;

    /* renamed from: d  reason: collision with root package name */
    boolean f4585d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f4586e;

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f4587f;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4582a = -1L;
        this.f4583b = false;
        this.f4584c = false;
        this.f4585d = false;
        this.f4586e = new Runnable() { // from class: androidx.core.widget.d
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.g();
            }
        };
        this.f4587f = new Runnable() { // from class: androidx.core.widget.f
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.h();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f4585d = true;
        removeCallbacks(this.f4587f);
        this.f4584c = false;
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.f4582a;
        long j12 = currentTimeMillis - j11;
        if (j12 < 500 && j11 != -1) {
            if (this.f4583b) {
                return;
            }
            postDelayed(this.f4586e, 500 - j12);
            this.f4583b = true;
            return;
        }
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.f4583b = false;
        this.f4582a = -1L;
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.f4584c = false;
        if (this.f4585d) {
            return;
        }
        this.f4582a = System.currentTimeMillis();
        setVisibility(0);
    }

    private void i() {
        removeCallbacks(this.f4586e);
        removeCallbacks(this.f4587f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.f4582a = -1L;
        this.f4585d = false;
        removeCallbacks(this.f4586e);
        this.f4583b = false;
        if (this.f4584c) {
            return;
        }
        postDelayed(this.f4587f, 500L);
        this.f4584c = true;
    }

    public void e() {
        post(new Runnable() { // from class: androidx.core.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.f();
            }
        });
    }

    public void j() {
        post(new Runnable() { // from class: androidx.core.widget.g
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.k();
            }
        });
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }
}