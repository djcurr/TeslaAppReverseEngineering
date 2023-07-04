package yf;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class d implements SensorEventListener {

    /* renamed from: j  reason: collision with root package name */
    private static final long f59483j;

    /* renamed from: k  reason: collision with root package name */
    private static final float f59484k;

    /* renamed from: a  reason: collision with root package name */
    private float f59485a;

    /* renamed from: b  reason: collision with root package name */
    private float f59486b;

    /* renamed from: c  reason: collision with root package name */
    private float f59487c;

    /* renamed from: d  reason: collision with root package name */
    private final a f59488d;

    /* renamed from: e  reason: collision with root package name */
    private SensorManager f59489e;

    /* renamed from: f  reason: collision with root package name */
    private long f59490f;

    /* renamed from: g  reason: collision with root package name */
    private int f59491g;

    /* renamed from: h  reason: collision with root package name */
    private long f59492h;

    /* renamed from: i  reason: collision with root package name */
    private int f59493i;

    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    static {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        f59483j = timeUnit.convert(20L, TimeUnit.MILLISECONDS);
        f59484k = (float) timeUnit.convert(3L, TimeUnit.SECONDS);
    }

    public d(a aVar) {
        this(aVar, 1);
    }

    private boolean a(float f11) {
        return Math.abs(f11) > 13.042845f;
    }

    private void b(long j11) {
        if (this.f59491g >= this.f59493i * 8) {
            d();
            this.f59488d.a();
        }
        if (((float) (j11 - this.f59492h)) > f59484k) {
            d();
        }
    }

    private void c(long j11) {
        this.f59492h = j11;
        this.f59491g++;
    }

    private void d() {
        this.f59491g = 0;
        this.f59485a = BitmapDescriptorFactory.HUE_RED;
        this.f59486b = BitmapDescriptorFactory.HUE_RED;
        this.f59487c = BitmapDescriptorFactory.HUE_RED;
    }

    public void e(SensorManager sensorManager) {
        wf.a.c(sensorManager);
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        if (defaultSensor != null) {
            this.f59489e = sensorManager;
            this.f59490f = -1L;
            sensorManager.registerListener(this, defaultSensor, 2);
            this.f59492h = 0L;
            d();
        }
    }

    public void f() {
        SensorManager sensorManager = this.f59489e;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f59489e = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i11) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long j11 = sensorEvent.timestamp;
        if (j11 - this.f59490f < f59483j) {
            return;
        }
        float[] fArr = sensorEvent.values;
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[2] - 9.80665f;
        this.f59490f = j11;
        if (a(f11) && this.f59485a * f11 <= BitmapDescriptorFactory.HUE_RED) {
            c(sensorEvent.timestamp);
            this.f59485a = f11;
        } else if (a(f12) && this.f59486b * f12 <= BitmapDescriptorFactory.HUE_RED) {
            c(sensorEvent.timestamp);
            this.f59486b = f12;
        } else if (a(f13) && this.f59487c * f13 <= BitmapDescriptorFactory.HUE_RED) {
            c(sensorEvent.timestamp);
            this.f59487c = f13;
        }
        b(sensorEvent.timestamp);
    }

    public d(a aVar, int i11) {
        this.f59488d = aVar;
        this.f59493i = i11;
    }
}