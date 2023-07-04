package h80;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.vision.face.Face;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import g80.b;
import java.io.File;
import java.io.IOException;

/* loaded from: classes5.dex */
public class a extends AsyncTask<Void, Void, SparseArray<Face>> {

    /* renamed from: a  reason: collision with root package name */
    private String f28995a;

    /* renamed from: b  reason: collision with root package name */
    private String f28996b;

    /* renamed from: c  reason: collision with root package name */
    private Promise f28997c;

    /* renamed from: f  reason: collision with root package name */
    private Context f29000f;

    /* renamed from: g  reason: collision with root package name */
    private ReadableMap f29001g;

    /* renamed from: i  reason: collision with root package name */
    private b f29003i;

    /* renamed from: d  reason: collision with root package name */
    private int f28998d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f28999e = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f29002h = 0;

    public a(Context context, ReadableMap readableMap, Promise promise) {
        this.f28995a = readableMap.getString("uri");
        this.f28997c = promise;
        this.f29001g = readableMap;
        this.f29000f = context;
    }

    private static b a(ReadableMap readableMap, Context context) {
        b bVar = new b(context);
        bVar.i(false);
        if (readableMap.hasKey("mode")) {
            bVar.h(readableMap.getInt("mode"));
        }
        if (readableMap.hasKey("runClassifications")) {
            bVar.f(readableMap.getInt("runClassifications"));
        }
        if (readableMap.hasKey("detectLandmarks")) {
            bVar.g(readableMap.getInt("detectLandmarks"));
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b */
    public SparseArray<Face> doInBackground(Void... voidArr) {
        if (isCancelled()) {
            return null;
        }
        this.f29003i = a(this.f29001g, this.f29000f);
        Bitmap decodeFile = BitmapFactory.decodeFile(this.f28996b);
        this.f28998d = decodeFile.getWidth();
        this.f28999e = decodeFile.getHeight();
        try {
            this.f29002h = new androidx.exifinterface.media.a(this.f28996b).i("Orientation", 0);
        } catch (IOException e11) {
            Log.e("E_FACE_DETECTION_FAILED", "Reading orientation from file `" + this.f28996b + "` failed.", e11);
        }
        return this.f29003i.b(i80.b.a(decodeFile));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: c */
    public void onPostExecute(SparseArray<Face> sparseArray) {
        super.onPostExecute(sparseArray);
        WritableMap createMap = Arguments.createMap();
        WritableArray createArray = Arguments.createArray();
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            WritableMap f11 = g80.a.f(sparseArray.valueAt(i11));
            f11.putDouble("yawAngle", ((-f11.getDouble("yawAngle")) + 360.0d) % 360.0d);
            f11.putDouble("rollAngle", ((-f11.getDouble("rollAngle")) + 360.0d) % 360.0d);
            createArray.pushMap(f11);
        }
        createMap.putArray("faces", createArray);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt(Snapshot.WIDTH, this.f28998d);
        createMap2.putInt(Snapshot.HEIGHT, this.f28999e);
        createMap2.putInt("orientation", this.f29002h);
        createMap2.putString("uri", this.f28995a);
        createMap.putMap("image", createMap2);
        this.f29003i.d();
        this.f28997c.resolve(createMap);
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        String str = this.f28995a;
        if (str == null) {
            this.f28997c.reject("E_FACE_DETECTION_FAILED", "You have to provide an URI of an image.");
            cancel(true);
            return;
        }
        String path = Uri.parse(str).getPath();
        this.f28996b = path;
        if (path == null) {
            Promise promise = this.f28997c;
            promise.reject("E_FACE_DETECTION_FAILED", "Invalid URI provided: `" + this.f28995a + "`.");
            cancel(true);
            return;
        }
        if (!(path.startsWith(this.f29000f.getCacheDir().getPath()) || this.f28996b.startsWith(this.f29000f.getFilesDir().getPath()))) {
            this.f28997c.reject("E_FACE_DETECTION_FAILED", "The image has to be in the local app's directories.");
            cancel(true);
        } else if (new File(this.f28996b).exists()) {
        } else {
            Promise promise2 = this.f28997c;
            promise2.reject("E_FACE_DETECTION_FAILED", "The file does not exist. Given path: `" + this.f28996b + "`.");
            cancel(true);
        }
    }
}