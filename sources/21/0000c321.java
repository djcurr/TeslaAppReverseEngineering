package yu;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import ch.qos.logback.core.CoreConstants;
import com.tesla.logging.TeslaLog;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f59787c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static volatile g f59788d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f59789a;

    /* renamed from: b  reason: collision with root package name */
    private Geocoder f59790b;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized g a(Context context) {
            g gVar;
            kotlin.jvm.internal.s.g(context, "context");
            if (g.f59788d == null) {
                g.f59788d = new g(context, null);
            }
            gVar = g.f59788d;
            kotlin.jvm.internal.s.e(gVar);
            return gVar;
        }
    }

    private g(Context context) {
        this.f59789a = context;
        this.f59790b = new Geocoder(context);
    }

    public /* synthetic */ g(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public final void c(double d11, double d12, String str, p callback) {
        int Y;
        kotlin.jvm.internal.s.g(callback, "callback");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!Geocoder.isPresent()) {
            callback.a();
            return;
        }
        try {
            List<Address> fromLocation = this.f59790b.getFromLocation(d11, d12, 1);
            if (fromLocation == null) {
                callback.a();
            } else if (!fromLocation.isEmpty() && fromLocation.get(0).getMaxAddressLineIndex() >= 0) {
                Address address = fromLocation.get(0);
                StringBuilder sb2 = new StringBuilder();
                try {
                    String addressLine = address.getAddressLine(0);
                    kotlin.jvm.internal.s.f(addressLine, "address.getAddressLine(0)");
                    String addressLine2 = address.getAddressLine(0);
                    kotlin.jvm.internal.s.f(addressLine2, "address.getAddressLine(0)");
                    Y = kotlin.text.w.Y(addressLine2, CoreConstants.COMMA_CHAR, 0, false, 6, null);
                    String substring = addressLine.substring(0, Y);
                    kotlin.jvm.internal.s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb2.append(substring);
                } catch (Exception unused) {
                    if (address.getThoroughfare() != null) {
                        if (address.getSubThoroughfare() != null) {
                            sb2.append(address.getSubThoroughfare());
                        }
                        sb2.append(" ");
                        sb2.append(address.getThoroughfare());
                    } else if (address.getFeatureName() != null) {
                        sb2.append(address.getFeatureName());
                    } else {
                        sb2.append("");
                    }
                }
                linkedHashMap.put("street_prefix", address.getSubThoroughfare());
                linkedHashMap.put("street", sb2.toString());
                linkedHashMap.put("name", sb2.toString());
                linkedHashMap.put("city", address.getLocality() == null ? address.getFeatureName() : address.getLocality());
                linkedHashMap.put("region", address.getAdminArea());
                linkedHashMap.put("country", address.getCountryName());
                linkedHashMap.put("postalCode", address.getPostalCode());
                linkedHashMap.put("isoCountryCode", address.getCountryCode());
                callback.b(linkedHashMap);
            } else {
                callback.b(linkedHashMap);
            }
        } catch (Exception e11) {
            if (e11 instanceof IOException) {
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                teslaLog.i("LocationServicesHelper", "Failed to get address from location: " + e11);
            } else {
                TeslaLog.INSTANCE.e("LocationServicesHelper", "Failed to get address from location", e11);
            }
            callback.a();
        }
    }
}