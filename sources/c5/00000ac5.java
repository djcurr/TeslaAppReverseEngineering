package atd.m;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import atd.i.c;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private Location f6902a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class b extends atd.i.d {
        private b(g gVar) {
        }

        @Override // atd.i.d
        protected List<String> b() {
            return Collections.singletonList(atd.s0.a.a(-72678100494912L));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c implements f {
        c() {
        }

        @Override // atd.m.g.f
        public Location a(Context context) {
            try {
                return (Location) Tasks.await(LocationServices.getFusedLocationProviderClient(context).getLastLocation(), 500L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                atd.s0.a.a(-72875668990528L);
                return null;
            } catch (NoClassDefFoundError unused2) {
                return null;
            } catch (ExecutionException unused3) {
                atd.s0.a.a(-72235718863424L);
                return null;
            } catch (TimeoutException unused4) {
                atd.s0.a.a(-72519186704960L);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d implements f {
        d() {
        }

        @Override // atd.m.g.f
        public Location a(Context context) {
            LocationManager locationManager = (LocationManager) context.getSystemService(atd.s0.a.a(-72420402457152L));
            if (locationManager != null) {
                return locationManager.getLastKnownLocation(atd.s0.a.a(-71625833507392L));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class e extends b {
        e() {
            super();
        }

        @Override // atd.i.b
        public String a() {
            return atd.s0.a.a(-71643013376576L);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // atd.i.d
        /* renamed from: d */
        public Double c(Context context) {
            return Double.valueOf(g.this.a(context).getLatitude());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface f {
        Location a(Context context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: atd.m.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0124g extends b {
        C0124g() {
            super();
        }

        @Override // atd.i.b
        public String a() {
            return atd.s0.a.a(-71690258016832L);
        }

        @Override // atd.i.d
        /* renamed from: d */
        public Double c(Context context) {
            return Double.valueOf(g.this.a(context).getLongitude());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h implements f {
        h() {
        }

        @Override // atd.m.g.f
        public Location a(Context context) {
            LocationManager locationManager = (LocationManager) context.getSystemService(atd.s0.a.a(-71703142918720L));
            if (locationManager != null) {
                return locationManager.getLastKnownLocation(atd.s0.a.a(-71733207689792L));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class i implements f {
        i() {
        }

        @Override // atd.m.g.f
        public Location a(Context context) {
            LocationManager locationManager = (LocationManager) context.getSystemService(atd.s0.a.a(-71492689521216L));
            if (locationManager != null) {
                return locationManager.getLastKnownLocation(atd.s0.a.a(-71522754292288L));
            }
            return null;
        }
    }

    private List<f> b() {
        return Arrays.asList(new c(), new d(), new h(), new i());
    }

    public Collection<? extends atd.i.b> a() {
        return Arrays.asList(new e(), new C0124g());
    }

    synchronized Location a(Context context) {
        Location location = this.f6902a;
        if (location != null) {
            return location;
        }
        for (f fVar : b()) {
            Location a11 = fVar.a(context);
            this.f6902a = a11;
            if (a11 != null) {
                return a11;
            }
        }
        throw new atd.i.c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
    }
}