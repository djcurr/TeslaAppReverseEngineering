package fr.greweb.reactnativeviewshot;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.q0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import expo.modules.imagepicker.ImagePickerConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.zip.Deflater;

/* loaded from: classes5.dex */
public class a implements q0 {

    /* renamed from: l  reason: collision with root package name */
    private static final String f26806l = "a";

    /* renamed from: m  reason: collision with root package name */
    private static byte[] f26807m = new byte[65536];

    /* renamed from: n  reason: collision with root package name */
    private static final Object f26808n = new Object();

    /* renamed from: o  reason: collision with root package name */
    private static final Set<Bitmap> f26809o = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a  reason: collision with root package name */
    private final int f26810a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26811b;
    @InterfaceC0519a

    /* renamed from: c  reason: collision with root package name */
    private final int f26812c;

    /* renamed from: d  reason: collision with root package name */
    private final double f26813d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f26814e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f26815f;

    /* renamed from: g  reason: collision with root package name */
    private final File f26816g;

    /* renamed from: h  reason: collision with root package name */
    private final String f26817h;

    /* renamed from: i  reason: collision with root package name */
    private final Promise f26818i;

    /* renamed from: j  reason: collision with root package name */
    private final Boolean f26819j;

    /* renamed from: k  reason: collision with root package name */
    private final Activity f26820k;

