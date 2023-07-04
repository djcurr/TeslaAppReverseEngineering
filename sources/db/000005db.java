package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class j {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Bundle f4326a;

        /* renamed from: b */
        private IconCompat f4327b;

        /* renamed from: c */
        private final o[] f4328c;

        /* renamed from: d */
        private final o[] f4329d;

        /* renamed from: e */
        private boolean f4330e;

        /* renamed from: f */
        boolean f4331f;

        /* renamed from: g */
        private final int f4332g;

        /* renamed from: h */
        private final boolean f4333h;
        @Deprecated

        /* renamed from: i */
        public int f4334i;

        /* renamed from: j */
        public CharSequence f4335j;

        /* renamed from: k */
        public PendingIntent f4336k;

        public a(int i11, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i11 != 0 ? IconCompat.c(null, "", i11) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f4336k;
        }

        public boolean b() {
            return this.f4330e;
        }

        public o[] c() {
            return this.f4329d;
        }

        public Bundle d() {
            return this.f4326a;
        }

        public IconCompat e() {
            int i11;
            if (this.f4327b == null && (i11 = this.f4334i) != 0) {
                this.f4327b = IconCompat.c(null, "", i11);
            }
            return this.f4327b;
        }

        public o[] f() {
            return this.f4328c;
        }

        public int g() {
            return this.f4332g;
        }

        public boolean h() {
            return this.f4331f;
        }

        public CharSequence i() {
            return this.f4335j;
        }

        public boolean j() {
            return this.f4333h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, o[] oVarArr, o[] oVarArr2, boolean z11, int i11, boolean z12, boolean z13) {
            this.f4331f = true;
            this.f4327b = iconCompat;
            if (iconCompat != null && iconCompat.i() == 2) {
                this.f4334i = iconCompat.e();
            }
            this.f4335j = e.d(charSequence);
            this.f4336k = pendingIntent;
            this.f4326a = bundle == null ? new Bundle() : bundle;
            this.f4328c = oVarArr;
            this.f4329d = oVarArr2;
            this.f4330e = z11;
            this.f4332g = i11;
            this.f4331f = z12;
            this.f4333h = z13;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends f {

        /* renamed from: e */
        private Bitmap f4337e;

        /* renamed from: f */
        private IconCompat f4338f;

        /* renamed from: g */
        private boolean f4339g;

        /* renamed from: h */
        private boolean f4340h;

        /* loaded from: classes.dex */
        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.j$b$b */
        /* loaded from: classes.dex */
        private static class C0072b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* loaded from: classes.dex */
        private static class c {
            static void a(Notification.BigPictureStyle bigPictureStyle, boolean z11) {
                bigPictureStyle.showBigPictureWhenCollapsed(z11);
            }
        }

        @Override // androidx.core.app.j.f
        public void b(i iVar) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(iVar.a()).setBigContentTitle(this.f4369b).bigPicture(this.f4337e);
                if (this.f4339g) {
                    IconCompat iconCompat = this.f4338f;
                    if (iconCompat == null) {
                        a.a(bigPicture, null);
                    } else if (i11 >= 23) {
                        C0072b.a(bigPicture, this.f4338f.q(iVar instanceof k ? ((k) iVar).f() : null));
                    } else if (iconCompat.i() == 1) {
                        a.a(bigPicture, this.f4338f.d());
                    } else {
                        a.a(bigPicture, null);
                    }
                }
                if (this.f4371d) {
                    a.b(bigPicture, this.f4370c);
                }
                if (i11 >= 31) {
                    c.a(bigPicture, this.f4340h);
                }
            }
        }

        @Override // androidx.core.app.j.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f4338f = bitmap == null ? null : IconCompat.b(bitmap);
            this.f4339g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f4337e = bitmap;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e */
        private CharSequence f4341e;

        @Override // androidx.core.app.j.f
        public void a(Bundle bundle) {
            super.a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f4341e);
            }
        }

        @Override // androidx.core.app.j.f
        public void b(i iVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(iVar.a()).setBigContentTitle(this.f4369b).bigText(this.f4341e);
                if (this.f4371d) {
                    bigText.setSummaryText(this.f4370c);
                }
            }
        }

        @Override // androidx.core.app.j.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f4341e = e.d(charSequence);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a */
        protected e f4368a;

        /* renamed from: b */
        CharSequence f4369b;

        /* renamed from: c */
        CharSequence f4370c;

        /* renamed from: d */
        boolean f4371d = false;

        public void a(Bundle bundle) {
            if (this.f4371d) {
                bundle.putCharSequence("android.summaryText", this.f4370c);
            }
            CharSequence charSequence = this.f4369b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c11 = c();
            if (c11 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c11);
            }
        }

        public abstract void b(i iVar);

        protected abstract String c();

        public RemoteViews d(i iVar) {
            return null;
        }

        public RemoteViews e(i iVar) {
            return null;
        }

        public RemoteViews f(i iVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f4368a != eVar) {
                this.f4368a = eVar;
                if (eVar != null) {
                    eVar.C(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 19) {
            return notification.extras;
        }
        if (i11 >= 16) {
            return l.c(notification);
        }
        return null;
    }

    /* loaded from: classes.dex */
    public static class e {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        long N;
        int O;
        int P;
        boolean Q;
        d R;
        Notification S;
        boolean T;
        Icon U;
        @Deprecated
        public ArrayList<String> V;

        /* renamed from: a */
        public Context f4342a;

        /* renamed from: b */
        public ArrayList<a> f4343b;

        /* renamed from: c */
        public ArrayList<n> f4344c;

        /* renamed from: d */
        ArrayList<a> f4345d;

        /* renamed from: e */
        CharSequence f4346e;

        /* renamed from: f */
        CharSequence f4347f;

        /* renamed from: g */
        PendingIntent f4348g;

        /* renamed from: h */
        PendingIntent f4349h;

        /* renamed from: i */
        RemoteViews f4350i;

        /* renamed from: j */
        Bitmap f4351j;

        /* renamed from: k */
        CharSequence f4352k;

        /* renamed from: l */
        int f4353l;

        /* renamed from: m */
        int f4354m;

        /* renamed from: n */
        boolean f4355n;

        /* renamed from: o */
        boolean f4356o;

        /* renamed from: p */
        f f4357p;

        /* renamed from: q */
        CharSequence f4358q;

        /* renamed from: r */
        CharSequence f4359r;

        /* renamed from: s */
        CharSequence[] f4360s;

        /* renamed from: t */
        int f4361t;

        /* renamed from: u */
        int f4362u;

        /* renamed from: v */
        boolean f4363v;

        /* renamed from: w */
        String f4364w;

        /* renamed from: x */
        boolean f4365x;

        /* renamed from: y */
        String f4366y;

        /* renamed from: z */
        boolean f4367z;

        public e(Context context, String str) {
            this.f4343b = new ArrayList<>();
            this.f4344c = new ArrayList<>();
            this.f4345d = new ArrayList<>();
            this.f4355n = true;
            this.f4367z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.S = notification;
            this.f4342a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.S.audioStreamType = -1;
            this.f4354m = 0;
            this.V = new ArrayList<>();
            this.Q = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap e(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f4342a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(j3.b.f33151b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(j3.b.f33150a);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
            return bitmap;
        }

        private void p(int i11, boolean z11) {
            if (z11) {
                Notification notification = this.S;
                notification.flags = i11 | notification.flags;
                return;
            }
            Notification notification2 = this.S;
            notification2.flags = (~i11) & notification2.flags;
        }

        public e A(int i11) {
            this.S.icon = i11;
            return this;
        }

        public e B(Uri uri) {
            Notification notification = this.S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public e C(f fVar) {
            if (this.f4357p != fVar) {
                this.f4357p = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        public e D(CharSequence charSequence) {
            this.S.tickerText = d(charSequence);
            return this;
        }

        public e E(long[] jArr) {
            this.S.vibrate = jArr;
            return this;
        }

        public e F(int i11) {
            this.F = i11;
            return this;
        }

        public e G(long j11) {
            this.S.when = j11;
            return this;
        }

        public e a(int i11, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f4343b.add(new a(i11, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new k(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public e f(boolean z11) {
            p(16, z11);
            return this;
        }

        public e g(String str) {
            this.C = str;
            return this;
        }

        public e h(String str) {
            this.K = str;
            return this;
        }

        public e i(int i11) {
            this.E = i11;
            return this;
        }

        public e j(CharSequence charSequence) {
            this.f4352k = d(charSequence);
            return this;
        }

        public e k(PendingIntent pendingIntent) {
            this.f4348g = pendingIntent;
            return this;
        }

        public e l(CharSequence charSequence) {
            this.f4347f = d(charSequence);
            return this;
        }

        public e m(CharSequence charSequence) {
            this.f4346e = d(charSequence);
            return this;
        }

        public e n(int i11) {
            Notification notification = this.S;
            notification.defaults = i11;
            if ((i11 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e o(PendingIntent pendingIntent) {
            this.S.deleteIntent = pendingIntent;
            return this;
        }

        public e q(String str) {
            this.f4364w = str;
            return this;
        }

        public e r(Bitmap bitmap) {
            this.f4351j = e(bitmap);
            return this;
        }

        public e s(int i11, int i12, int i13) {
            Notification notification = this.S;
            notification.ledARGB = i11;
            notification.ledOnMS = i12;
            notification.ledOffMS = i13;
            notification.flags = ((i12 == 0 || i13 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e t(boolean z11) {
            this.f4367z = z11;
            return this;
        }

        public e u(int i11) {
            this.f4353l = i11;
            return this;
        }

        public e v(boolean z11) {
            p(2, z11);
            return this;
        }

        public e w(boolean z11) {
            p(8, z11);
            return this;
        }

        public e x(int i11) {
            this.f4354m = i11;
            return this;
        }

        public e y(int i11, int i12, boolean z11) {
            this.f4361t = i11;
            this.f4362u = i12;
            this.f4363v = z11;
            return this;
        }

        public e z(boolean z11) {
            this.f4355n = z11;
            return this;
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }
    }
}