package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.j;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4372a;

    /* renamed from: b  reason: collision with root package name */
    private final Notification.Builder f4373b;

    /* renamed from: c  reason: collision with root package name */
    private final j.e f4374c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f4375d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteViews f4376e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Bundle> f4377f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f4378g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    private int f4379h;

    /* renamed from: i  reason: collision with root package name */
    private RemoteViews f4380i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(j.e eVar) {
        int i11;
        Icon icon;
        List<String> list;
        List<String> e11;
        this.f4374c = eVar;
        this.f4372a = eVar.f4342a;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            this.f4373b = new Notification.Builder(eVar.f4342a, eVar.K);
        } else {
            this.f4373b = new Notification.Builder(eVar.f4342a);
        }
        Notification notification = eVar.S;
        this.f4373b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f4350i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f4346e).setContentText(eVar.f4347f).setContentInfo(eVar.f4352k).setContentIntent(eVar.f4348g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f4349h, (notification.flags & 128) != 0).setLargeIcon(eVar.f4351j).setNumber(eVar.f4353l).setProgress(eVar.f4361t, eVar.f4362u, eVar.f4363v);
        if (i12 < 21) {
            this.f4373b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i12 >= 16) {
            this.f4373b.setSubText(eVar.f4358q).setUsesChronometer(eVar.f4356o).setPriority(eVar.f4354m);
            Iterator<j.a> it2 = eVar.f4343b.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
            Bundle bundle = eVar.D;
            if (bundle != null) {
                this.f4378g.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (eVar.f4367z) {
                    this.f4378g.putBoolean("android.support.localOnly", true);
                }
                String str = eVar.f4364w;
                if (str != null) {
                    this.f4378g.putString("android.support.groupKey", str);
                    if (eVar.f4365x) {
                        this.f4378g.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f4378g.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = eVar.f4366y;
                if (str2 != null) {
                    this.f4378g.putString("android.support.sortKey", str2);
                }
            }
            this.f4375d = eVar.H;
            this.f4376e = eVar.I;
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 17) {
            this.f4373b.setShowWhen(eVar.f4355n);
        }
        if (i13 >= 19 && i13 < 21 && (e11 = e(g(eVar.f4344c), eVar.V)) != null && !e11.isEmpty()) {
            this.f4378g.putStringArray("android.people", (String[]) e11.toArray(new String[e11.size()]));
        }
        if (i13 >= 20) {
            this.f4373b.setLocalOnly(eVar.f4367z).setGroup(eVar.f4364w).setGroupSummary(eVar.f4365x).setSortKey(eVar.f4366y);
            this.f4379h = eVar.O;
        }
        if (i13 >= 21) {
            this.f4373b.setCategory(eVar.C).setColor(eVar.E).setVisibility(eVar.F).setPublicVersion(eVar.G).setSound(notification.sound, notification.audioAttributes);
            if (i13 < 28) {
                list = e(g(eVar.f4344c), eVar.V);
            } else {
                list = eVar.V;
            }
            if (list != null && !list.isEmpty()) {
                for (String str3 : list) {
                    this.f4373b.addPerson(str3);
                }
            }
            this.f4380i = eVar.J;
            if (eVar.f4345d.size() > 0) {
                Bundle bundle2 = eVar.c().getBundle("android.car.EXTENSIONS");
                bundle2 = bundle2 == null ? new Bundle() : bundle2;
                Bundle bundle3 = new Bundle(bundle2);
                Bundle bundle4 = new Bundle();
                for (int i14 = 0; i14 < eVar.f4345d.size(); i14++) {
                    bundle4.putBundle(Integer.toString(i14), l.b(eVar.f4345d.get(i14)));
                }
                bundle2.putBundle("invisible_actions", bundle4);
                bundle3.putBundle("invisible_actions", bundle4);
                eVar.c().putBundle("android.car.EXTENSIONS", bundle2);
                this.f4378g.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 23 && (icon = eVar.U) != null) {
            this.f4373b.setSmallIcon(icon);
        }
        if (i15 >= 24) {
            this.f4373b.setExtras(eVar.D).setRemoteInputHistory(eVar.f4360s);
            RemoteViews remoteViews = eVar.H;
            if (remoteViews != null) {
                this.f4373b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.I;
            if (remoteViews2 != null) {
                this.f4373b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.J;
            if (remoteViews3 != null) {
                this.f4373b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i15 >= 26) {
            this.f4373b.setBadgeIconType(eVar.L).setSettingsText(eVar.f4359r).setShortcutId(eVar.M).setTimeoutAfter(eVar.N).setGroupAlertBehavior(eVar.O);
            if (eVar.B) {
                this.f4373b.setColorized(eVar.A);
            }
            if (!TextUtils.isEmpty(eVar.K)) {
                this.f4373b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i15 >= 28) {
            Iterator<n> it3 = eVar.f4344c.iterator();
            while (it3.hasNext()) {
                this.f4373b.addPerson(it3.next().h());
            }
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 29) {
            this.f4373b.setAllowSystemGeneratedContextualActions(eVar.Q);
            this.f4373b.setBubbleMetadata(j.d.a(eVar.R));
        }
        if (r3.a.c() && (i11 = eVar.P) != 0) {
            this.f4373b.setForegroundServiceBehavior(i11);
        }
        if (eVar.T) {
            if (this.f4374c.f4365x) {
                this.f4379h = 2;
            } else {
                this.f4379h = 1;
            }
            this.f4373b.setVibrate(null);
            this.f4373b.setSound(null);
            int i17 = notification.defaults & (-2);
            notification.defaults = i17;
            int i18 = i17 & (-3);
            notification.defaults = i18;
            this.f4373b.setDefaults(i18);
            if (i16 >= 26) {
                if (TextUtils.isEmpty(this.f4374c.f4364w)) {
                    this.f4373b.setGroup("silent");
                }
                this.f4373b.setGroupAlertBehavior(this.f4379h);
            }
        }
    }

    private void b(j.a aVar) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 20) {
            if (i11 >= 16) {
                this.f4377f.add(l.f(this.f4373b, aVar));
                return;
            }
            return;
        }
        IconCompat e11 = aVar.e();
        if (i11 >= 23) {
            builder = new Notification.Action.Builder(e11 != null ? e11.p() : null, aVar.i(), aVar.a());
        } else {
            builder = new Notification.Action.Builder(e11 != null ? e11.e() : 0, aVar.i(), aVar.a());
        }
        if (aVar.f() != null) {
            for (RemoteInput remoteInput : o.b(aVar.f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        if (aVar.d() != null) {
            bundle = new Bundle(aVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.g());
        if (i12 >= 28) {
            builder.setSemanticAction(aVar.g());
        }
        if (i12 >= 29) {
            builder.setContextual(aVar.j());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.h());
        builder.addExtras(bundle);
        this.f4373b.addAction(builder.build());
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.b bVar = new androidx.collection.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> g(List<n> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (n nVar : list) {
            arrayList.add(nVar.g());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i11 = notification.defaults & (-2);
        notification.defaults = i11;
        notification.defaults = i11 & (-3);
    }

    @Override // androidx.core.app.i
    public Notification.Builder a() {
        return this.f4373b;
    }

    public Notification c() {
        Bundle a11;
        RemoteViews f11;
        RemoteViews d11;
        j.f fVar = this.f4374c.f4357p;
        if (fVar != null) {
            fVar.b(this);
        }
        RemoteViews e11 = fVar != null ? fVar.e(this) : null;
        Notification d12 = d();
        if (e11 != null) {
            d12.contentView = e11;
        } else {
            RemoteViews remoteViews = this.f4374c.H;
            if (remoteViews != null) {
                d12.contentView = remoteViews;
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 16 && fVar != null && (d11 = fVar.d(this)) != null) {
            d12.bigContentView = d11;
        }
        if (i11 >= 21 && fVar != null && (f11 = this.f4374c.f4357p.f(this)) != null) {
            d12.headsUpContentView = f11;
        }
        if (i11 >= 16 && fVar != null && (a11 = j.a(d12)) != null) {
            fVar.a(a11);
        }
        return d12;
    }

    protected Notification d() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            return this.f4373b.build();
        }
        if (i11 >= 24) {
            Notification build = this.f4373b.build();
            if (this.f4379h != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.f4379h == 2) {
                    h(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f4379h == 1) {
                    h(build);
                }
            }
            return build;
        } else if (i11 >= 21) {
            this.f4373b.setExtras(this.f4378g);
            Notification build2 = this.f4373b.build();
            RemoteViews remoteViews = this.f4375d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f4376e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f4380i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f4379h != 0) {
                if (build2.getGroup() != null && (build2.flags & 512) != 0 && this.f4379h == 2) {
                    h(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f4379h == 1) {
                    h(build2);
                }
            }
            return build2;
        } else if (i11 >= 20) {
            this.f4373b.setExtras(this.f4378g);
            Notification build3 = this.f4373b.build();
            RemoteViews remoteViews4 = this.f4375d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f4376e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f4379h != 0) {
                if (build3.getGroup() != null && (build3.flags & 512) != 0 && this.f4379h == 2) {
                    h(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f4379h == 1) {
                    h(build3);
                }
            }
            return build3;
        } else if (i11 >= 19) {
            SparseArray<Bundle> a11 = l.a(this.f4377f);
            if (a11 != null) {
                this.f4378g.putSparseParcelableArray("android.support.actionExtras", a11);
            }
            this.f4373b.setExtras(this.f4378g);
            Notification build4 = this.f4373b.build();
            RemoteViews remoteViews6 = this.f4375d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f4376e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i11 >= 16) {
            Notification build5 = this.f4373b.build();
            Bundle a12 = j.a(build5);
            Bundle bundle = new Bundle(this.f4378g);
            for (String str : this.f4378g.keySet()) {
                if (a12.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a12.putAll(bundle);
            SparseArray<Bundle> a13 = l.a(this.f4377f);
            if (a13 != null) {
                j.a(build5).putSparseParcelableArray("android.support.actionExtras", a13);
            }
            RemoteViews remoteViews8 = this.f4375d;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f4376e;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        } else {
            return this.f4373b.getNotification();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context f() {
        return this.f4372a;
    }
}