    /* renamed from: fr.greweb.reactnativeviewshot.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public @interface InterfaceC0519a {

        /* renamed from: c  reason: collision with root package name */
        public static final Bitmap.CompressFormat[] f26821c = {Bitmap.CompressFormat.JPEG, Bitmap.CompressFormat.PNG, Bitmap.CompressFormat.WEBP};
    }

    /* loaded from: classes5.dex */
    public static class b extends ByteArrayOutputStream {
        public b(byte[] bArr) {
            super(0);
            ((ByteArrayOutputStream) this).buf = bArr;
        }

        protected static int j(int i11) {
            if (i11 >= 0) {
                return i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            throw new OutOfMemoryError();
        }

        public ByteBuffer a(int i11) {
            if (((ByteArrayOutputStream) this).buf.length < i11) {
                g(i11);
            }
            return ByteBuffer.wrap(((ByteArrayOutputStream) this).buf);
        }

        protected void g(int i11) {
            int length = ((ByteArrayOutputStream) this).buf.length << 1;
            if (length - i11 < 0) {
                length = i11;
            }
            if (length - 2147483639 > 0) {
                length = j(i11);
            }
            ((ByteArrayOutputStream) this).buf = Arrays.copyOf(((ByteArrayOutputStream) this).buf, length);
        }

        public byte[] l() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public void m(int i11) {
            ((ByteArrayOutputStream) this).count = i11;
        }
    }

    public a(int i11, String str, @InterfaceC0519a int i12, double d11, Integer num, Integer num2, File file, String str2, Boolean bool, ReactApplicationContext reactApplicationContext, Activity activity, Promise promise) {
        this.f26810a = i11;
        this.f26811b = str;
        this.f26812c = i12;
        this.f26813d = d11;
        this.f26814e = num;
        this.f26815f = num2;
        this.f26816g = file;
        this.f26817h = str2;
        this.f26819j = bool;
        this.f26820k = activity;
        this.f26818i = promise;
    }

    private Matrix a(Canvas canvas, View view, View view2) {
        Matrix matrix = new Matrix();
        LinkedList linkedList = new LinkedList();
        View view3 = view2;
        do {
            linkedList.add(view3);
            view3 = (View) view3.getParent();
        } while (view3 != view);
        Collections.reverse(linkedList);
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            View view4 = (View) it2.next();
            canvas.save();
            int i11 = 0;
            float left = view4.getLeft() + (view4 != view2 ? view4.getPaddingLeft() : 0) + view4.getTranslationX();
            int top = view4.getTop();
            if (view4 != view2) {
                i11 = view4.getPaddingTop();
            }
            float translationY = top + i11 + view4.getTranslationY();
            canvas.translate(left, translationY);
            canvas.rotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            canvas.scale(view4.getScaleX(), view4.getScaleY());
            matrix.postTranslate(left, translationY);
            matrix.postRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            matrix.postScale(view4.getScaleX(), view4.getScaleY());
        }
        return matrix;
    }

    private Point b(View view, OutputStream outputStream) {
        try {
            dx.a.d(f26806l, dx.a.b(this.f26820k));
            return c(view, outputStream);
        } finally {
            outputStream.close();
        }
    }

    private Point c(View view, OutputStream outputStream) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (width > 0 && height > 0) {
            if (this.f26819j.booleanValue()) {
                ScrollView scrollView = (ScrollView) view;
                int i11 = 0;
                for (int i12 = 0; i12 < scrollView.getChildCount(); i12++) {
                    i11 += scrollView.getChildAt(i12).getHeight();
                }
                height = i11;
            }
            Point point = new Point(width, height);
            Bitmap f11 = f(width, height);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            paint.setDither(true);
            Canvas canvas = new Canvas(f11);
            view.draw(canvas);
            for (View view2 : e(view)) {
                if ((view2 instanceof TextureView) && view2.getVisibility() == 0) {
                    TextureView textureView = (TextureView) view2;
                    textureView.setOpaque(false);
                    Bitmap bitmap = textureView.getBitmap(g(view2.getWidth(), view2.getHeight()));
                    int save = canvas.save();
                    a(canvas, view, view2);
                    canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
                    canvas.restoreToCount(save);
                    i(bitmap);
                }
            }
            Integer num = this.f26814e;
            if (num != null && this.f26815f != null && (num.intValue() != width || this.f26815f.intValue() != height)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(f11, this.f26814e.intValue(), this.f26815f.intValue(), true);
                i(f11);
                f11 = createScaledBitmap;
            }
            int i13 = this.f26812c;
            if (-1 == i13 && (outputStream instanceof b)) {
                int i14 = width * height * 4;
                b bVar = (b) d(outputStream);
                f11.copyPixelsToBuffer(bVar.a(i14));
                bVar.m(i14);
            } else {
                f11.compress(InterfaceC0519a.f26821c[i13], (int) (this.f26813d * 100.0d), outputStream);
            }
            i(f11);
            return point;
        }
        throw new RuntimeException("Impossible to snapshot the view: view is invalid");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends A, A> T d(A a11) {
        return a11;
    }

    private List<View> e(View view) {
        if (!(view instanceof ViewGroup)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            arrayList2.addAll(e(viewGroup.getChildAt(i11)));
        }
        return arrayList2;
    }

    private static Bitmap f(int i11, int i12) {
        synchronized (f26808n) {
            for (Bitmap bitmap : f26809o) {
                if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
                    f26809o.remove(bitmap);
                    bitmap.eraseColor(0);
                    return bitmap;
                }
            }
            return Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        }
    }

    private static Bitmap g(int i11, int i12) {
        synchronized (f26808n) {
            for (Bitmap bitmap : f26809o) {
                if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
                    f26809o.remove(bitmap);
                    bitmap.eraseColor(0);
                    return bitmap;
                }
            }
            return Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        }
    }

    private static int h(View view) {
        return Math.min(view.getWidth() * view.getHeight() * 4, 32);
    }

    private static void i(Bitmap bitmap) {
        synchronized (f26808n) {
            f26809o.add(bitmap);
        }
    }

    private void j(View view) {
        String str;
        boolean z11 = -1 == this.f26812c;
        boolean equals = "zip-base64".equals(this.f26817h);
        b bVar = new b(f26807m);
        Point b11 = b(view, bVar);
        f26807m = bVar.l();
        int size = bVar.size();
        String format = String.format(Locale.US, "%d:%d|", Integer.valueOf(b11.x), Integer.valueOf(b11.y));
        if (!z11) {
            format = "";
        }
        if (equals) {
            Deflater deflater = new Deflater();
            deflater.setInput(f26807m, 0, size);
            deflater.finish();
            b bVar2 = new b(new byte[32]);
            byte[] bArr = new byte[1024];
            while (!deflater.finished()) {
                bVar2.write(bArr, 0, deflater.deflate(bArr));
            }
            str = format + Base64.encodeToString(bVar2.l(), 0, bVar2.size(), 2);
        } else {
            str = format + Base64.encodeToString(f26807m, 0, size, 2);
        }
        this.f26818i.resolve(str);
    }

    private void k(View view) {
        b bVar = new b(f26807m);
        b(view, bVar);
        f26807m = bVar.l();
        String encodeToString = Base64.encodeToString(f26807m, 0, bVar.size(), 2);
        String str = "jpg".equals(this.f26811b) ? "jpeg" : this.f26811b;
        Promise promise = this.f26818i;
        promise.resolve("data:image/" + str + ";base64," + encodeToString);
    }

    private void l(View view) {
        String uri = Uri.fromFile(this.f26816g).toString();
        FileOutputStream fileOutputStream = new FileOutputStream(this.f26816g);
        b bVar = new b(f26807m);
        Point b11 = b(view, bVar);
        f26807m = bVar.l();
        int size = bVar.size();
        fileOutputStream.write(String.format(Locale.US, "%d:%d|", Integer.valueOf(b11.x), Integer.valueOf(b11.y)).getBytes(Charset.forName("US-ASCII")));
        fileOutputStream.write(f26807m, 0, size);
        fileOutputStream.close();
        this.f26818i.resolve(uri);
    }

    private void m(View view) {
        b(view, new FileOutputStream(this.f26816g));
        this.f26818i.resolve(Uri.fromFile(this.f26816g).toString());
    }

    @Override // com.facebook.react.uimanager.q0
    public void execute(m mVar) {
        View resolveView;
        int i11 = this.f26810a;
        if (i11 == -1) {
            resolveView = this.f26820k.getWindow().getDecorView().findViewById(16908290);
        } else {
            resolveView = mVar.resolveView(i11);
        }
        if (resolveView == null) {
            String str = f26806l;
            Log.e(str, "No view found with reactTag: " + this.f26810a, new AssertionError());
            Promise promise = this.f26818i;
            promise.reject("E_UNABLE_TO_SNAPSHOT", "No view found with reactTag: " + this.f26810a);
            return;
        }
        try {
            b bVar = new b(f26807m);
            bVar.m(h(resolveView));
            f26807m = bVar.l();
            if ("tmpfile".equals(this.f26817h) && -1 == this.f26812c) {
                l(resolveView);
            } else if ("tmpfile".equals(this.f26817h) && -1 != this.f26812c) {
                m(resolveView);
            } else {
                if (!ImagePickerConstants.OPTION_BASE64.equals(this.f26817h) && !"zip-base64".equals(this.f26817h)) {
                    if ("data-uri".equals(this.f26817h)) {
                        k(resolveView);
                    }
                }
                j(resolveView);
            }
        } catch (Throwable th2) {
            Log.e(f26806l, "Failed to capture view snapshot", th2);
            this.f26818i.reject("E_UNABLE_TO_SNAPSHOT", "Failed to capture view snapshot");
        }
    }
}