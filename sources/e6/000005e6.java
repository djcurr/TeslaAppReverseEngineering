package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.j;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.List;
import org.spongycastle.i18n.MessageBundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f4381a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static Field f4382b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f4383c;

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i11 = 0; i11 < size; i11++) {
            Bundle bundle = list.get(i11);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i11, bundle);
            }
        }
        return sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle b(j.a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat e11 = aVar.e();
        bundle2.putInt("icon", e11 != null ? e11.e() : 0);
        bundle2.putCharSequence(MessageBundle.TITLE_ENTRY, aVar.i());
        bundle2.putParcelable("actionIntent", aVar.a());
        if (aVar.d() != null) {
            bundle = new Bundle(aVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", e(aVar.f()));
        bundle2.putBoolean("showsUserInterface", aVar.h());
        bundle2.putInt("semanticAction", aVar.g());
        return bundle2;
    }

    public static Bundle c(Notification notification) {
        synchronized (f4381a) {
            if (f4383c) {
                return null;
            }
            try {
                if (f4382b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f4383c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f4382b = declaredField;
                }
                Bundle bundle = (Bundle) f4382b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f4382b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e11) {
                Log.e("NotificationCompat", "Unable to access notification extras", e11);
                f4383c = true;
                return null;
            } catch (NoSuchFieldException e12) {
                Log.e("NotificationCompat", "Unable to access notification extras", e12);
                f4383c = true;
                return null;
            }
        }
    }

    private static Bundle d(o oVar) {
        new Bundle();
        throw null;
    }

    private static Bundle[] e(o[] oVarArr) {
        if (oVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[oVarArr.length];
        for (int i11 = 0; i11 < oVarArr.length; i11++) {
            bundleArr[i11] = d(oVarArr[i11]);
        }
        return bundleArr;
    }

    public static Bundle f(Notification.Builder builder, j.a aVar) {
        IconCompat e11 = aVar.e();
        builder.addAction(e11 != null ? e11.e() : 0, aVar.i(), aVar.a());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", e(aVar.f()));
        }
        if (aVar.c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", e(aVar.c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        return bundle;
    }
}