package q5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
public class a extends View {
    private int A;
    private float A3;
    private int B;
    private float B3;
    private int C;
    private float C3;
    private boolean D3;
    private int E;
    private int E3;
    private int F;
    private int F3;
    private int G;
    private int G3;
    private int H;
    private float H3;
    private float I3;
    private float J3;
    private int K;
    private int K3;
    private String L;
    private int L3;
    private int M3;
    private int N3;
    private String O;
    private int O3;
    private String P;
    private String Q;
    private boolean Q1;
    private Paint Q2;
    private float R;
    private float T;
    private boolean V1;

    /* renamed from: a  reason: collision with root package name */
    private int f47486a;

    /* renamed from: b  reason: collision with root package name */
    private int f47487b;

    /* renamed from: b1  reason: collision with root package name */
    private float f47488b1;

    /* renamed from: b2  reason: collision with root package name */
    private boolean f47489b2;

    /* renamed from: c  reason: collision with root package name */
    private int f47490c;

    /* renamed from: d  reason: collision with root package name */
    private int f47491d;

    /* renamed from: e  reason: collision with root package name */
    private int f47492e;

    /* renamed from: f  reason: collision with root package name */
    private int f47493f;

    /* renamed from: g  reason: collision with root package name */
    private int f47494g;

    /* renamed from: g1  reason: collision with root package name */
    private float f47495g1;

    /* renamed from: g2  reason: collision with root package name */
    private boolean f47496g2;

    /* renamed from: h  reason: collision with root package name */
    private int f47497h;

    /* renamed from: i  reason: collision with root package name */
    private int f47498i;

    /* renamed from: i3  reason: collision with root package name */
    private TextPaint f47499i3;

    /* renamed from: j  reason: collision with root package name */
    private int f47500j;

    /* renamed from: j3  reason: collision with root package name */
    private Paint f47501j3;

    /* renamed from: k  reason: collision with root package name */
    private int f47502k;

    /* renamed from: k3  reason: collision with root package name */
    private String[] f47503k3;

    /* renamed from: l  reason: collision with root package name */
    private int f47504l;

    /* renamed from: l3  reason: collision with root package name */
    private CharSequence[] f47505l3;

    /* renamed from: m  reason: collision with root package name */
    private int f47506m;

    /* renamed from: m3  reason: collision with root package name */
    private CharSequence[] f47507m3;

    /* renamed from: n  reason: collision with root package name */
    private int f47508n;

    /* renamed from: n3  reason: collision with root package name */
    private HandlerThread f47509n3;

    /* renamed from: o  reason: collision with root package name */
    private int f47510o;

    /* renamed from: o3  reason: collision with root package name */
    private Handler f47511o3;

    /* renamed from: p  reason: collision with root package name */
    private int f47512p;

    /* renamed from: p1  reason: collision with root package name */
    private boolean f47513p1;

    /* renamed from: p2  reason: collision with root package name */
    private boolean f47514p2;

    /* renamed from: p3  reason: collision with root package name */
    private Handler f47515p3;

    /* renamed from: q  reason: collision with root package name */
    private int f47516q;

    /* renamed from: q3  reason: collision with root package name */
    private Map<String, Integer> f47517q3;

    /* renamed from: r3  reason: collision with root package name */
    private f f47518r3;

    /* renamed from: s3  reason: collision with root package name */
    private d f47519s3;

    /* renamed from: t  reason: collision with root package name */
    private int f47520t;

    /* renamed from: t3  reason: collision with root package name */
    private c f47521t3;

    /* renamed from: u3  reason: collision with root package name */
    private e f47522u3;

    /* renamed from: v3  reason: collision with root package name */
    private int f47523v3;

    /* renamed from: w  reason: collision with root package name */
    private int f47524w;

    /* renamed from: w3  reason: collision with root package name */
    private int f47525w3;

    /* renamed from: x  reason: collision with root package name */
    private int f47526x;

    /* renamed from: x1  reason: collision with root package name */
    private boolean f47527x1;

    /* renamed from: x2  reason: collision with root package name */
    private Scroller f47528x2;

    /* renamed from: x3  reason: collision with root package name */
    private int f47529x3;

    /* renamed from: y  reason: collision with root package name */
    private int f47530y;

    /* renamed from: y1  reason: collision with root package name */
    private boolean f47531y1;

    /* renamed from: y2  reason: collision with root package name */
    private VelocityTracker f47532y2;

    /* renamed from: y3  reason: collision with root package name */
    private int f47533y3;

    /* renamed from: z  reason: collision with root package name */
    private int f47534z;

