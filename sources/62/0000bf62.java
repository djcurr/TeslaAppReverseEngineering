package xg;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.p;
import com.facebook.react.views.image.d;
import com.facebook.react.views.text.a0;
import je.q;

/* loaded from: classes3.dex */
public class b extends a0 {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f57374a;

    /* renamed from: b  reason: collision with root package name */
    private final ge.b f57375b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.drawee.view.b<ke.a> f57376c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f57377d;

    /* renamed from: e  reason: collision with root package name */
    private int f57378e;

    /* renamed from: f  reason: collision with root package name */
    private int f57379f;

    /* renamed from: g  reason: collision with root package name */
    private Uri f57380g;

    /* renamed from: h  reason: collision with root package name */
    private int f57381h;

    /* renamed from: i  reason: collision with root package name */
    private ReadableMap f57382i;

    /* renamed from: j  reason: collision with root package name */
    private String f57383j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f57384k;

    public b(Resources resources, int i11, int i12, int i13, Uri uri, ReadableMap readableMap, ge.b bVar, Object obj, String str) {
        this.f57376c = new com.facebook.drawee.view.b<>(ke.b.t(resources).a());
        this.f57375b = bVar;
        this.f57377d = obj;
        this.f57379f = i13;
        this.f57380g = uri == null ? Uri.EMPTY : uri;
        this.f57382i = readableMap;
        this.f57381h = (int) p.c(i12);
        this.f57378e = (int) p.c(i11);
        this.f57383j = str;
    }

    private q.c i(String str) {
        return d.c(str);
    }

    @Override // com.facebook.react.views.text.a0
    public Drawable a() {
        return this.f57374a;
    }

    @Override // com.facebook.react.views.text.a0
    public int b() {
        return this.f57378e;
    }

    @Override // com.facebook.react.views.text.a0
    public void c() {
        this.f57376c.k();
    }

    @Override // com.facebook.react.views.text.a0
    public void d() {
        this.f57376c.l();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, Paint paint) {
        if (this.f57374a == null) {
            ig.a y11 = ig.a.y(ImageRequestBuilder.s(this.f57380g), this.f57382i);
            this.f57376c.h().v(i(this.f57383j));
            this.f57376c.o(this.f57375b.y().b(this.f57376c.g()).A(this.f57377d).C(y11).build());
            this.f57375b.y();
            Drawable i16 = this.f57376c.i();
            this.f57374a = i16;
            i16.setBounds(0, 0, this.f57381h, this.f57378e);
            int i17 = this.f57379f;
            if (i17 != 0) {
                this.f57374a.setColorFilter(i17, PorterDuff.Mode.SRC_IN);
            }
            this.f57374a.setCallback(this.f57384k);
        }
        canvas.save();
        canvas.translate(f11, ((i14 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - ((this.f57374a.getBounds().bottom - this.f57374a.getBounds().top) / 2));
        this.f57374a.draw(canvas);
        canvas.restore();
    }

    @Override // com.facebook.react.views.text.a0
    public void e() {
        this.f57376c.k();
    }

    @Override // com.facebook.react.views.text.a0
    public void f() {
        this.f57376c.l();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i13 = -this.f57378e;
            fontMetricsInt.ascent = i13;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i13;
            fontMetricsInt.bottom = 0;
        }
        return this.f57381h;
    }

    @Override // com.facebook.react.views.text.a0
    public void h(TextView textView) {
        this.f57384k = textView;
    }
}