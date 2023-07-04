package hv;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.tesla.logging.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class c implements SensorEventListener {

    /* renamed from: c  reason: collision with root package name */
    private static final g f29430c;

    /* renamed from: a  reason: collision with root package name */
    private b f29431a;

    /* renamed from: b  reason: collision with root package name */
    private Integer f29432b;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a(e eVar);
    }

    static {
        new a(null);
        f29430c = g.f21878b.a("MotionEventManager");
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i11) {
        Integer num = this.f29432b;
        this.f29432b = Integer.valueOf(i11);
        if (num != null && num.intValue() == i11) {
            return;
        }
        g gVar = f29430c;
        gVar.i("onAccuracyChanged: " + num + " -> " + i11);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        b bVar;
        if (sensorEvent == null || sensorEvent.sensor.getType() != 10 || (bVar = this.f29431a) == null) {
            return;
        }
        float[] fArr = sensorEvent.values;
        s.f(fArr, "event.values");
        bVar.a(new e(fArr));
    }
}