    /* renamed from: z3  reason: collision with root package name */
    private int f47535z3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class HandlerC1020a extends Handler {
        HandlerC1020a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int H;
            int i11;
            int i12 = message.what;
            if (i12 != 1) {
                if (i12 != 2) {
                    return;
                }
                a.this.W(message.arg1, message.arg2, message.obj);
                return;
            }
            int i13 = 0;
            if (!a.this.f47528x2.isFinished()) {
                if (a.this.f47523v3 == 0) {
                    a.this.T(1);
                }
                a.this.f47511o3.sendMessageDelayed(a.this.E(1, 0, 0, message.obj), 32L);
                return;
            }
            if (a.this.L3 != 0) {
                if (a.this.f47523v3 == 0) {
                    a.this.T(1);
                }
                if (a.this.L3 < (-a.this.G3) / 2) {
                    i11 = (int) (((a.this.G3 + a.this.L3) * 300.0f) / a.this.G3);
                    a.this.f47528x2.startScroll(0, a.this.M3, 0, a.this.L3 + a.this.G3, i11 * 3);
                    a aVar = a.this;
                    H = aVar.H(aVar.M3 + a.this.G3 + a.this.L3);
                } else {
                    i11 = (int) (((-a.this.L3) * 300.0f) / a.this.G3);
                    a.this.f47528x2.startScroll(0, a.this.M3, 0, a.this.L3, i11 * 3);
                    a aVar2 = a.this;
                    H = aVar2.H(aVar2.M3 + a.this.L3);
                }
                i13 = i11;
                a.this.postInvalidate();
            } else {
                a.this.T(0);
                a aVar3 = a.this;
                H = aVar3.H(aVar3.M3);
            }
            a aVar4 = a.this;
            Message E = aVar4.E(2, aVar4.G, H, message.obj);
            if (a.this.f47514p2) {
                a.this.f47515p3.sendMessageDelayed(E, i13 * 2);
            } else {
                a.this.f47511o3.sendMessageDelayed(E, i13 * 2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends Handler {
        b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i11 = message.what;
            if (i11 == 2) {
                a.this.W(message.arg1, message.arg2, message.obj);
            } else if (i11 != 3) {
            } else {
                a.this.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(a aVar, int i11);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(a aVar, int i11, int i12);
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(a aVar, int i11, int i12);
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(a aVar, int i11, int i12, String[] strArr);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47486a = -13421773;
        this.f47487b = -695533;
        this.f47490c = -695533;
        this.f47491d = 0;
        this.f47492e = 0;
        this.f47493f = 0;
        this.f47494g = 0;
        this.f47497h = 0;
        this.f47498i = 0;
        this.f47500j = 0;
        this.f47502k = 0;
        this.f47504l = 0;
        this.f47506m = -695533;
        this.f47508n = 2;
        this.f47510o = 0;
        this.f47512p = 0;
        this.f47516q = 3;
        this.f47520t = 0;
        this.f47524w = 0;
        this.f47526x = -1;
        this.f47530y = -1;
        this.f47534z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 150;
        this.K = 8;
        this.R = 1.0f;
        this.T = BitmapDescriptorFactory.HUE_RED;
        this.f47488b1 = BitmapDescriptorFactory.HUE_RED;
        this.f47495g1 = BitmapDescriptorFactory.HUE_RED;
        this.f47513p1 = true;
        this.f47527x1 = true;
        this.f47531y1 = false;
        this.Q1 = false;
        this.V1 = true;
        this.f47489b2 = false;
        this.f47496g2 = false;
        this.f47514p2 = true;
        this.Q2 = new Paint();
        this.f47499i3 = new TextPaint();
        this.f47501j3 = new Paint();
        this.f47517q3 = new ConcurrentHashMap();
        this.f47523v3 = 0;
        this.A3 = BitmapDescriptorFactory.HUE_RED;
        this.B3 = BitmapDescriptorFactory.HUE_RED;
        this.C3 = BitmapDescriptorFactory.HUE_RED;
        this.D3 = false;
        this.K3 = 0;
        this.L3 = 0;
        this.M3 = 0;
        this.N3 = 0;
        this.O3 = 0;
        K(context, attributeSet);
        J(context);
    }

    private float A(float f11, float f12, float f13) {
        return f12 + ((f13 - f12) * f11);
    }

    private int B(int i11, int i12, boolean z11) {
        if (i12 <= 0) {
            return 0;
        }
        if (z11) {
            int i13 = i11 % i12;
            return i13 < 0 ? i13 + i12 : i13;
        }
        return i11;
    }

    private int C(CharSequence[] charSequenceArr, Paint paint) {
        if (charSequenceArr == null) {
            return 0;
        }
        int i11 = 0;
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence != null) {
                i11 = Math.max(G(charSequence, paint), i11);
            }
        }
        return i11;
    }

    private Message D(int i11) {
        return E(i11, 0, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message E(int i11, int i12, int i13, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i11;
        obtain.arg1 = i12;
        obtain.arg2 = i13;
        obtain.obj = obj;
        return obtain;
    }

    private float F(Paint.FontMetrics fontMetrics) {
        return fontMetrics == null ? BitmapDescriptorFactory.HUE_RED : Math.abs(fontMetrics.top + fontMetrics.bottom) / 2.0f;
    }

    private int G(CharSequence charSequence, Paint paint) {
        Integer num;
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        String charSequence2 = charSequence.toString();
        if (this.f47517q3.containsKey(charSequence2) && (num = this.f47517q3.get(charSequence2)) != null) {
            return num.intValue();
        }
        int measureText = (int) (paint.measureText(charSequence2) + 0.5f);
        this.f47517q3.put(charSequence2, Integer.valueOf(measureText));
        return measureText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int H(int i11) {
        int i12 = this.G3;
        boolean z11 = false;
        if (i12 == 0) {
            return 0;
        }
        int i13 = (i11 / i12) + (this.f47516q / 2);
        int oneRecycleSize = getOneRecycleSize();
        if (this.f47527x1 && this.V1) {
            z11 = true;
        }
        int B = B(i13, oneRecycleSize, z11);
        if (B >= 0 && B < getOneRecycleSize()) {
            return B + this.f47526x;
        }
        return getOneRecycleSize() - 1;
    }

    private void I() {
        if (this.f47503k3 == null) {
            this.f47503k3 = r0;
            String[] strArr = {""};
        }
    }

    private void J(Context context) {
        this.f47528x2 = new Scroller(context);
        this.H = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        this.K = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (this.f47491d == 0) {
            this.f47491d = d0(context, 14.0f);
        }
        if (this.f47492e == 0) {
            this.f47492e = d0(context, 16.0f);
        }
        if (this.f47493f == 0) {
            this.f47493f = d0(context, 14.0f);
        }
        if (this.f47498i == 0) {
            this.f47498i = v(context, 8.0f);
        }
        if (this.f47500j == 0) {
            this.f47500j = v(context, 8.0f);
        }
        this.Q2.setColor(this.f47506m);
        this.Q2.setAntiAlias(true);
        this.Q2.setStyle(Paint.Style.STROKE);
        this.Q2.setStrokeWidth(this.f47508n);
        this.f47499i3.setColor(this.f47486a);
        this.f47499i3.setAntiAlias(true);
        this.f47499i3.setTextAlign(Paint.Align.RIGHT);
        this.f47501j3.setColor(this.f47490c);
        this.f47501j3.setAntiAlias(true);
        this.f47501j3.setTextAlign(Paint.Align.CENTER);
        this.f47501j3.setTextSize(this.f47493f);
        int i11 = this.f47516q;
        if (i11 % 2 == 0) {
            this.f47516q = i11 + 1;
        }
        if (this.f47526x == -1 || this.f47530y == -1) {
            n0();
        }
        L();
    }

    private void K(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q5.b.f47538a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == q5.b.f47557t) {
                this.f47516q = obtainStyledAttributes.getInt(index, 3);
            } else if (index == q5.b.f47542e) {
                this.f47506m = obtainStyledAttributes.getColor(index, -695533);
            } else if (index == q5.b.f47543f) {
                this.f47508n = obtainStyledAttributes.getDimensionPixelSize(index, 2);
            } else if (index == q5.b.f47544g) {
                this.f47510o = obtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == q5.b.f47545h) {
                this.f47512p = obtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == q5.b.f47558u) {
                this.f47503k3 = t(obtainStyledAttributes.getTextArray(index));
            } else if (index == q5.b.f47560w) {
                this.f47486a = obtainStyledAttributes.getColor(index, -13421773);
            } else if (index == q5.b.f47561x) {
                this.f47487b = obtainStyledAttributes.getColor(index, -695533);
            } else if (index == q5.b.f47559v) {
                this.f47490c = obtainStyledAttributes.getColor(index, -695533);
            } else if (index == q5.b.A) {
                this.f47491d = obtainStyledAttributes.getDimensionPixelSize(index, d0(context, 14.0f));
            } else if (index == q5.b.B) {
                this.f47492e = obtainStyledAttributes.getDimensionPixelSize(index, d0(context, 16.0f));
            } else if (index == q5.b.f47563z) {
                this.f47493f = obtainStyledAttributes.getDimensionPixelSize(index, d0(context, 14.0f));
            } else if (index == q5.b.f47553p) {
                this.f47526x = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == q5.b.f47552o) {
                this.f47530y = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == q5.b.C) {
                this.f47527x1 = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == q5.b.f47556s) {
                this.f47513p1 = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == q5.b.f47547j) {
                this.L = obtainStyledAttributes.getString(index);
            } else if (index == q5.b.f47539b) {
                this.Q = obtainStyledAttributes.getString(index);
            } else if (index == q5.b.f47546i) {
                this.P = obtainStyledAttributes.getString(index);
            } else if (index == q5.b.f47551n) {
                this.f47498i = obtainStyledAttributes.getDimensionPixelSize(index, v(context, 8.0f));
            } else if (index == q5.b.f47550m) {
                this.f47500j = obtainStyledAttributes.getDimensionPixelSize(index, v(context, 8.0f));
            } else if (index == q5.b.f47549l) {
                this.f47502k = obtainStyledAttributes.getDimensionPixelSize(index, v(context, 2.0f));
            } else if (index == q5.b.f47548k) {
                this.f47504l = obtainStyledAttributes.getDimensionPixelSize(index, v(context, 5.0f));
            } else if (index == q5.b.f47540c) {
                this.f47505l3 = obtainStyledAttributes.getTextArray(index);
            } else if (index == q5.b.f47541d) {
                this.f47507m3 = obtainStyledAttributes.getTextArray(index);
            } else if (index == q5.b.f47555r) {
                this.f47496g2 = obtainStyledAttributes.getBoolean(index, false);
            } else if (index == q5.b.f47554q) {
                this.f47514p2 = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == q5.b.f47562y) {
                this.O = obtainStyledAttributes.getString(index);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void L() {
        HandlerThread handlerThread = new HandlerThread("HandlerThread-For-Refreshing");
        this.f47509n3 = handlerThread;
        handlerThread.start();
        this.f47511o3 = new HandlerC1020a(this.f47509n3.getLooper());
        this.f47515p3 = new b();
    }

    private void M() {
        if (this.f47509n3.isAlive()) {
            return;
        }
        L();
    }

    private void N() {
        u(getPickedIndexRelativeToRaw() - this.f47526x, false);
        this.f47527x1 = false;
        postInvalidate();
    }

    private boolean P(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    private int Q(int i11) {
        if (this.f47527x1 && this.V1) {
            return i11;
        }
        int i12 = this.f47535z3;
        return (i11 >= i12 && i11 <= (i12 = this.f47533y3)) ? i11 : i12;
    }

    private int R(int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        this.O3 = mode;
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = getPaddingTop() + getPaddingBottom() + (this.f47516q * (this.C + (this.f47502k * 2)));
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    private int S(int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        this.N3 = mode;
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 1073741824) {
            return size;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight() + Math.max(this.E, Math.max(this.B, this.F) + (((Math.max(this.f47494g, this.f47497h) != 0 ? this.f47498i : 0) + Math.max(this.f47494g, this.f47497h) + (Math.max(this.f47494g, this.f47497h) == 0 ? 0 : this.f47500j) + (this.f47504l * 2)) * 2));
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(int i11) {
        if (this.f47523v3 == i11) {
            return;
        }
        this.f47523v3 = i11;
        c cVar = this.f47521t3;
        if (cVar != null) {
            cVar.a(this, i11);
        }
    }

    private int U(int i11, int i12, int i13, boolean z11) {
        if (!z11) {
            return i11 > i13 ? i13 : i11 < i12 ? i12 : i11;
        } else if (i11 > i13) {
            return (((i11 - i13) % getOneRecycleSize()) + i12) - 1;
        } else {
            return i11 < i12 ? ((i11 - i12) % getOneRecycleSize()) + i13 + 1 : i11;
        }
    }

    private void V() {
        VelocityTracker velocityTracker = this.f47532y2;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.f47532y2.recycle();
            this.f47532y2 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i11, int i12, Object obj) {
        T(0);
        if (i11 != i12) {
            if (obj == null || !(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
                d dVar = this.f47519s3;
                if (dVar != null) {
                    int i13 = this.f47534z;
                    dVar.a(this, i11 + i13, i13 + i12);
                }
                f fVar = this.f47518r3;
                if (fVar != null) {
                    fVar.a(this, i11, i12, this.f47503k3);
                }
            }
            this.G = i12;
        }
        if (this.f47489b2) {
            this.f47489b2 = false;
            N();
        }
    }

    private void X(int i11, int i12) {
        this.f47522u3.a(this, i11, i12);
    }

    private void Y(int i11) {
        Z(i11, true);
    }

    private void Z(int i11, boolean z11) {
        int pickedIndexRelativeToRaw;
        int pickedIndexRelativeToRaw2;
        int i12;
        int i13;
        M();
        if ((!this.f47527x1 || !this.V1) && ((pickedIndexRelativeToRaw2 = (pickedIndexRelativeToRaw = getPickedIndexRelativeToRaw()) + i11) > (i12 = this.f47530y) || pickedIndexRelativeToRaw2 < (i12 = this.f47526x))) {
            i11 = i12 - pickedIndexRelativeToRaw;
        }
        int i14 = this.L3;
        int i15 = this.G3;
        if (i14 < (-i15) / 2) {
            int i16 = i15 + i14;
            int i17 = (int) (((i14 + i15) * 300.0f) / i15);
            i13 = i11 < 0 ? (-i17) - (i11 * 300) : i17 + (i11 * 300);
            i14 = i16;
        } else {
            int i18 = (int) (((-i14) * 300.0f) / i15);
            i13 = i11 < 0 ? i18 - (i11 * 300) : i18 + (i11 * 300);
        }
        int i19 = i14 + (i11 * i15);
        if (i13 < 300) {
            i13 = 300;
        }
        if (i13 > 600) {
            i13 = 600;
        }
        this.f47528x2.startScroll(0, this.M3, 0, i19, i13);
        if (z11) {
            this.f47511o3.sendMessageDelayed(D(1), i13 / 4);
        } else {
            this.f47511o3.sendMessageDelayed(E(1, 0, 0, new Boolean(z11)), i13 / 4);
        }
        postInvalidate();
    }

    private int d0(Context context, float f11) {
        return (int) ((f11 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    private void e0() {
        Handler handler = this.f47511o3;
        if (handler != null) {
            handler.removeMessages(1);
        }
    }

    private void g0(String[] strArr) {
        this.f47503k3 = strArr;
        o0();
    }

    private TextUtils.TruncateAt getEllipsizeType() {
        String str = this.O;
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1074341483:
                if (str.equals("middle")) {
                    c11 = 0;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c11 = 1;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return TextUtils.TruncateAt.MIDDLE;
            case 1:
                return TextUtils.TruncateAt.END;
            case 2:
                return TextUtils.TruncateAt.START;
            default:
                throw new IllegalArgumentException("Illegal text ellipsize type.");
        }
    }

    private void h0() {
        int i11;
        int i12;
        int i13;
        int i14 = this.f47516q / 2;
        this.f47520t = i14;
        this.f47524w = i14 + 1;
        int i15 = this.F3;
        this.H3 = (i14 * i15) / i11;
        this.I3 = (i12 * i15) / i11;
        if (this.f47510o < 0) {
            this.f47510o = 0;
        }
        if (this.f47512p < 0) {
            this.f47512p = 0;
        }
        if (this.f47510o + this.f47512p != 0 && getPaddingLeft() + this.f47510o >= (this.E3 - getPaddingRight()) - this.f47512p) {
            int paddingLeft = getPaddingLeft() + this.f47510o + getPaddingRight();
            int i16 = this.f47512p;
            int i17 = (paddingLeft + i16) - this.E3;
            int i18 = this.f47510o;
            float f11 = i17;
            this.f47510o = (int) (i18 - ((i18 * f11) / (i18 + i16)));
            this.f47512p = (int) (i16 - ((f11 * i16) / (i13 + i16)));
        }
    }

    private void i0() {
        int i11 = this.f47491d;
        int i12 = this.G3;
        if (i11 > i12) {
            this.f47491d = i12;
        }
        if (this.f47492e > i12) {
            this.f47492e = i12;
        }
        Paint paint = this.f47501j3;
        if (paint != null) {
            paint.setTextSize(this.f47493f);
            this.f47495g1 = F(this.f47501j3.getFontMetrics());
            this.f47494g = G(this.L, this.f47501j3);
            TextPaint textPaint = this.f47499i3;
            if (textPaint != null) {
                textPaint.setTextSize(this.f47492e);
                this.f47488b1 = F(this.f47499i3.getFontMetrics());
                this.f47499i3.setTextSize(this.f47491d);
                this.T = F(this.f47499i3.getFontMetrics());
                return;
            }
            throw new IllegalArgumentException("mPaintText should not be null.");
        }
        throw new IllegalArgumentException("mPaintHint should not be null.");
    }

    private void j0() {
        float textSize = this.f47499i3.getTextSize();
        this.f47499i3.setTextSize(this.f47492e);
        this.C = (int) ((this.f47499i3.getFontMetrics().bottom - this.f47499i3.getFontMetrics().top) + 0.5d);
        this.f47499i3.setTextSize(textSize);
    }

    private void k0(boolean z11) {
        l0();
        j0();
        if (z11) {
            if (this.N3 == Integer.MIN_VALUE || this.O3 == Integer.MIN_VALUE) {
                this.f47515p3.sendEmptyMessage(3);
            }
        }
    }

    private void l0() {
        float textSize = this.f47499i3.getTextSize();
        this.f47499i3.setTextSize(this.f47492e);
        this.B = C(this.f47503k3, this.f47499i3);
        this.E = C(this.f47505l3, this.f47499i3);
        this.F = C(this.f47507m3, this.f47499i3);
        this.f47499i3.setTextSize(this.f47493f);
        this.f47497h = G(this.Q, this.f47499i3);
        this.f47499i3.setTextSize(textSize);
    }

    private void m0() {
        this.f47533y3 = 0;
        this.f47535z3 = (-this.f47516q) * this.G3;
        if (this.f47503k3 != null) {
            int oneRecycleSize = getOneRecycleSize();
            int i11 = this.f47516q;
            int i12 = this.G3;
            this.f47533y3 = ((oneRecycleSize - (i11 / 2)) - 1) * i12;
            this.f47535z3 = (-(i11 / 2)) * i12;
        }
    }

    private void n0() {
        I();
        o0();
        if (this.f47526x == -1) {
            this.f47526x = 0;
        }
        if (this.f47530y == -1) {
            this.f47530y = this.f47503k3.length - 1;
        }
        b0(this.f47526x, this.f47530y, false);
    }

    private void o0() {
        this.V1 = this.f47503k3.length > this.f47516q;
    }

    private void q() {
        int floor = (int) Math.floor(this.M3 / this.G3);
        this.K3 = floor;
        int i11 = this.M3;
        int i12 = this.G3;
        int i13 = -(i11 - (floor * i12));
        this.L3 = i13;
        if (this.f47522u3 != null) {
            if ((-i13) > i12 / 2) {
                this.f47529x3 = floor + 1 + (this.f47516q / 2);
            } else {
                this.f47529x3 = floor + (this.f47516q / 2);
            }
            int oneRecycleSize = this.f47529x3 % getOneRecycleSize();
            this.f47529x3 = oneRecycleSize;
            if (oneRecycleSize < 0) {
                this.f47529x3 = oneRecycleSize + getOneRecycleSize();
            }
            int i14 = this.f47525w3;
            int i15 = this.f47529x3;
            if (i14 != i15) {
                int i16 = this.f47534z;
                X(i14 + i16, i15 + i16);
            }
            this.f47525w3 = this.f47529x3;
        }
    }

    private void r(MotionEvent motionEvent) {
        float y11 = motionEvent.getY();
        for (int i11 = 0; i11 < this.f47516q; i11++) {
            int i12 = this.G3;
            if (i12 * i11 <= y11 && y11 < i12 * (i11 + 1)) {
                s(i11);
                return;
            }
        }
    }

    private void s(int i11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f47516q)) {
            return;
        }
        Y(i11 - (i12 / 2));
    }

    private String[] t(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            return null;
        }
        String[] strArr = new String[charSequenceArr.length];
        for (int i11 = 0; i11 < charSequenceArr.length; i11++) {
            strArr[i11] = charSequenceArr[i11].toString();
        }
        return strArr;
    }

    private void u(int i11, boolean z11) {
        int i12 = i11 - ((this.f47516q - 1) / 2);
        this.K3 = i12;
        int B = B(i12, getOneRecycleSize(), z11);
        this.K3 = B;
        int i13 = this.G3;
        if (i13 == 0) {
            this.f47531y1 = true;
            return;
        }
        this.M3 = i13 * B;
        int i14 = B + (this.f47516q / 2);
        this.f47525w3 = i14;
        int oneRecycleSize = i14 % getOneRecycleSize();
        this.f47525w3 = oneRecycleSize;
        if (oneRecycleSize < 0) {
            this.f47525w3 = oneRecycleSize + getOneRecycleSize();
        }
        this.f47529x3 = this.f47525w3;
        q();
    }

    private int v(Context context, float f11) {
        return (int) ((f11 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void w(Canvas canvas) {
        float f11;
        float f12;
        float f13;
        int i11;
        int i12;
        float f14 = BitmapDescriptorFactory.HUE_RED;
        int i13 = 0;
        while (i13 < this.f47516q + 1) {
            float f15 = this.L3 + (this.G3 * i13);
            int B = B(this.K3 + i13, getOneRecycleSize(), this.f47527x1 && this.V1);
            int i14 = this.f47516q;
            if (i13 == i14 / 2) {
                f13 = (this.L3 + i12) / this.G3;
                i11 = z(f13, this.f47486a, this.f47487b);
                f11 = A(f13, this.f47491d, this.f47492e);
                f12 = A(f13, this.T, this.f47488b1);
            } else if (i13 == (i14 / 2) + 1) {
                float f16 = 1.0f - f14;
                int z11 = z(f16, this.f47486a, this.f47487b);
                float A = A(f16, this.f47491d, this.f47492e);
                float A2 = A(f16, this.T, this.f47488b1);
                f13 = f14;
                i11 = z11;
                f11 = A;
                f12 = A2;
            } else {
                int i15 = this.f47486a;
                f11 = this.f47491d;
                f12 = this.T;
                f13 = f14;
                i11 = i15;
            }
            this.f47499i3.setColor(i11);
            this.f47499i3.setTextSize(f11);
            if (B >= 0 && B < getOneRecycleSize()) {
                CharSequence charSequence = this.f47503k3[B + this.f47526x];
                if (this.O != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.f47499i3, getWidth() - (this.f47504l * 2), getEllipsizeType());
                }
                canvas.drawText(charSequence.toString(), this.f47499i3.getTextAlign() == Paint.Align.RIGHT ? this.E3 - (this.f47504l * 2) : this.f47504l * 2, f15 + (this.G3 / 2) + f12, this.f47499i3);
            } else if (!TextUtils.isEmpty(this.P)) {
                canvas.drawText(this.P, this.J3, f15 + (this.G3 / 2) + f12, this.f47499i3);
            }
            i13++;
            f14 = f13;
        }
    }

    private void x(Canvas canvas) {
        if (TextUtils.isEmpty(this.L)) {
            return;
        }
        canvas.drawText(this.L, this.J3 + ((this.B + this.f47494g) / 2) + this.f47498i, ((this.H3 + this.I3) / 2.0f) + this.f47495g1, this.f47501j3);
    }

    private void y(Canvas canvas) {
        if (this.f47513p1) {
            canvas.drawLine(getPaddingLeft() + this.f47510o, this.H3, (this.E3 - getPaddingRight()) - this.f47512p, this.H3, this.Q2);
            canvas.drawLine(getPaddingLeft() + this.f47510o, this.I3, (this.E3 - getPaddingRight()) - this.f47512p, this.I3, this.Q2);
        }
    }

    private int z(float f11, int i11, int i12) {
        int i13 = (i11 & (-16777216)) >>> 24;
        int i14 = (i11 & 16711680) >>> 16;
        int i15 = (i11 & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) >>> 8;
        int i16 = (i11 & 255) >>> 0;
        return ((int) (i16 + ((((i12 & 255) >>> 0) - i16) * f11))) | (((int) (i13 + (((((-16777216) & i12) >>> 24) - i13) * f11))) << 24) | (((int) (i14 + ((((16711680 & i12) >>> 16) - i14) * f11))) << 16) | (((int) (i15 + ((((65280 & i12) >>> 8) - i15) * f11))) << 8);
    }

    public boolean O() {
        return this.f47523v3 == 2;
    }

    public void a(int i11, boolean z11) {
        c0(getValue(), i11, z11);
    }

    public void a0(int i11, int i12) {
        b0(i11, i12, true);
    }

    public void b(int i11) {
        c0(getValue(), i11, true);
    }

    public void b0(int i11, int i12, boolean z11) {
        if (i11 <= i12) {
            String[] strArr = this.f47503k3;
            if (strArr == null) {
                throw new IllegalArgumentException("mDisplayedValues should not be null, you need to set mDisplayedValues first.");
            }
            if (i11 >= 0) {
                boolean z12 = true;
                if (i11 > strArr.length - 1) {
                    throw new IllegalArgumentException("minShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f47503k3.length - 1) + " minShowIndex is " + i11);
                } else if (i12 >= 0) {
                    if (i12 <= strArr.length - 1) {
                        this.f47526x = i11;
                        this.f47530y = i12;
                        if (z11) {
                            this.G = i11 + 0;
                            if (!this.f47527x1 || !this.V1) {
                                z12 = false;
                            }
                            u(0, z12);
                            postInvalidate();
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("maxShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f47503k3.length - 1) + " maxShowIndex is " + i12);
                } else {
                    throw new IllegalArgumentException("maxShowIndex should not be less than 0, now maxShowIndex is " + i12);
                }
            }
            throw new IllegalArgumentException("minShowIndex should not be less than 0, now minShowIndex is " + i11);
        }
        throw new IllegalArgumentException("minShowIndex should be less than maxShowIndex, minShowIndex is " + i11 + ", maxShowIndex is " + i12 + ".");
    }

    public void c0(int i11, int i12, boolean z11) {
        int i13;
        boolean z12 = true;
        int U = U(i11, this.f47534z, this.A, this.f47527x1 && this.V1);
        int i14 = this.f47534z;
        int i15 = this.A;
        if (!this.f47527x1 || !this.V1) {
            z12 = false;
        }
        int U2 = U(i12, i14, i15, z12);
        if (this.f47527x1 && this.V1) {
            i13 = U2 - U;
            int oneRecycleSize = getOneRecycleSize() / 2;
            if (i13 < (-oneRecycleSize) || oneRecycleSize < i13) {
                int oneRecycleSize2 = getOneRecycleSize();
                i13 = i13 > 0 ? i13 - oneRecycleSize2 : i13 + oneRecycleSize2;
            }
        } else {
            i13 = U2 - U;
        }
        setValue(U);
        if (U == U2) {
            return;
        }
        Z(i13, z11);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.G3 != 0 && this.f47528x2.computeScrollOffset()) {
            this.M3 = this.f47528x2.getCurrY();
            q();
            postInvalidate();
        }
    }

    public void f0() {
        Scroller scroller = this.f47528x2;
        if (scroller == null || scroller.isFinished()) {
            return;
        }
        Scroller scroller2 = this.f47528x2;
        scroller2.startScroll(0, scroller2.getCurrY(), 0, 0, 1);
        this.f47528x2.abortAnimation();
        postInvalidate();
    }

    public String getContentByCurrValue() {
        return this.f47503k3[getValue() - this.f47534z];
    }

    public String[] getDisplayedValues() {
        return this.f47503k3;
    }

    public int getMaxValue() {
        return this.A;
    }

    public int getMinValue() {
        return this.f47534z;
    }

    public int getOneRecycleSize() {
        return (this.f47530y - this.f47526x) + 1;
    }

    public int getPickedIndexRelativeToRaw() {
        int i11 = this.L3;
        if (i11 != 0) {
            int i12 = this.G3;
            if (i11 < (-i12) / 2) {
                return H(this.M3 + i12 + i11);
            }
            return H(this.M3 + i11);
        }
        return H(this.M3);
    }

    public int getRawContentSize() {
        String[] strArr = this.f47503k3;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    public int getValue() {
        return getPickedIndexRelativeToRaw() + this.f47534z;
    }

    public boolean getWrapSelectorWheel() {
        return this.f47527x1;
    }

    public boolean getWrapSelectorWheelAbsolutely() {
        return this.f47527x1 && this.V1;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        HandlerThread handlerThread = this.f47509n3;
        if (handlerThread == null || !handlerThread.isAlive()) {
            L();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47509n3.quit();
        if (this.G3 == 0) {
            return;
        }
        if (!this.f47528x2.isFinished()) {
            this.f47528x2.abortAnimation();
            this.M3 = this.f47528x2.getCurrY();
            q();
            int i11 = this.L3;
            if (i11 != 0) {
                int i12 = this.G3;
                if (i11 < (-i12) / 2) {
                    this.M3 = this.M3 + i12 + i11;
                } else {
                    this.M3 += i11;
                }
                q();
            }
            T(0);
        }
        int H = H(this.M3);
        int i13 = this.G;
        if (H != i13 && this.f47496g2) {
            try {
                d dVar = this.f47519s3;
                if (dVar != null) {
                    int i14 = this.f47534z;
                    dVar.a(this, i13 + i14, i14 + H);
                }
                f fVar = this.f47518r3;
                if (fVar != null) {
                    fVar.a(this, this.G, H, this.f47503k3);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        this.G = H;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        w(canvas);
        y(canvas);
        x(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        k0(false);
        setMeasuredDimension(S(i11), R(i12));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        int i15;
        super.onSizeChanged(i11, i12, i13, i14);
        this.E3 = i11;
        this.F3 = i12;
        this.G3 = i12 / this.f47516q;
        this.J3 = ((i11 + getPaddingLeft()) - getPaddingRight()) / 2.0f;
        boolean z11 = false;
        if (getOneRecycleSize() > 1) {
            if (this.Q1) {
                i15 = getValue() - this.f47534z;
            } else if (this.f47531y1) {
                i15 = this.K3 + ((this.f47516q - 1) / 2);
            }
            if (this.f47527x1 && this.V1) {
                z11 = true;
            }
            u(i15, z11);
            i0();
            m0();
            h0();
            this.Q1 = true;
        }
        i15 = 0;
        if (this.f47527x1) {
            z11 = true;
        }
        u(i15, z11);
        i0();
        m0();
        h0();
        this.Q1 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (r1 < r3) goto L23;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setContentTextTypeface(Typeface typeface) {
        this.f47499i3.setTypeface(typeface);
    }

    public void setDisplayedValues(String[] strArr) {
        e0();
        f0();
        if (strArr != null) {
            boolean z11 = true;
            if ((this.A - this.f47534z) + 1 <= strArr.length) {
                g0(strArr);
                k0(true);
                this.G = this.f47526x + 0;
                if (!this.f47527x1 || !this.V1) {
                    z11 = false;
                }
                u(0, z11);
                postInvalidate();
                this.f47515p3.sendEmptyMessage(3);
                return;
            }
            throw new IllegalArgumentException("mMaxValue - mMinValue + 1 should not be greater than mDisplayedValues.length, now ((mMaxValue - mMinValue + 1) is " + ((this.A - this.f47534z) + 1) + " newDisplayedValues.length is " + strArr.length + ", you need to set MaxValue and MinValue before setDisplayedValues(String[])");
        }
        throw new IllegalArgumentException("newDisplayedValues should not be null.");
    }

    public void setDividerColor(int i11) {
        if (this.f47506m == i11) {
            return;
        }
        this.f47506m = i11;
        this.Q2.setColor(i11);
        postInvalidate();
    }

    public void setDividerHeight(int i11) {
        if (this.f47508n == i11) {
            return;
        }
        this.f47508n = i11;
        this.Q2.setStrokeWidth(i11);
        postInvalidate();
    }

    public void setFriction(float f11) {
        if (f11 > BitmapDescriptorFactory.HUE_RED) {
            ViewConfiguration.get(getContext());
            this.R = ViewConfiguration.getScrollFriction() / f11;
            return;
        }
        throw new IllegalArgumentException("you should set a a positive float friction, now friction is " + f11);
    }

    public void setHintText(String str) {
        if (P(this.L, str)) {
            return;
        }
        this.L = str;
        this.f47495g1 = F(this.f47501j3.getFontMetrics());
        this.f47494g = G(this.L, this.f47501j3);
        this.f47515p3.sendEmptyMessage(3);
    }

    public void setHintTextColor(int i11) {
        if (this.f47490c == i11) {
            return;
        }
        this.f47490c = i11;
        this.f47501j3.setColor(i11);
        postInvalidate();
    }

    public void setHintTextTypeface(Typeface typeface) {
        this.f47501j3.setTypeface(typeface);
    }

    public void setItemPaddingHorizontal(int i11) {
        this.f47504l = i11;
        postInvalidate();
    }

    public void setMaxValue(int i11) {
        String[] strArr = this.f47503k3;
        Objects.requireNonNull(strArr, "mDisplayedValues should not be null");
        int i12 = this.f47534z;
        if ((i11 - i12) + 1 <= strArr.length) {
            this.A = i11;
            int i13 = this.f47526x;
            int i14 = (i11 - i12) + i13;
            this.f47530y = i14;
            a0(i13, i14);
            m0();
            return;
        }
        throw new IllegalArgumentException("(maxValue - mMinValue + 1) should not be greater than mDisplayedValues.length now  (maxValue - mMinValue + 1) is " + ((i11 - this.f47534z) + 1) + " and mDisplayedValues.length is " + this.f47503k3.length);
    }

    public void setMinValue(int i11) {
        this.f47534z = i11;
        this.f47526x = 0;
        m0();
    }

    public void setNormalTextColor(int i11) {
        if (this.f47486a == i11) {
            return;
        }
        this.f47486a = i11;
        postInvalidate();
    }

    public void setOnScrollListener(c cVar) {
        this.f47521t3 = cVar;
    }

    public void setOnValueChangeListenerInScrolling(e eVar) {
        this.f47522u3 = eVar;
    }

    public void setOnValueChangedListener(d dVar) {
        this.f47519s3 = dVar;
    }

    public void setOnValueChangedListenerRelativeToRaw(f fVar) {
        this.f47518r3 = fVar;
    }

    public void setPickedIndexRelativeToMin(int i11) {
        if (i11 < 0 || i11 >= getOneRecycleSize()) {
            return;
        }
        this.G = this.f47526x + i11;
        u(i11, this.f47527x1 && this.V1);
        postInvalidate();
    }

    public void setPickedIndexRelativeToRaw(int i11) {
        int i12 = this.f47526x;
        if (i12 <= -1 || i12 > i11 || i11 > this.f47530y) {
            return;
        }
        this.G = i11;
        u(i11 - i12, this.f47527x1 && this.V1);
        postInvalidate();
    }

    public void setSelectedTextColor(int i11) {
        if (this.f47487b == i11) {
            return;
        }
        this.f47487b = i11;
        postInvalidate();
    }

    public void setShownCount(int i11) {
        this.f47516q = i11;
    }

    public void setTextAlign(Paint.Align align) {
        this.f47499i3.setTextAlign(align);
    }

    public void setValue(int i11) {
        int i12 = this.f47534z;
        if (i11 >= i12) {
            if (i11 <= this.A) {
                setPickedIndexRelativeToRaw(i11 - i12);
                return;
            }
            throw new IllegalArgumentException("should not set a value greater than mMaxValue, value is " + i11);
        }
        throw new IllegalArgumentException("should not set a value less than mMinValue, value is " + i11);
    }

    public void setWrapSelectorWheel(boolean z11) {
        if (this.f47527x1 != z11) {
            if (!z11) {
                if (this.f47523v3 == 0) {
                    N();
                    return;
                } else {
                    this.f47489b2 = true;
                    return;
                }
            }
            this.f47527x1 = z11;
            o0();
            postInvalidate();
        }
    }
}