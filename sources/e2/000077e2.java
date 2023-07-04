package io.nlopez.smartlocation.geocoding.providers;

import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import ezvcard.property.Kind;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import tx.d;

/* loaded from: classes5.dex */
public class AndroidGeocodingProvider implements vx.a {

    /* renamed from: j  reason: collision with root package name */
    private static final String f31696j = AndroidGeocodingProvider.class.getCanonicalName() + ".DIRECT_GEOCODE_ACTION";

    /* renamed from: k  reason: collision with root package name */
    private static final String f31697k = AndroidGeocodingProvider.class.getCanonicalName() + ".REVERSE_GEOCODE_ACTION";

    /* renamed from: a  reason: collision with root package name */
    private Locale f31698a;

    /* renamed from: b  reason: collision with root package name */
    private tx.b f31699b;

    /* renamed from: c  reason: collision with root package name */
    private d f31700c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, Integer> f31701d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap<Location, Integer> f31702e;

    /* renamed from: f  reason: collision with root package name */
    private Context f31703f;

    /* renamed from: g  reason: collision with root package name */
    private cy.b f31704g;

    /* renamed from: h  reason: collision with root package name */
    private BroadcastReceiver f31705h;

    /* renamed from: i  reason: collision with root package name */
    private BroadcastReceiver f31706i;

    /* loaded from: classes5.dex */
    public static class AndroidGeocodingService extends IntentService {

        /* renamed from: a  reason: collision with root package name */
        private Geocoder f31707a;

        public AndroidGeocodingService() {
            super(AndroidGeocodingService.class.getSimpleName());
        }

        private ArrayList<Address> a(Location location, int i11) {
            try {
                return new ArrayList<>(this.f31707a.getFromLocation(location.getLatitude(), location.getLongitude(), i11));
            } catch (IOException unused) {
                return new ArrayList<>();
            }
        }

        private ArrayList<wx.a> b(String str, int i11) {
            try {
                List<Address> fromLocationName = this.f31707a.getFromLocationName(str, i11);
                ArrayList<wx.a> arrayList = new ArrayList<>();
                for (Address address : fromLocationName) {
                    arrayList.add(new wx.a(address));
                }
                return arrayList;
            } catch (IOException unused) {
                return new ArrayList<>();
            }
        }

        private void c(String str, ArrayList<wx.a> arrayList) {
            Intent intent = new Intent(AndroidGeocodingProvider.f31696j);
            intent.putExtra("name", str);
            intent.putExtra("result", arrayList);
            sendBroadcast(intent);
        }

        private void d(Location location, ArrayList<Address> arrayList) {
            Intent intent = new Intent(AndroidGeocodingProvider.f31697k);
            intent.putExtra(Kind.LOCATION, location);
            intent.putExtra("result", arrayList);
            sendBroadcast(intent);
        }

        @Override // android.app.IntentService
        protected void onHandleIntent(Intent intent) {
            Locale locale = (Locale) intent.getSerializableExtra("locale");
            if (locale == null) {
                this.f31707a = new Geocoder(this);
            } else {
                this.f31707a = new Geocoder(this, locale);
            }
            if (intent.hasExtra("direct")) {
                HashMap hashMap = (HashMap) intent.getSerializableExtra("direct");
                for (String str : hashMap.keySet()) {
                    c(str, b(str, ((Integer) hashMap.get(str)).intValue()));
                }
            }
            if (intent.hasExtra("reverse")) {
                HashMap hashMap2 = (HashMap) intent.getSerializableExtra("reverse");
                for (Location location : hashMap2.keySet()) {
                    d(location, a(location, ((Integer) hashMap2.get(location)).intValue()));
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (AndroidGeocodingProvider.f31696j.equals(intent.getAction())) {
                AndroidGeocodingProvider.this.f31704g.b("sending new direct geocoding response", new Object[0]);
                if (AndroidGeocodingProvider.this.f31699b != null) {
                    AndroidGeocodingProvider.this.f31699b.a(intent.getStringExtra("name"), intent.getParcelableArrayListExtra("result"));
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (AndroidGeocodingProvider.f31697k.equals(intent.getAction())) {
                AndroidGeocodingProvider.this.f31704g.b("sending new reverse geocoding response", new Object[0]);
                if (AndroidGeocodingProvider.this.f31700c != null) {
                    AndroidGeocodingProvider.this.f31700c.a((Location) intent.getParcelableExtra(Kind.LOCATION), (ArrayList) intent.getSerializableExtra("result"));
                }
            }
        }
    }

    public AndroidGeocodingProvider() {
        this(Locale.getDefault());
    }

    @Override // vx.a
    public void a(Context context, cy.b bVar) {
        this.f31704g = bVar;
        this.f31703f = context;
    }

    @Override // vx.a
    public void b(Location location, int i11) {
        this.f31702e.put(location, Integer.valueOf(i11));
    }

    @Override // vx.a
    public void c(tx.b bVar, d dVar) {
        this.f31699b = bVar;
        this.f31700c = dVar;
        if (this.f31701d.isEmpty() && this.f31702e.isEmpty()) {
            this.f31704g.d("No direct geocoding or reverse geocoding points added", new Object[0]);
            return;
        }
        IntentFilter intentFilter = new IntentFilter(f31696j);
        IntentFilter intentFilter2 = new IntentFilter(f31697k);
        Intent intent = new Intent(this.f31703f, AndroidGeocodingService.class);
        intent.putExtra("locale", this.f31698a);
        if (!this.f31701d.isEmpty()) {
            this.f31703f.registerReceiver(this.f31705h, intentFilter);
            intent.putExtra("direct", this.f31701d);
        }
        if (!this.f31702e.isEmpty()) {
            this.f31703f.registerReceiver(this.f31706i, intentFilter2);
            intent.putExtra("reverse", this.f31702e);
        }
        this.f31703f.startService(intent);
        this.f31701d.clear();
        this.f31702e.clear();
    }

    @Override // vx.a
    public void d(String str, int i11) {
        this.f31701d.put(str, Integer.valueOf(i11));
    }

    @Override // vx.a
    public void stop() {
        try {
            this.f31703f.unregisterReceiver(this.f31705h);
        } catch (IllegalArgumentException unused) {
            this.f31704g.b("Silenced 'receiver not registered' stuff (calling stop more times than necessary did this)", new Object[0]);
        }
        try {
            this.f31703f.unregisterReceiver(this.f31706i);
        } catch (IllegalArgumentException unused2) {
            this.f31704g.b("Silenced 'receiver not registered' stuff (calling stop more times than necessary did this)", new Object[0]);
        }
    }

    public AndroidGeocodingProvider(Locale locale) {
        this.f31705h = new a();
        this.f31706i = new b();
        if (locale != null) {
            this.f31698a = locale;
            this.f31701d = new HashMap<>();
            this.f31702e = new HashMap<>();
            if (!Geocoder.isPresent()) {
                throw new RuntimeException("Android Geocoder not present. Please check if Geocoder.isPresent() before invoking the search");
            }
            return;
        }
        throw new RuntimeException("Locale is null");
    }
}