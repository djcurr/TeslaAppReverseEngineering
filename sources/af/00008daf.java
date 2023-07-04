package o4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f42254f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static a f42255g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f42256a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f42257b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f42258c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<b> f42259d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private final Handler f42260e;

    /* renamed from: o4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class HandlerC0835a extends Handler {
        HandlerC0835a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final Intent f42262a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<c> f42263b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f42262a = intent;
            this.f42263b = arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        final IntentFilter f42264a;

        /* renamed from: b  reason: collision with root package name */
        final BroadcastReceiver f42265b;

        /* renamed from: c  reason: collision with root package name */
        boolean f42266c;

        /* renamed from: d  reason: collision with root package name */
        boolean f42267d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f42264a = intentFilter;
            this.f42265b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f42265b);
            sb2.append(" filter=");
            sb2.append(this.f42264a);
            if (this.f42267d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    private a(Context context) {
        this.f42256a = context;
        this.f42260e = new HandlerC0835a(context.getMainLooper());
    }

    public static a b(Context context) {
        a aVar;
        synchronized (f42254f) {
            if (f42255g == null) {
                f42255g = new a(context.getApplicationContext());
            }
            aVar = f42255g;
        }
        return aVar;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f42257b) {
                size = this.f42259d.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                this.f42259d.toArray(bVarArr);
                this.f42259d.clear();
            }
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = bVarArr[i11];
                int size2 = bVar.f42263b.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    c cVar = bVar.f42263b.get(i12);
                    if (!cVar.f42267d) {
                        cVar.f42265b.onReceive(this.f42256a, bVar.f42262a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f42257b) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList<c> arrayList = this.f42257b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f42257b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                String action = intentFilter.getAction(i11);
                ArrayList<c> arrayList2 = this.f42258c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f42258c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public boolean d(Intent intent) {
        int i11;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        synchronized (this.f42257b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f42256a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z11 = (intent.getFlags() & 8) != 0;
            if (z11) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList3 = this.f42258c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z11) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i12 = 0;
                while (i12 < arrayList3.size()) {
                    c cVar = arrayList3.get(i12);
                    if (z11) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f42264a);
                    }
                    if (cVar.f42266c) {
                        if (z11) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i11 = i12;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i11 = i12;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        int match = cVar.f42264a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z11) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.f42266c = true;
                            i12 = i11 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        } else if (z11) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : MessageExtension.FIELD_DATA : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    i12 = i11 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                        ((c) arrayList5.get(i13)).f42266c = false;
                    }
                    this.f42259d.add(new b(intent, arrayList5));
                    if (!this.f42260e.hasMessages(1)) {
                        this.f42260e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public void e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f42257b) {
            ArrayList<c> remove = this.f42257b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                c cVar = remove.get(size);
                cVar.f42267d = true;
                for (int i11 = 0; i11 < cVar.f42264a.countActions(); i11++) {
                    String action = cVar.f42264a.getAction(i11);
                    ArrayList<c> arrayList = this.f42258c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.f42265b == broadcastReceiver) {
                                cVar2.f42267d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f42258c.remove(action);
                        }
                    }
                }
            }
        }
    }
}