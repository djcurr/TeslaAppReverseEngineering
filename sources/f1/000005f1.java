package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q implements Iterable<Intent> {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Intent> f4417a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final Context f4418b;

    /* loaded from: classes.dex */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private q(Context context) {
        this.f4418b = context;
    }

    public static q f(Context context) {
        return new q(context);
    }

    public q b(Intent intent) {
        this.f4417a.add(intent);
        return this;
    }

    public q c(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f4418b.getPackageManager());
        }
        if (component != null) {
            e(component);
        }
        b(intent);
        return this;
    }

    public q d(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = h.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f4418b.getPackageManager());
            }
            e(component);
            b(supportParentActivityIntent);
        }
        return this;
    }

    public q e(ComponentName componentName) {
        int size = this.f4417a.size();
        try {
            Intent b11 = h.b(this.f4418b, componentName);
            while (b11 != null) {
                this.f4417a.add(size, b11);
                b11 = h.b(this.f4418b, b11.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e11);
        }
    }

    public void h() {
        i(null);
    }

    public void i(Bundle bundle) {
        if (!this.f4417a.isEmpty()) {
            ArrayList<Intent> arrayList = this.f4417a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (androidx.core.content.b.startActivities(this.f4418b, intentArr, bundle)) {
                return;
            }
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f4418b.startActivity(intent);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f4417a.iterator();
    }
}