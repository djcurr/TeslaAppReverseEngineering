package p7;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.core.exception.CheckoutException;
import java.lang.reflect.Array;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c implements Parcelable {

    /* loaded from: classes.dex */
    public static class a<T extends c> implements Parcelable.Creator<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f46377a;

        public a(Class<T> cls) {
            this.f46377a = cls;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final T createFromParcel(Parcel parcel) {
            try {
                JSONObject b11 = p7.a.b(parcel);
                if (b11 != null) {
                    return (T) d.a(b11, this.f46377a);
                }
                throw new CheckoutException("Failed to create ModelObject from parcel. JSONObject is null.");
            } catch (JSONException e11) {
                throw new CheckoutException("Failed to create ModelObject from parcel.", e11);
            }
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public T[] newArray(int i11) {
            return (T[]) ((c[]) Array.newInstance((Class<?>) this.f46377a, i11));
        }
    }

    /* loaded from: classes.dex */
    public interface b<T extends c> {
        T a(JSONObject jSONObject);

        JSONObject b(T t11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }
}