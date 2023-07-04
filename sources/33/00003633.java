package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    private float f15457c;

    /* renamed from: f  reason: collision with root package name */
    private tk.d f15460f;

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f15455a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    private final tk.f f15456b = new a();

    /* renamed from: d  reason: collision with root package name */
    private boolean f15458d = true;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<b> f15459e = new WeakReference<>(null);

    /* loaded from: classes3.dex */
    class a extends tk.f {
        a() {
        }

        @Override // tk.f
        public void a(int i11) {
            h.this.f15458d = true;
            b bVar = (b) h.this.f15459e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // tk.f
        public void b(Typeface typeface, boolean z11) {
            if (z11) {
                return;
            }
            h.this.f15458d = true;
            b bVar = (b) h.this.f15459e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public h(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        return charSequence == null ? BitmapDescriptorFactory.HUE_RED : this.f15455a.measureText(charSequence, 0, charSequence.length());
    }

    public tk.d d() {
        return this.f15460f;
    }

    public TextPaint e() {
        return this.f15455a;
    }

    public float f(String str) {
        if (!this.f15458d) {
            return this.f15457c;
        }
        float c11 = c(str);
        this.f15457c = c11;
        this.f15458d = false;
        return c11;
    }

    public void g(b bVar) {
        this.f15459e = new WeakReference<>(bVar);
    }

    public void h(tk.d dVar, Context context) {
        if (this.f15460f != dVar) {
            this.f15460f = dVar;
            if (dVar != null) {
                dVar.o(context, this.f15455a, this.f15456b);
                b bVar = this.f15459e.get();
                if (bVar != null) {
                    this.f15455a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f15455a, this.f15456b);
                this.f15458d = true;
            }
            b bVar2 = this.f15459e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z11) {
        this.f15458d = z11;
    }

    public void j(Context context) {
        this.f15460f.n(context, this.f15455a, this.f15456b);
    }
}