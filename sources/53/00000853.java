package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.u;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a  reason: collision with root package name */
    int f5718a = 0;

    /* renamed from: b  reason: collision with root package name */
    final HashMap<Integer, String> f5719b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    final RemoteCallbackList<t> f5720c = new a();

    /* renamed from: d  reason: collision with root package name */
    private final u.a f5721d = new b();

    /* loaded from: classes.dex */
    class a extends RemoteCallbackList<t> {
        a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a */
        public void onCallbackDied(t tVar, Object obj) {
            MultiInstanceInvalidationService.this.f5719b.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* loaded from: classes.dex */
    class b extends u.a {
        b() {
        }

        @Override // androidx.room.u
        public void H(t tVar, int i11) {
            synchronized (MultiInstanceInvalidationService.this.f5720c) {
                MultiInstanceInvalidationService.this.f5720c.unregister(tVar);
                MultiInstanceInvalidationService.this.f5719b.remove(Integer.valueOf(i11));
            }
        }

        @Override // androidx.room.u
        public void n(int i11, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f5720c) {
                String str = MultiInstanceInvalidationService.this.f5719b.get(Integer.valueOf(i11));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f5720c.beginBroadcast();
                for (int i12 = 0; i12 < beginBroadcast; i12++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.f5720c.getBroadcastCookie(i12)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.f5719b.get(Integer.valueOf(intValue));
                    if (i11 != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.f5720c.getBroadcastItem(i12).b(strArr);
                        } catch (RemoteException e11) {
                            Log.w("ROOM", "Error invoking a remote callback", e11);
                        }
                    }
                }
                MultiInstanceInvalidationService.this.f5720c.finishBroadcast();
            }
        }

        @Override // androidx.room.u
        public int u(t tVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f5720c) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i11 = multiInstanceInvalidationService.f5718a + 1;
                multiInstanceInvalidationService.f5718a = i11;
                if (multiInstanceInvalidationService.f5720c.register(tVar, Integer.valueOf(i11))) {
                    MultiInstanceInvalidationService.this.f5719b.put(Integer.valueOf(i11), str);
                    return i11;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f5718a--;
                return 0;
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f5721d;
    }
}